
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLContentTooLargeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLContentTooLargeError graphQLContentTooLargeError = GraphQLContentTooLargeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLContentTooLargeErrorBuilder implements Builder<GraphQLContentTooLargeError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLContentTooLargeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLContentTooLargeErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLContentTooLargeError with checking for non-null required values
     * @return GraphQLContentTooLargeError
     */
    public GraphQLContentTooLargeError build() {
        return new GraphQLContentTooLargeErrorImpl(values);
    }

    /**
     * builds GraphQLContentTooLargeError without checking for non-null required values
     * @return GraphQLContentTooLargeError
     */
    public GraphQLContentTooLargeError buildUnchecked() {
        return new GraphQLContentTooLargeErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLContentTooLargeErrorBuilder
     * @return builder
     */
    public static GraphQLContentTooLargeErrorBuilder of() {
        return new GraphQLContentTooLargeErrorBuilder();
    }

    /**
     * create builder for GraphQLContentTooLargeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLContentTooLargeErrorBuilder of(final GraphQLContentTooLargeError template) {
        GraphQLContentTooLargeErrorBuilder builder = new GraphQLContentTooLargeErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
