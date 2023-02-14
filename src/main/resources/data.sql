INSERT INTO cinema (name)
VALUES ('Cinéma Paradiso'),
       ('Le Grand Rex'),
       ('UGC Odéon');

INSERT INTO movie (title, director)
VALUES ('Les dents de la mer', 'Steven Spielberg'),
       ('Forrest Gump', 'Robert Zemeckis'),
       ('La La Land', 'Damien Chazelle');

INSERT INTO showtime (cinema_id, movie_id, start_time, end_time)
VALUES (1, 1, '2022-02-14 18:00:00', '2022-02-14 20:04:00'),
       (1, 2, '2022-02-14 20:30:00', '2022-02-14 22:52:00'),
       (2, 3, '2022-02-14 18:15:00', '2022-02-14 20:23:00'),
       (2, 1, '2022-02-14 21:00:00', '2022-02-14 23:04:00'),
       (3, 2, '2022-02-14 19:00:00', '2022-02-14 21:22:00'),
       (3, 3, '2022-02-14 21:30:00', '2022-02-14 23:38:00');
