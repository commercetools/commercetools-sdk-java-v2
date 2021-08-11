
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class MyCartUpdateItemShippingAddressActionBuilder
        implements Builder<MyCartUpdateItemShippingAddressAction> {

    private com.commercetools.api.models.common.BaseAddress address;

    public MyCartUpdateItemShippingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public MyCartUpdateItemShippingAddressActionBuilder address(
            final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public MyCartUpdateItemShippingAddressAction build() {
        Objects.requireNonNull(address, MyCartUpdateItemShippingAddressAction.class + ": address is missing");
        return new MyCartUpdateItemShippingAddressActionImpl(address);
    }

    /**
     * builds MyCartUpdateItemShippingAddressAction without checking for non null required values
     */
    public MyCartUpdateItemShippingAddressAction buildUnchecked() {
        return new MyCartUpdateItemShippingAddressActionImpl(address);
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of() {
        return new MyCartUpdateItemShippingAddressActionBuilder();
    }

    public static MyCartUpdateItemShippingAddressActionBuilder of(
            final MyCartUpdateItemShippingAddressAction template) {
        MyCartUpdateItemShippingAddressActionBuilder builder = new MyCartUpdateItemShippingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
