mysql> use FIL_DB1;
Database changed
mysql> CREATE TABLE faculty(id INT AUTO_INCREMENT PRIMARY KEY,name VARCHAR(50),email VARCHAR(100) UNIQUE,password VARCHAR(40),mobile_number VARCHAR(15))
    -> ;
Query OK, 0 rows affected (0.18 sec)

mysql> CREATE TABLE course(id INT AUTO_INCREMENT PRIMARY KEY, name VARCHAR(50),duration VARCHAR(30));
Query OK, 0 rows affected (0.02 sec)

mysql> CREATE TABLE faculty_course_assignment(id INT AUTO_INCREMENT PRIMARY
    -> KEY, faculty_id INT, course_id INT, FOREIGN KEY(faculty_id) REFERENCES faculty(id),FOREIGN KEY (course_id) REFERENCES course(id));
Query OK, 0 rows affected (0.04 sec)