FROM openjdk:8-jdk-alpine
MAINTAINER ppant
RUN mkdir /app
WORKDIR /app
COPY ./target/GetReviews-v1.jar getreviews-v1.jar

CMD java -jar getreviews-v1.jar
