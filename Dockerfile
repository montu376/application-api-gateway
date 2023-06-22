FROM openjdk
COPY target/*.jar  app/main.jar
ENTRYPOINT ['java' ,'-jar','app/main.jar']
EXPOSE 8080