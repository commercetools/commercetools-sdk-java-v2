
package com.commercetools.history.models.common;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BusinessUnitResourceIdentifierBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BusinessUnitResourceIdentifier businessUnitResourceIdentifier = BusinessUnitResourceIdentifier.builder()
 *             .typeId(ReferenceTypeId.APPROVAL_FLOW)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BusinessUnitResourceIdentifierBuilder implements Builder<BusinessUnitResourceIdentifier> {

    @Nullable
    private String id;

    @Nullable
    private String key;

    private com.commercetools.history.models.common.ReferenceTypeId typeId;

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>key</code> is absent.</p>
     * @param id value to be set
     * @return Builder
     */

    public BusinessUnitResourceIdentifierBuilder id(@Nullable final String id) {
        this.id = id;
        return this;
    }

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>id</code> is absent.</p>
     * @param key value to be set
     * @return Builder
     */

    public BusinessUnitResourceIdentifierBuilder key(@Nullable final String key) {
        this.key = key;
        return this;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     * @param typeId value to be set
     * @return Builder
     */

    public BusinessUnitResourceIdentifierBuilder typeId(
            final com.commercetools.history.models.common.ReferenceTypeId typeId) {
        this.typeId = typeId;
        return this;
    }

    /**
     *  <p>Unique identifier of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>key</code> is absent.</p>
     * @return id
     */

    @Nullable
    public String getId() {
        return this.id;
    }

    /**
     *  <p>Unique key of the referenced <a href="https://docs.commercetools.com/apis/ctp:api:type:BusinessUnit" rel="nofollow">BusinessUnit</a>. Required if <code>id</code> is absent.</p>
     * @return key
     */

    @Nullable
    public String getKey() {
        return this.key;
    }

    /**
     *  <p>Type of resource the value should reference. Supported resource type identifiers are:</p>
     * @return typeId
     */

    public com.commercetools.history.models.common.ReferenceTypeId getTypeId() {
        return this.typeId;
    }

    /**
     * builds BusinessUnitResourceIdentifier with checking for non-null required values
     * @return BusinessUnitResourceIdentifier
     */
    public BusinessUnitResourceIdentifier build() {
        Objects.requireNonNull(typeId, BusinessUnitResourceIdentifier.class + ": typeId is missing");
        return new BusinessUnitResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * builds BusinessUnitResourceIdentifier without checking for non-null required values
     * @return BusinessUnitResourceIdentifier
     */
    public BusinessUnitResourceIdentifier buildUnchecked() {
        return new BusinessUnitResourceIdentifierImpl(id, key, typeId);
    }

    /**
     * factory method for an instance of BusinessUnitResourceIdentifierBuilder
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder of() {
        return new BusinessUnitResourceIdentifierBuilder();
    }

    /**
     * create builder for BusinessUnitResourceIdentifier instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BusinessUnitResourceIdentifierBuilder of(final BusinessUnitResourceIdentifier template) {
        BusinessUnitResourceIdentifierBuilder builder = new BusinessUnitResourceIdentifierBuilder();
        builder.id = template.getId();
        builder.key = template.getKey();
        builder.typeId = template.getTypeId();
        return builder;
    }

}
