FROM eclipse-temurin:21-jdk-jammy

WORKDIR /app

COPY src ./src

CMD ["java", "Main"]