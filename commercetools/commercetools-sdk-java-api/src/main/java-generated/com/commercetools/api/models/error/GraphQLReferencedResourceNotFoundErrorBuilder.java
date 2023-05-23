
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GraphQLReferencedResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GraphQLReferencedResourceNotFoundError graphQLReferencedResourceNotFoundError = GraphQLReferencedResourceNotFoundError.builder()
 *             .typeId(ReferenceTypeId.ASSOCIATE_ROLE)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GraphQLReferencedResourceNotFoundErrorBuilder implements Builder<GraphQLReferencedResourceNotFoundError> {

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public GraphQLReferencedResourceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public GraphQLReferencedResourceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
        if (this.values == null) {
            values = new HashMap<>();
        }
        values.put(key, value);
        return this;
    }

    /**
     *  <p>Type of referenced resource.</p>
     * @param typeId value to be set
     * @return Builder
     */

    public GraphQLReferencedResourceNotFoundErrorBuilder typeId(
            final com.commercetools.api.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @param id value to be set
     * @return Builder
     */

    public GraphQLReferencedResourceNotFoundErrorBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @param key value to be set
     * @return Builder
     */

    public GraphQLReferencedResourceNotFoundErrorBuilder key(@Nullable final String key) {
        this.key = key;
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
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     * builds GraphQLReferencedResourceNotFoundError with checking for non-null required values
     * @return GraphQLReferencedResourceNotFoundError
     */
    public GraphQLReferencedResourceNotFoundError build() {
        Objects.requireNonNull(typeId, GraphQLReferencedResourceNotFoundError.class + ": typeId is missing");
        return new GraphQLReferencedResourceNotFoundErrorImpl(values, typeId, id, key);
    }

    /**
     * builds GraphQLReferencedResourceNotFoundError without checking for non-null required values
     * @return GraphQLReferencedResourceNotFoundError
     */
    public GraphQLReferencedResourceNotFoundError buildUnchecked() {
        return new GraphQLReferencedResourceNotFoundErrorImpl(values, typeId, id, key);
    }

    /**
     * factory method for an instance of GraphQLReferencedResourceNotFoundErrorBuilder
     * @return builder
     */
    public static GraphQLReferencedResourceNotFoundErrorBuilder of() {
        return new GraphQLReferencedResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for GraphQLReferencedResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GraphQLReferencedResourceNotFoundErrorBuilder of(
            final GraphQLReferencedResourceNotFoundError template) {
        GraphQLReferencedResourceNotFoundErrorBuilder builder = new GraphQLReferencedResourceNotFoundErrorBuilder();
        builder.values = template.values();
        builder.typeId = template.getTypeId();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
