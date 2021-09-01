
package com.commercetools.api.models.type;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CustomFieldEnumValueBuilder implements Builder<CustomFieldEnumValue> {

    private String key;

    private String label;

    public CustomFieldEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public CustomFieldEnumValueBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    public CustomFieldEnumValue build() {
        Objects.requireNonNull(key, CustomFieldEnumValue.class + ": key is missing");
        Objects.requireNonNull(label, CustomFieldEnumValue.class + ": label is missing");
        return new CustomFieldEnumValueImpl(key, label);
    }

    /**
     * builds CustomFieldEnumValue without checking for non null required values
     */
    public CustomFieldEnumValue buildUnchecked() {
        return new CustomFieldEnumValueImpl(key, label);
    }

    public static CustomFieldEnumValueBuilder of() {
        return new CustomFieldEnumValueBuilder();
    }

    public static CustomFieldEnumValueBuilder of(final CustomFieldEnumValue template) {
        CustomFieldEnumValueBuilder builder = new CustomFieldEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
