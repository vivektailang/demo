FROM openjdk:11
#VOLUME /tmp
#EXPOSE 7070
#ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
#ADD ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
#ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]
VOLUME /tmp
EXPOSE 7070
ARG JAR_FILE=target/demo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} app.jar
ENTRYPOINT ["java","-jar","/app.jar"]
