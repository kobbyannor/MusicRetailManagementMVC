create database musicretail;
use musicretail;

drop table  songTracking;
drop table  song;

create table retailer(
retailerName varchar(200) ,
artistPassword  varchar(200) 
);


insert into retailer(retailerName,artistPassword)
values("admin","admin");


create table song(
song_title varchar(200) ,
artist_Name varchar(200) references musician(stage_Name) ,
release_Year varchar(200),
time_Sold varchar(200),
no_of_sales int,
price_in_cedis double default 1.5,
primary key(song_title,artist_Name)
);


insert into song(song_title,
artist_Name,release_Year,time_Sold,no_of_sales)
values("Susuka remix","Kofi Kinata",
'2015','18th may',1)
ON DUPLICATE KEY UPDATE no_of_sales=no_of_sales+1;
;


create table songTracking(
id int auto_increment primary key,
song_title varchar(200) ,
artist_Name varchar(200) references musician(stage_Name) ,
release_Year varchar(200),
time_Sold varchar(200),
price_in_cedis double default 1.5
);


	ALTER TABLE `songTracking`
	  CHANGE COLUMN `song_title` `song_title` VARCHAR(500);

insert into songTracking(song_title,artist_Name,release_Year,time_Sold)

values("Susuka remix","Kofi Kinata",'2015','18th may');



