create TABLE sexe
(
    id  INTEGER primary key AUTO_INCREMENT,
    lib VARCHAR(15)
);

create TABLE person
(
    id          INTEGER primary key AUTO_INCREMENT,
    first_name  VARCHAR(255) NOT NULL,
    last_name   VARCHAR(255) NOT NULL,
    birth_date  date         not null,
    sexe_id     integer      not null,
    post_id     INTEGER,
    room_place  VARCHAR(255),
    arrive_date Date NOT NULL,
    email       VARCHAR(255)
);

create TABLE poste
(
    id        INTEGER PRIMARY KEY AUTO_INCREMENT,
    lib       VARCHAR(255) not null,
    level     INTEGER      not null,
    person_id INTEGER,
    boss_id   INTEGER
);

CREATE TABLE utilisateur
(
    login    VARCHAR(255) NOT NULL,
    password VARCHAR(255) NOT NULL,
    level    INTEGER DEFAULT 0
);

INSERT INTO sexe(lib) values ('Homme'), ('femme'), ('neutre');
INSERT INTO utilisateur(login, password, level) VALUES ('charles', '1234', 5);
INSERT INTO person(first_name, last_name, birth_date, sexe_id, post_id, room_place, arrive_date, email) values
('Charles', 'ligony', CURRENT_DATE, 1, 1, null, CURRENT_DATE, 'bvxyz@hotmail.fr');