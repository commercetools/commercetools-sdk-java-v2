
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentMissingCurrencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCurrencyError graphQLAgentMissingCurrencyError = GraphQLAgentMissingCurrencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentMissingCurrencyErrorBuilder implements Builder<GraphQLAgentMissingCurrencyError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentMissingCurrencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentMissingCurrencyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentMissingCurrencyError with checking for non-null required values
     * @return GraphQLAgentMissingCurrencyError
     */
    public GraphQLAgentMissingCurrencyError build() {
        return new GraphQLAgentMissingCurrencyErrorImpl(values);
    }

    /**
     * builds GraphQLAgentMissingCurrencyError without checking for non-null required values
     * @return GraphQLAgentMissingCurrencyError
     */
    public GraphQLAgentMissingCurrencyError buildUnchecked() {
        return new GraphQLAgentMissingCurrencyErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentMissingCurrencyErrorBuilder
     * @return builder
     */
    public static GraphQLAgentMissingCurrencyErrorBuilder of() {
        return new GraphQLAgentMissingCurrencyErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentMissingCurrencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCurrencyErrorBuilder of(final GraphQLAgentMissingCurrencyError template) {
        GraphQLAgentMissingCurrencyErrorBuilder builder = new GraphQLAgentMissingCurrencyErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
