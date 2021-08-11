
package com.commercetools.api.models.shipping_method;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingMethodChangeNameActionBuilder implements Builder<ShippingMethodChangeNameAction> {

    private String name;

    public ShippingMethodChangeNameActionBuilder name(final String name) {
        this.name = name;
        return this;
    }

    public String getName() {
        return this.name;
    }

    public ShippingMethodChangeNameAction build() {
        Objects.requireNonNull(name, ShippingMethodChangeNameAction.class + ": name is missing");
        return new ShippingMethodChangeNameActionImpl(name);
    }

    /**
     * builds ShippingMethodChangeNameAction without checking for non null required values
     */
    public ShippingMethodChangeNameAction buildUnchecked() {
        return new ShippingMethodChangeNameActionImpl(name);
    }

    public static ShippingMethodChangeNameActionBuilder of() {
        return new ShippingMethodChangeNameActionBuilder();
    }

    public static ShippingMethodChangeNameActionBuilder of(final ShippingMethodChangeNameAction template) {
        ShippingMethodChangeNameActionBuilder builder = new ShippingMethodChangeNameActionBuilder();
        builder.name = template.getName();
        return builder;
    }

}
