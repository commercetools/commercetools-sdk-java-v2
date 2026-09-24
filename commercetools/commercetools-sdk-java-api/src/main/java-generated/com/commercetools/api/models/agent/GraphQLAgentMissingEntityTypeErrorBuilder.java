
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentMissingEntityTypeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingEntityTypeError graphQLAgentMissingEntityTypeError = GraphQLAgentMissingEntityTypeError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentMissingEntityTypeErrorBuilder implements Builder<GraphQLAgentMissingEntityTypeError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentMissingEntityTypeErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentMissingEntityTypeErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentMissingEntityTypeError with checking for non-null required values
     * @return GraphQLAgentMissingEntityTypeError
     */
    public GraphQLAgentMissingEntityTypeError build() {
        return new GraphQLAgentMissingEntityTypeErrorImpl(values);
    }

    /**
     * builds GraphQLAgentMissingEntityTypeError without checking for non-null required values
     * @return GraphQLAgentMissingEntityTypeError
     */
    public GraphQLAgentMissingEntityTypeError buildUnchecked() {
        return new GraphQLAgentMissingEntityTypeErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentMissingEntityTypeErrorBuilder
     * @return builder
     */
    public static GraphQLAgentMissingEntityTypeErrorBuilder of() {
        return new GraphQLAgentMissingEntityTypeErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentMissingEntityTypeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingEntityTypeErrorBuilder of(final GraphQLAgentMissingEntityTypeError template) {
        GraphQLAgentMissingEntityTypeErrorBuilder builder = new GraphQLAgentMissingEntityTypeErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
