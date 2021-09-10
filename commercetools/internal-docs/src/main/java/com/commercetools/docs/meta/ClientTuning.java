
package com.commercetools.docs.meta;

/**
    <h2 id=client-tuning>Tuning the client</h2>

    <h3 id=blocking-execution>Blocking execution</h3>

    In a lot of frameworks there is no support for asynchronous execution and so it is necessary to wait for the responses.

    The Client can wait for responses with the method `executeBlocking()`. This method enforces a timeout for resilience and throws directly ApiHttpExceptions.

    {@include.example example.ExamplesTest#executeBlocking()}

    <h3 id=retry-middleware>RetryMiddleware</h3>

    The RetryMiddleware configures a Client to handle failures like gateway timeouts and version conflicts through retrying the request.

    A best practice example to retry on gateway timeouts and similar problems

    {@include.example example.ExamplesTest#retry()}

    <h3 id=configure-http-client>Configure the underlying http client</h3>

    The `ApiRootBuilder` has create methods which allow to pass a preconfigured HTTP client.

    {@include.example example.ExamplesTest#proxy()}
 */
public class ClientTuning {
}
