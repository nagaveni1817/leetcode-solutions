# Write your MySQL query statement below
select  p1.product_id , coalesce(p1.new_price,10) as price
from Products p1
where (p1.product_id,p1.change_date) IN (


    select product_id,MAX(change_date)
    from Products
    where change_date <='2019-08-16'
    group by product_id
)

union all
select p.product_id, 10 as price
from Products p
GROUP BY p.product_id
HAVING MIN(p.change_date) > '2019-08-16'
order by product_id;