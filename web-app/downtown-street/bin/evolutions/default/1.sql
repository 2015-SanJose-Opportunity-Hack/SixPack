# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table admin (
  id                        bigint auto_increment not null,
  username                  varchar(255),
  password                  varchar(255),
  name                      varchar(255),
  email                     varchar(255),
  contact                   varchar(255),
  constraint pk_admin primary key (id))
;

create table category (
  id                        integer auto_increment not null,
  category_name             varchar(255),
  constraint uq_category_category_name unique (category_name),
  constraint pk_category primary key (id))
;

create table department (
  id                        integer auto_increment not null,
  name                      varchar(255),
  username                  varchar(255),
  password                  varchar(255),
  location                  varchar(255),
  admin_name                varchar(255),
  admin_phone               varchar(255),
  item_count                integer,
  active_items              integer,
  total_worth               integer,
  constraint uq_department_username unique (username),
  constraint pk_department primary key (id))
;

create table item (
  tag_id                    integer auto_increment not null,
  name                      varchar(255),
  unit_cost                 double,
  total_cost                double,
  quantity                  integer,
  purchase_date             datetime,
  created_at                datetime,
  modified_at               datetime,
  location                  varchar(255),
  other_information         TEXT,
  disposal_date             datetime,
  dispose_quantity          integer,
  image_path                varchar(255),
  description               varchar(255),
  serial_number             varchar(255),
  comments                  varchar(255),
  vendor                    varchar(255),
  is_taggable               tinyint(1) default 0,
  category_id               integer,
  department_id             integer,
  is_approved               tinyint(1) default 0,
  constraint pk_item primary key (tag_id))
;

create table log (
  log_id                    bigint auto_increment not null,
  log_date                  datetime,
  log_type_id               integer,
  log_item_id               integer,
  log_item_type_id          integer,
  log_user                  varchar(255),
  ip_address                varchar(255),
  constraint pk_log primary key (log_id))
;

create table log_item_type (
  id                        integer auto_increment not null,
  log_item_type             varchar(255),
  constraint pk_log_item_type primary key (id))
;

create table log_type (
  id                        integer auto_increment not null,
  log_type                  varchar(255),
  constraint uq_log_type_log_type unique (log_type),
  constraint pk_log_type primary key (id))
;

alter table item add constraint fk_item_category_1 foreign key (category_id) references category (id) on delete restrict on update restrict;
create index ix_item_category_1 on item (category_id);
alter table item add constraint fk_item_department_2 foreign key (department_id) references department (id) on delete restrict on update restrict;
create index ix_item_department_2 on item (department_id);
alter table log add constraint fk_log_logType_3 foreign key (log_type_id) references log_type (id) on delete restrict on update restrict;
create index ix_log_logType_3 on log (log_type_id);
alter table log add constraint fk_log_logItemType_4 foreign key (log_item_type_id) references log_item_type (id) on delete restrict on update restrict;
create index ix_log_logItemType_4 on log (log_item_type_id);



# --- !Downs

SET FOREIGN_KEY_CHECKS=0;

drop table admin;

drop table category;

drop table department;

drop table item;

drop table log;

drop table log_item_type;

drop table log_type;

SET FOREIGN_KEY_CHECKS=1;

