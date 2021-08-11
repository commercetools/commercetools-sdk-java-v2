
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class DeliveryRemovedMessagePayloadBuilder implements Builder<DeliveryRemovedMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    public DeliveryRemovedMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    public DeliveryRemovedMessagePayloadBuilder delivery(final com.commercetools.api.models.order.Delivery delivery) {
        this.delivery = delivery;
        return this;
    }

    public com.commercetools.api.models.order.Delivery getDelivery() {
        return this.delivery;
    }

    public DeliveryRemovedMessagePayload build() {
        Objects.requireNonNull(delivery, DeliveryRemovedMessagePayload.class + ": delivery is missing");
        return new DeliveryRemovedMessagePayloadImpl(delivery);
    }

    /**
     * builds DeliveryRemovedMessagePayload without checking for non null required values
     */
    public DeliveryRemovedMessagePayload buildUnchecked() {
        return new DeliveryRemovedMessagePayloadImpl(delivery);
    }

    public static DeliveryRemovedMessagePayloadBuilder of() {
        return new DeliveryRemovedMessagePayloadBuilder();
    }

    public static DeliveryRemovedMessagePayloadBuilder of(final DeliveryRemovedMessagePayload template) {
        DeliveryRemovedMessagePayloadBuilder builder = new DeliveryRemovedMessagePayloadBuilder();
        builder.delivery = template.getDelivery();
        return builder;
    }

}
