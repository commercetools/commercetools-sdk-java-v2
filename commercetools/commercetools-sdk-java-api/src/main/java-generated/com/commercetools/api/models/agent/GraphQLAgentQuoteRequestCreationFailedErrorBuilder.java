
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentQuoteRequestCreationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentQuoteRequestCreationFailedError graphQLAgentQuoteRequestCreationFailedError = GraphQLAgentQuoteRequestCreationFailedError.builder()
 *             .cartId("{cartId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentQuoteRequestCreationFailedErrorBuilder
        implements Builder<GraphQLAgentQuoteRequestCreationFailedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String cartId;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentQuoteRequestCreationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentQuoteRequestCreationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @param cartId value to be set
     * @return Builder
     */

    public GraphQLAgentQuoteRequestCreationFailedErrorBuilder cartId(final String cartId) {
        this.cartId = cartId;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @return pattern properties
     */

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    /**
     *  <p><code>id</code> of the orphaned Cart, for retry or cleanup.</p>
     * @return cartId
     */

    public String getCartId() {
        return this.cartId;
    }

    /**
     * builds GraphQLAgentQuoteRequestCreationFailedError with checking for non-null required values
     * @return GraphQLAgentQuoteRequestCreationFailedError
     */
    public GraphQLAgentQuoteRequestCreationFailedError build() {
        Objects.requireNonNull(cartId, GraphQLAgentQuoteRequestCreationFailedError.class + ": cartId is missing");
        return new GraphQLAgentQuoteRequestCreationFailedErrorImpl(values, cartId);
    }

    /**
     * builds GraphQLAgentQuoteRequestCreationFailedError without checking for non-null required values
     * @return GraphQLAgentQuoteRequestCreationFailedError
     */
    public GraphQLAgentQuoteRequestCreationFailedError buildUnchecked() {
        return new GraphQLAgentQuoteRequestCreationFailedErrorImpl(values, cartId);
    }

    /**
     * factory method for an instance of GraphQLAgentQuoteRequestCreationFailedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentQuoteRequestCreationFailedErrorBuilder of() {
        return new GraphQLAgentQuoteRequestCreationFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentQuoteRequestCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentQuoteRequestCreationFailedErrorBuilder of(
            final GraphQLAgentQuoteRequestCreationFailedError template) {
        GraphQLAgentQuoteRequestCreationFailedErrorBuilder builder = new GraphQLAgentQuoteRequestCreationFailedErrorBuilder();
        builder.values = template.values();
        builder.cartId = template.getCartId();
        return builder;
    }

}
