
package com.commercetools.api.models.error;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferencedResourceNotFoundErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferencedResourceNotFoundError referencedResourceNotFoundError = ReferencedResourceNotFoundError.builder()
 *             .message("{message}")
 *             .typeId(ReferenceTypeId.ATTRIBUTE_GROUP)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferencedResourceNotFoundErrorBuilder implements Builder<ReferencedResourceNotFoundError> {

    private String message;

    private Map<String, java.lang.Object> values = new HashMap<>();

    private com.commercetools.api.models.common.ReferenceTypeId typeId;

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param values properties to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     * @param key property name
     * @param value property value
     * @return Builder
     */

    public ReferencedResourceNotFoundErrorBuilder addValue(final String key, final java.lang.Object value) {
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

    public ReferencedResourceNotFoundErrorBuilder typeId(
            final com.commercetools.api.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundErrorBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundErrorBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
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
     * builds ReferencedResourceNotFoundError with checking for non-null required values
     * @return ReferencedResourceNotFoundError
     */
    public ReferencedResourceNotFoundError build() {
        Objects.requireNonNull(message, ReferencedResourceNotFoundError.class + ": message is missing");
        Objects.requireNonNull(typeId, ReferencedResourceNotFoundError.class + ": typeId is missing");
        return new ReferencedResourceNotFoundErrorImpl(message, values, typeId, id, key);
    }

    /**
     * builds ReferencedResourceNotFoundError without checking for non-null required values
     * @return ReferencedResourceNotFoundError
     */
    public ReferencedResourceNotFoundError buildUnchecked() {
        return new ReferencedResourceNotFoundErrorImpl(message, values, typeId, id, key);
    }

    /**
     * factory method for an instance of ReferencedResourceNotFoundErrorBuilder
     * @return builder
     */
    public static ReferencedResourceNotFoundErrorBuilder of() {
        return new ReferencedResourceNotFoundErrorBuilder();
    }

    /**
     * create builder for ReferencedResourceNotFoundError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferencedResourceNotFoundErrorBuilder of(final ReferencedResourceNotFoundError template) {
        ReferencedResourceNotFoundErrorBuilder builder = new ReferencedResourceNotFoundErrorBuilder();
        builder.message = template.getMessage();
        builder.values = template.values();
        builder.typeId = template.getTypeId();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
