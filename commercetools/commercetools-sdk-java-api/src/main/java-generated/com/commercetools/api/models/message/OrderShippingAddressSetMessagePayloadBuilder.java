
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderShippingAddressSetMessagePayloadBuilder
        implements Builder<OrderShippingAddressSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    public OrderShippingAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderShippingAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public OrderShippingAddressSetMessagePayloadBuilder oldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public OrderShippingAddressSetMessagePayloadBuilder oldAddress(
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

    public OrderShippingAddressSetMessagePayload build() {
        return new OrderShippingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    /**
     * builds OrderShippingAddressSetMessagePayload without checking for non null required values
     */
    public OrderShippingAddressSetMessagePayload buildUnchecked() {
        return new OrderShippingAddressSetMessagePayloadImpl(address, oldAddress);
    }

    public static OrderShippingAddressSetMessagePayloadBuilder of() {
        return new OrderShippingAddressSetMessagePayloadBuilder();
    }

    public static OrderShippingAddressSetMessagePayloadBuilder of(
            final OrderShippingAddressSetMessagePayload template) {
        OrderShippingAddressSetMessagePayloadBuilder builder = new OrderShippingAddressSetMessagePayloadBuilder();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
