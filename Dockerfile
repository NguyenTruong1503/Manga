# Build stage
FROM maven:3.8.6-openjdk-17 AS build
WORKDIR /app

# Sao chép chỉ các file cần thiết để tận dụng cache
COPY pom.xml .
COPY src ./src
RUN mvn clean package -DskipTests

# Run stage
FROM eclipse-temurin:17-jre-jammy
WORKDIR /app

# Sao chép file .war từ stage build
COPY --from=build /app/target/DrComputer-0.0.1-SNAPSHOT.war drcomputer.war
EXPOSE 8080

# Chạy ứng dụng
ENTRYPOINT ["java", "-jar", "drcomputer.war"]
