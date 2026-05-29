
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionChainTooDeepErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionChainTooDeepError graphQLExtensionChainTooDeepError = GraphQLExtensionChainTooDeepError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionChainTooDeepErrorBuilder implements Builder<GraphQLExtensionChainTooDeepError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionChainTooDeepErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionChainTooDeepErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLExtensionChainTooDeepError with checking for non-null required values
     * @return GraphQLExtensionChainTooDeepError
     */
    public GraphQLExtensionChainTooDeepError build() {
        return new GraphQLExtensionChainTooDeepErrorImpl(values);
    }

    /**
     * builds GraphQLExtensionChainTooDeepError without checking for non-null required values
     * @return GraphQLExtensionChainTooDeepError
     */
    public GraphQLExtensionChainTooDeepError buildUnchecked() {
        return new GraphQLExtensionChainTooDeepErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLExtensionChainTooDeepErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionChainTooDeepErrorBuilder of() {
        return new GraphQLExtensionChainTooDeepErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionChainTooDeepError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionChainTooDeepErrorBuilder of(final GraphQLExtensionChainTooDeepError template) {
        GraphQLExtensionChainTooDeepErrorBuilder builder = new GraphQLExtensionChainTooDeepErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
