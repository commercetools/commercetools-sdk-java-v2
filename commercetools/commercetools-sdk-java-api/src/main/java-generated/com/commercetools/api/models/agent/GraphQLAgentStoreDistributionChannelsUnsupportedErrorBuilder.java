
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreDistributionChannelsUnsupportedError graphQLAgentStoreDistributionChannelsUnsupportedError = GraphQLAgentStoreDistributionChannelsUnsupportedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder
        implements Builder<GraphQLAgentStoreDistributionChannelsUnsupportedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder values(
            final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder addValue(final String key,
            final java.lang.Object value) {
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
     * builds GraphQLAgentStoreDistributionChannelsUnsupportedError with checking for non-null required values
     * @return GraphQLAgentStoreDistributionChannelsUnsupportedError
     */
    public GraphQLAgentStoreDistributionChannelsUnsupportedError build() {
        return new GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentStoreDistributionChannelsUnsupportedError without checking for non-null required values
     * @return GraphQLAgentStoreDistributionChannelsUnsupportedError
     */
    public GraphQLAgentStoreDistributionChannelsUnsupportedError buildUnchecked() {
        return new GraphQLAgentStoreDistributionChannelsUnsupportedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder of() {
        return new GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentStoreDistributionChannelsUnsupportedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder of(
            final GraphQLAgentStoreDistributionChannelsUnsupportedError template) {
        GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder builder = new GraphQLAgentStoreDistributionChannelsUnsupportedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
