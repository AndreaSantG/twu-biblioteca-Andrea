select title from book where id not in (select checkout_item.book_id from checkout_item where checkout_item.book_id is not null)
union all
select title from movie where id not in (select checkout_item.movie_id from checkout_item where checkout_item.movie_id is not null);