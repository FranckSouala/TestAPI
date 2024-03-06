CREATE TABLE province(
    id integer primary key not null auto_increment,
    chef_lieu varchar(50),
    population integer,
    nom varchar(50)
);

CREATE TABLE departement(
   id integer primary key not null auto_increment,
   chef_lieu varchar(50),
   population integer,
   nom varchar(50)
);

