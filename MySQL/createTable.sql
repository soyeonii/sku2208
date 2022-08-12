show tables;

CREATE TABLE Member (
    id VARCHAR(8) PRIMARY KEY,
    name VARCHAR(15) NOT NULL,
    password VARCHAR(12) NOT NULL,
    email VARCHAR(50) NOT NULL,
    join_date DATETIME DEFAULT CURRENT_TIMESTAMP
);

insert into member values('sku', '서경이', 'skupw', 'sku@sku.ac.kr', default);
insert into member values('sku1', '서경이', 'skupw', 'sku@sku.ac.kr', default);

select * from member;

update member set name='이서경' where id='sku1';