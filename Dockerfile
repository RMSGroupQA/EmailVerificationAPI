FROM maven as build
WORKDIR /build
COPY pom.xml .
COPY . .
RUN mvn clean install

FROM openjdk:8
COPY --from=build /build/target/EmailVerifyAPI-0.0.1-SNAPSHOT.jar  email.jar
EXPOSE 8080
ENTRYPOINT ["java","-jar","email.jar"]
