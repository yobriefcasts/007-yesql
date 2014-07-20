-- name: get-person-by-id
select * from people where id = :id

-- name: get-person-by-email
select * from people where email_address = :email_address
