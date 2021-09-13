
package com.commercetools.docs.meta;

/**
    <h2 id=features>Features</h2>

    <h3 id=embracing-java-8>Embracing Java 8</h3>

    The SDK API uses:

    - {@link java.util.concurrent.CompletionStage}
    - Java Date API: {@link java.time.ZonedDateTime}, {@link java.time.LocalDate} and {@link java.time.LocalTime}
    - {@link FunctionalInterface functional interfaces}

    <h3 id=request-builders>Request builders</h3>

    The SDK provides a request builder which allows to explore the API while writing the program.

    {@include.example example.ExamplesTest#performRequest()}

    The request method objects are immutable as shown in this example.

    {@include.example example.ExamplesTest#immutableRequest()}

    <h3 id=defaults>Good defaults for equals() and hashCode()</h3>

    The SDK's model implementation classes provide default implementations for the methods.

    <h3 id=client-interfaces>Client interfaces</h3>

    The HTTP client abstract itself is a functional interface and can be replaced with test doubles.

    <h3 id=model-factories>Model factory methods</h3>

    Each model has a factory method {@code ::of()} to create a new empty instance. The method {@code ::builder()} returns a new builder instance.

    <h3 id=middlewares>Middlewares</h3>

    The client supports middlewares to adjust request and responses while being executed.
    A {@link io.vrap.rmf.base.client.http.Middleware middleware} is a functional interface
    which has the request and the next middleware as an argument and returns a CompletableFuture with the response. The following
    example shows how to add an additional header.

    {@include.example example.ExamplesTest#middleware()}

    The authentication, logging and other functionality has been implemented in middlewares and is added by default to the {@link io.vrap.rmf.base.client.http.HandlerStack}
    in the {@link io.vrap.rmf.base.client.ClientBuilder}

 */
public class Features {
}
