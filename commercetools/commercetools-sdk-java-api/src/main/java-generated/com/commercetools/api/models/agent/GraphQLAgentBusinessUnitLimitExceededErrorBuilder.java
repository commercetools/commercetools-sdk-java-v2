
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentBusinessUnitLimitExceededErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitLimitExceededError graphQLAgentBusinessUnitLimitExceededError = GraphQLAgentBusinessUnitLimitExceededError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentBusinessUnitLimitExceededErrorBuilder
        implements Builder<GraphQLAgentBusinessUnitLimitExceededError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentBusinessUnitLimitExceededErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentBusinessUnitLimitExceededErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentBusinessUnitLimitExceededError with checking for non-null required values
     * @return GraphQLAgentBusinessUnitLimitExceededError
     */
    public GraphQLAgentBusinessUnitLimitExceededError build() {
        return new GraphQLAgentBusinessUnitLimitExceededErrorImpl(values);
    }

    /**
     * builds GraphQLAgentBusinessUnitLimitExceededError without checking for non-null required values
     * @return GraphQLAgentBusinessUnitLimitExceededError
     */
    public GraphQLAgentBusinessUnitLimitExceededError buildUnchecked() {
        return new GraphQLAgentBusinessUnitLimitExceededErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentBusinessUnitLimitExceededErrorBuilder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitLimitExceededErrorBuilder of() {
        return new GraphQLAgentBusinessUnitLimitExceededErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitLimitExceededError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitLimitExceededErrorBuilder of(
            final GraphQLAgentBusinessUnitLimitExceededError template) {
        GraphQLAgentBusinessUnitLimitExceededErrorBuilder builder = new GraphQLAgentBusinessUnitLimitExceededErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
