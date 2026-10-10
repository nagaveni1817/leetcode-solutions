# Write your MySQL query statement below
SELECT
    f.student_id,
    f.subject,
    f.score AS first_score,
    l.score AS latest_score
FROM (
    SELECT s.student_id, s.subject, s.score
    FROM Scores s
    JOIN (
        SELECT student_id, subject, MIN(exam_date) AS first_date
        FROM Scores
        GROUP BY student_id, subject
    ) d
      ON s.student_id = d.student_id
     AND s.subject = d.subject
     AND s.exam_date = d.first_date
) f
JOIN (
    SELECT s.student_id, s.subject, s.score
    FROM Scores s
    JOIN (
        SELECT student_id, subject, MAX(exam_date) AS latest_date
        FROM Scores
        GROUP BY student_id, subject
    ) d
      ON s.student_id = d.student_id
     AND s.subject = d.subject
     AND s.exam_date = d.latest_date
) l
  ON f.student_id = l.student_id
 AND f.subject = l.subject
WHERE l.score > f.score
  AND EXISTS (
      SELECT 1
      FROM Scores s
      WHERE s.student_id = f.student_id
        AND s.subject = f.subject
      GROUP BY s.student_id, s.subject
      HAVING COUNT(DISTINCT s.exam_date) >= 2
  )
ORDER BY f.student_id, f.subject;