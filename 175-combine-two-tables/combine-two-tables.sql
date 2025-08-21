# Write your MySQL query statement b
SELECT Person.firstName,person.lastName, Address.city,Address.state
 FROM Person
 LEFT JOIN Address ON Person.personId = Address.personId;