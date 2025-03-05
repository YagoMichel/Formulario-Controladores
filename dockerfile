FROM amazoncorretto:17-alpine-jdk
COPY target/formulario-0.0.1-SNAPSHOT app.jar
ENTRYPOINT ["java","-jar","/app.jar"