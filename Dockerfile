FROM openjdk:8
WORKDIR /app
COPY target/cr7ImportsDiscovery.jar /app/cr7ImportsDiscovery.jar
EXPOSE 8888
ENTRYPOINT ["java", "-jar", "cr7ImportsDiscovery.jar"]