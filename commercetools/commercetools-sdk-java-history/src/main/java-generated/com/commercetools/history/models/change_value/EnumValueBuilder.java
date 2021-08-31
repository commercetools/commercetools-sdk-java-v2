
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumValueBuilder implements Builder<EnumValue> {

    private String key;

    private String label;

    public EnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public EnumValueBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    public EnumValue build() {
        Objects.requireNonNull(key, EnumValue.class + ": key is missing");
        Objects.requireNonNull(label, EnumValue.class + ": label is missing");
        return new EnumValueImpl(key, label);
    }

    /**
     * builds EnumValue without checking for non null required values
     */
    public EnumValue buildUnchecked() {
        return new EnumValueImpl(key, label);
    }

    public static EnumValueBuilder of() {
        return new EnumValueBuilder();
    }

    public static EnumValueBuilder of(final EnumValue template) {
        EnumValueBuilder builder = new EnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
