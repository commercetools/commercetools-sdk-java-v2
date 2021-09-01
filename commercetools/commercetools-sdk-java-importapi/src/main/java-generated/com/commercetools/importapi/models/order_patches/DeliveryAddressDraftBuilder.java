
package com.commercetools.importapi.models.order_patches;

import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryAddressDraftBuilder implements Builder<DeliveryAddressDraft> {

    private String deliveryId;

    @Nullable
    private com.commercetools.importapi.models.common.Address address;

    public DeliveryAddressDraftBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public DeliveryAddressDraftBuilder address(
            Function<com.commercetools.importapi.models.common.AddressBuilder, com.commercetools.importapi.models.common.AddressBuilder> builder) {
        this.address = builder.apply(com.commercetools.importapi.models.common.AddressBuilder.of()).build();
        return this;
    }

    public DeliveryAddressDraftBuilder address(
            @Nullable final com.commercetools.importapi.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.importapi.models.common.Address getAddress() {
        return this.address;
    }

    public DeliveryAddressDraft build() {
        Objects.requireNonNull(deliveryId, DeliveryAddressDraft.class + ": deliveryId is missing");
        return new DeliveryAddressDraftImpl(deliveryId, address);
    }

    /**
     * builds DeliveryAddressDraft without checking for non null required values
     */
    public DeliveryAddressDraft buildUnchecked() {
        return new DeliveryAddressDraftImpl(deliveryId, address);
    }

    public static DeliveryAddressDraftBuilder of() {
        return new DeliveryAddressDraftBuilder();
    }

    public static DeliveryAddressDraftBuilder of(final DeliveryAddressDraft template) {
        DeliveryAddressDraftBuilder builder = new DeliveryAddressDraftBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
