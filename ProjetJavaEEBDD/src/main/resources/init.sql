create TABLE sexe
(
    id  INTEGER primary key,
    lib VARCHAR(15)
);

create TABLE person
(
    id          INTEGER primary key,
    first_name  VARCHAR(255) NOT NULL,
    last_name   VARCHAR(255) NOT NULL,
    birth_date  date         not null,
    sexe_id     integer      not null,
    post_id     INTEGER      not null,
    room_place  VARCHAR(255),
    arrive_date Date default CURRENT_DATE,
    email       VARCHAR(255)
);

create TABLE poste
(
    id        INTEGER PRIMARY KEY,
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
)



