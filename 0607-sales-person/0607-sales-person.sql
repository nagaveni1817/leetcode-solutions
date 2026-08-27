# Write your MySQL query statement below
select s.name
from SalesPerson s
where  NOT EXISTS(
    select  1
    from Orders o
     JOIN Company c
        ON o.com_id = c.com_id
    where o.sales_id=s.sales_id and c.name="RED" 
);
