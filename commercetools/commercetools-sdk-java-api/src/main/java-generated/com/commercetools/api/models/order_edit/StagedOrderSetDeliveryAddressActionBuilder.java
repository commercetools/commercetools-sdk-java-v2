
package com.commercetools.api.models.order_edit;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetDeliveryAddressActionBuilder {

    private String deliveryId;

    @Nullable
    private com.commercetools.api.models.common.Address address;

    public StagedOrderSetDeliveryAddressActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public StagedOrderSetDeliveryAddressActionBuilder address(
            @Nullable final com.commercetools.api.models.common.Address address) {
        this.address = address;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    @Nullable
    public com.commercetools.api.models.common.Address getAddress() {
        return this.address;
    }

    public StagedOrderSetDeliveryAddressAction build() {
        return new StagedOrderSetDeliveryAddressActionImpl(deliveryId, address);
    }

    public static StagedOrderSetDeliveryAddressActionBuilder of() {
        return new StagedOrderSetDeliveryAddressActionBuilder();
    }

    public static StagedOrderSetDeliveryAddressActionBuilder of(final StagedOrderSetDeliveryAddressAction template) {
        StagedOrderSetDeliveryAddressActionBuilder builder = new StagedOrderSetDeliveryAddressActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        builder.address = template.getAddress();
        return builder;
    }

}
