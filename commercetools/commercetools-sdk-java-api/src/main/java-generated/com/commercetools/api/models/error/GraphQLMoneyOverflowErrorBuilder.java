
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMoneyOverflowErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMoneyOverflowError graphQLMoneyOverflowError = GraphQLMoneyOverflowError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMoneyOverflowErrorBuilder implements Builder<GraphQLMoneyOverflowError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMoneyOverflowErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMoneyOverflowErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLMoneyOverflowError with checking for non-null required values
     * @return GraphQLMoneyOverflowError
     */
    public GraphQLMoneyOverflowError build() {
        return new GraphQLMoneyOverflowErrorImpl(values);
    }

    /**
     * builds GraphQLMoneyOverflowError without checking for non-null required values
     * @return GraphQLMoneyOverflowError
     */
    public GraphQLMoneyOverflowError buildUnchecked() {
        return new GraphQLMoneyOverflowErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLMoneyOverflowErrorBuilder
     * @return builder
     */
    public static GraphQLMoneyOverflowErrorBuilder of() {
        return new GraphQLMoneyOverflowErrorBuilder();
    }

    /**
     * create builder for GraphQLMoneyOverflowError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMoneyOverflowErrorBuilder of(final GraphQLMoneyOverflowError template) {
        GraphQLMoneyOverflowErrorBuilder builder = new GraphQLMoneyOverflowErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
