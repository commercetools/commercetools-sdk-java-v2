
package com.commercetools.importapi.models.common;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class EnumValueBuilder {

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
