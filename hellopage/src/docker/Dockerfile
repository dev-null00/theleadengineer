FROM java:8-alpine
RUN mkdir -p /var/www
ADD hello.yml /var/www
ADD hellopage-1.0-SNAPSHOT.jar /var/www
EXPOSE 7122
WORKDIR /var/www
ENTRYPOINT ["java", "-jar","hellopage-1.0-SNAPSHOT.jar", "server", "hello.yml"]