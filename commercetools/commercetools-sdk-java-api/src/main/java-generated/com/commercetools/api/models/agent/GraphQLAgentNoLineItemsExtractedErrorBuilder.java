
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentNoLineItemsExtractedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentNoLineItemsExtractedError graphQLAgentNoLineItemsExtractedError = GraphQLAgentNoLineItemsExtractedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentNoLineItemsExtractedErrorBuilder implements Builder<GraphQLAgentNoLineItemsExtractedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentNoLineItemsExtractedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentNoLineItemsExtractedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentNoLineItemsExtractedError with checking for non-null required values
     * @return GraphQLAgentNoLineItemsExtractedError
     */
    public GraphQLAgentNoLineItemsExtractedError build() {
        return new GraphQLAgentNoLineItemsExtractedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentNoLineItemsExtractedError without checking for non-null required values
     * @return GraphQLAgentNoLineItemsExtractedError
     */
    public GraphQLAgentNoLineItemsExtractedError buildUnchecked() {
        return new GraphQLAgentNoLineItemsExtractedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentNoLineItemsExtractedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentNoLineItemsExtractedErrorBuilder of() {
        return new GraphQLAgentNoLineItemsExtractedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentNoLineItemsExtractedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentNoLineItemsExtractedErrorBuilder of(
            final GraphQLAgentNoLineItemsExtractedError template) {
        GraphQLAgentNoLineItemsExtractedErrorBuilder builder = new GraphQLAgentNoLineItemsExtractedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
