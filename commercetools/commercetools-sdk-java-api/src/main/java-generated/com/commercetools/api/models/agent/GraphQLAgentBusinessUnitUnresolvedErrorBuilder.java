
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentBusinessUnitUnresolvedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitUnresolvedError graphQLAgentBusinessUnitUnresolvedError = GraphQLAgentBusinessUnitUnresolvedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentBusinessUnitUnresolvedErrorBuilder
        implements Builder<GraphQLAgentBusinessUnitUnresolvedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentBusinessUnitUnresolvedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentBusinessUnitUnresolvedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentBusinessUnitUnresolvedError with checking for non-null required values
     * @return GraphQLAgentBusinessUnitUnresolvedError
     */
    public GraphQLAgentBusinessUnitUnresolvedError build() {
        return new GraphQLAgentBusinessUnitUnresolvedErrorImpl(values);
    }

    /**
     * builds GraphQLAgentBusinessUnitUnresolvedError without checking for non-null required values
     * @return GraphQLAgentBusinessUnitUnresolvedError
     */
    public GraphQLAgentBusinessUnitUnresolvedError buildUnchecked() {
        return new GraphQLAgentBusinessUnitUnresolvedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentBusinessUnitUnresolvedErrorBuilder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitUnresolvedErrorBuilder of() {
        return new GraphQLAgentBusinessUnitUnresolvedErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitUnresolvedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitUnresolvedErrorBuilder of(
            final GraphQLAgentBusinessUnitUnresolvedError template) {
        GraphQLAgentBusinessUnitUnresolvedErrorBuilder builder = new GraphQLAgentBusinessUnitUnresolvedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
