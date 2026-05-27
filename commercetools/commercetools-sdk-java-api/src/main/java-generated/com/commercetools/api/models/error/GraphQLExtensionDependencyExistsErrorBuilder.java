
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionDependencyExistsErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionDependencyExistsError graphQLExtensionDependencyExistsError = GraphQLExtensionDependencyExistsError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionDependencyExistsErrorBuilder implements Builder<GraphQLExtensionDependencyExistsError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionDependencyExistsErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionDependencyExistsErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExtensionDependencyExistsError with checking for non-null required values
     * @return GraphQLExtensionDependencyExistsError
     */
    public GraphQLExtensionDependencyExistsError build() {
        return new GraphQLExtensionDependencyExistsErrorImpl(values);
    }

    /**
     * builds GraphQLExtensionDependencyExistsError without checking for non-null required values
     * @return GraphQLExtensionDependencyExistsError
     */
    public GraphQLExtensionDependencyExistsError buildUnchecked() {
        return new GraphQLExtensionDependencyExistsErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExtensionDependencyExistsErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionDependencyExistsErrorBuilder of() {
        return new GraphQLExtensionDependencyExistsErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionDependencyExistsError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionDependencyExistsErrorBuilder of(
            final GraphQLExtensionDependencyExistsError template) {
        GraphQLExtensionDependencyExistsErrorBuilder builder = new GraphQLExtensionDependencyExistsErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
