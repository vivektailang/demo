FROM jdk:11
VOLUME /tmp
EXPOSE 7070
ARG JAR_FILE=targetdemo-0.0.1-SNAPSHOT.jar
ADD ${JAR_FILE} demo-0.0.1-SNAPSHOT.jar
ENTRYPOINT ["java","-jar","/demo-0.0.1-SNAPSHOT.jar"]
