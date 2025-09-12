# Write your MySQL query statement below
SELECT max(num) AS  num from (Select num as num from MyNumbers GROUP BY num having count(*)=1) AS Singles;