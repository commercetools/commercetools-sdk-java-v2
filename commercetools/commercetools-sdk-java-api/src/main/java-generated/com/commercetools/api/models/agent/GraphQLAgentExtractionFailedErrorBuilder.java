
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentExtractionFailedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentExtractionFailedError graphQLAgentExtractionFailedError = GraphQLAgentExtractionFailedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentExtractionFailedErrorBuilder implements Builder<GraphQLAgentExtractionFailedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentExtractionFailedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentExtractionFailedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentExtractionFailedError with checking for non-null required values
     * @return GraphQLAgentExtractionFailedError
     */
    public GraphQLAgentExtractionFailedError build() {
        return new GraphQLAgentExtractionFailedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentExtractionFailedError without checking for non-null required values
     * @return GraphQLAgentExtractionFailedError
     */
    public GraphQLAgentExtractionFailedError buildUnchecked() {
        return new GraphQLAgentExtractionFailedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentExtractionFailedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentExtractionFailedErrorBuilder of() {
        return new GraphQLAgentExtractionFailedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentExtractionFailedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentExtractionFailedErrorBuilder of(final GraphQLAgentExtractionFailedError template) {
        GraphQLAgentExtractionFailedErrorBuilder builder = new GraphQLAgentExtractionFailedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
