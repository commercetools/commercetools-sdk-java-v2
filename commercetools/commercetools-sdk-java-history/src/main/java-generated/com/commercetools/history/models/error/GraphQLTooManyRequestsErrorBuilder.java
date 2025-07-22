
package com.commercetools.history.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLTooManyRequestsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLTooManyRequestsError graphQLTooManyRequestsError = GraphQLTooManyRequestsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLTooManyRequestsErrorBuilder implements Builder<GraphQLTooManyRequestsError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLTooManyRequestsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLTooManyRequestsErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLTooManyRequestsError with checking for non-null required values
     * @return GraphQLTooManyRequestsError
     */
    public GraphQLTooManyRequestsError build() {
        return new GraphQLTooManyRequestsErrorImpl(values);
    }

    /**
     * builds GraphQLTooManyRequestsError without checking for non-null required values
     * @return GraphQLTooManyRequestsError
     */
    public GraphQLTooManyRequestsError buildUnchecked() {
        return new GraphQLTooManyRequestsErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLTooManyRequestsErrorBuilder
     * @return builder
     */
    public static GraphQLTooManyRequestsErrorBuilder of() {
        return new GraphQLTooManyRequestsErrorBuilder();
    }

    /**
     * create builder for GraphQLTooManyRequestsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLTooManyRequestsErrorBuilder of(final GraphQLTooManyRequestsError template) {
        GraphQLTooManyRequestsErrorBuilder builder = new GraphQLTooManyRequestsErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
