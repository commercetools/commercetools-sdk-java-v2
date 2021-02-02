
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeSetTypeBuilder {

    private com.commercetools.importapi.models.producttypes.AttributeType elementType;

    public AttributeSetTypeBuilder elementType(
            final com.commercetools.importapi.models.producttypes.AttributeType elementType) {
        this.elementType = elementType;
        return this;
    }

    public com.commercetools.importapi.models.producttypes.AttributeType getElementType() {
        return this.elementType;
    }

    public AttributeSetType build() {
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
