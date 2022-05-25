
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.ApiMethod;

/**
 * <h2 id=using>Using SDK</h2>
 *
 * <p>SDK follows a builder pattern when creating requests and model entities. Category resource will be used to demonstrate
 * how to use the SDK. This behaviour is the same for all resources.</p>
 *
 * <h3>Models and Builders</h3>
 *
 * <p>Models are defined as interfaces. For each model a {@link io.vrap.rmf.base.client.Builder} class exists which builds
 * the implementation class of a model. The model builder has a <code>build</code> method which checks that required properties
 * have been set. The <code>buildUnchecked</code> method creates a new instance without checking for required properties</p>
 *
 * <img src="model-classes.svg" alt="Classes of a model">
 *
 * {@include.example example.ExamplesTest#draftBuilder()}
 *
 * <h3>Request DSL</h3>
 *
 * <p>Building request can be done with the help of an ApiRoot, e.g. {@link com.commercetools.api.client.ProjectApiRoot}.
 * The DSL mirrors the directory structure and HTTP methods of the API and allows navigating and discovering the commercetools Composable Commerce
 * API while typing. The HTTP method builders includes methods for every query parameter. Additionally there are
 * the {@link ApiMethod#execute()} and {@link ApiMethod#executeBlocking()} methods which are sending the request using the
 * configured {@link io.vrap.rmf.base.client.ApiHttpClient} and mapping the result to the correct response class. In case
 * the raw JSON is needed {@link ApiMethod#send()} and {@link ApiMethod#sendBlocking()} will return an {@link io.vrap.rmf.base.client.ApiHttpResponse}
 * with the byte array.</p>
 *
 * {@include.example example.ExamplesTest#usage()}
 *
 * @startuml model-classes.svg
 * interface Model
 * class ModelImpl implements Model
 * class ModelBuilder<Builder<Model>>
 * ModelBuilder : Model build()
 * note right of ModelBuilder::build
 *     method checks required properties
 *     have been set
 * endnote
 * ModelBuilder : Model buildUnchecked()
 * ModelImpl <-- ModelBuilder::build
 * ModelImpl <-- ModelBuilder::buildUnchecked
 * @enduml
 */
public class Using {
}
