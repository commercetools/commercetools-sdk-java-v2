# Spring MVC example app

Example to show how Java SDK can be used in a Spring Boot application with OpenTelemetry monitoring enabled.
The example application is configured for exporting logs, metrics and traces using OpenTelemetry using the
OpenTelemetry auto instrumentation.

## Requirements

- A Composable Commerce Project with a configured [API Client](https://docs.commercetools.com/tutorials/getting-started#creating-an-api-client).
  Necessary scopes: `view_published_products`, `manage_orders`
- Your Project must have existing products containing variants with SKUs, and at least one customer, the storefront search endpoint must be active.
- If your Project is currently empty, you can install the [SUNRISE sample data](https://docs.commercetools.com/sdk/sunrise-data).

### OpenTelemetry collector

The [OpenTelemetry collector example](https://github.com/commercetools/opentelemetry-collector-example) repository includes
a docker compose setup for starting a local OpenTelemetry collector in combination with Prometheus, Grafana, JaegerUI,
NewRelic and Dynatrace as exporter target.

## Installation

1. Clone/Download the example folder.
2. Navigate to the path `spring-otel/`.
3. Register the client credentials in environment variables:
   `CTP_CLIENT_ID`, `CTP_CLIENT_SECRET` and `CTP_PROJECT_KEY`
4. If you are collecting data for Dynatrace, set the environment variable `OTEL_PROVIDER=DYNATRACE`. This will ensure that no histogram data are exported as histogram is not supported in Dynatrace using opentelemetry.

## Using the Spring MVC Example app

### Prepare OpenTelemetry Auto Instrumentation

1. Run `./gradlew downloadOtel`

### Start the server

1. Open a new Terminal.
2. Run `./gradlew bootRun`.
3. The server starts.

### Navigate the application

1. Open a new browser window/tab
2. Navigate to [http://localhost:8080/p](http://localhost:8080/p) and a list of products should appear.

### View Traces, Metrics

With the OpenTelemetry collector example docker setup running navigate to http://localhost:16686/jaeger/ui/search to
see the traces in the Jaeger UI.

Grafana dashboards are to be found at http://localhost:3000/grafana/dashboards/

Prometheus is located at http://localhost:9090

### Choose your OpenTelemetry provider
To choose exporting to either NewRelic or Dynatrace you need to set the environment variable `OTEL_PROVIDER`
to either `local`, `newrelic` or `dynatrace`. By default, the `local` settings are used.
