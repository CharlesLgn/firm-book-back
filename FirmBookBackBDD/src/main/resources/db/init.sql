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
('Charles', 'Ligony', '1997-05-16', 1, 1, null, CURRENT_DATE, 'bvxyz@hotmail.fr'),
('Cyril', 'Challouatte', '1998-08-12', 1, 2, 'Bureau de Gauche', CURRENT_DATE, 'test.test@t.co'),
('Lucas', 'Cuoco', '1997-06-15', 3, 3, 'Bureau de Droite', CURRENT_DATE, 'lucas@cuoco.fr'),
('Mariia', 'Kokot', '1996-02-10', 2, 4, null, CURRENT_DATE, 'maria@gmail.com');

INSERT INTO poste(lib, level, person_id, boss_id) values
('C.T.O', 10, 1, null),
('Frontend Dev', 5, 2, 1),
('Backend Dev', 5, 3, 1),
('Trainee', 5, 4, 2);
