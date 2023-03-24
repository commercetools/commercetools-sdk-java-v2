
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CustomFieldReferenceTypeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CustomFieldReferenceType customFieldReferenceType = CustomFieldReferenceType.builder()
 *             .referenceTypeId(CustomFieldReferenceValue.CART)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CustomFieldReferenceTypeBuilder implements Builder<CustomFieldReferenceType> {

    private com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId;

    /**
     *  <p>Resource type the Custom Field can reference.</p>
     * @param referenceTypeId value to be set
     * @return Builder
     */

    public CustomFieldReferenceTypeBuilder referenceTypeId(
            final com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    public com.commercetools.api.models.type.CustomFieldReferenceValue getReferenceTypeId() {
        return this.referenceTypeId;
    }

    /**
     * builds CustomFieldReferenceType with checking for non-null required values
     * @return CustomFieldReferenceType
     */
    public CustomFieldReferenceType build() {
        Objects.requireNonNull(referenceTypeId, CustomFieldReferenceType.class + ": referenceTypeId is missing");
        return new CustomFieldReferenceTypeImpl(referenceTypeId);
    }

    /**
     * builds CustomFieldReferenceType without checking for non-null required values
     * @return CustomFieldReferenceType
     */
    public CustomFieldReferenceType buildUnchecked() {
        return new CustomFieldReferenceTypeImpl(referenceTypeId);
    }

    public static CustomFieldReferenceTypeBuilder of() {
        return new CustomFieldReferenceTypeBuilder();
    }

    public static CustomFieldReferenceTypeBuilder of(final CustomFieldReferenceType template) {
        CustomFieldReferenceTypeBuilder builder = new CustomFieldReferenceTypeBuilder();
        builder.referenceTypeId = template.getReferenceTypeId();
        return builder;
    }

}
