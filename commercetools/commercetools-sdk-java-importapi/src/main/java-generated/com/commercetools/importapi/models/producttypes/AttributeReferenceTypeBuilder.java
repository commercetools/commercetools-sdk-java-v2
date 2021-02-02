
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeReferenceTypeBuilder {

    private com.commercetools.importapi.models.common.ReferenceType referenceTypeId;

    public AttributeReferenceTypeBuilder referenceTypeId(
            final com.commercetools.importapi.models.common.ReferenceType referenceTypeId) {
        this.referenceTypeId = referenceTypeId;
        return this;
    }

    public com.commercetools.importapi.models.common.ReferenceType getReferenceTypeId() {
        return this.referenceTypeId;
    }

    public AttributeReferenceType build() {
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
