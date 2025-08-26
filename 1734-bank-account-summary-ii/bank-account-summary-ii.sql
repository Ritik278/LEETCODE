# Write your MySQL query statement below
Select name, SUM(amount) as balance  from Users u lEFT JOIN  Transactions t ON u.account= t.account GROUP BY u.account having balance > 10000;