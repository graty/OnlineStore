CREATE TABLE users (
 id long AUTO_INCREMENT,
 first_name varchar(255) NOT NULL,
 last_name varchar(255) NOT NULL,
 username varchar(50) NOT NULL
);

CREATE TABLE product (
 id long AUTO_INCREMENT,
 name varchar(255) NOT NULL,
 description varchar(255) NOT NULL,
 price double NOT NULL
);
