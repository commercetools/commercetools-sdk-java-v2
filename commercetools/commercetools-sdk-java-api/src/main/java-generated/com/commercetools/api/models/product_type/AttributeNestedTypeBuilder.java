
package com.commercetools.api.models.product_type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNestedTypeBuilder implements Builder<AttributeNestedType> {

    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference() {
        return this.typeReference;
    }

    public AttributeNestedType build() {
        Objects.requireNonNull(typeReference);
        return new AttributeNestedTypeImpl(typeReference);
    }

    /**
     * builds AttributeNestedType without checking for non null required values
     */
    public AttributeNestedType buildUnchecked() {
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
