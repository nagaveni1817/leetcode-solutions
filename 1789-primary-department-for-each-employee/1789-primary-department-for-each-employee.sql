# Write your MySQL query statement below
select e.employee_id,e.department_id
from Employee e
where e.primary_flag='y' or (
    select count(*)
    from Employee e1
    where e1.employee_id=e.employee_id
)=1
group by e.employee_id;