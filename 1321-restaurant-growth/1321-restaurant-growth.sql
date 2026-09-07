# Write your MySQL query statement below
SELECT 
    d.visited_on,
    SUM(c.amount) AS amount,
    ROUND(SUM(c.amount) / 7, 2) AS average_amount
FROM (
    SELECT DISTINCT visited_on
    FROM Customer
) d
JOIN Customer c
    ON DATEDIFF(d.visited_on, c.visited_on) BETWEEN 0 AND 6
WHERE d.visited_on >= (
    SELECT DATE_ADD(MIN(visited_on), INTERVAL 6 DAY)
    FROM Customer
)
GROUP BY d.visited_on
ORDER BY d.visited_on;