/* Write your T-SQL query statement below */
with t1 as (select t.* from Trips t 
join users u1 on t.client_id=u1.users_id and u1.banned='No'
join users u2 on t.driver_id=u2.users_id and u2.banned='No'
           where t.request_at between '2013-10-01' and '2013-10-03')
select t.request_at as Day, cast(sum(case when t.status='completed' then 0 else 1.0 end)/ count(t.id)*1.0 as decimal(16,2)) as "Cancellation Rate"
from t1 as t
group by t.request_at;