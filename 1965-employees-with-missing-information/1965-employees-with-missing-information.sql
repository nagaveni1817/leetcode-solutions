# Write your MySQL query statement below
select e.employee_id
FROM Employees e
LEFT JOIN Salaries s
    ON e.employee_id = s.employee_id
WHERE s.employee_id IS NULL
union 
select s.employee_id
FROM Salaries s
LEFT JOIN Employees e
    ON e.employee_id = s.employee_id
WHERE e.employee_id IS NULL
order by employee_id;