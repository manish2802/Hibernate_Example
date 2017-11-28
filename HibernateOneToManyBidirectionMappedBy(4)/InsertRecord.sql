create table customer_otm_bi_Mapped (cid varchar(255) not null, cname varchar(10), primary key (cid))
create table Item_otm_bi_Mapped (item_id varchar(255) not null, item_name varchar(10), price double precision, customer_cid varchar(255), primary key (item_id))
alter table Item_otm_bi_Mapped add constraint FKhdj35um6e5e7bor5euwt3lq5r foreign key (customer_cid) references customer_otm_bi (cid)

select item_.item_id, item_.customer_cid as customer4_1_, item_.item_name as item_nam2_1_, item_.price as price3_1_ from Item_otm_bi item_Mapped where item_.item_id=?
 select item_.item_id, item_.customer_cid as customer4_1_, item_.item_name as item_nam2_1_, item_.price as price3_1_ from Item_otm_bi item_Mapped where item_.item_id=?
insert into customer_otm_bi_Mapped (cname, cid) values (?, ?)
 insert into Item_otm_bi_Mapped (customer_cid, item_name, price, item_id) values (?, ?, ?, ?)
 insert into Item_otm_bi_Mapped (customer_cid, item_name, price, item_id) values (?, ?, ?, ?)