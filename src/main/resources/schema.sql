CREATE TABLE cinema
(
    id   INT PRIMARY KEY AUTO_INCREMENT,
    name VARCHAR(255) NOT NULL
);

CREATE TABLE movie
(
    id       INT PRIMARY KEY AUTO_INCREMENT,
    title    VARCHAR(255) NOT NULL,
    director VARCHAR(255) NOT NULL
);

CREATE TABLE showtime
(
    id         INT PRIMARY KEY AUTO_INCREMENT,
    cinema_id  INT       NOT NULL,
    movie_id   INT       NOT NULL,
    start_time TIMESTAMP NOT NULL,
    end_time   TIMESTAMP NOT NULL,
    FOREIGN KEY (cinema_id) REFERENCES cinema (id),
    FOREIGN KEY (movie_id) REFERENCES movie (id)
);
