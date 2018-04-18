# --- Created by Ebean DDL
# To stop Ebean DDL generation, remove this comment and start using Evolutions

# --- !Ups

create table parent (
  id                            bigint auto_increment not null,
  name                          varchar(255) not null,
  create_date                   timestamp not null,
  update_date                   timestamp not null,
  constraint pk_parent primary key (id)
);


# --- !Downs

drop table if exists parent;

