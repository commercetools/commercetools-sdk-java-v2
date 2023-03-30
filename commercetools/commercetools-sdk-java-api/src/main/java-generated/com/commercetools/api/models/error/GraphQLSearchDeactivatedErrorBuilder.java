
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSearchDeactivatedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchDeactivatedError graphQLSearchDeactivatedError = GraphQLSearchDeactivatedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchDeactivatedErrorBuilder implements Builder<GraphQLSearchDeactivatedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSearchDeactivatedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSearchDeactivatedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSearchDeactivatedError with checking for non-null required values
     * @return GraphQLSearchDeactivatedError
     */
    public GraphQLSearchDeactivatedError build() {
        return new GraphQLSearchDeactivatedErrorImpl(values);
    }

    /**
     * builds GraphQLSearchDeactivatedError without checking for non-null required values
     * @return GraphQLSearchDeactivatedError
     */
    public GraphQLSearchDeactivatedError buildUnchecked() {
        return new GraphQLSearchDeactivatedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSearchDeactivatedErrorBuilder
     * @return builder
     */
    public static GraphQLSearchDeactivatedErrorBuilder of() {
        return new GraphQLSearchDeactivatedErrorBuilder();
    }

    /**
     * create builder for GraphQLSearchDeactivatedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchDeactivatedErrorBuilder of(final GraphQLSearchDeactivatedError template) {
        GraphQLSearchDeactivatedErrorBuilder builder = new GraphQLSearchDeactivatedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
