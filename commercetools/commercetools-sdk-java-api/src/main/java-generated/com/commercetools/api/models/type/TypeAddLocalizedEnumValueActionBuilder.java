
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeAddLocalizedEnumValueActionBuilder implements Builder<TypeAddLocalizedEnumValueAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    public TypeAddLocalizedEnumValueActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeAddLocalizedEnumValueActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build();
        return this;
    }

    public TypeAddLocalizedEnumValueActionBuilder value(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value) {
        this.value = value;
        return this;
    }

    public String getFieldName() {
        return this.fieldName;
    }

    public com.commercetools.api.models.type.CustomFieldLocalizedEnumValue getValue() {
        return this.value;
    }

    public TypeAddLocalizedEnumValueAction build() {
        Objects.requireNonNull(fieldName, TypeAddLocalizedEnumValueAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeAddLocalizedEnumValueAction.class + ": value is missing");
        return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
    }

    /**
     * builds TypeAddLocalizedEnumValueAction without checking for non null required values
     */
    public TypeAddLocalizedEnumValueAction buildUnchecked() {
        return new TypeAddLocalizedEnumValueActionImpl(fieldName, value);
    }

    public static TypeAddLocalizedEnumValueActionBuilder of() {
        return new TypeAddLocalizedEnumValueActionBuilder();
    }

    public static TypeAddLocalizedEnumValueActionBuilder of(final TypeAddLocalizedEnumValueAction template) {
        TypeAddLocalizedEnumValueActionBuilder builder = new TypeAddLocalizedEnumValueActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
