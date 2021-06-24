FROM openjdk:11-slim

LABEL MAINTAINER="Nikita Lysiakov"

ADD target/demo-*.jar app.jar

# passed by build.sh
ARG PROFILE

# concat with some app profiles
ENV SPRING_PROFILES_ACTIVE=docker,openapi,$PROFILE


ENTRYPOINT [ "java", "-jar", "/app.jar" ]

