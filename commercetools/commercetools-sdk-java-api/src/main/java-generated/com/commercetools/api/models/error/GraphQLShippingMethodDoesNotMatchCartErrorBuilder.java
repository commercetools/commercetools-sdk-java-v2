
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLShippingMethodDoesNotMatchCartErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLShippingMethodDoesNotMatchCartError graphQLShippingMethodDoesNotMatchCartError = GraphQLShippingMethodDoesNotMatchCartError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLShippingMethodDoesNotMatchCartErrorBuilder
        implements Builder<GraphQLShippingMethodDoesNotMatchCartError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLShippingMethodDoesNotMatchCartErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLShippingMethodDoesNotMatchCartErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
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
     * builds GraphQLShippingMethodDoesNotMatchCartError with checking for non-null required values
     * @return GraphQLShippingMethodDoesNotMatchCartError
     */
    public GraphQLShippingMethodDoesNotMatchCartError build() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorImpl(values);
    }

    /**
     * builds GraphQLShippingMethodDoesNotMatchCartError without checking for non-null required values
     * @return GraphQLShippingMethodDoesNotMatchCartError
     */
    public GraphQLShippingMethodDoesNotMatchCartError buildUnchecked() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLShippingMethodDoesNotMatchCartErrorBuilder
     * @return builder
     */
    public static GraphQLShippingMethodDoesNotMatchCartErrorBuilder of() {
        return new GraphQLShippingMethodDoesNotMatchCartErrorBuilder();
    }

    /**
     * create builder for GraphQLShippingMethodDoesNotMatchCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLShippingMethodDoesNotMatchCartErrorBuilder of(
            final GraphQLShippingMethodDoesNotMatchCartError template) {
        GraphQLShippingMethodDoesNotMatchCartErrorBuilder builder = new GraphQLShippingMethodDoesNotMatchCartErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
