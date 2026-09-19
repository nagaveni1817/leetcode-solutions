# Write your MySQL query statement below
select c.category, count(a.account_id) as accounts_count
from (
    select 'Low Salary' as category
    union all
    select 'Average Salary'
    union all
    select 'High Salary'
)  c
left join Accounts a on c.category =
     case when a.income < '20000' then 'Low Salary'
     when a.income between '20000' and '50000' then 'Average Salary'
     else 'High Salary'
     end  
group by c.category;
