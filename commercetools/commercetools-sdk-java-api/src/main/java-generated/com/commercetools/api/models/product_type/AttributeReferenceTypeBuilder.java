
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AttributeReferenceTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AttributeReferenceType attributeReferenceType = AttributeReferenceType.builder()
 *             .referenceTypeId(AttributeReferenceTypeId.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeReferenceTypeBuilder implements Builder<AttributeReferenceType> {

    private com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId;

    /**
     *  <p>Name of the resource type that the value should reference.</p>
     */

    public AttributeReferenceTypeBuilder referenceTypeId(
            final com.commercetools.api.models.product_type.AttributeReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    public com.commercetools.api.models.product_type.AttributeReferenceTypeId getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public AttributeReferenceType build() {
        Objects.requireNonNull(referenceTypeId, AttributeReferenceType.class + ": referenceTypeId is missing");
        return new AttributeReferenceTypeImpl(referenceTypeId);
    }

    /**
     * builds AttributeReferenceType without checking for non null required values
     */
    public AttributeReferenceType buildUnchecked() {
        return new AttributeReferenceTypeImpl(referenceTypeId);
    }

    public static AttributeReferenceTypeBuilder of() {
        return new AttributeReferenceTypeBuilder();
    }

    public static AttributeReferenceTypeBuilder of(final AttributeReferenceType template) {
        AttributeReferenceTypeBuilder builder = new AttributeReferenceTypeBuilder();
        builder.referenceTypeId = template.getReferenceTypeId();
        return builder;
    }

}
