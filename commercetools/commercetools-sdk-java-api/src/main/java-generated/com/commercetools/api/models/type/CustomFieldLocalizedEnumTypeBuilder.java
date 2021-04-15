
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldLocalizedEnumTypeBuilder {

    private java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values;

    public CustomFieldLocalizedEnumTypeBuilder values(
            final com.commercetools.api.models.type.CustomFieldLocalizedEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
        return this;
    }

    public CustomFieldLocalizedEnumTypeBuilder values(
            final java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> values) {
        this.values = values;
        return this;
    }

    public java.util.List<com.commercetools.api.models.type.CustomFieldLocalizedEnumValue> getValues() {
        return this.values;
    }

    public CustomFieldLocalizedEnumType build() {
        return new CustomFieldLocalizedEnumTypeImpl(values);
    }

    public static CustomFieldLocalizedEnumTypeBuilder of() {
        return new CustomFieldLocalizedEnumTypeBuilder();
    }

    public static CustomFieldLocalizedEnumTypeBuilder of(final CustomFieldLocalizedEnumType template) {
        CustomFieldLocalizedEnumTypeBuilder builder = new CustomFieldLocalizedEnumTypeBuilder();
        builder.values = template.getValues();
        return builder;
    }

}
