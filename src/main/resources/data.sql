INSERT INTO book (title, author) VALUES ('Spring Boot in Action', 'Craig Walls');
INSERT INTO book (title, author) VALUES ('Clean Code', 'Robert C. Martin');
INSERT INTO book (title, author) VALUES ('Clean Code', 'Shankar K. Leela');

--| Action                                       | Result                             |
--| -------------------------------------------- | ---------------------------------- |
--| `data.sql` on app startup                    | Inserts hardcoded data into DB     |
--| `POST` request from Postman                  | Inserts data into DB via API       |
--| `GET` request                                | Reads data from DB and returns it  |
--| Automatically save POSTed data to `data.sql` | ❌ Not supported (must do manually) |
