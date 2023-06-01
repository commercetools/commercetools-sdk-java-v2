package com.commercetools.api.models.message;

import com.commercetools.api.models.message.OrderMessagePayload;
import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.message.OrderShipmentStateChangedMessagePayloadImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.io.IOException;

/**
 *  <p>Generated after a successful Change Shipment State update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderShipmentStateChangedMessagePayload orderShipmentStateChangedMessagePayload = OrderShipmentStateChangedMessagePayload.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .oldShipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div> 
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
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
    @NotNull
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
    public static OrderShipmentStateChangedMessagePayload of(){
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

    /**
     * factory method to create a deep copy of OrderShipmentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderShipmentStateChangedMessagePayload deepCopy(@Nullable final OrderShipmentStateChangedMessagePayload template) {
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
    public static OrderShipmentStateChangedMessagePayloadBuilder builder(final OrderShipmentStateChangedMessagePayload template) {
        return OrderShipmentStateChangedMessagePayloadBuilder.of(template);
    }


    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderShipmentStateChangedMessagePayload(Function<OrderShipmentStateChangedMessagePayload, T> helper) {
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
