
package com.commercetools.api.models.message;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeliveryRemovedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeliveryRemovedMessagePayload deliveryRemovedMessagePayload = DeliveryRemovedMessagePayload.builder()
 *             .delivery(deliveryBuilder -> deliveryBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeliveryRemovedMessagePayloadBuilder implements Builder<DeliveryRemovedMessagePayload> {

    private com.commercetools.api.models.order.Delivery delivery;

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     */

    public DeliveryRemovedMessagePayloadBuilder delivery(
            Function<com.commercetools.api.models.order.DeliveryBuilder, com.commercetools.api.models.order.DeliveryBuilder> builder) {
        this.delivery = builder.apply(com.commercetools.api.models.order.DeliveryBuilder.of()).build();
        return this;
    }

    /**
     *  <p>The Delivery that was removed from the Order.</p>
     */

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
