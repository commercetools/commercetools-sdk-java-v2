
package com.commercetools.docs.meta;

/**
 * <h2 id=configuration>Configuration</h2>
 *
 * <h3>ApiRoot and ProjectApiRoot</h3>
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
 * <h3>Custom HTTP client</h3>
 *
 * <p>The builder can be instantiated with a custom {@link io.vrap.rmf.base.client.VrapHttpClient} instance. For example a
 * specific instance of a client</p>
 *
 * {@include.example example.ExamplesTest#customHttpClient()}
 *
 * <p>This can also be useful to wrap preconfigured clients e.g. with additional middlewares</p>
 *
 * {@include.example example.ExamplesTest#wrappedClient()}
 */
public class Configuration {
}
