# Write your MySQL query statement below
select distinct l1.num as ConsecutiveNums 
from Logs l1
join Logs l2  on l2.id=l1.id+1 and l2.num=l1.num  
join Logs l3 on l3.id=l1.id+2 and l3.num=l1.num;

