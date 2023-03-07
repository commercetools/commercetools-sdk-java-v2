
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.ClientBuilder;
import io.vrap.rmf.base.client.http.ErrorMiddleware;

/**
 * {@include.toc}
 * <h2 id=configuration>Configuration</h2>
 *
 * <h3 id="api-root">ApiRoot and ProjectApiRoot</h3>
 *
 * <p>The SDK modules provide an ApiRootBuilder to create an {@link io.vrap.rmf.base.client.ApiHttpClient}. To ease the development
 * the builder can also create a module specific ApiRoot or ProjectApiRoot. E.g.: {@link com.commercetools.api.client.ApiRoot}
 * and {@link com.commercetools.api.client.ProjectApiRoot}
 * </p>
 * <p>Creating http requests starts from the ApiRoot which  holds information specific to the project. The following example
 * shows how to configure an API root and a project scoped root:</p>
 *
 * {@include.example example.ExamplesTest#instance()}
 *
 * <p>Similar configuration to create the root instances for the Import API</p>
 *
 * {@include.example example.ImportExamplesTest#instance()}
 *
 * <h3 id="custom-client">Custom HTTP client</h3>
 *
 * <p>The builder can be instantiated with a custom {@link io.vrap.rmf.base.client.VrapHttpClient} instance. For example a
 * specific instance of a client</p>
 *
 * {@include.example example.ExamplesTest#customHttpClient()}
 *
 * <p>This can also be useful to wrap preconfigured clients e.g. with additional middlewares</p>
 *
 * {@include.example example.ExamplesTest#wrappedClient()}
 *
 * <h3 id="error-handling">Error handling</h3>
 *
 * <p>The client builder adds methods to allow the customization of the error handling</p>
 *
 * <h4 id="unwrap-exceptions">Unwrap exceptions</h4>
 *
 * <p>By default the {@link io.vrap.rmf.base.client.http.ErrorMiddleware} is configured to throw a CompletionException. The
 * {@link io.vrap.rmf.base.client.ClientBuilder#withErrorMiddleware(ErrorMiddleware.ExceptionMode)} method allows to configure
 * the middleware to unwrap the causing exception.</p>
 *
 * {@include.example example.ExamplesTest#exceptionMode()}
 *
 * <h4 id="not-found">Not found</h4>
 *
 * <p>The {@link ErrorMiddleware} throws for every response with a status code 400 or higher an exception. This can be unwanted
 * behaviour for a {@link io.vrap.rmf.base.client.error.NotFoundException}. The method {@link ClientBuilder#addNotFoundExceptionMiddleware()}
 * configures the client to return a body with a NULL value instead. The method also allows the filtering of specific request to be
 * captured.</p>
 *
 * {@include.example example.ExamplesTest#notFoundMiddleware()}
 */
public class Configuration {
}
