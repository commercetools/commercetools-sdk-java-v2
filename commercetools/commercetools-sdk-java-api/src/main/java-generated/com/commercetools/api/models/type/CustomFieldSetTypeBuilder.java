
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldSetTypeBuilder implements Builder<CustomFieldSetType> {

    private com.commercetools.api.models.type.FieldType elementType;

    public CustomFieldSetTypeBuilder elementType(final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        return this;
    }

    public com.commercetools.api.models.type.FieldType getElementType() {
        return this.elementType;
    }

    public CustomFieldSetType build() {
        Objects.requireNonNull(elementType, CustomFieldSetType.class + ": elementType is missing");
        return new CustomFieldSetTypeImpl(elementType);
    }

    /**
     * builds CustomFieldSetType without checking for non null required values
     */
    public CustomFieldSetType buildUnchecked() {
        return new CustomFieldSetTypeImpl(elementType);
    }

    public static CustomFieldSetTypeBuilder of() {
        return new CustomFieldSetTypeBuilder();
    }

    public static CustomFieldSetTypeBuilder of(final CustomFieldSetType template) {
        CustomFieldSetTypeBuilder builder = new CustomFieldSetTypeBuilder();
        builder.elementType = template.getElementType();
        return builder;
    }

}
