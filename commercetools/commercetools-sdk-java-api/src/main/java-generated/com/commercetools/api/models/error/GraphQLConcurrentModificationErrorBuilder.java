
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLConcurrentModificationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLConcurrentModificationError graphQLConcurrentModificationError = GraphQLConcurrentModificationError.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLConcurrentModificationErrorBuilder implements Builder<GraphQLConcurrentModificationError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    @Nullable
    private Long currentVersion;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLConcurrentModificationErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLConcurrentModificationErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Current version of the resource.</p>
     * @param currentVersion value to be set
     * @return Builder
     */

    public GraphQLConcurrentModificationErrorBuilder currentVersion(@Nullable final Long currentVersion) {
        this.currentVersion = currentVersion;
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
     *  <p>Current version of the resource.</p>
     * @return currentVersion
     */

    @Nullable
    public Long getCurrentVersion() {
        return this.currentVersion;
    }

    /**
     * builds GraphQLConcurrentModificationError with checking for non-null required values
     * @return GraphQLConcurrentModificationError
     */
    public GraphQLConcurrentModificationError build() {
        return new GraphQLConcurrentModificationErrorImpl(values, currentVersion);
    }

    /**
     * builds GraphQLConcurrentModificationError without checking for non-null required values
     * @return GraphQLConcurrentModificationError
     */
    public GraphQLConcurrentModificationError buildUnchecked() {
        return new GraphQLConcurrentModificationErrorImpl(values, currentVersion);
    }

    /**
     * factory method for an instance of GraphQLConcurrentModificationErrorBuilder
     * @return builder
     */
    public static GraphQLConcurrentModificationErrorBuilder of() {
        return new GraphQLConcurrentModificationErrorBuilder();
    }

    /**
     * create builder for GraphQLConcurrentModificationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLConcurrentModificationErrorBuilder of(final GraphQLConcurrentModificationError template) {
        GraphQLConcurrentModificationErrorBuilder builder = new GraphQLConcurrentModificationErrorBuilder();
        builder.values = template.values();
        builder.currentVersion = template.getCurrentVersion();
        return builder;
    }

}
