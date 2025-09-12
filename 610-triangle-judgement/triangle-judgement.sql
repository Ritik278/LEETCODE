# Write your MySQL query statement below
SELECT x,y,z , CASE when x+y>z AND x+z>y AND y+z>x THEN 'Yes'
ELSE 'No' END AS triangle from Triangle;