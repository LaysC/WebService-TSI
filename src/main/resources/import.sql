-- This file allow to write SQL commands that will be emitted in test and dev.
-- The commands are commented as their support depends of the database
-- insert into myentity (id, field) values(1, 'field-1');
-- insert into myentity (id, field) values(2, 'field-2');
-- insert into myentity (id, field) values(3, 'field-3');
-- alter sequence myentity_seq restart with 4;

INSERT INTO book (id, titulo, autor, editor, ano, estaDisponivel)
VALUES
  (1, 'Dom Casmurro', 'Machado de Assis', 'Garnier', 1899, TRUE),
  (2, '1984n', 'George Orwell', 'Secker Warburg', 1949, TRUE),
  (3, 'O Pequeno Príncipe', 'Antoine de Saint-Exupéry', 'Reynal & Hitchcock', 1943, TRUE),
  (4, 'Capitães da Areia', 'Jorge Amado', 'Livraria Martins Editora', 1937, TRUE);

