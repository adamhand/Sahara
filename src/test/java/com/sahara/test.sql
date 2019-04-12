create database mytest;

use mytest;
create table user(
  id tinyint not null primary key auto_increment,
  name varchar(30) not null,
  gender varchar(15) not null
)engine = InnoDB;
