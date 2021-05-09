create table list (
    id integer not null auto_increment,
    title varchar(255),
    description varchar(255),
    list_type varchar(255),
    created DATE,
    modified DATE,
    primary key (id)

) engine=InnoDB;

create table positions (
    id integer not null auto_increment,
    title varchar(255),
    primary key (id),
    FOREIGN KEY (listId) REFERENCES list(id)
) engine=InnoDB;