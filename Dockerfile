FROM amazoncorretto:17

WORKDIR /app

COPY target/dining-room-eureka-server-0.0.1-SNAPSHOT.jar /app.jar

ENV DB_HOST=mysql
ENV DB_PORT=3306

EXPOSE 8761

CMD ["java", "-jar", "/app.jar"]