
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class TypeChangeLocalizedEnumValueLabelActionBuilder
        implements Builder<TypeChangeLocalizedEnumValueLabelAction> {

    private String fieldName;

    private com.commercetools.api.models.type.CustomFieldLocalizedEnumValue value;

    public TypeChangeLocalizedEnumValueLabelActionBuilder fieldName(final String fieldName) {
        this.fieldName = fieldName;
        return this;
    }

    public TypeChangeLocalizedEnumValueLabelActionBuilder value(
            Function<com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder, com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder> builder) {
        this.value = builder.apply(com.commercetools.api.models.type.CustomFieldLocalizedEnumValueBuilder.of()).build();
        return this;
    }

    public TypeChangeLocalizedEnumValueLabelActionBuilder value(
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

    public TypeChangeLocalizedEnumValueLabelAction build() {
        Objects.requireNonNull(fieldName, TypeChangeLocalizedEnumValueLabelAction.class + ": fieldName is missing");
        Objects.requireNonNull(value, TypeChangeLocalizedEnumValueLabelAction.class + ": value is missing");
        return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
    }

    /**
     * builds TypeChangeLocalizedEnumValueLabelAction without checking for non null required values
     */
    public TypeChangeLocalizedEnumValueLabelAction buildUnchecked() {
        return new TypeChangeLocalizedEnumValueLabelActionImpl(fieldName, value);
    }

    public static TypeChangeLocalizedEnumValueLabelActionBuilder of() {
        return new TypeChangeLocalizedEnumValueLabelActionBuilder();
    }

    public static TypeChangeLocalizedEnumValueLabelActionBuilder of(
            final TypeChangeLocalizedEnumValueLabelAction template) {
        TypeChangeLocalizedEnumValueLabelActionBuilder builder = new TypeChangeLocalizedEnumValueLabelActionBuilder();
        builder.fieldName = template.getFieldName();
        builder.value = template.getValue();
        return builder;
    }

}
