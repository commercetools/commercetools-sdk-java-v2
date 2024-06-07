
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
 * <h3 id=policy-middleware>PolicyMiddleware</h3>
 *
 * <p>The {@link io.vrap.rmf.base.client.http.PolicyMiddleware} configures a client to handle failures like gateway timeouts
 * and version conflicts through retrying the request. Limiting the number of parallel requests or timeouts</p>
 *
 * <p>A best practice example to retry on gateway timeouts and similar problems.</p>
 *
 * {@include.example example.ExamplesTest#retry()}
 *
 * <p>For more configuration options see {@link io.vrap.rmf.base.client.http.PolicyBuilder}</p>
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
 *
 * <h3 id=timeouts>Timeouts</h3>
 *
 * <p>Underlying HTTP Clients are by default configured to timeout after 120 seconds. There are different ways to limit
 * the time a call can take. One is to develop a middleware which times out when necessary. This also is the most flexible
 * option as it leaves room to distinguish between different kind of requests like {@link io.vrap.rmf.base.client.ApiHttpMethod#GET GET}
 * requests should timeout after 10 seconds where as POST requests should timeout after 120 seconds. It's best to use a
 * resilience library like <a href="https://failsafe.dev/">failsafe</a> to implement this functionality.</p>
 *
 * {@include.example example.ExamplesTest#timeoutMiddleware()}
 *
 * <p>Alternatively the underlying HTTP can be configured to timeout after a specified amount of time.</p>
 *
 * {@include.example example.ExamplesTest#timeoutOkHttpClient()}
 * {@include.example example.ExamplesTest#timeoutApacheHttpClient()}
 *
 * <p>The third option is to use the timeout functionality of the futures</p>
 *
 * {@include.example example.ExamplesTest#timeoutFuture()}
 */
public class ClientTuning {
}
