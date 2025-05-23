
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Change ShipmentState update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = OrderShipmentStateChangedMessagePayload.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("OrderShipmentStateChanged")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderShipmentStateChangedMessagePayloadImpl.class)
public interface OrderShipmentStateChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderShipmentStateChangedMessagePayload
     */
    String ORDER_SHIPMENT_STATE_CHANGED = "OrderShipmentStateChanged";

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @return oldShipmentState
     */

    @JsonProperty("oldShipmentState")
    public ShipmentState getOldShipmentState();

    /**
     *  <p>ShipmentState after the Change Shipment State update action.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     *  <p>ShipmentState before the Change Shipment State update action.</p>
     * @param oldShipmentState value to be set
     */

    public void setOldShipmentState(final ShipmentState oldShipmentState);

    /**
     * factory method
     * @return instance of OrderShipmentStateChangedMessagePayload
     */
    public static OrderShipmentStateChangedMessagePayload of() {
        return new OrderShipmentStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderShipmentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderShipmentStateChangedMessagePayload of(final OrderShipmentStateChangedMessagePayload template) {
        OrderShipmentStateChangedMessagePayloadImpl instance = new OrderShipmentStateChangedMessagePayloadImpl();
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    public OrderShipmentStateChangedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of OrderShipmentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShipmentStateChangedMessagePayload deepCopy(
            @Nullable final OrderShipmentStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderShipmentStateChangedMessagePayloadImpl instance = new OrderShipmentStateChangedMessagePayloadImpl();
        instance.setShipmentState(template.getShipmentState());
        instance.setOldShipmentState(template.getOldShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderShipmentStateChangedMessagePayload
     * @return builder
     */
    public static OrderShipmentStateChangedMessagePayloadBuilder builder() {
        return OrderShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderShipmentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderShipmentStateChangedMessagePayloadBuilder builder(
            final OrderShipmentStateChangedMessagePayload template) {
        return OrderShipmentStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShipmentStateChangedMessagePayload(
            Function<OrderShipmentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderShipmentStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderShipmentStateChangedMessagePayload>";
            }
        };
    }
}
