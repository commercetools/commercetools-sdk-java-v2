
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNestedTypeBuilder {

    private com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference;

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getTypeReference() {
        return this.typeReference;
    }

    public AttributeNestedType build() {
        return new AttributeNestedTypeImpl(typeReference);
    }

    public static AttributeNestedTypeBuilder of() {
        return new AttributeNestedTypeBuilder();
    }

    public static AttributeNestedTypeBuilder of(final AttributeNestedType template) {
        AttributeNestedTypeBuilder builder = new AttributeNestedTypeBuilder();
        builder.typeReference = template.getTypeReference();
        return builder;
    }

}
