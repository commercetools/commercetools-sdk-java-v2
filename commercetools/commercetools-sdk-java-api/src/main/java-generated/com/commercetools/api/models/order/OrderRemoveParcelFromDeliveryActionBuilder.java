
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class OrderRemoveParcelFromDeliveryActionBuilder implements Builder<OrderRemoveParcelFromDeliveryAction> {

    private String parcelId;

    public OrderRemoveParcelFromDeliveryActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    public String getParcelId() {
        return this.parcelId;
    }

    public OrderRemoveParcelFromDeliveryAction build() {
        Objects.requireNonNull(parcelId, OrderRemoveParcelFromDeliveryAction.class + ": parcelId is missing");
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    /**
     * builds OrderRemoveParcelFromDeliveryAction without checking for non null required values
     */
    public OrderRemoveParcelFromDeliveryAction buildUnchecked() {
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder of() {
        return new OrderRemoveParcelFromDeliveryActionBuilder();
    }

    public static OrderRemoveParcelFromDeliveryActionBuilder of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionBuilder builder = new OrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
