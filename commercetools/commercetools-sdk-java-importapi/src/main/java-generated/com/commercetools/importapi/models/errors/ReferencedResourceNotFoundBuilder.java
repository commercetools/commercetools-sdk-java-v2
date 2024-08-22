
package com.commercetools.importapi.models.errors;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ReferencedResourceNotFoundBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ReferencedResourceNotFound referencedResourceNotFound = ReferencedResourceNotFound.builder()
 *             .message("{message}")
 *             .typeId(ReferenceType.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ReferencedResourceNotFoundBuilder implements Builder<ReferencedResourceNotFound> {

    private String message;

    private com.commercetools.importapi.models.common.ReferenceType typeId;

    @Nullable
    private String id;

    @Nullable
    private String key;

    /**
     *  <p><code>"The referenced object of type $typeId $predicate was not found. It either doesn't exist, or it can't be accessed from this endpoint (e.g., if the endpoint filters by store or customer account)."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Type of referenced resource.</p>
     * @param typeId value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundBuilder typeId(
            final com.commercetools.importapi.models.common.ReferenceType typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced resource, if known.</p>
     * @param id value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>User-defined unique identifier of the referenced resource, if known.</p>
     * @param key value to be set
     * @return Builder
     */

    public ReferencedResourceNotFoundBuilder key(@Nullable final String key) {
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
     *  <p>Type of referenced resource.</p>
     * @return typeId
     */

    public com.commercetools.importapi.models.common.ReferenceType getTypeId() {
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
     * builds ReferencedResourceNotFound with checking for non-null required values
     * @return ReferencedResourceNotFound
     */
    public ReferencedResourceNotFound build() {
        Objects.requireNonNull(message, ReferencedResourceNotFound.class + ": message is missing");
        Objects.requireNonNull(typeId, ReferencedResourceNotFound.class + ": typeId is missing");
        return new ReferencedResourceNotFoundImpl(message, typeId, id, key);
    }

    /**
     * builds ReferencedResourceNotFound without checking for non-null required values
     * @return ReferencedResourceNotFound
     */
    public ReferencedResourceNotFound buildUnchecked() {
        return new ReferencedResourceNotFoundImpl(message, typeId, id, key);
    }

    /**
     * factory method for an instance of ReferencedResourceNotFoundBuilder
     * @return builder
     */
    public static ReferencedResourceNotFoundBuilder of() {
        return new ReferencedResourceNotFoundBuilder();
    }

    /**
     * create builder for ReferencedResourceNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ReferencedResourceNotFoundBuilder of(final ReferencedResourceNotFound template) {
        ReferencedResourceNotFoundBuilder builder = new ReferencedResourceNotFoundBuilder();
        builder.message = template.getMessage();
        builder.typeId = template.getTypeId();
        builder.id = template.getId();
        builder.key = template.getKey();
        return builder;
    }

}
