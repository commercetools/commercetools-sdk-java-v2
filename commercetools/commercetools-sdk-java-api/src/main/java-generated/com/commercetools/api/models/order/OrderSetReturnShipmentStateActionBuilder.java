
package com.commercetools.api.models.order;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnShipmentStateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnShipmentStateAction orderSetReturnShipmentStateAction = OrderSetReturnShipmentStateAction.builder()
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnShipmentStateActionBuilder implements Builder<OrderSetReturnShipmentStateAction> {

    @Nullable
    private String returnItemId;

    @Nullable
    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder returnItemId(@Nullable final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder returnItemKey(@Nullable final String returnItemKey) {
        this.returnItemKey = returnItemKey;
        return this;
    }

    /**
     *  <p>New shipment state of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @param shipmentState value to be set
     * @return Builder
     */

    public OrderSetReturnShipmentStateActionBuilder shipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        return this;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @Nullable
    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @Nullable
    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>New shipment state of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @return shipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     * builds OrderSetReturnShipmentStateAction with checking for non-null required values
     * @return OrderSetReturnShipmentStateAction
     */
    public OrderSetReturnShipmentStateAction build() {
        Objects.requireNonNull(shipmentState, OrderSetReturnShipmentStateAction.class + ": shipmentState is missing");
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, returnItemKey, shipmentState);
    }

    /**
     * builds OrderSetReturnShipmentStateAction without checking for non-null required values
     * @return OrderSetReturnShipmentStateAction
     */
    public OrderSetReturnShipmentStateAction buildUnchecked() {
        return new OrderSetReturnShipmentStateActionImpl(returnItemId, returnItemKey, shipmentState);
    }

    /**
     * factory method for an instance of OrderSetReturnShipmentStateActionBuilder
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder of() {
        return new OrderSetReturnShipmentStateActionBuilder();
    }

    /**
     * create builder for OrderSetReturnShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionBuilder builder = new OrderSetReturnShipmentStateActionBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnItemKey = template.getReturnItemKey();
        builder.shipmentState = template.getShipmentState();
        return builder;
    }

}
