# Write your MySQL query statement below
/*select r.contest_id, round(count(distinct r.user_id)/count(u.user_id)*100,2) as percentage
from Users u
join Register r on u.user_id = r.user_id 
group by r.contest_id
order by percentage ;*/
SELECT r.contest_id,
       ROUND(
           COUNT(DISTINCT r.user_id) /
           (SELECT COUNT(*) FROM Users) * 100,
           2
       ) AS percentage
FROM Register r
GROUP BY r.contest_id
ORDER BY percentage DESC,contest_id ASC;;