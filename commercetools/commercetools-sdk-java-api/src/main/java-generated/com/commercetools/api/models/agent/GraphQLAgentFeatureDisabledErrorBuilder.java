
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentFeatureDisabledErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentFeatureDisabledError graphQLAgentFeatureDisabledError = GraphQLAgentFeatureDisabledError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentFeatureDisabledErrorBuilder implements Builder<GraphQLAgentFeatureDisabledError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentFeatureDisabledErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentFeatureDisabledErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentFeatureDisabledError with checking for non-null required values
     * @return GraphQLAgentFeatureDisabledError
     */
    public GraphQLAgentFeatureDisabledError build() {
        return new GraphQLAgentFeatureDisabledErrorImpl(values);
    }

    /**
     * builds GraphQLAgentFeatureDisabledError without checking for non-null required values
     * @return GraphQLAgentFeatureDisabledError
     */
    public GraphQLAgentFeatureDisabledError buildUnchecked() {
        return new GraphQLAgentFeatureDisabledErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentFeatureDisabledErrorBuilder
     * @return builder
     */
    public static GraphQLAgentFeatureDisabledErrorBuilder of() {
        return new GraphQLAgentFeatureDisabledErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentFeatureDisabledError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentFeatureDisabledErrorBuilder of(final GraphQLAgentFeatureDisabledError template) {
        GraphQLAgentFeatureDisabledErrorBuilder builder = new GraphQLAgentFeatureDisabledErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
