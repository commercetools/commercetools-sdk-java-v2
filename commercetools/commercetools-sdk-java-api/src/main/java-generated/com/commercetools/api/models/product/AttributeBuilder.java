
package com.commercetools.api.models.product;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class AttributeBuilder {

    private String name;

    private java.lang.Object value;

    public AttributeBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public AttributeBuilder value(final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public java.lang.Object getValue() {
        return this.value;
    }

    public Attribute build() {
        return new AttributeImpl(name, value);
    }

    public static AttributeBuilder of() {
        return new AttributeBuilder();
    }

    public static AttributeBuilder of(final Attribute template) {
        AttributeBuilder builder = new AttributeBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
