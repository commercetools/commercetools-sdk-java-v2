
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentProductSearchNotEnabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentProductSearchNotEnabledError graphQLAgentProductSearchNotEnabledError = GraphQLAgentProductSearchNotEnabledError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentProductSearchNotEnabledErrorBuilder
        implements Builder<GraphQLAgentProductSearchNotEnabledError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentProductSearchNotEnabledErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentProductSearchNotEnabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentProductSearchNotEnabledError with checking for non-null required values
     * @return GraphQLAgentProductSearchNotEnabledError
     */
    public GraphQLAgentProductSearchNotEnabledError build() {
        return new GraphQLAgentProductSearchNotEnabledErrorImpl(values);
    }

    /**
     * builds GraphQLAgentProductSearchNotEnabledError without checking for non-null required values
     * @return GraphQLAgentProductSearchNotEnabledError
     */
    public GraphQLAgentProductSearchNotEnabledError buildUnchecked() {
        return new GraphQLAgentProductSearchNotEnabledErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentProductSearchNotEnabledErrorBuilder
     * @return builder
     */
    public static GraphQLAgentProductSearchNotEnabledErrorBuilder of() {
        return new GraphQLAgentProductSearchNotEnabledErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentProductSearchNotEnabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentProductSearchNotEnabledErrorBuilder of(
            final GraphQLAgentProductSearchNotEnabledError template) {
        GraphQLAgentProductSearchNotEnabledErrorBuilder builder = new GraphQLAgentProductSearchNotEnabledErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
