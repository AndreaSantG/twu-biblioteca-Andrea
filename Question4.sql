insert into book values (11, 'The Pragmatic Programmer');
insert into member values (43, "Andrea Santacruz");
insert into checkout_item (member_id, book_id) values (43,11);
select name from member where id in (select member_id from checkout_item where book_id in (select id from book where title = "The Pragmatic Programmer"));