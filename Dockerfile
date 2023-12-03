FROM openjdk:17-alpine
ENV SPRING_PROFILES_ACTIVE=dev
ENV SERVER_PORT=8082
COPY target/redis-cache-app.jar  /tmp/redis-cache-app.jar
WORKDIR /tmp/
EXPOSE $SERVER_PORT
ENTRYPOINT ["java","-jar","redis-cache-app.jar"]