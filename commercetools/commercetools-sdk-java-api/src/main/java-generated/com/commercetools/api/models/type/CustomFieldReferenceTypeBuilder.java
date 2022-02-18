
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class CustomFieldReferenceTypeBuilder implements Builder<CustomFieldReferenceType> {

    private com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId;

    public CustomFieldReferenceTypeBuilder referenceTypeId(
            final com.commercetools.api.models.type.CustomFieldReferenceValue referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    public com.commercetools.api.models.type.CustomFieldReferenceValue getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public CustomFieldReferenceType build() {
        Objects.requireNonNull(referenceTypeId, CustomFieldReferenceType.class + ": referenceTypeId is missing");
        return new CustomFieldReferenceTypeImpl(referenceTypeId);
    }

    /**
     * builds CustomFieldReferenceType without checking for non null required values
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
