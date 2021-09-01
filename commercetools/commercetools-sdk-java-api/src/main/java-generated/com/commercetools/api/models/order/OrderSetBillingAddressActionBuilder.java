
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderSetBillingAddressActionBuilder implements Builder<OrderSetBillingAddressAction> {

    @Nullable
    private com.commercetools.api.models.common.BaseAddress address;

    public OrderSetBillingAddressActionBuilder address(
            Function<com.commercetools.api.models.common.BaseAddressBuilder, com.commercetools.api.models.common.BaseAddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.BaseAddressBuilder.of()).build();
        return this;
    }

    public OrderSetBillingAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.BaseAddress address) {
        this.address = address;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.BaseAddress getAddress() {
        return this.address;
    }

    public OrderSetBillingAddressAction build() {
        return new OrderSetBillingAddressActionImpl(address);
    }

    /**
     * builds OrderSetBillingAddressAction without checking for non null required values
     */
    public OrderSetBillingAddressAction buildUnchecked() {
        return new OrderSetBillingAddressActionImpl(address);
    }

    public static OrderSetBillingAddressActionBuilder of() {
        return new OrderSetBillingAddressActionBuilder();
    }

    public static OrderSetBillingAddressActionBuilder of(final OrderSetBillingAddressAction template) {
        OrderSetBillingAddressActionBuilder builder = new OrderSetBillingAddressActionBuilder();
        builder.address = template.getAddress();
        return builder;
    }

}
