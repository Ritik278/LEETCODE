# Write your MySQL query statement below
Select actor_id, director_id from actorDirector group by actor_id, director_id having count(timestamp)>=3;