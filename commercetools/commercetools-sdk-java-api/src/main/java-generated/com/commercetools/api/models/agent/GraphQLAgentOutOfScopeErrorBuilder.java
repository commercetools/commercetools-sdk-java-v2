
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentOutOfScopeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentOutOfScopeError graphQLAgentOutOfScopeError = GraphQLAgentOutOfScopeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentOutOfScopeErrorBuilder implements Builder<GraphQLAgentOutOfScopeError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentOutOfScopeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentOutOfScopeErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentOutOfScopeError with checking for non-null required values
     * @return GraphQLAgentOutOfScopeError
     */
    public GraphQLAgentOutOfScopeError build() {
        return new GraphQLAgentOutOfScopeErrorImpl(values);
    }

    /**
     * builds GraphQLAgentOutOfScopeError without checking for non-null required values
     * @return GraphQLAgentOutOfScopeError
     */
    public GraphQLAgentOutOfScopeError buildUnchecked() {
        return new GraphQLAgentOutOfScopeErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentOutOfScopeErrorBuilder
     * @return builder
     */
    public static GraphQLAgentOutOfScopeErrorBuilder of() {
        return new GraphQLAgentOutOfScopeErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentOutOfScopeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentOutOfScopeErrorBuilder of(final GraphQLAgentOutOfScopeError template) {
        GraphQLAgentOutOfScopeErrorBuilder builder = new GraphQLAgentOutOfScopeErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
