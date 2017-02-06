
create database musicretail;
use musicretail;

create table musician(
stage_name varchar(200) primary key,
surname varchar(200),
first_name varchar(200),
age int,
contact int
);

create table song(
song_ID int primary key,
song_title varchar(200),
artist_Name varchar(200) references musician(stage_Name),
release_Year varchar(200),
genre varchar(200),
time_Sold varchar(200)
);

insert into musician(stage_name,surname,first_name,age,contact)
values("Shatta Wale","Mensah","Charles",'30','0277329200');

insert into musician(stage_name,surname,first_name,age,contact)
values("Guru","Maradona","Nana Yaw",'30','0244900111');


insert into musician(stage_name,surname,first_name,age,contact)
values("Sarkodie","Addo","Michael",'30','0277329200');


insert into musician(stage_name,surname,first_name,age,contact)
values("Kofi Kinatta","Appiah","David",'22','0234890982');


insert into musician(stage_name,surname,first_name,age,contact)
values("Samini","Emmanuel","Samini",'31','0248009200');


insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('01',"Adonai(Remix) ft. Castro","Sarkodie",'2014','AfroBeat');


insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('02',"Linda","Samini",'2006','HipLife');


insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('03',"Dancehall King","Shatta Wale",'2014','AfroBeat');


insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('04',"Alkayida","Guru",'2014','AfroBeat');


insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('05',"Susuka","Kofi Kinata",'2015','AfroBeat');



insert into song(song_ID,song_title,artist_Name,release_Year,genre)
values('06',"U Go Kill Me","Sarkodie",'2012','Azonto');



