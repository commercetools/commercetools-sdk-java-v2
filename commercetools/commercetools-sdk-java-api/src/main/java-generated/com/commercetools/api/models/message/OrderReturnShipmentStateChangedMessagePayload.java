
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Set ReturnShipmentState update action.</p>
 *
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
@JsonDeserialize(as = OrderReturnShipmentStateChangedMessagePayloadImpl.class)
public interface OrderReturnShipmentStateChangedMessagePayload extends OrderMessagePayload {

    /**
     * discriminator value for OrderReturnShipmentStateChangedMessagePayload
     */
    String ORDER_RETURN_SHIPMENT_STATE_CHANGED = "OrderReturnShipmentStateChanged";

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     * @return returnShipmentState
     */
    @NotNull
    @JsonProperty("returnShipmentState")
    public ReturnShipmentState getReturnShipmentState();

    /**
     *  <p>Unique identifier of the ReturnItem.</p>
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p>State of the ReturnItem after the Set Return Shipment State update action.</p>
     * @param returnShipmentState value to be set
     */

    public void setReturnShipmentState(final ReturnShipmentState returnShipmentState);

    /**
     * factory method
     * @return instance of OrderReturnShipmentStateChangedMessagePayload
     */
    public static OrderReturnShipmentStateChangedMessagePayload of() {
        return new OrderReturnShipmentStateChangedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy OrderReturnShipmentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderReturnShipmentStateChangedMessagePayload of(
            final OrderReturnShipmentStateChangedMessagePayload template) {
        OrderReturnShipmentStateChangedMessagePayloadImpl instance = new OrderReturnShipmentStateChangedMessagePayloadImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of OrderReturnShipmentStateChangedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderReturnShipmentStateChangedMessagePayload deepCopy(
            @Nullable final OrderReturnShipmentStateChangedMessagePayload template) {
        if (template == null) {
            return null;
        }
        OrderReturnShipmentStateChangedMessagePayloadImpl instance = new OrderReturnShipmentStateChangedMessagePayloadImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnShipmentState(template.getReturnShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderReturnShipmentStateChangedMessagePayload
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessagePayloadBuilder builder() {
        return OrderReturnShipmentStateChangedMessagePayloadBuilder.of();
    }

    /**
     * create builder for OrderReturnShipmentStateChangedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderReturnShipmentStateChangedMessagePayloadBuilder builder(
            final OrderReturnShipmentStateChangedMessagePayload template) {
        return OrderReturnShipmentStateChangedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderReturnShipmentStateChangedMessagePayload(
            Function<OrderReturnShipmentStateChangedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderReturnShipmentStateChangedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<OrderReturnShipmentStateChangedMessagePayload>";
            }
        };
    }
}
