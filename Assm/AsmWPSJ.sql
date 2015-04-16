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
select username, passw from Account where username='k0olz'
go
create table BookStore(
	id int primary key identity,
	name nvarchar(50)not null,
	author nvarchar(50) not null,
	price float not null,
	description nvarchar(500) not null,
	img varchar(50) not null
)
go
insert into BookStore values(N'Yêu em từ cái nhìn đầu tiên',N'Cố Mạn',100.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/1.jpg');
insert into BookStore values(N'Ốc sên chạy',N'Cố Mạn',200.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/2.jpg');
insert into BookStore values(N'Bên nhau trọn đời',N'Cố Mạn',150.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/3.jpg');
insert into BookStore values(N'Bữa trưa tình yêu',N'Cố Mạn',110.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/4.jpg');
insert into BookStore values(N'Sam sam đến đây ăn nè',N'Cố Mạn',180.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/5.jpg');
insert into BookStore values(N'Boss đại nhân ta thua rồi',N'Cố Mạn',160.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/6.jpg');
insert into BookStore values(N'Chân trời góc bể',N'Cố Mạn',50.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/7.jpg');
insert into BookStore values(N'Đã lâu không gặp',N'Cố Mạn',65.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/8.jpg');
insert into BookStore values(N'Hơi ấm',N'Cố Mạn',90.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/9.jpg');
insert into BookStore values(N'Hứa cho em một đời âm áp',N'Cố Mạn',80.000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/10.jpg');
insert into BookStore values(N'Nụ Hôn của sói',N'Cố Mạn',170000,N'Đây là một câu chuyện kể về tình yêu học trò','Img/11.jpg');
go
select * from BookStore
drop table BookStore
drop table account