
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentStoreUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreUnresolvedError graphQLAgentStoreUnresolvedError = GraphQLAgentStoreUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentStoreUnresolvedErrorBuilder implements Builder<GraphQLAgentStoreUnresolvedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentStoreUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentStoreUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentStoreUnresolvedError with checking for non-null required values
     * @return GraphQLAgentStoreUnresolvedError
     */
    public GraphQLAgentStoreUnresolvedError build() {
        return new GraphQLAgentStoreUnresolvedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentStoreUnresolvedError without checking for non-null required values
     * @return GraphQLAgentStoreUnresolvedError
     */
    public GraphQLAgentStoreUnresolvedError buildUnchecked() {
        return new GraphQLAgentStoreUnresolvedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentStoreUnresolvedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentStoreUnresolvedErrorBuilder of() {
        return new GraphQLAgentStoreUnresolvedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentStoreUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreUnresolvedErrorBuilder of(final GraphQLAgentStoreUnresolvedError template) {
        GraphQLAgentStoreUnresolvedErrorBuilder builder = new GraphQLAgentStoreUnresolvedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
