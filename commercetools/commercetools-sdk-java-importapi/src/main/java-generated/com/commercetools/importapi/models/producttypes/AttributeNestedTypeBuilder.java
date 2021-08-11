
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeNestedTypeBuilder implements Builder<AttributeNestedType> {

    private com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference;

    public AttributeNestedTypeBuilder typeReference(
            Function<com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder, com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder> builder) {
        this.typeReference = builder
                .apply(com.commercetools.importapi.models.common.ProductTypeKeyReferenceBuilder.of())
                .build();
        return this;
    }

    public AttributeNestedTypeBuilder typeReference(
            final com.commercetools.importapi.models.common.ProductTypeKeyReference typeReference) {
        this.typeReference = typeReference;
        return this;
    }

    public com.commercetools.importapi.models.common.ProductTypeKeyReference getTypeReference() {
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
