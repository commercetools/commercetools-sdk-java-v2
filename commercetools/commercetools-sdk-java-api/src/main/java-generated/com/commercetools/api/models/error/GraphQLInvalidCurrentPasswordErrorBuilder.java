
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInvalidCurrentPasswordErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInvalidCurrentPasswordError graphQLInvalidCurrentPasswordError = GraphQLInvalidCurrentPasswordError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInvalidCurrentPasswordErrorBuilder implements Builder<GraphQLInvalidCurrentPasswordError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInvalidCurrentPasswordErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInvalidCurrentPasswordErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInvalidCurrentPasswordError with checking for non-null required values
     * @return GraphQLInvalidCurrentPasswordError
     */
    public GraphQLInvalidCurrentPasswordError build() {
        return new GraphQLInvalidCurrentPasswordErrorImpl(values);
    }

    /**
     * builds GraphQLInvalidCurrentPasswordError without checking for non-null required values
     * @return GraphQLInvalidCurrentPasswordError
     */
    public GraphQLInvalidCurrentPasswordError buildUnchecked() {
        return new GraphQLInvalidCurrentPasswordErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInvalidCurrentPasswordErrorBuilder
     * @return builder
     */
    public static GraphQLInvalidCurrentPasswordErrorBuilder of() {
        return new GraphQLInvalidCurrentPasswordErrorBuilder();
    }

    /**
     * create builder for GraphQLInvalidCurrentPasswordError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInvalidCurrentPasswordErrorBuilder of(final GraphQLInvalidCurrentPasswordError template) {
        GraphQLInvalidCurrentPasswordErrorBuilder builder = new GraphQLInvalidCurrentPasswordErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
