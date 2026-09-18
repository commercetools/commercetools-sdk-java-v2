
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentBusinessUnitAmbiguousErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentBusinessUnitAmbiguousError graphQLAgentBusinessUnitAmbiguousError = GraphQLAgentBusinessUnitAmbiguousError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentBusinessUnitAmbiguousErrorBuilder implements Builder<GraphQLAgentBusinessUnitAmbiguousError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentBusinessUnitAmbiguousErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentBusinessUnitAmbiguousErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentBusinessUnitAmbiguousError with checking for non-null required values
     * @return GraphQLAgentBusinessUnitAmbiguousError
     */
    public GraphQLAgentBusinessUnitAmbiguousError build() {
        return new GraphQLAgentBusinessUnitAmbiguousErrorImpl(values);
    }

    /**
     * builds GraphQLAgentBusinessUnitAmbiguousError without checking for non-null required values
     * @return GraphQLAgentBusinessUnitAmbiguousError
     */
    public GraphQLAgentBusinessUnitAmbiguousError buildUnchecked() {
        return new GraphQLAgentBusinessUnitAmbiguousErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentBusinessUnitAmbiguousErrorBuilder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitAmbiguousErrorBuilder of() {
        return new GraphQLAgentBusinessUnitAmbiguousErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentBusinessUnitAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentBusinessUnitAmbiguousErrorBuilder of(
            final GraphQLAgentBusinessUnitAmbiguousError template) {
        GraphQLAgentBusinessUnitAmbiguousErrorBuilder builder = new GraphQLAgentBusinessUnitAmbiguousErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
