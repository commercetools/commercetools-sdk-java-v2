# Me endpoint checkout app

Example to show how the ME endpoints can be used with the Java SDK in a Spring Boot application.

## Requirements

- A Composable Commerce Project with a configured [API Client](https://docs.commercetools.com/tutorials/getting-started#creating-an-api-client).
  Necessary scopes: `view_published_products`, `view_categories`, `manage_my_profile`, `manage_my_shopping_lists`, `manage_my_payments`, `manage_my_orders`
- Your Project must have existing products containing variants with SKUs, and at least one customer, the storefront search endpoint must be active.
- If your Project is currently empty, you can install the [SUNRISE sample data](https://docs.commercetools.com/sdk/sunrise-data).

## Installation

1. Clone/Download the example folder.
2. Navigate to the path `spring/`.
3. Register the client credentials in environment variables:
   `CTP_CLIENT_ID`, `CTP_CLIENT_SECRET` and `CTP_PROJECT_KEY`

## Using the ME Endpoint Checkout App

You should start the server before the client and keep both running in separate Terminal windows.

### Start the server

1. Open a new Terminal.
2. Run `./gradlew bootRun`.
3. The server starts.

### Navigate the application

1. Open a new browser window/tab
2. Navigate to [http://localhost:8080/p](http://localhost:8080/p) and a list of products should appear.
