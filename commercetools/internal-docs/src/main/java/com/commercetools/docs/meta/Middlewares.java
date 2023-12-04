
package com.commercetools.docs.meta;

/**
    {@include.toc}
    <h2 id="middlewares">Middlewares</h2>

    <p></p>

    <h3 id="ErrorMiddleware">ErrorMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.ErrorMiddleware} is used to react to erroneous HTTP responses. It will always
    be placed as first middleware in the {@link io.vrap.rmf.base.client.http.HandlerStack}. The default implementation
    converts responses with a status code 400 or higher to exceptions. For creating the exceptions it uses a
    {@link io.vrap.rmf.base.client.error.HttpExceptionFactory}.</p>

    {@include.example io.vrap.rmf.base.client.http.ErrorMiddlewareImpl#invoke(io.vrap.rmf.base.client.ApiHttpRequest, java.util.function.Function)}

    <h3 id="OAuthMiddleware">OAuthMiddleware</h3>

    <p>An {@link io.vrap.rmf.base.client.http.OAuthMiddleware} is used to authenticate a request against the commercetools Composable Commerce
    APIs. The default implementation adds an auth header to the request instance. In case of an expired token it will try to
    reauthenticate automatically. To retrieve an {@link io.vrap.rmf.base.client.AuthenticationToken} the
    {@link io.vrap.rmf.base.client.http.OAuthHandler} is called.</p>

    {@include.example io.vrap.rmf.base.client.http.OAuthMiddlewareImpl#invoke(io.vrap.rmf.base.client.ApiHttpRequest, java.util.function.Function)}

    <h3 id="PolicyMiddleware">PolicyMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.PolicyMiddleware} is used to act on a failed request returns with the configured
    policies e.g. retry on status code <code>503</code>. For retrying an exponential backoff strategy is used which will increase
    the wait time before each try to avoid overwhelming the API. A jitter is also added to avoid reduce the possibility that parallel
    requests will be retried at the same time.</p>

    <p>The policy implementations use the library <a href="https://failsafe.dev/">failsafe</a></p>

    <h3 id="ConcurrentModificationMiddleware">ConcurrentModificationMiddleware</h3>

    <p>The {@link com.commercetools.api.client.ConcurrentModificationMiddleware} is used to retry a failed request which returns the
    status codes <code>409</code> (concurrent modification). For retrying an exponential backoff strategy is used which will increase
    the wait time before each try to avoid overwhelming the API. A jitter is also added to avoid reduce the possibility that parallel
    requests will be retried at the same time.</p>

    <p>The retry implementation uses the library <a href="https://failsafe.dev/">failsafe</a></p>

    <h3 id="UserAgentMiddleware">UserAgentMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.UserAgentMiddleware} adds an user agent header to every request. By default
    is submits the following data:</p>
    <ul>
        <li>SDK version</li>
        <li>JVM runtime version</li>
        <li>Operating system name and version</li>
    </ul>

    {@include.example io.vrap.rmf.base.client.ClientBuilder#buildDefaultUserAgent()}

    <h3 id="AcceptGZipMiddleware">AcceptGZipMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.AcceptGZipMiddleware} adds an <code>Accept-Encoding: gzip</code> header, to
    enable the ability of an compressed response as this reduces the data transport time.</p>

    {@include.example io.vrap.rmf.base.client.http.AcceptGZipMiddleware#invoke(io.vrap.rmf.base.client.ApiHttpRequest, java.util.function.Function)}

    <h3 id="InternalLoggerMiddleware">InternalLoggerMiddleware</h3>

    <p>The {@link io.vrap.rmf.base.client.http.InternalLoggerMiddleware}</p> logs every request send using the SDK. Depending
    on the configured logging level the default implementation logs the sent request and the returning response. The info level
    outputs the request method, url and the response status code. Using debug level the request and response instance will be logged.
    With trace level it will pretty print body of the request as well the response. To avoid leaking of sensitive data the
    logger redacts passwords, tokens and some other sensitive data.
 */
public class Middlewares {
}
