# Write your MySQL query statement below
SELECT c.name AS Customers FROM Customers C
    LEFT JOIN Orders o on c.id = o.CustomerId where o.id IS NULL ; 