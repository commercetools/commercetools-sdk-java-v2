
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
     */

    public ReferencedResourceNotFoundErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
     */

    public ReferencedResourceNotFoundErrorBuilder values(final Map<String, java.lang.Object> values) {
        this.values = values;
        return this;
    }

    /**
     *  <p>Error-specific additional fields.</p>
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
     */

    public ReferencedResourceNotFoundErrorBuilder typeId(
            final com.commercetools.api.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     */

    public ReferencedResourceNotFoundErrorBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     */

    public ReferencedResourceNotFoundErrorBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    public String getMessage() {
        return this.message;
    }

    public Map<String, java.lang.Object> getValues() {
        return this.values;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    @Nullable
    public String getId() {
        return this.id;
    }

    @Nullable
    public String getKey() {
        return this.key;
    }

    public ReferencedResourceNotFoundError build() {
        Objects.requireNonNull(message, ReferencedResourceNotFoundError.class + ": message is missing");
        Objects.requireNonNull(values, ReferencedResourceNotFoundError.class + ": values are missing");
        Objects.requireNonNull(typeId, ReferencedResourceNotFoundError.class + ": typeId is missing");
        return new ReferencedResourceNotFoundErrorImpl(message, values, typeId, id, key);
    }

    /**
     * builds ReferencedResourceNotFoundError without checking for non null required values
     */
    public ReferencedResourceNotFoundError buildUnchecked() {
        return new ReferencedResourceNotFoundErrorImpl(message, values, typeId, id, key);
    }

    public static ReferencedResourceNotFoundErrorBuilder of() {
        return new ReferencedResourceNotFoundErrorBuilder();
    }

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
