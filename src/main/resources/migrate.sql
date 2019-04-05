create table if not exists groups(
	group_id int not null AUTO_INCREMENT,
	group_number varchar(32) not null,
	subject varchar(64) not null,
	started_year year not null,
	primary key (group_id)
);

create table if not exists students(
	student_id bigint not null AUTO_INCREMENT,
	group_id int not null,
	first_name varchar(32) not null,
	last_name varchar(32) not null,
	email varchar(64) not null,
	password varchar(128) not null,
	last_login datetime,
	primary key (student_id),
	foreign key (group_id) references groups(group_id),
	unique(email)
);

create table if not exists performed_exams(
	id bigint not null AUTO_INCREMENT,
	student_id bigint not null,
	exam_id int not null,
	taken_data datetime,
	exam_result decimal(3.2),
	is_passed boolean,
	primary key (id)
);

create table if not exists exams(
	exam_id int not null AUTO_INCREMENT,
	subject varchar(255) unique not null,
	passing_score decimal(3,2) not null,
	primary key (exam_id)
);

create table if not exists questions(
	question_id bigint not null auto_increment,
	exam_id int not null,
	question_text text,
	image blob,
	difficulty int,
	primary key (question_id),
	foreign key (exam_id) references exams(exam_id)
);

create table if not exists answers(
	answer_id bigint not null AUTO_INCREMENT,
	question_id bigint not null,
	answer text not null,
	is_correct boolean,
	primary key (answer_id),
	foreign key (question_id) references questions(question_id)
);