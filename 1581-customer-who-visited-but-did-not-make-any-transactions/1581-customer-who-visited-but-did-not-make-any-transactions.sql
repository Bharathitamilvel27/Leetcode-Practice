# Write your MySQL query statement below
select v.customer_id,count(*) as count_no_trans
from visits v
left join
transactions t
on v.visit_id = t.visit_id  
where t.transaction_id is null
group by v.customer_id;
 --  where t.transaction_id is null - It keeps only the rows where there was no matching transaction(which means no transaction happened thus no transaction id is there for those vivits)

 -- id they ask those whoo have done transaction means just put inner join & remove the line where t.transaction_id is null
 -- if they ask those who made atleast 2 transactions - use having - group by v.customer_id , having count(*)>=2