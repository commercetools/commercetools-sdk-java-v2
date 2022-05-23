
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   OrderRemoveDeliveryAction orderRemoveDeliveryAction = OrderRemoveDeliveryAction.builder()
           .deliveryId("{deliveryId}")
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveDeliveryActionBuilder implements Builder<OrderRemoveDeliveryAction> {

    private String deliveryId;

    public OrderRemoveDeliveryActionBuilder deliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
        return this;
    }

    public String getDeliveryId() {
        return this.deliveryId;
    }

    public OrderRemoveDeliveryAction build() {
        Objects.requireNonNull(deliveryId, OrderRemoveDeliveryAction.class + ": deliveryId is missing");
        return new OrderRemoveDeliveryActionImpl(deliveryId);
    }

    /**
     * builds OrderRemoveDeliveryAction without checking for non null required values
     */
    public OrderRemoveDeliveryAction buildUnchecked() {
        return new OrderRemoveDeliveryActionImpl(deliveryId);
    }

    public static OrderRemoveDeliveryActionBuilder of() {
        return new OrderRemoveDeliveryActionBuilder();
    }

    public static OrderRemoveDeliveryActionBuilder of(final OrderRemoveDeliveryAction template) {
        OrderRemoveDeliveryActionBuilder builder = new OrderRemoveDeliveryActionBuilder();
        builder.deliveryId = template.getDeliveryId();
        return builder;
    }

}
