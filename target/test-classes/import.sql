-- SQL QUERIES TO SETUP HSQLDB FOR EMBEDDED DAO TESTS

-- Crée des utilisateurs pour les tests CRUD
INSERT INTO user(email, name, password) VALUES ('select@campus.fr', 'felix', 'felix');
INSERT INTO user(email, name, password) VALUES ('update@campus.fr', 'Update13','update');
INSERT INTO user(email, name, password) VALUES ('delete@campus.fr', 'Delete13', 'delete');