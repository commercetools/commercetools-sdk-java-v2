
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentMissingCountryErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentMissingCountryError graphQLAgentMissingCountryError = GraphQLAgentMissingCountryError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentMissingCountryErrorBuilder implements Builder<GraphQLAgentMissingCountryError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentMissingCountryErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentMissingCountryErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentMissingCountryError with checking for non-null required values
     * @return GraphQLAgentMissingCountryError
     */
    public GraphQLAgentMissingCountryError build() {
        return new GraphQLAgentMissingCountryErrorImpl(values);
    }

    /**
     * builds GraphQLAgentMissingCountryError without checking for non-null required values
     * @return GraphQLAgentMissingCountryError
     */
    public GraphQLAgentMissingCountryError buildUnchecked() {
        return new GraphQLAgentMissingCountryErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentMissingCountryErrorBuilder
     * @return builder
     */
    public static GraphQLAgentMissingCountryErrorBuilder of() {
        return new GraphQLAgentMissingCountryErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentMissingCountryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentMissingCountryErrorBuilder of(final GraphQLAgentMissingCountryError template) {
        GraphQLAgentMissingCountryErrorBuilder builder = new GraphQLAgentMissingCountryErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
