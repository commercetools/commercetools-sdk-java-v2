
package com.commercetools.api.models.product_type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNestedTypeBuilder implements Builder<AttributeNestedType> {

    private com.commercetools.api.models.product_type.ProductTypeReference typeReference;

    public AttributeNestedTypeBuilder typeReference(
            Function<com.commercetools.api.models.product_type.ProductTypeReferenceBuilder, com.commercetools.api.models.product_type.ProductTypeReferenceBuilder> builder) {
        this.typeReference = builder.apply(com.commercetools.api.models.product_type.ProductTypeReferenceBuilder.of())
                .build();
        return this;
    }

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.api.models.product_type.ProductTypeReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    public com.commercetools.api.models.product_type.ProductTypeReference getTypeReference() {
        return this.typeReference;
    }

    public AttributeNestedType build() {
        Objects.requireNonNull(typeReference, AttributeNestedType.class + ": typeReference is missing");
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
