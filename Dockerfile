FROM sgrio/java-oracle
MAINTAINER Anibelin(myemail@mymail.com)
ADD target/helloWorldMaven-0.0.1-SNAPSHOT.jar helloWorldMaven.jar
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /helloWorldMaven.jar" ]

