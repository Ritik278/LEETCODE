# Write your MySQL query statement below
Select name from SalesPerson Where sales_id NOT In(SELECT DISTINCT
o.sales_id from Orders o JOIN company c ON o.com_id=c.com_id where c.name='RED');