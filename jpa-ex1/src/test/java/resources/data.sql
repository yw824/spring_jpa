call next value for hibernate_sequence;

insert
into user ("id", "name", "email", "created_at", "updated_at")
values(1, "scott", "scott@gmail.com", now(), now())
;

call next value for hibernate_sequence;

insert
into user ("id", "name", "email", "created_at", "updated_at")
values(2, "james", "james@gmail.com", now(), now())
;

call next value for hibernate_sequence;

insert
into user ("id", "name", "email", "created_at", "updated_at")
values(3, "peter", "peter@gmail.com", now(), now())
;

call next value for hibernate_sequence;

insert
into user ("id", "name", "email", "created_at", "updated_at")
values(4, "martin", "martin@another.com", now(), now())
;

call next value for hibernate_sequence;

insert
into user ("id", "name", "email", "created_at", "updated_at")
values(4, "martin", "martin@fastcampus.com", now(), now())
;
