CREATE DATABASE penguin;

use penguin;

CREATE TABLE if NOT EXISTS teachers(id int AUTO_INCREMENT, name varchar(55), PRIMARY KEY(id));
CREATE TABLE if NOT EXISTS courses(id int AUTO_INCREMENT, name varchar(55), teacher_id int, PRIMARY KEY(id), FOREIGN KEY(teacher_id) REFERENCES teachers(id));


INSERT INTO teachers (name) VALUES ('Johanna Kabir');
INSERT INTO teachers (name) VALUES ('Lara Gilbertr');
INSERT INTO teachers (name) VALUES ('John Smith');
INSERT INTO teachers (name) VALUES ('Danniel Robertson');
INSERT INTO teachers (name) VALUES ('Larry Cooper');


INSERT INTO courses(name, teacher_id) VALUES ('English Grammer', 3);
INSERT INTO courses(name, teacher_id) VALUES ('Mathematics', 1);
INSERT INTO courses(name, teacher_id) VALUES ('Physics', 4);
INSERT INTO courses(name, teacher_id) VALUES ('Chemistry', 4);
INSERT INTO courses(name, teacher_id) VALUES ('Biology', 5);

SELECT courses.name,teachers.name FROM teachers LEFT JOIN courses ON courses.id = teachers.id;


SELECT * FROM teachers WHERE teachers.id = (SELECT courses.teacher_id FROM courses GROUP BY courses.teacher_id ORDER BY COUNT(courses.teacher_id) DESC LIMIT 1);



SELECT teachers.id, teachers.name FROM teachers LEFT JOIN courses ON courses.teacher_id = teachers.id WHERE courses.teacher_id IS NULL;

