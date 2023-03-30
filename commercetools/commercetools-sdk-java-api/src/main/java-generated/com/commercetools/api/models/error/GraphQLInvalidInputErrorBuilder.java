
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidInputErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidInputError graphQLInvalidInputError = GraphQLInvalidInputError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidInputErrorBuilder implements Builder<GraphQLInvalidInputError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInvalidInputErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInvalidInputErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidInputError with checking for non-null required values
     * @return GraphQLInvalidInputError
     */
    public GraphQLInvalidInputError build() {
        return new GraphQLInvalidInputErrorImpl(values);
    }

    /**
     * builds GraphQLInvalidInputError without checking for non-null required values
     * @return GraphQLInvalidInputError
     */
    public GraphQLInvalidInputError buildUnchecked() {
        return new GraphQLInvalidInputErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidInputErrorBuilder
     * @return builder
     */
    public static GraphQLInvalidInputErrorBuilder of() {
        return new GraphQLInvalidInputErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidInputError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidInputErrorBuilder of(final GraphQLInvalidInputError template) {
        GraphQLInvalidInputErrorBuilder builder = new GraphQLInvalidInputErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
