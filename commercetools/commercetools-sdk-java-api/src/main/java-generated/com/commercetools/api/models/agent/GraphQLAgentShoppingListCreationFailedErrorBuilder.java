
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentShoppingListCreationFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentShoppingListCreationFailedError graphQLAgentShoppingListCreationFailedError = GraphQLAgentShoppingListCreationFailedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentShoppingListCreationFailedErrorBuilder
        implements Builder<GraphQLAgentShoppingListCreationFailedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentShoppingListCreationFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentShoppingListCreationFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentShoppingListCreationFailedError with checking for non-null required values
     * @return GraphQLAgentShoppingListCreationFailedError
     */
    public GraphQLAgentShoppingListCreationFailedError build() {
        return new GraphQLAgentShoppingListCreationFailedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentShoppingListCreationFailedError without checking for non-null required values
     * @return GraphQLAgentShoppingListCreationFailedError
     */
    public GraphQLAgentShoppingListCreationFailedError buildUnchecked() {
        return new GraphQLAgentShoppingListCreationFailedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentShoppingListCreationFailedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentShoppingListCreationFailedErrorBuilder of() {
        return new GraphQLAgentShoppingListCreationFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentShoppingListCreationFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentShoppingListCreationFailedErrorBuilder of(
            final GraphQLAgentShoppingListCreationFailedError template) {
        GraphQLAgentShoppingListCreationFailedErrorBuilder builder = new GraphQLAgentShoppingListCreationFailedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
