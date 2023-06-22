FROM openjdk:11
COPY target/*.jar  app/main.jar
CMD ['java','-jar','app/main.jar']
EXPOSE 8080