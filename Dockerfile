FROM eclipse-temurin:17.0.12_7-jdk-jammy
COPY . .
RUN ./mvnw clean install -DskipTests
ENTRYPOINT [ "java", "-jar", "target/spring_api-0.0.1-SNAPSHOT.jar" ]