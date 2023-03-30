
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLExtensionNoResponseErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLExtensionNoResponseError graphQLExtensionNoResponseError = GraphQLExtensionNoResponseError.builder()
 *             .extensionId("{extensionId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLExtensionNoResponseErrorBuilder implements Builder<GraphQLExtensionNoResponseError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private String extensionId;

    @Nullable
    private String extensionKey;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLExtensionNoResponseErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLExtensionNoResponseErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Unique identifier of the API Extension.</p>
     * @param extensionId value to be set
     * @return Builder
     */

    public GraphQLExtensionNoResponseErrorBuilder extensionId(final String extensionId) {
        this.extensionId = extensionId;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @param extensionKey value to be set
     * @return Builder
     */

    public GraphQLExtensionNoResponseErrorBuilder extensionKey(@Nullable final String extensionKey) {
        this.extensionKey = extensionKey;
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
     *  <p>Unique identifier of the API Extension.</p>
     * @return extensionId
     */

    public String getExtensionId() {
        return this.extensionId;
    }

    /**
     *  <p>User-defined unique identifier of the API Extension, if available.</p>
     * @return extensionKey
     */

    @Nullable
    public String getExtensionKey() {
        return this.extensionKey;
    }

    /**
     * builds GraphQLExtensionNoResponseError with checking for non-null required values
     * @return GraphQLExtensionNoResponseError
     */
    public GraphQLExtensionNoResponseError build() {
        Objects.requireNonNull(extensionId, GraphQLExtensionNoResponseError.class + ": extensionId is missing");
        return new GraphQLExtensionNoResponseErrorImpl(values, extensionId, extensionKey);
    }

    /**
     * builds GraphQLExtensionNoResponseError without checking for non-null required values
     * @return GraphQLExtensionNoResponseError
     */
    public GraphQLExtensionNoResponseError buildUnchecked() {
        return new GraphQLExtensionNoResponseErrorImpl(values, extensionId, extensionKey);
    }

    /**
     * factory method for an instance of GraphQLExtensionNoResponseErrorBuilder
     * @return builder
     */
    public static GraphQLExtensionNoResponseErrorBuilder of() {
        return new GraphQLExtensionNoResponseErrorBuilder();
    }

    /**
     * create builder for GraphQLExtensionNoResponseError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLExtensionNoResponseErrorBuilder of(final GraphQLExtensionNoResponseError template) {
        GraphQLExtensionNoResponseErrorBuilder builder = new GraphQLExtensionNoResponseErrorBuilder();
        builder.values = template.values();
        builder.extensionId = template.getExtensionId();
        builder.extensionKey = template.getExtensionKey();
        return builder;
    }

}
