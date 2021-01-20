
package com.commercetools.api.models.type;

import java.time.ZonedDateTime;
import java.util.*;

import javax.annotation.Nullable;

import com.commercetools.api.models.type.CustomFieldSetType;
import com.commercetools.api.models.type.FieldType;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldSetTypeBuilder {

    private com.commercetools.api.models.type.FieldType elementType;

    public CustomFieldSetTypeBuilder elementType(final com.commercetools.api.models.type.FieldType elementType) {
        this.elementType = elementType;
        return this;
    }

    public com.commercetools.api.models.type.FieldType getElementType() {
        return this.elementType;
    }

    public CustomFieldSetType build() {
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
