# Write your MySQL query statement below
SELECT 
    sell_date,
    COUNT(DISTINCT product) AS num_sold,
    GROUP_CONCAT(DISTINCT product ORDER BY product) AS products
FROM Activities
GROUP BY sell_date;
/*SELECT sell_date, COUNT(DISTINCT product) AS num_sold, GROUP_CONCAT(
    DISTINCT product
    ORDER BY product
) as product
from Activities
group by sell_date;*/