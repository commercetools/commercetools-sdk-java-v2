
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLCircularDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLCircularDependencyError graphQLCircularDependencyError = GraphQLCircularDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLCircularDependencyErrorBuilder implements Builder<GraphQLCircularDependencyError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLCircularDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLCircularDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLCircularDependencyError with checking for non-null required values
     * @return GraphQLCircularDependencyError
     */
    public GraphQLCircularDependencyError build() {
        return new GraphQLCircularDependencyErrorImpl(values);
    }

    /**
     * builds GraphQLCircularDependencyError without checking for non-null required values
     * @return GraphQLCircularDependencyError
     */
    public GraphQLCircularDependencyError buildUnchecked() {
        return new GraphQLCircularDependencyErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLCircularDependencyErrorBuilder
     * @return builder
     */
    public static GraphQLCircularDependencyErrorBuilder of() {
        return new GraphQLCircularDependencyErrorBuilder();
    }

    /**
     * create builder for GraphQLCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLCircularDependencyErrorBuilder of(final GraphQLCircularDependencyError template) {
        GraphQLCircularDependencyErrorBuilder builder = new GraphQLCircularDependencyErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
