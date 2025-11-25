#Start with a base image containing Java runtime
FROM eclipse-temurin:21-jdk
#Information around who maintains the image
LABEL "org.opencontainers.image.authors"="salma.com"
# Add the application's jar to the image
COPY target/joueur-microservice-0.0.1-SNAPSHOT.jar joueur-microservice-0.0.1-SNAPSHOT.jar
# execute the application
ENTRYPOINT ["java", "-jar", "joueur-microservice-0.0.1-SNAPSHOT.jar"]