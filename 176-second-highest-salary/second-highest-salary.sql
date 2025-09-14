SELECT (SELECT Distinct salary from Employee order by salary desc LIMIT 1 offset 1) AS SecondHighestSalary;
