# Write your MySQL query statement below
SELECT DISTINCT max(salary) as SecondHighestSalary
from Employee
where salary < ANY (
    select max(salary)
    from Employee
    
);
