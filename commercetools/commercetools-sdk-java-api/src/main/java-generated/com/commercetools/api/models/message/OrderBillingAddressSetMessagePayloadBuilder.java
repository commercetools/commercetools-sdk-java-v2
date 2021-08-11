
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderBillingAddressSetMessagePayloadBuilder
        implements Builder<OrderBillingAddressSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    public OrderBillingAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderBillingAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public OrderBillingAddressSetMessagePayloadBuilder oldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderBillingAddressSetMessagePayloadBuilder oldAddress(
            @Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
        return this;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    public OrderBillingAddressSetMessagePayload build() {
        return new OrderBillingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    /**
     * builds OrderBillingAddressSetMessagePayload without checking for non null required values
     */
    public OrderBillingAddressSetMessagePayload buildUnchecked() {
        return new OrderBillingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    public static OrderBillingAddressSetMessagePayloadBuilder of() {
        return new OrderBillingAddressSetMessagePayloadBuilder();
    }

    public static OrderBillingAddressSetMessagePayloadBuilder of(final OrderBillingAddressSetMessagePayload template) {
        OrderBillingAddressSetMessagePayloadBuilder builder = new OrderBillingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
