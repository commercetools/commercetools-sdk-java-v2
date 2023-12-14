# Use an official OpenJDK runtime as a base image
FROM openjdk:17-jdk-slim

ENV DT_PAAS_TOKEN="your PAAS token from Dynatrace (https://docs.dynatrace.com/docs/manage/access-control/access-tokens#paas-token)"
ENV DT_ENVIRONMENT_URL="your environment URL from Dynatrace (https://docs.dynatrace.com/docs/setup-and-configuration/setup-on-container-platforms/docker/set-up-oneagent-on-containers-for-application-only-monitoring#cloud-platforms)"
ENV CTP_CLIENT_SECRET="CTP client secret"
ENV CTP_CLIENT_ID="CTP client ID"
ENV CTP_PROJECT_KEY="CTP project key"

# Set the working directory inside the container
WORKDIR /app

# Copy the packaged JAR file into the container at the specified path
COPY build/libs/spring-dynatrace-oneagent-0.0.1-SNAPSHOT.jar /app/spring-dynatrace-oneagent-0.0.1-SNAPSHOT.jar

# Expose the port that your Spring Boot application will run on
EXPOSE 8080

RUN apt-get update && \
    apt-get install -y wget unzip && \
    rm -rf /var/lib/apt/lists/*

# ARGs for Dynatrace OneAgent

RUN mkdir -p /opt/dynatrace/oneagent && ARCHIVE=$(mktemp) && wget -O $ARCHIVE "https://$DT_ENVIRONMENT_URL.live.dynatrace.com/api/v1/deployment/installer/agent/unix/paas/latest?Api-Token=$DT_PAAS_TOKEN&flavor=default&arch=arm&include=$DT_ONEAGENT_TECHNOLOGY" && unzip -o -d /opt/dynatrace/oneagent $ARCHIVE && rm -f $ARCHIVE

ENV LD_PRELOAD /opt/dynatrace/oneagent/agent/lib64/liboneagentproc.so

# Set the entry point to start Dynatrace OneAgent
ENTRYPOINT [ "java", "-jar", "spring-dynatrace-oneagent-0.0.1-SNAPSHOT.jar" ]
