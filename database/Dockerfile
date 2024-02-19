FROM mysql:latest
LABEL authors="swamy.v"
# Execute SQL commands directly in Dockerfile
RUN echo "\
CREATE USER IF NOT EXISTS '${MYSQL_INIT_USER}'@'%' IDENTIFIED BY '${MYSQL_INIT_PASSWORD}'; \
GRANT ALL PRIVILEGES ON *.* TO '${MYSQL_INIT_USER}'@'%' WITH GRANT OPTION; \
FLUSH PRIVILEGES; \
\
USE books; \
CREATE TABLE IF NOT EXISTS book ( \
    book_id INT AUTO_INCREMENT PRIMARY KEY, \
    book_title VARCHAR(255), \
    book_author VARCHAR(255), \
    bookisbn VARCHAR(255), \
    book_abstract TEXT \
);" > /docker-entrypoint-initdb.d/init.sql
