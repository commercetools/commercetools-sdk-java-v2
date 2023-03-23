
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.ApiMethod;

/**
 * {@include.toc}
 * <h2 id=client-tuning>Tuning the client</h2>
 *
 * <h3 id=blocking-execution>Blocking execution</h3>
 *
 * <p>In a lot of frameworks there is no support for asynchronous execution and so it is necessary to wait for the responses.
 * The client can wait for responses with the method {@link ApiMethod#executeBlocking()}. This method enforces a timeout for
 * resilience and throws directly {@link io.vrap.rmf.base.client.ApiHttpException}.</p>
 *
 * {@include.example example.ExamplesTest#executeBlocking()}
 *
 * <h3 id=retry-middleware>RetryMiddleware</h3>
 *
 * <p>The {@link io.vrap.rmf.base.client.http.RetryRequestMiddleware} configures a client to handle failures like gateway timeouts
 * and version conflicts through retrying the request.</p>
 *
 * <p>A best practice example to retry on gateway timeouts and similar problems</p>
 *
 * {@include.example example.ExamplesTest#retry()}
 *
 * <h3 id=configure-http-client>Configure the underlying http client</h3>
 *
 * <p>The {@link com.commercetools.api.defaultconfig.ApiRootBuilder} has create methods which allow to pass a preconfigured HTTP client.</p>
 *
 * {@include.example example.ExamplesTest#proxy()}
 *
 * <h3 id=limit-requests>Limit concurrent requests</h3>
 *
 * <p>By default the client is initialized with a ForkJoinPool. The underlying HTTP client may have it's own configuration for
 * limiting the maximum number of requests. By default the OkHttp and Apache AsyncHTTP client will be configured for 64 maximum
 * requests.</p>
 *
 * <p>To adjust this instantiate the HTTP client in the client builder</p>
 *
 * {@include.example example.ExamplesTest#httpConcurrentLimitation()}
 *
 * <p>Another option is to use a middleware which limits the number of requests. The SDK provides for this use case
 * the {@link io.vrap.rmf.base.client.http.QueueMiddleware}.</p>
 *
 * {@include.example example.ExamplesTest#queueConcurrentLimitation()}
 */
public class ClientTuning {
}
