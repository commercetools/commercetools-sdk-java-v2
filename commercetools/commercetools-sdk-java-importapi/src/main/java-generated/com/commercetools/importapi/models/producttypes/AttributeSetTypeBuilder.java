
package com.commercetools.importapi.models.producttypes;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeSetTypeBuilder implements Builder<AttributeSetType> {

    private com.commercetools.importapi.models.producttypes.AttributeType elementType;

    public AttributeSetTypeBuilder elementType(
            final com.commercetools.importapi.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    public AttributeSetTypeBuilder elementType(
            Function<com.commercetools.importapi.models.producttypes.AttributeTypeBuilder, Builder<? extends com.commercetools.importapi.models.producttypes.AttributeType>> builder) {
        this.elementType = builder.apply(com.commercetools.importapi.models.producttypes.AttributeTypeBuilder.of())
                .build();
        return this;
    }

    public com.commercetools.importapi.models.producttypes.AttributeType getElementType() {
        return this.elementType;
    }

    public AttributeSetType build() {
        Objects.requireNonNull(elementType, AttributeSetType.class + ": elementType is missing");
        return new AttributeSetTypeImpl(elementType);
    }

    /**
     * builds AttributeSetType without checking for non null required values
     */
    public AttributeSetType buildUnchecked() {
        return new AttributeSetTypeImpl(elementType);
    }

    public static AttributeSetTypeBuilder of() {
        return new AttributeSetTypeBuilder();
    }

    public static AttributeSetTypeBuilder of(final AttributeSetType template) {
        AttributeSetTypeBuilder builder = new AttributeSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
