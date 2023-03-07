
package com.commercetools.docs.meta;

/**
 * {@include.toc}
 * <h2 id=features>Features</h2>
 *
 * <h3 id=embracing-java-8>Embracing Java 8</h3>
 *
 * <p>The SDK API uses:</p>
 *
 * <ul>
 *     <li>{@link java.util.concurrent.CompletionStage}</li>
 *     <li>Java Date API: {@link java.time.ZonedDateTime}, {@link java.time.LocalDate} and {@link java.time.LocalTime}</li>
 *     <li>{@link FunctionalInterface functional interfaces}</li>
 * </ul>
 * <h3 id=request-builders>Request builders</h3>
 *
 * <p>The SDK provides a request builder which allows to explore the API while writing the program.</p>
 *
 * {@include.example example.ExamplesTest#performRequest()}
 *
 * <p>The request method objects are immutable as shown in this example.</p>
 *
 * {@include.example example.ExamplesTest#immutableRequest()}
 *
 * <h3 id=defaults>Good defaults for equals() and hashCode()</h3>
 *
 * <p>The SDK's model implementation classes provide default implementations for the methods.</p>
 *
 * <h3 id=client-interfaces>Client interfaces</h3>
 *
 * <p>The HTTP client abstract itself is a functional interface and can be replaced with test doubles.</p>
 *
 * <h3 id=model-factories>Model factory methods</h3>
 *
 * <p>Each model has a factory method {@code ::of()} to create a new empty instance. The method {@code ::builder()}
 * returns a new builder instance.</p>
 *
 * <h3 id=middlewares>Middlewares</h3>
 *
 * <p>The client supports middlewares to adjust request and responses while being executed.
 * A {@link io.vrap.rmf.base.client.http.Middleware middleware} is a functional interface
 * which has the request and the next middleware as an argument and returns a CompletableFuture with the response. The following
 * example shows how to add an additional header.</p>
 *
 * {@include.example example.ExamplesTest#middleware()}
 *
 * <p>The authentication, logging and other functionality has been implemented in middlewares and is added by default to the {@link io.vrap.rmf.base.client.http.HandlerStack}
 * in the {@link io.vrap.rmf.base.client.ClientBuilder}</p>
 */
public class Features {
}
