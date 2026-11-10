
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionChainTooWideErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionChainTooWideError graphQLExtensionChainTooWideError = GraphQLExtensionChainTooWideError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionChainTooWideErrorBuilder implements Builder<GraphQLExtensionChainTooWideError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionChainTooWideErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionChainTooWideErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExtensionChainTooWideError with checking for non-null required values
     * @return GraphQLExtensionChainTooWideError
     */
    public GraphQLExtensionChainTooWideError build() {
        return new GraphQLExtensionChainTooWideErrorImpl(values);
    }

    /**
     * builds GraphQLExtensionChainTooWideError without checking for non-null required values
     * @return GraphQLExtensionChainTooWideError
     */
    public GraphQLExtensionChainTooWideError buildUnchecked() {
        return new GraphQLExtensionChainTooWideErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExtensionChainTooWideErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionChainTooWideErrorBuilder of() {
        return new GraphQLExtensionChainTooWideErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionChainTooWideError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionChainTooWideErrorBuilder of(final GraphQLExtensionChainTooWideError template) {
        GraphQLExtensionChainTooWideErrorBuilder builder = new GraphQLExtensionChainTooWideErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
