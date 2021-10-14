FROM openjdk:11-jre-slim
ADD ./target/mongoexample-0.0.1-SNAPSHOT.jar app.jar
ENV JAVA_OPTS=''
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]
EXPOSE 9094