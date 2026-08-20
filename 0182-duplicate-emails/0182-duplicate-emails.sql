# Write your MySQL query statement below
SELECT email As Email
FROM Person
group by email
having count(email)>=2;

