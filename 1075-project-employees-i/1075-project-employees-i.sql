# Write your MySQL query statement below
SELECT p.project_id,  ROUND(AVG(e.experience_years),2) As average_years
FROM  Project p,Employee e
WHERE p.employee_id=e.employee_id
group by project_id;