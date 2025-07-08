
package com.commercetools.importapi.models.producttypes;

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
 *             .referenceTypeId(ReferenceType.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AttributeReferenceTypeBuilder implements Builder<AttributeReferenceType> {

    private com.commercetools.importapi.models.common.ReferenceType referenceTypeId;

    /**
     *  <p>Type of referenced resource.</p>
     * @param referenceTypeId value to be set
     * @return Builder
     */

    public AttributeReferenceTypeBuilder referenceTypeId(
            final com.commercetools.importapi.models.common.ReferenceType referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    /**
     *  <p>Type of referenced resource.</p>
     * @return referenceTypeId
     */

    public com.commercetools.importapi.models.common.ReferenceType getReferenceTypeId() {
        return this.referenceTypeId;
    }

    /**
     * builds AttributeReferenceType with checking for non-null required values
     * @return AttributeReferenceType
     */
    public AttributeReferenceType build() {
        Objects.requireNonNull(referenceTypeId, AttributeReferenceType.class + ": referenceTypeId is missing");
        return new AttributeReferenceTypeImpl(referenceTypeId);
    }

    /**
     * builds AttributeReferenceType without checking for non-null required values
     * @return AttributeReferenceType
     */
    public AttributeReferenceType buildUnchecked() {
        return new AttributeReferenceTypeImpl(referenceTypeId);
    }

    /**
     * factory method for an instance of AttributeReferenceTypeBuilder
     * @return builder
     */
    public static AttributeReferenceTypeBuilder of() {
        return new AttributeReferenceTypeBuilder();
    }

    /**
     * create builder for AttributeReferenceType instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AttributeReferenceTypeBuilder of(final AttributeReferenceType template) {
        AttributeReferenceTypeBuilder builder = new AttributeReferenceTypeBuilder();
        builder.referenceTypeId = template.getReferenceTypeId();
        return builder;
    }

}
