# Write your MySQL query statement below
select m.employee_id,m.name,count(e1.reports_to) as reports_count,round(avg(e1.age)) as average_age 
from Employees e1
join Employees m on e1.reports_to=m.employee_id
group by m.employee_id,m.name
order by m.employee_id;
