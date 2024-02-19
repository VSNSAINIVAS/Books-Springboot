-- Create user
CREATE USER IF NOT EXISTS '${MYSQL_INIT_USER}'@'%' IDENTIFIED BY '${MYSQL_INIT_PASSWORD}';
GRANT ALL PRIVILEGES ON *.* TO '${MYSQL_INIT_USER}'@'%' WITH GRANT OPTION;
FLUSH PRIVILEGES;

-- Initialize database and create table
USE books;

CREATE TABLE IF NOT EXISTS book (
    book_id INT AUTO_INCREMENT PRIMARY KEY,
    book_title VARCHAR(255),
    book_author VARCHAR(255),
    bookisbn VARCHAR(255),
    book_abstract TEXT
);
