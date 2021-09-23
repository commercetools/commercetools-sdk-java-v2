
package com.commercetools.docs.meta;

/**
    <h2 id=configuration>Configuration</h2>

    <h3>ApiRoot and ProjectApiRoot</h3>

    <p>The SDK modules provide an ApiRootBuilder to create an {@link io.vrap.rmf.base.client.ApiHttpClient}. To ease the development
    the builder can also create a module specific ApiRoot or ProjectApiRoot. E.g.: {@link com.commercetools.api.client.ApiRoot} and {@link com.commercetools.api.client.ProjectApiRoot}
    </p>
    <p>Creating http requests starts from the ApiRoot which  holds information specific to the project. To configure the
    ApiRoot use the following method:</p>

    {@include.example example.ExamplesTest#instance()}

    {@include.example example.ImportExamplesTest#instance()}

    {@include.example example.ImportExamplesTest#euInstance()}
 */
public class Configuration {
}
