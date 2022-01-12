
package com.commercetools.docs.meta;

import io.vrap.rmf.base.client.ApiMethod;

/**
 * <h2 id=general-concept>General concept of the SDK</h2>
 *
 * The SDK provides classes and interfaces to interact with the commercetools APIs in an object oriented way.
 *
 * <h3>ApiHttpClient</h3>
 *
 * The {@link io.vrap.rmf.base.client.ApiHttpClient} defines the interface to interact with the API. It executes requests
 * and maps the response to the correct class and returns it. The ApiHttpClient supports multiple different HTTP client
 * implementations and can the behavior can be adjusted using {@link io.vrap.rmf.base.client.http.Middleware middlewares}.
 *
 * <h3>ApiRoot & ProjectApiRoot</h3>
 *
 * The {@link com.commercetools.api.client.ApiRoot} and {@link com.commercetools.api.client.ProjectApiRoot} provide a way
 * to explore the functionality of the API while coding. All endpoints are reachable using the chainable calls from
 * the API root as like as the URI hierarchy of the API describes them. All request builder instances are immutable.
 *
 * <h3>ApiMethod</h3>
 *
 * For every resource endpoint and HTTP method a specific {@link io.vrap.rmf.base.client.ApiMethod} exists. It specifies
 * the request type and the response return type. Also these classes define methods for the possible query parameters.
 * The `with` methods set the parameter to the specified value and drop already defined ones. The `add` methods will
 * add an additional parameter with the specified value. The ApiMethod classes are immutable.
 *
 * The {@link ApiMethod#execute()} and {@link ApiMethod#executeBlocking()} can be used to directly execute the request
 * using the configured ApiHttpClient. {@link ApiMethod#send()} and {@link ApiMethod#sendBlocking()} will execute the
 * request and return the response as byte array instead of mapping it.
 */
public class GeneralConcept {
}