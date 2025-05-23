
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 *  <p>Produces the Order Shipment State Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderChangeShipmentStateAction orderChangeShipmentStateAction = OrderChangeShipmentStateAction.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("changeShipmentState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderChangeShipmentStateActionImpl.class)
public interface OrderChangeShipmentStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderChangeShipmentStateAction
     */
    String CHANGE_SHIPMENT_STATE = "changeShipmentState";

    /**
     *  <p>New shipment status of the Order.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ShipmentState getShipmentState();

    /**
     *  <p>New shipment status of the Order.</p>
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ShipmentState shipmentState);

    /**
     * factory method
     * @return instance of OrderChangeShipmentStateAction
     */
    public static OrderChangeShipmentStateAction of() {
        return new OrderChangeShipmentStateActionImpl();
    }

    /**
     * factory method to create a shallow copy OrderChangeShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderChangeShipmentStateAction of(final OrderChangeShipmentStateAction template) {
        OrderChangeShipmentStateActionImpl instance = new OrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public OrderChangeShipmentStateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderChangeShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderChangeShipmentStateAction deepCopy(@Nullable final OrderChangeShipmentStateAction template) {
        if (template == null) {
            return null;
        }
        OrderChangeShipmentStateActionImpl instance = new OrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderChangeShipmentStateAction
     * @return builder
     */
    public static OrderChangeShipmentStateActionBuilder builder() {
        return OrderChangeShipmentStateActionBuilder.of();
    }

    /**
     * create builder for OrderChangeShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderChangeShipmentStateActionBuilder builder(final OrderChangeShipmentStateAction template) {
        return OrderChangeShipmentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderChangeShipmentStateAction(Function<OrderChangeShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderChangeShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderChangeShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderChangeShipmentStateAction>";
            }
        };
    }
}
