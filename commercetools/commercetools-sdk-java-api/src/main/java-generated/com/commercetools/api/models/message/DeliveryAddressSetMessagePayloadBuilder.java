
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryAddressSetMessagePayloadBuilder {

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
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
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
