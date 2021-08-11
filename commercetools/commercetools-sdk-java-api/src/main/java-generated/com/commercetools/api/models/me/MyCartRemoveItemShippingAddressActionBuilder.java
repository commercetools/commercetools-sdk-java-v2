
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartRemoveItemShippingAddressActionBuilder
        implements Builder<MyCartRemoveItemShippingAddressAction> {

    private String addressKey;

    public MyCartRemoveItemShippingAddressActionBuilder addressKey(final String addressKey) {
        this.addressKey = addressKey;
        return this;
    }

    public String getAddressKey() {
        return this.addressKey;
    }

    public MyCartRemoveItemShippingAddressAction build() {
        Objects.requireNonNull(addressKey, MyCartRemoveItemShippingAddressAction.class + ": addressKey is missing");
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }

    /**
     * builds MyCartRemoveItemShippingAddressAction without checking for non null required values
     */
    public MyCartRemoveItemShippingAddressAction buildUnchecked() {
        return new MyCartRemoveItemShippingAddressActionImpl(addressKey);
    }

    public static MyCartRemoveItemShippingAddressActionBuilder of() {
        return new MyCartRemoveItemShippingAddressActionBuilder();
    }

    public static MyCartRemoveItemShippingAddressActionBuilder of(
            final MyCartRemoveItemShippingAddressAction template) {
        MyCartRemoveItemShippingAddressActionBuilder builder = new MyCartRemoveItemShippingAddressActionBuilder();
        builder.addressKey = template.getAddressKey();
        return builder;
    }

}
