
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentShoppingListUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentShoppingListUnresolvedError graphQLAgentShoppingListUnresolvedError = GraphQLAgentShoppingListUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentShoppingListUnresolvedErrorBuilder
        implements Builder<GraphQLAgentShoppingListUnresolvedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentShoppingListUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentShoppingListUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentShoppingListUnresolvedError with checking for non-null required values
     * @return GraphQLAgentShoppingListUnresolvedError
     */
    public GraphQLAgentShoppingListUnresolvedError build() {
        return new GraphQLAgentShoppingListUnresolvedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentShoppingListUnresolvedError without checking for non-null required values
     * @return GraphQLAgentShoppingListUnresolvedError
     */
    public GraphQLAgentShoppingListUnresolvedError buildUnchecked() {
        return new GraphQLAgentShoppingListUnresolvedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentShoppingListUnresolvedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentShoppingListUnresolvedErrorBuilder of() {
        return new GraphQLAgentShoppingListUnresolvedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentShoppingListUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentShoppingListUnresolvedErrorBuilder of(
            final GraphQLAgentShoppingListUnresolvedError template) {
        GraphQLAgentShoppingListUnresolvedErrorBuilder builder = new GraphQLAgentShoppingListUnresolvedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
