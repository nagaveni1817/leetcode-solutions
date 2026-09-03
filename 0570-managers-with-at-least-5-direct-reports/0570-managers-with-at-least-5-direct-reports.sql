# Write your MySQL query statement below
select m.name
from Employee e
join Employee m on e.managerID=m.id
group by m.id,m.name
having count(*) >=5;