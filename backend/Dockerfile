FROM openjdk:17-oracle
LABEL authors="swamy.v"
VOLUME /tmp
ARG JAR_FILE="/../target/books-1.0-SNAPSHOT.jar"
COPY ${JAR_FILE} books.jar

ENTRYPOINT ["java", "-jar", "/books.jar"]