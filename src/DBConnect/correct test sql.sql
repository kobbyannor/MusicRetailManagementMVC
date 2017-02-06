drop table song;

create table song(
song_ID int ,
song_title varchar(200) ,
artist_Name varchar(200) references musician(stage_Name) ,
release_Year varchar(200),
genre varchar(200),
time_Sold varchar(200),
no_of_sales int,
primary key(song_title,artist_Name)
);


insert into song(song_ID,song_title,
artist_Name,release_Year,genre,time_Sold,no_of_sales)
values('06',"Susuka remix","Kofi Kinata",
'2015','AfroBeat','18th may',1)
ON DUPLICATE KEY UPDATE no_of_sales=no_of_sales+1;
;