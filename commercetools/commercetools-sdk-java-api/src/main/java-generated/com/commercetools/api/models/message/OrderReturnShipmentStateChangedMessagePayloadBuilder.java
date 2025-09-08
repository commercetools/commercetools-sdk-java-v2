
package com.commercetools.api.models.message;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderReturnShipmentStateChangedMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderReturnShipmentStateChangedMessagePayload orderReturnShipmentStateChangedMessagePayload = OrderReturnShipmentStateChangedMessagePayload.builder()
 *             .returnItemId("{returnItemId}")
 *             .returnShipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderReturnShipmentStateChangedMessagePayloadBuilder
        implements Builder<OrderReturnShipmentStateChangedMessagePayload> {

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState returnShipmentState;

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @param returnItemId value to be set
     * @return Builder
     */

    public OrderReturnShipmentStateChangedMessagePayloadBuilder returnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
        return this;
    }

    /**
     *  <p>State of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetReturnShipmentStateAction" rel="nofollow">Set Return Shipment State</a> update action.</p>
     * @param returnShipmentState value to be set
     * @return Builder
     */

    public OrderReturnShipmentStateChangedMessagePayloadBuilder returnShipmentState(
            final com.commercetools.api.models.order.ReturnShipmentState returnShipmentState) {
        this.returnShipmentState = returnShipmentState;
        return this;
    }

    /**
     *  <p>Unique identifier of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a>.</p>
     * @return returnItemId
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p>State of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ReturnItem" rel="nofollow">ReturnItem</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetReturnShipmentStateAction" rel="nofollow">Set Return Shipment State</a> update action.</p>
     * @return returnShipmentState
     */

    public com.commercetools.api.models.order.ReturnShipmentState getReturnShipmentState() {
        return this.returnShipmentState;
    }

    /**
     * builds OrderReturnShipmentStateChangedMessagePayload with checking for non-null required values
     * @return OrderReturnShipmentStateChangedMessagePayload
     */
    public OrderReturnShipmentStateChangedMessagePayload build() {
        Objects.requireNonNull(returnItemId,
            OrderReturnShipmentStateChangedMessagePayload.class + ": returnItemId is missing");
        Objects.requireNonNull(returnShipmentState,
            OrderReturnShipmentStateChangedMessagePayload.class + ": returnShipmentState is missing");
        return new OrderReturnShipmentStateChangedMessagePayloadImpl(returnItemId, returnShipmentState);
    }

    /**
     * builds OrderReturnShipmentStateChangedMessagePayload without checking for non-null required values
     * @return OrderReturnShipmentStateChangedMessagePayload
     */
    public OrderReturnShipmentStateChangedMessagePayload buildUnchecked() {
        return new OrderReturnShipmentStateChangedMessagePayloadImpl(returnItemId, returnShipmentState);
    }

    /**
     * factory method for an instance of OrderReturnShipmentStateChangedMessagePayloadBuilder
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessagePayloadBuilder of() {
        return new OrderReturnShipmentStateChangedMessagePayloadBuilder();
    }

    /**
     * create builder for OrderReturnShipmentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessagePayloadBuilder of(
            final OrderReturnShipmentStateChangedMessagePayload template) {
        OrderReturnShipmentStateChangedMessagePayloadBuilder builder = new OrderReturnShipmentStateChangedMessagePayloadBuilder();
        builder.returnItemId = template.getReturnItemId();
        builder.returnShipmentState = template.getReturnShipmentState();
        return builder;
    }

}
