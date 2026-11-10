
package com.commercetools.api.models.agent;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLAgentStoreAmbiguousErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLAgentStoreAmbiguousError graphQLAgentStoreAmbiguousError = GraphQLAgentStoreAmbiguousError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLAgentStoreAmbiguousErrorBuilder implements Builder<GraphQLAgentStoreAmbiguousError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLAgentStoreAmbiguousErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLAgentStoreAmbiguousErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLAgentStoreAmbiguousError with checking for non-null required values
     * @return GraphQLAgentStoreAmbiguousError
     */
    public GraphQLAgentStoreAmbiguousError build() {
        return new GraphQLAgentStoreAmbiguousErrorImpl(values);
    }

    /**
     * builds GraphQLAgentStoreAmbiguousError without checking for non-null required values
     * @return GraphQLAgentStoreAmbiguousError
     */
    public GraphQLAgentStoreAmbiguousError buildUnchecked() {
        return new GraphQLAgentStoreAmbiguousErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLAgentStoreAmbiguousErrorBuilder
     * @return builder
     */
    public static GraphQLAgentStoreAmbiguousErrorBuilder of() {
        return new GraphQLAgentStoreAmbiguousErrorBuilder();
    }

    /**
     * create builder for GraphQLAgentStoreAmbiguousError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLAgentStoreAmbiguousErrorBuilder of(final GraphQLAgentStoreAmbiguousError template) {
        GraphQLAgentStoreAmbiguousErrorBuilder builder = new GraphQLAgentStoreAmbiguousErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
