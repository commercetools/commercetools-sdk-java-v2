
package com.commercetools.api.models.error;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLMaxStoreReferencesReachedErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLMaxStoreReferencesReachedError graphQLMaxStoreReferencesReachedError = GraphQLMaxStoreReferencesReachedError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLMaxStoreReferencesReachedErrorBuilder implements Builder<GraphQLMaxStoreReferencesReachedError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLMaxStoreReferencesReachedErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLMaxStoreReferencesReachedErrorBuilder addValue(final String key, final java.lang.Object value) {
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
     * builds GraphQLMaxStoreReferencesReachedError with checking for non-null required values
     * @return GraphQLMaxStoreReferencesReachedError
     */
    public GraphQLMaxStoreReferencesReachedError build() {
        return new GraphQLMaxStoreReferencesReachedErrorImpl(values);
    }

    /**
     * builds GraphQLMaxStoreReferencesReachedError without checking for non-null required values
     * @return GraphQLMaxStoreReferencesReachedError
     */
    public GraphQLMaxStoreReferencesReachedError buildUnchecked() {
        return new GraphQLMaxStoreReferencesReachedErrorImpl(values);
    }

    /**
     * factory method for an instance of GraphQLMaxStoreReferencesReachedErrorBuilder
     * @return builder
     */
    public static GraphQLMaxStoreReferencesReachedErrorBuilder of() {
        return new GraphQLMaxStoreReferencesReachedErrorBuilder();
    }

    /**
     * create builder for GraphQLMaxStoreReferencesReachedError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLMaxStoreReferencesReachedErrorBuilder of(
            final GraphQLMaxStoreReferencesReachedError template) {
        GraphQLMaxStoreReferencesReachedErrorBuilder builder = new GraphQLMaxStoreReferencesReachedErrorBuilder();
        builder.values = template.values();
        return builder;
    }

}
