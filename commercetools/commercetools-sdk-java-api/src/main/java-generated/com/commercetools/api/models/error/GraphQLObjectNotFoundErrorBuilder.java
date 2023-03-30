
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLObjectNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLObjectNotFoundError graphQLObjectNotFoundError = GraphQLObjectNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLObjectNotFoundErrorBuilder implements Builder<GraphQLObjectNotFoundError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLObjectNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLObjectNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLObjectNotFoundError with checking for non-null required values
     * @return GraphQLObjectNotFoundError
     */
    public GraphQLObjectNotFoundError build() {
        return new GraphQLObjectNotFoundErrorImpl(values);
    }

    /**
     * builds GraphQLObjectNotFoundError without checking for non-null required values
     * @return GraphQLObjectNotFoundError
     */
    public GraphQLObjectNotFoundError buildUnchecked() {
        return new GraphQLObjectNotFoundErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLObjectNotFoundErrorBuilder
     * @return builder
     */
    public static GraphQLObjectNotFoundErrorBuilder of() {
        return new GraphQLObjectNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLObjectNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLObjectNotFoundErrorBuilder of(final GraphQLObjectNotFoundError template) {
        GraphQLObjectNotFoundErrorBuilder builder = new GraphQLObjectNotFoundErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
