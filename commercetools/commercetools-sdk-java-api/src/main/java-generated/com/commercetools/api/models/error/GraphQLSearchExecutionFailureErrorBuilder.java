
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSearchExecutionFailureErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchExecutionFailureError graphQLSearchExecutionFailureError = GraphQLSearchExecutionFailureError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchExecutionFailureErrorBuilder implements Builder<GraphQLSearchExecutionFailureError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSearchExecutionFailureErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSearchExecutionFailureErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSearchExecutionFailureError with checking for non-null required values
     * @return GraphQLSearchExecutionFailureError
     */
    public GraphQLSearchExecutionFailureError build() {
        return new GraphQLSearchExecutionFailureErrorImpl(values);
    }

    /**
     * builds GraphQLSearchExecutionFailureError without checking for non-null required values
     * @return GraphQLSearchExecutionFailureError
     */
    public GraphQLSearchExecutionFailureError buildUnchecked() {
        return new GraphQLSearchExecutionFailureErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSearchExecutionFailureErrorBuilder
     * @return builder
     */
    public static GraphQLSearchExecutionFailureErrorBuilder of() {
        return new GraphQLSearchExecutionFailureErrorBuilder();
    }

    /**
     * create builder for GraphQLSearchExecutionFailureError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchExecutionFailureErrorBuilder of(final GraphQLSearchExecutionFailureError template) {
        GraphQLSearchExecutionFailureErrorBuilder builder = new GraphQLSearchExecutionFailureErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
