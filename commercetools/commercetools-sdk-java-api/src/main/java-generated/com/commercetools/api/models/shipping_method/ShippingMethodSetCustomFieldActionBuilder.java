
package com.commercetools.api.models.shipping_method;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodSetCustomFieldActionBuilder {

    private String name;

    @Nullable
    private java.lang.Object value;

    public ShippingMethodSetCustomFieldActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public ShippingMethodSetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
        this.value = value;
        return this;
    }

    public String getName() {
        return this.name;
    }

    @Nullable
    public java.lang.Object getValue() {
        return this.value;
    }

    public ShippingMethodSetCustomFieldAction build() {
        return new ShippingMethodSetCustomFieldActionImpl(name, value);
    }

    public static ShippingMethodSetCustomFieldActionBuilder of() {
        return new ShippingMethodSetCustomFieldActionBuilder();
    }

    public static ShippingMethodSetCustomFieldActionBuilder of(final ShippingMethodSetCustomFieldAction template) {
        ShippingMethodSetCustomFieldActionBuilder builder = new ShippingMethodSetCustomFieldActionBuilder();
        builder.name = template.getName();
        builder.value = template.getValue();
        return builder;
    }

}
