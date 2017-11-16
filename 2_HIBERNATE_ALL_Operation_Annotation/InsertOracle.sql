Hibernate: create table PRODUCT_ANNOTATION (PRODUCT_ID number(19,0) not null, PRICE double precision, PRODUCT_NAME varchar2(255), primary key (PRODUCT_ID))
Hibernate: create sequence hibernate_sequence start with 1 increment by 1 --Auto
Hibernate: select hibernate_sequence.nextval from dual
Hibernate: insert into PRODUCT_ANNOTATION (PRICE, PRODUCT_NAME, PRODUCT_ID) values (?, ?, ?)