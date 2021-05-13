create table list (
    id INTEGER NOT NULL auto_increment,
    title VARCHAR(255),
    description VARCHAR(255),
    list_type VARCHAR(255),
    created DATE,
    modified DATE,
    PRIMARY KEY (id)

) engine=InnoDB;

create table positions (
    id INTEGER NOT NULL auto_increment,
    title VARCHAR(255),
    description VARCHAR(255),
    position_fk INTEGER,
    PRIMARY KEY (id),
    FOREIGN KEY (position_fk) REFERENCES list(id)
) engine=InnoDB;