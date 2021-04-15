
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeAddEnumValueActionBuilder {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldEnumValue value;

    public TypeAddEnumValueActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeAddEnumValueActionBuilder value(final com.commercetools.api.models.type.CustomFieldEnumValue value) {
        this.value = value;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.CustomFieldEnumValue getValue() {
        return this.value;
    }

    public TypeAddEnumValueAction build() {
        return new TypeAddEnumValueActionImpl(fieldName, value);
    }

    public static TypeAddEnumValueActionBuilder of() {
        return new TypeAddEnumValueActionBuilder();
    }

    public static TypeAddEnumValueActionBuilder of(final TypeAddEnumValueAction template) {
        TypeAddEnumValueActionBuilder builder = new TypeAddEnumValueActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
