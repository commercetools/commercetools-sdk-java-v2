package com.commercetools.docs.meta;

/**
    <h2>Middlewares</h2>

    <p></p>

    <h3>ErrorMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.ErrorMiddleware} is used to react to erroneous HTTP responses. It will always
    be placed as first middleware in the {@link io.vrap.rmf.base.client.http.HandlerStack}. The default implementation
    converts responses with a status code 400 or higher to exceptions. For creating the exceptions it uses a
    {@link io.vrap.rmf.base.client.error.HttpExceptionFactory}.</p>

    {@include.example io.vrap.rmf.base.client.http.ErrorMiddlewareImpl#invoke(io.vrap.rmf.base.client.ApiHttpRequest, java.util.function.Function)}

    <h3>OAuthMiddleware</h3>

    <p>An {@link io.vrap.rmf.base.client.http.OAuthMiddleware} is used to authenticate a request against the commercetools
    APIs. The default implementation adds an auth header to the request instance. In case of an expired token it will try to
    reauthenticate automatically. To retrieve an {@link io.vrap.rmf.base.client.AuthenticationToken} the
    {@link io.vrap.rmf.base.client.http.OAuthHandler} is called.</p>

    {@include.example io.vrap.rmf.base.client.http.OAuthMiddlewareImpl#invoke(io.vrap.rmf.base.client.ApiHttpRequest, java.util.function.Function)}

    <h3>RetryMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.RetryMiddleware} is used to retry a failed request returns with the configured
    status codes e.g. <code>503</code>. For retrying an exponential backoff strategy is used which will increase the wait
    time before each try to avoid overwhelming the API. An jitter is also added to the wait time so that the executor is
    not overwhelmed with multiple parallel request.</p>

 */
public class Middlewares {
}
