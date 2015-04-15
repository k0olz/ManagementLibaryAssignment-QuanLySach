create database AsmWPSJ
go
use AsmWPSJ
go

create table Account
(
	id int primary key identity,
	username nvarchar(50) not null,
	passw nvarchar(50) not null,
)

insert into Account values('k0olz','123456')
insert into Account values('thang','123456')
select * from Account
drop table account
select username, passw from Account where username='k0olz'
go
create table BookStore(
	id int primary key identity,
	name nvarchar(50)not null,
	author nvarchar(50) not null,
	price float not null,
	description nvarchar(50) not null,
	img varchar(50) not null
)
go
insert into BookStore values('Yêu em từ cái nhìn đầu tiên','Cố Mạn',100000,'Đây là một câu chuyện kể về tình yêu học trò','Img/1.jpg');
insert into BookStore values('Ốc sên chạy','Cố Mạn',200000,'Đây là một câu chuyện kể về tình yêu học trò','Img/2.jpg');
insert into BookStore values('Bên nhau trọn đời','Cố Mạn',150000,'Đây là một câu chuyện kể về tình yêu học trò','Img/3.jpg');
insert into BookStore values('Bữa trưa tình yêu','Cố Mạn',110000,'Đây là một câu chuyện kể về tình yêu học trò','Img/4.jpg');
insert into BookStore values('Sam sam đến đây ăn nè','Cố Mạn',180000,'Đây là một câu chuyện kể về tình yêu học trò','Img/5.jpg');
insert into BookStore values('Boss đại nhân ta thua rồi','Cố Mạn',160000,'Đây là một câu chuyện kể về tình yêu học trò','Img/6.jpg');
insert into BookStore values('Chân trời góc bể','Cố Mạn',50000,'Đây là một câu chuyện kể về tình yêu học trò','Img/7.jpg');
insert into BookStore values('Đã lâu không gặp','Cố Mạn',65000,'Đây là một câu chuyện kể về tình yêu học trò','Img/8.jpg');
insert into BookStore values('Hơi ấm','Cố Mạn',90000,'Đây là một câu chuyện kể về tình yêu học trò','Img/9.jpg');
insert into BookStore values('Hứa cho em một đời âm áp','Cố Mạn',80000,'Đây là một câu chuyện kể về tình yêu học trò','Img/10.jpg');
insert into BookStore values('Nụ Hôn của sói','Cố Mạn',170000,'Đây là một câu chuyện kể về tình yêu học trò','Img/11.jpg');
go
select * from BookStore
drop table BookStore