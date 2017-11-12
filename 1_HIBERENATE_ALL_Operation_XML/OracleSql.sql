CREATE TABLE product_table
  (
    pid   INTEGER NOT NULL,
    pname VARCHAR(255) NOT NULL,
    price DOUBLE PRECISION,
    price2 DECIMAL(19,2),
    PRIMARY KEY (pid)
  )

  select max(pid) from product_table

  
  insert into product_table (pname, price, price2, pid) values (?, ?, ?, ?)
  
  
  --update
  update product_table set pname=?, price=?, price2=? where pid=?
