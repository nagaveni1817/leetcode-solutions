# Write your MySQL query statement below
SELECT DISTINCT user_id, count(follower_id) As followers_count
FROM Followers
group by user_id
ORDER BY user_id;