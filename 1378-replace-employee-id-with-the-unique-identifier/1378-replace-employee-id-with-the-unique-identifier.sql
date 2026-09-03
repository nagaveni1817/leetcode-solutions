# Write your MySQL query statement below
select s.unique_id, e.name
from Employees e
left join EmployeeUNI s on e.id=s.id;