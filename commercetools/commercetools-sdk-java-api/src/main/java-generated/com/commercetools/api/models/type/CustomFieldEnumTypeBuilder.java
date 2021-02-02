
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldEnumTypeBuilder {

    private java.util.List<com.commercetools.api.models.type.CustomFieldEnumValue> values;

    public CustomFieldEnumTypeBuilder values(final com.commercetools.api.models.type.CustomFieldEnumValue... values) {
        this.values = new ArrayList<>(Arrays.asList(values));
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
