create table students(id int primary key auto_increment, name varchar(50), email varchar(50), phone_no varchar(10), course varchar(50));
desc students;

create table teachers(id int primary key auto_increment, name varchar(50), email varchar(50), phone_no varchar(50), salary int);
desc teachers;

create table courses(id int primary key auto_increment, name varchar(50), duration int, fees int);
desc courses;

