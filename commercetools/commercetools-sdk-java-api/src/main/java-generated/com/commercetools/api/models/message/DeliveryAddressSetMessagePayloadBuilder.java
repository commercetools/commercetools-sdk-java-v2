
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryAddressSetMessagePayloadBuilder implements Builder<DeliveryAddressSetMessagePayload> {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.Address address;

    @Nullable
    private com.commercetools.api.models.common.Address oldAddress;

    public DeliveryAddressSetMessagePayloadBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public DeliveryAddressSetMessagePayloadBuilder address(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryAddressSetMessagePayloadBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public DeliveryAddressSetMessagePayloadBuilder oldAddress(
            Function<com.commercetools.api.models.common.AddressBuilder, com.commercetools.api.models.common.AddressBuilder> builder) {
        this.oldAddress = builder.apply(com.commercetools.api.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryAddressSetMessagePayloadBuilder oldAddress(
            @Nullable final com.commercetools.api.models.common.Address oldAddress) {
        this.oldAddress = oldAddress;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getOldAddress() {
        return this.oldAddress;
    }

    public DeliveryAddressSetMessagePayload build() {
        Objects.requireNonNull(deliveryId, DeliveryAddressSetMessagePayload.class + ": deliveryId is missing");
        return new DeliveryAddressSetMessagePayloadImpl(deliveryId, address, oldAddress);
    }

    /**
     * builds DeliveryAddressSetMessagePayload without checking for non null required values
     */
    public DeliveryAddressSetMessagePayload buildUnchecked() {
        return new DeliveryAddressSetMessagePayloadImpl(deliveryId, address, oldAddress);
    }

    public static DeliveryAddressSetMessagePayloadBuilder of() {
        return new DeliveryAddressSetMessagePayloadBuilder();
    }

    public static DeliveryAddressSetMessagePayloadBuilder of(final DeliveryAddressSetMessagePayload template) {
        DeliveryAddressSetMessagePayloadBuilder builder = new DeliveryAddressSetMessagePayloadBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        builder.oldAddress = template.getOldAddress();
        return builder;
    }

}
