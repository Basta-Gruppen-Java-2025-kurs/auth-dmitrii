-- Users and user roles
INSERT INTO users (username, password) VALUES
('test', '$2a$12$BxH.QaTRK7p4f3r.Gc//YOozw1Po0U6TAVXkl33tSzfEGHizIurPO'),  -- test
('admin', '$2a$12$GP/ecvzGkUoXyQv6nFKaH.uUHApsyNFR7khk9CW6D701VXt2zsRNW'); -- admin

INSERT INTO roles (name) VALUES ('ROLE_USER'), ('ROLE_ADMIN');

INSERT INTO user_roles (user_id, role_id) VALUES (1,1), (2,1), (2,2);

-- Games
INSERT INTO games (title, genre, rating, release_year) VALUES
('Unnamed', 'missile simulator', NULL, 1947),
('Turochamp', 'chess', NULL, 1948),
('Bertie the Brain', 'tic-tac-toe', NULL, 1950),
('Nim', 'nim', NULL, 1951),
('Spacewar!', 'space duel', 10.0, 1962),
('Minecraft', 'open world survival sandbox', 10.0, 2009),
('Starcraft', 'real time strategy', 9.9, 1998),
('Warcraft', 'real time strategy', 9.8, 1994),
('Frogger', 'arcade/action', 7.0, 1981);