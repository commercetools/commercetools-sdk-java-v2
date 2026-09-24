
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentProductsNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentProductsNotFoundError graphQLAgentProductsNotFoundError = GraphQLAgentProductsNotFoundError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentProductsNotFoundErrorBuilder implements Builder<GraphQLAgentProductsNotFoundError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentProductsNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentProductsNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentProductsNotFoundError with checking for non-null required values
     * @return GraphQLAgentProductsNotFoundError
     */
    public GraphQLAgentProductsNotFoundError build() {
        return new GraphQLAgentProductsNotFoundErrorImpl(values);
    }

    /**
     * builds GraphQLAgentProductsNotFoundError without checking for non-null required values
     * @return GraphQLAgentProductsNotFoundError
     */
    public GraphQLAgentProductsNotFoundError buildUnchecked() {
        return new GraphQLAgentProductsNotFoundErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentProductsNotFoundErrorBuilder
     * @return builder
     */
    public static GraphQLAgentProductsNotFoundErrorBuilder of() {
        return new GraphQLAgentProductsNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentProductsNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentProductsNotFoundErrorBuilder of(final GraphQLAgentProductsNotFoundError template) {
        GraphQLAgentProductsNotFoundErrorBuilder builder = new GraphQLAgentProductsNotFoundErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
