SELECT * from (SELECT * from cinema where id %2=1) AS odd_movies where description <> 'boring' order by rating desc;
