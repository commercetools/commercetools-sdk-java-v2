
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentMissingShoppingListNameErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingShoppingListNameError graphQLAgentMissingShoppingListNameError = GraphQLAgentMissingShoppingListNameError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentMissingShoppingListNameErrorBuilder
        implements Builder<GraphQLAgentMissingShoppingListNameError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentMissingShoppingListNameErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentMissingShoppingListNameErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentMissingShoppingListNameError with checking for non-null required values
     * @return GraphQLAgentMissingShoppingListNameError
     */
    public GraphQLAgentMissingShoppingListNameError build() {
        return new GraphQLAgentMissingShoppingListNameErrorImpl(values);
    }

    /**
     * builds GraphQLAgentMissingShoppingListNameError without checking for non-null required values
     * @return GraphQLAgentMissingShoppingListNameError
     */
    public GraphQLAgentMissingShoppingListNameError buildUnchecked() {
        return new GraphQLAgentMissingShoppingListNameErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentMissingShoppingListNameErrorBuilder
     * @return builder
     */
    public static GraphQLAgentMissingShoppingListNameErrorBuilder of() {
        return new GraphQLAgentMissingShoppingListNameErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentMissingShoppingListNameError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingShoppingListNameErrorBuilder of(
            final GraphQLAgentMissingShoppingListNameError template) {
        GraphQLAgentMissingShoppingListNameErrorBuilder builder = new GraphQLAgentMissingShoppingListNameErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
