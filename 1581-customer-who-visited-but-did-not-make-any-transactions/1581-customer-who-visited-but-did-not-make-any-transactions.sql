# Write your MySQL query statement below
SELECT v.customer_id, COUNT(v.visit_id) As count_no_trans
FROM Visits v
left join Transactions t on v.visit_id = t.visit_id
where t.visit_id IS NULL
group by v.customer_id;