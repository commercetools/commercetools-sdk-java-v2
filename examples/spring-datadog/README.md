# Spring MVC example app

Example to show how Java SDK can be used in a Spring Boot application with Datadog monitoring. This example uses [datadog-api-client-java](https://github.com/DataDog/datadog-api-client-java).

## Requirements

- A Composable Commerce Project with a configured [API Client](https://docs.commercetools.com/tutorials/getting-started#creating-an-api-client).
  Necessary scopes: `view_published_products`, `manage_orders`
- Your Project must have existing products containing variants with SKUs, and at least one customer, the storefront search endpoint must be active.
- If your Project is currently empty, you can install the [SUNRISE sample data](https://docs.commercetools.com/sdk/sunrise-data).

## Installation

1. Clone/Download the example folder.
2. Navigate to the path `spring-datadog/`.
3. Register the client credentials in environment variables:
   `CTP_CLIENT_ID`, `CTP_CLIENT_SECRET`, `CTP_PROJECT_KEY`
4. Add Datadog API key to environment variable as `DD_API_KEY`. If necessary, add `DD_SITE` to environmental variable as well.

## Using the Spring MVC Example app

### Start the server

1. Open a new Terminal.
2. Run `./gradlew bootRun`.
3. The server starts.

### Navigate the application

1. Open a new browser window/tab
2. Navigate to [http://localhost:8080/p](http://localhost:8080/p) and a list of products should appear.
