# Write your MySQL query statement below
Select class from courses Group BY class having count(student)>=5;