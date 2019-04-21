create database db_sahara default charset utf8;
use db_sahara;

create table t_user(
    id tinyint not null auto_increment primary key,
    username varchar(255) not null,
    password varchar(255) not null
)engine=InnoDB;

create table t_category(
    id tinyint not null auto_increment primary key,
    category_name varchar(255) not null
)engine=InnoDB;

create table t_article(
    id tinyint not null auto_increment primary key,
    author varchar(255) not null,
    title varchar(1000) not null,
    article_content varchar(10000) not null,
    category_id tinyint not null,
    constraint category_id_fk foreign key (category_id) references t_category(id)
)engine=InnoDB;

create table t_tag(
    id tinyint not null auto_increment primary key,
    tag_name varchar(255) not null
)engine=InnoDB;

create table t_article_tag_relationship(
    id tinyint not null auto_increment primary key,
    article_id tinyint not null,
    tag_id tinyint not null,
    constraint article_id_fk foreign key (article_id) references t_article(id),
    constraint tag_id_fk foreign key (tag_id) references t_tag(id)
)engine=InnoDB;
