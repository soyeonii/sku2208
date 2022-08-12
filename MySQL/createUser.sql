show databases;
use mysql;
show tables;
select host, user from user;
desc user;

-- 사용자 생성
create user sku@localhost identified by "skupw";
create user sku@'%' identified by "skupw";

-- 데이터베이스 생성
create database skudb default char set utf8;

-- 권한 부여
grant all privileges on skudb.* to sku@localhost with grant option;
grant all privileges on skudb.* to sku@'%' with grant option;

flush privileges;