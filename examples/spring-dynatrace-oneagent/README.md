# Spring MVC example app

Example to show how Java SDK can be used in a Spring Boot application with Dynatrace OneAgent monitoring.

## Requirements

- A Composable Commerce Project with a configured [API Client](https://docs.commercetools.com/tutorials/getting-started#creating-an-api-client).
  Necessary scopes: `view_published_products`, `manage_orders`
- Your Project must have existing products containing variants with SKUs, and at least one customer, the storefront search endpoint must be active.
- If your Project is currently empty, you can install the [SUNRISE sample data](https://docs.commercetools.com/sdk/sunrise-data).

## Installation

1. Clone/Download the example folder.
2. Navigate to the path `spring-dynatrace-oneagent/`.
3. Register the client credentials in environment variables:
   `CTP_CLIENT_ID`, `CTP_CLIENT_SECRET` and `CTP_PROJECT_KEY`

## Using the Spring MVC Example app

### Install Dynatrace OneAgent
Follow the instructions on the [Dynatrace OneAgent page](
https://docs.dynatrace.com/docs/setup-and-configuration/dynatrace-oneagent#tabgroup--technology-support--operating-systems) to install the OneAgent on your system.

#### Install Dynatrace OneAgent on Mac
Currently, it is NOT possible to install Dynatrace OneAgent on macOS. For this case a [Dockerfile](./Dockerfile) is provided.
Use this file to build the application with the OneAgent included on Docker.
1. Run `./gradlew bootJar` to build a JAR file. This JAR file is necessary to build the Docker image.
2. Update ENV variables in the [Dockerfile](./Dockerfile) with your Dynatrace and CTP credentials.
3. Run `docker build -t spring-dynatrace-oneagent .` to build the Docker image.
4. Run `docker run -p 8080:8080 spring-dynatrace-oneagent` to start the Docker container.

### Navigate the application

1. Open a new browser window/tab
2. Navigate to [http://localhost:8080/p](http://localhost:8080/p) and a list of products should appear.

