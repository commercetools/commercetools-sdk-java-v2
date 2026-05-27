
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMissingDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMissingDependencyError graphQLMissingDependencyError = GraphQLMissingDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMissingDependencyErrorBuilder implements Builder<GraphQLMissingDependencyError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMissingDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMissingDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLMissingDependencyError with checking for non-null required values
     * @return GraphQLMissingDependencyError
     */
    public GraphQLMissingDependencyError build() {
        return new GraphQLMissingDependencyErrorImpl(values);
    }

    /**
     * builds GraphQLMissingDependencyError without checking for non-null required values
     * @return GraphQLMissingDependencyError
     */
    public GraphQLMissingDependencyError buildUnchecked() {
        return new GraphQLMissingDependencyErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLMissingDependencyErrorBuilder
     * @return builder
     */
    public static GraphQLMissingDependencyErrorBuilder of() {
        return new GraphQLMissingDependencyErrorBuilder();
    }

    /**
     * create builder for GraphQLMissingDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMissingDependencyErrorBuilder of(final GraphQLMissingDependencyError template) {
        GraphQLMissingDependencyErrorBuilder builder = new GraphQLMissingDependencyErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
