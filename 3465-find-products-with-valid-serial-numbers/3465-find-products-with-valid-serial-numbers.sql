# Write your MySQL query statement below
SELECT product_id, product_name, description
FROM products
WHERE REGEXP_LIKE( description,
    '(^|[^A-Za-z0-9_])SN[0-9]{4}-[0-9]{4}([^A-Za-z0-9_]|$)',
    'c'
)
ORDER BY product_id;