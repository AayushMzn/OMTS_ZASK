CREATE database omts;

USE omts;

create table customer
	(customer_id int primary key auto_increment,
	first_name varchar(20),
	last_name varchar(20),
	phone_num bigint(10) not null,
	email varchar(30) not null unique, 
	password varchar(30) not null);

create table hall 
	(hall_id int primary key auto_increment,
	hall_name varchar(10),
	seats int(3));

create table genre
	(genre_id int primary key auto_increment,
	genre_name varchar(20));

create table movies
	(movie_id int primary key auto_increment,
	genre_id int,
	movie_name varchar(20),
	length varchar(20),
	director varchar(20),
	cast varchar(70),
	rating int(2),
	run_date varchar(20),
	foreign key (genre_id) references genre(genre_id));

create table shift
	(shift_id int primary key auto_increment,
	shift_time varchar(20));

create table shows
	(show_id int primary key auto_increment,
	hall_id int,
	movie_id int,
	shift_id int,
	tickets_num int,
	price float,
	date date,
	foreign key (hall_id) references hall(hall_id),
	foreign key (movie_id) references movies(movie_id), 
	foreign key (shift_id) references shift(shift_id)); 

create table status 
	(status_id int primary key auto_increment,
	status_name varchar(20));

create table booking( booking_id int primary key auto_increment,
	show_id int,
	customer_id int, 
	date date,
	status_id int,
	foreign key (show_id) references shows(show_id),
	foreign key (customer_id) references customer(customer_id),
	foreign key (status_id) references status(status_id));

 create table ticket(
 	ticket_id int primary key auto_increment,
	booking_id int,
	price float check (price>0),
	status_id int,
	foreign key (booking_id) references booking(booking_id),
	foreign key (status_id) references status(status_id));

insert into customer(first_name,last_name,phone_num,email,password) values ("Samrat","Singh","9860123456","singh.samrat@gmail.com","samrat"),
	("Jeena","Maharjan","9860654321","mhzn.jeena@gmail.com","jeena"),
	("Aayush","Maharjan","9860987654","mhzn.aayush@gmail.com","aayush"),
	 ("Smriti","Maharjan","9860456789","mhzn.smriti@gmail.com","smriti"),
	("Karina","Shrestha","9813123456","shrestha.karina@gmail.com","karina"),
	("Shristi","Joshi","9813654321","joshi.shristi@gmail.com","shristi");

insert into genre(genre_name) values
    	("action"),
    	("adventure"),
    	("comedy"),
    	("drama"),
    	("fantasy"),
    	("horror"),
    	("magic"),
   	 ("music"),
   	 ("mystery"),
    	("psychological"),
    	("romance"),
    	("sci-fi"),
    	("sports"),
    	("supernatural"),
    	("thriller"),
    	("yuri");

insert into hall(hall_name,seats) values
    	("Kumari","150"),
    	("Bigmovies","150"),
    	("Bishal","150");

insert into shift(shift_time) values
    	("6 am - 9 am"),
    	("11 am - 2 am"),
   	("4 pm - 7 pm"),
    	("9 pm - 12 pm");


insert into movies (genre_id, movie_name, length, director, cast, rating, run_date) values
 	("1","Avengers:Infinity war","2 hrs 40 min","Anthony Russo","Robert D.Jr,Chris Patt","8.5","Jan-15:Feb-15"),
    	("11","Kimi no Nawa","1 hr 52 min","Makoto Shinkai","Miyamizu Mitsuha,Tachibana Taki","9.1","Jan-15:Feb-15"),
    	("6","Conjuring","1 hr 52 min","James Wan","Patrick Wilson,Vera Farmiga","7.5","Jan-15:Feb-15"),
    	("8","La la Land","2 hrs 8 min","Damien Chalzelle","Ryan Gosling,Emma Stone","8","Jan-15:Feb-15");

insert into shows (hall_id,movie_id,shift_id,tickets_num,price,date) values
    	 ("1","1","1","150","Rs. 425","2020/01/15"),
    	 ("2","2","2","150","Rs. 315","2020/01/20"),
    	 ("3","3","4","150","Rs. 315","2020/01/23"),
    	 ("3","5","1","150","Rs. 315","2020/01/28");

insert into status (status_name) values
    	("Booked"),
    	("Canceled");


