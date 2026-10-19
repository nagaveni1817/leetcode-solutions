# Write your MySQL query statement below
select p1.product_id as product1_id,p2.product_id as product2_id,pi1.category as product1_category, pi2.category as product2_category,count(distinct p1.user_id) as customer_count
from ProductPurchases p1
join ProductPurchases p2 on p1.user_id=p2.user_id and p1.product_id<p2.product_id
join ProductInfo pi1 on p1.product_id=pi1.product_id
join ProductInfo pi2 on p2.product_id=pi2.product_id
group by p1.product_id,p2.product_id,pi1.category,pi2.category
having count(distinct p1.user_id) >=3
order by customer_count desc,p1.product_id asc,p2.product_id asc;