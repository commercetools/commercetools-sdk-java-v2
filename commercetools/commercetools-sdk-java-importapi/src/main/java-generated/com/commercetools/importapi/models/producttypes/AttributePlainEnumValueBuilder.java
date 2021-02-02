
package com.commercetools.importapi.models.producttypes;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributePlainEnumValueBuilder {

    private String key;

    private String label;

    public AttributePlainEnumValueBuilder key(final String key) {
        this.key = key;
        return this;
    }

    public AttributePlainEnumValueBuilder label(final String label) {
        this.label = label;
        return this;
    }

    public String getKey() {
        return this.key;
    }

    public String getLabel() {
        return this.label;
    }

    public AttributePlainEnumValue build() {
        return new AttributePlainEnumValueImpl(key, label);
    }

    public static AttributePlainEnumValueBuilder of() {
        return new AttributePlainEnumValueBuilder();
    }

    public static AttributePlainEnumValueBuilder of(final AttributePlainEnumValue template) {
        AttributePlainEnumValueBuilder builder = new AttributePlainEnumValueBuilder();
        builder.key = template.getKey();
        builder.label = template.getLabel();
        return builder;
    }

}
