
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSearchNotReadyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchNotReadyError graphQLSearchNotReadyError = GraphQLSearchNotReadyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchNotReadyErrorBuilder implements Builder<GraphQLSearchNotReadyError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSearchNotReadyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSearchNotReadyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSearchNotReadyError with checking for non-null required values
     * @return GraphQLSearchNotReadyError
     */
    public GraphQLSearchNotReadyError build() {
        return new GraphQLSearchNotReadyErrorImpl(values);
    }

    /**
     * builds GraphQLSearchNotReadyError without checking for non-null required values
     * @return GraphQLSearchNotReadyError
     */
    public GraphQLSearchNotReadyError buildUnchecked() {
        return new GraphQLSearchNotReadyErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSearchNotReadyErrorBuilder
     * @return builder
     */
    public static GraphQLSearchNotReadyErrorBuilder of() {
        return new GraphQLSearchNotReadyErrorBuilder();
    }

    /**
     * create builder for GraphQLSearchNotReadyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchNotReadyErrorBuilder of(final GraphQLSearchNotReadyError template) {
        GraphQLSearchNotReadyErrorBuilder builder = new GraphQLSearchNotReadyErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
