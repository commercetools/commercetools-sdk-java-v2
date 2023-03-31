
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLSearchIndexingInProgressErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLSearchIndexingInProgressError graphQLSearchIndexingInProgressError = GraphQLSearchIndexingInProgressError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLSearchIndexingInProgressErrorBuilder implements Builder<GraphQLSearchIndexingInProgressError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLSearchIndexingInProgressErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLSearchIndexingInProgressErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLSearchIndexingInProgressError with checking for non-null required values
     * @return GraphQLSearchIndexingInProgressError
     */
    public GraphQLSearchIndexingInProgressError build() {
        return new GraphQLSearchIndexingInProgressErrorImpl(values);
    }

    /**
     * builds GraphQLSearchIndexingInProgressError without checking for non-null required values
     * @return GraphQLSearchIndexingInProgressError
     */
    public GraphQLSearchIndexingInProgressError buildUnchecked() {
        return new GraphQLSearchIndexingInProgressErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLSearchIndexingInProgressErrorBuilder
     * @return builder
     */
    public static GraphQLSearchIndexingInProgressErrorBuilder of() {
        return new GraphQLSearchIndexingInProgressErrorBuilder();
    }

    /**
     * create builder for GraphQLSearchIndexingInProgressError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLSearchIndexingInProgressErrorBuilder of(final GraphQLSearchIndexingInProgressError template) {
        GraphQLSearchIndexingInProgressErrorBuilder builder = new GraphQLSearchIndexingInProgressErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
