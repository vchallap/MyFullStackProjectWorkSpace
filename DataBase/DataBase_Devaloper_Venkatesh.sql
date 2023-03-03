select * from venkat_customers
--how to create table:
create table demo1(

demo_id number,
demo_name varchar(50),
demo_gender varchar(20),
demo_location varchar(30));
--retrive data from table
SELECT * FROM demo1

--Insert data into table
--option1: by interting data with required columns
insert into demo1 (demo_id,demo_name,demo_gender,demo_location) values(101,'abc','male','hyd');
--option 2: we can insert all the data of tables without columns
insert into demo1 values(102,'def','female','vojayawada');
--option 3:we can insert data into table continuosly
insert into demo1 values (&demo_id,&demo_name,&demo_gender,&demo_location);

--commit the data to save the data perminently
commit;

--how to update  all rows in the table

update demo1 set demo_location='USA';

-- HOW TO UPDATE SPECIFIC ROW IN TABLE

update demo1 set demo_location='UK' where demo_id=101;

--delete the unwanted records from table

delete demo1 where demo_id=106;
