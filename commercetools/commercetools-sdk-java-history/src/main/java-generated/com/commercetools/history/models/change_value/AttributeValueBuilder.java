
package com.commercetools.history.models.change_value;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class AttributeValueBuilder implements Builder<AttributeValue> {

    private String name;

    private java.lang.Object value;

    public AttributeValueBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeValueBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public AttributeValue build() {
        Objects.requireNonNull(name, AttributeValue.class + ": name is missing");
        Objects.requireNonNull(value, AttributeValue.class + ": value is missing");
        return new AttributeValueImpl(name, value);
    }

    /**
     * builds AttributeValue without checking for non null required values
     */
    public AttributeValue buildUnchecked() {
        return new AttributeValueImpl(name, value);
    }

    public static AttributeValueBuilder of() {
        return new AttributeValueBuilder();
    }

    public static AttributeValueBuilder of(final AttributeValue template) {
        AttributeValueBuilder builder = new AttributeValueBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
