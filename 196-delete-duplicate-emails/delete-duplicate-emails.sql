# Write your MySQL query statement below
DELETE P1 from person p1, person P2 where P1.email = P2.email AND P1.id>P2.id;