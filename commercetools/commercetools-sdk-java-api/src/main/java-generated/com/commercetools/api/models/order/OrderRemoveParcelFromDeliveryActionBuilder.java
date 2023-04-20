
package com.commercetools.api.models.order;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderRemoveParcelFromDeliveryActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderRemoveParcelFromDeliveryAction orderRemoveParcelFromDeliveryAction = OrderRemoveParcelFromDeliveryAction.builder()
 *             .parcelId("{parcelId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderRemoveParcelFromDeliveryActionBuilder implements Builder<OrderRemoveParcelFromDeliveryAction> {

    private String parcelId;

    /**
     * set the value to the parcelId
     * @param parcelId value to be set
     * @return Builder
     */

    public OrderRemoveParcelFromDeliveryActionBuilder parcelId(final String parcelId) {
        this.parcelId = parcelId;
        return this;
    }

    /**
     * value of parcelId}
     * @return parcelId
     */

    public String getParcelId() {
        return this.parcelId;
    }

    /**
     * builds OrderRemoveParcelFromDeliveryAction with checking for non-null required values
     * @return OrderRemoveParcelFromDeliveryAction
     */
    public OrderRemoveParcelFromDeliveryAction build() {
        Objects.requireNonNull(parcelId, OrderRemoveParcelFromDeliveryAction.class + ": parcelId is missing");
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    /**
     * builds OrderRemoveParcelFromDeliveryAction without checking for non-null required values
     * @return OrderRemoveParcelFromDeliveryAction
     */
    public OrderRemoveParcelFromDeliveryAction buildUnchecked() {
        return new OrderRemoveParcelFromDeliveryActionImpl(parcelId);
    }

    /**
     * factory method for an instance of OrderRemoveParcelFromDeliveryActionBuilder
     * @return builder
     */
    public static OrderRemoveParcelFromDeliveryActionBuilder of() {
        return new OrderRemoveParcelFromDeliveryActionBuilder();
    }

    /**
     * create builder for OrderRemoveParcelFromDeliveryAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderRemoveParcelFromDeliveryActionBuilder of(final OrderRemoveParcelFromDeliveryAction template) {
        OrderRemoveParcelFromDeliveryActionBuilder builder = new OrderRemoveParcelFromDeliveryActionBuilder();
        builder.parcelId = template.getParcelId();
        return builder;
    }

}
