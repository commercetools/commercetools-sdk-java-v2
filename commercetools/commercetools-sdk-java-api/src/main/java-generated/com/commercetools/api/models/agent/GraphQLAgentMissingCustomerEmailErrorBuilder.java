
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentMissingCustomerEmailErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCustomerEmailError graphQLAgentMissingCustomerEmailError = GraphQLAgentMissingCustomerEmailError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentMissingCustomerEmailErrorBuilder implements Builder<GraphQLAgentMissingCustomerEmailError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentMissingCustomerEmailErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentMissingCustomerEmailErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentMissingCustomerEmailError with checking for non-null required values
     * @return GraphQLAgentMissingCustomerEmailError
     */
    public GraphQLAgentMissingCustomerEmailError build() {
        return new GraphQLAgentMissingCustomerEmailErrorImpl(values);
    }

    /**
     * builds GraphQLAgentMissingCustomerEmailError without checking for non-null required values
     * @return GraphQLAgentMissingCustomerEmailError
     */
    public GraphQLAgentMissingCustomerEmailError buildUnchecked() {
        return new GraphQLAgentMissingCustomerEmailErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentMissingCustomerEmailErrorBuilder
     * @return builder
     */
    public static GraphQLAgentMissingCustomerEmailErrorBuilder of() {
        return new GraphQLAgentMissingCustomerEmailErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentMissingCustomerEmailError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCustomerEmailErrorBuilder of(
            final GraphQLAgentMissingCustomerEmailError template) {
        GraphQLAgentMissingCustomerEmailErrorBuilder builder = new GraphQLAgentMissingCustomerEmailErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
