# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin (
  id                        bigint auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  email                     varchar(255),
  contact                   varchar(255),
  constraint pk_admin primary key (id))
;

create table request (
  id                        integer auto_increment not null,
  first_name                varchar(255),
  last_name                 varchar(255),
  image                     varchar(255),
  contact                   varchar(255),
  comment                   varchar(255),
  latitude                  varchar(255),
  longitude                 varchar(255),
  address                   varchar(255),
  email                     varchar(255),
  business                  varchar(255),
  is_resolved               tinyint(1) default 0,
  constraint pk_request primary key (id))
;




# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table admin;

drop table request;

SET FOREIGN_KEY_CHECKS=1;

