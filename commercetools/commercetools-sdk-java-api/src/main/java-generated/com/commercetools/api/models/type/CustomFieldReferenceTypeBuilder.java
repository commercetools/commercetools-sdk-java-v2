
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldReferenceTypeBuilder {

    private com.commercetools.api.models.common.ReferenceTypeId referenceTypeId;

    public CustomFieldReferenceTypeBuilder referenceTypeId(
            final com.commercetools.api.models.common.ReferenceTypeId referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    public com.commercetools.api.models.common.ReferenceTypeId getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public CustomFieldReferenceType build() {
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
