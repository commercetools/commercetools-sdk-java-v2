
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.ApiMethod;

/**
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
 */
public class ClientTuning {
}
