
package com.commercetools.history.models;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ItemShippingTargetBuilder {

    private String addressKey;

    private Integer quantity;

    public ItemShippingTargetBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public ItemShippingTargetBuilder quantity(final Integer quantity) {
        this.quantity = quantity;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public Integer getQuantity() {
        return this.quantity;
    }

    public ItemShippingTarget build() {
        return new ItemShippingTargetImpl(addressKey, quantity);
    }

    public static ItemShippingTargetBuilder of() {
        return new ItemShippingTargetBuilder();
    }

    public static ItemShippingTargetBuilder of(final ItemShippingTarget template) {
        ItemShippingTargetBuilder builder = new ItemShippingTargetBuilder();
        builder.addressKey = template.getAddressKey();
        builder.quantity = template.getQuantity();
        return builder;
    }

}
