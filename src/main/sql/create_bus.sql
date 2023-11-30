create database jeedemo;

use jeedemo;

create table bus(
bus_no int not null primary key,
bus_type varchar(50) not null,
bus_route varchar(50) not null,
service_day varchar(10) not null,
start_place varchar(100) not null,
end_place varchar(100) not null,
service_start_time time not null,
travel_hours int not null,
seat_capsity int not null
);

create table booking(
booking_id int primary key not null auto_increment,
passenger_name varchar(50),
passenger_age int,
passenger_gender char,
bus_no int,
start_place varchar(100),
end_place varchar(100),
booking_date date,
constraint fk_bus_no foreign key (bus_no) references bus(bus_no)
);


insert into bus values(
176,
"Ac",
"227B",
"A",
"chennai",
"trichy",
'20:45:00',
7,
5);

