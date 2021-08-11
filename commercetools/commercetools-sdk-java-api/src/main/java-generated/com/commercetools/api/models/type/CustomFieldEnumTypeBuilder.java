
package com.commercetools.api.models.type;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldEnumTypeBuilder implements Builder<CustomFieldEnumType> {

    private java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values;

    public CustomFieldEnumTypeBuilder values(final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public CustomFieldEnumTypeBuilder withValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        this.values = new ArrayList<>();
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    public CustomFieldEnumTypeBuilder plusValues(
            Function<com.commercetools.api.models.type.CustomFieldEnumValueBuilder, com.commercetools.api.models.type.CustomFieldEnumValueBuilder> builder) {
        if (this.values == null) {
            this.values = new ArrayList<>();
        }
        this.values.add(builder.apply(com.commercetools.api.models.type.CustomFieldEnumValueBuilder.of()).build());
        return this;
    }

    public CustomFieldEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values) {
        this.values = values;
        return this;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> getValues() {
        return this.values;
    }

    public CustomFieldEnumType build() {
        Objects.requireNonNull(values, CustomFieldEnumType.class + ": values is missing");
        return new CustomFieldEnumTypeImpl(values);
    }

    /**
     * builds CustomFieldEnumType without checking for non null required values
     */
    public CustomFieldEnumType buildUnchecked() {
        return new CustomFieldEnumTypeImpl(values);
    }

    public static CustomFieldEnumTypeBuilder of() {
        return new CustomFieldEnumTypeBuilder();
    }

    public static CustomFieldEnumTypeBuilder of(final CustomFieldEnumType template) {
        CustomFieldEnumTypeBuilder builder = new CustomFieldEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
