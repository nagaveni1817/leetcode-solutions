# Write your MySQL query statement below
SELECT id,movie,description, rating
FROM Cinema
where id%2=1 AND description != 'boring'
order by rating desc;