
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLInsufficientScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLInsufficientScopeError graphQLInsufficientScopeError = GraphQLInsufficientScopeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLInsufficientScopeErrorBuilder implements Builder<GraphQLInsufficientScopeError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLInsufficientScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLInsufficientScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLInsufficientScopeError with checking for non-null required values
     * @return GraphQLInsufficientScopeError
     */
    public GraphQLInsufficientScopeError build() {
        return new GraphQLInsufficientScopeErrorImpl(values);
    }

    /**
     * builds GraphQLInsufficientScopeError without checking for non-null required values
     * @return GraphQLInsufficientScopeError
     */
    public GraphQLInsufficientScopeError buildUnchecked() {
        return new GraphQLInsufficientScopeErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLInsufficientScopeErrorBuilder
     * @return builder
     */
    public static GraphQLInsufficientScopeErrorBuilder of() {
        return new GraphQLInsufficientScopeErrorBuilder();
    }

    /**
     * create builder for GraphQLInsufficientScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLInsufficientScopeErrorBuilder of(final GraphQLInsufficientScopeError template) {
        GraphQLInsufficientScopeErrorBuilder builder = new GraphQLInsufficientScopeErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
