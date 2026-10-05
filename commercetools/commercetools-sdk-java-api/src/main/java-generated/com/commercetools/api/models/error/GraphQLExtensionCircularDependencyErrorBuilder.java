
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionCircularDependencyErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionCircularDependencyError graphQLExtensionCircularDependencyError = GraphQLExtensionCircularDependencyError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionCircularDependencyErrorBuilder
        implements Builder<GraphQLExtensionCircularDependencyError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionCircularDependencyErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionCircularDependencyErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExtensionCircularDependencyError with checking for non-null required values
     * @return GraphQLExtensionCircularDependencyError
     */
    public GraphQLExtensionCircularDependencyError build() {
        return new GraphQLExtensionCircularDependencyErrorImpl(values);
    }

    /**
     * builds GraphQLExtensionCircularDependencyError without checking for non-null required values
     * @return GraphQLExtensionCircularDependencyError
     */
    public GraphQLExtensionCircularDependencyError buildUnchecked() {
        return new GraphQLExtensionCircularDependencyErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExtensionCircularDependencyErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionCircularDependencyErrorBuilder of() {
        return new GraphQLExtensionCircularDependencyErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionCircularDependencyError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionCircularDependencyErrorBuilder of(
            final GraphQLExtensionCircularDependencyError template) {
        GraphQLExtensionCircularDependencyErrorBuilder builder = new GraphQLExtensionCircularDependencyErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
