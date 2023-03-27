
package com.commercetools.api.models.order;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderSetReturnShipmentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderSetReturnShipmentStateAction orderSetReturnShipmentStateAction = OrderSetReturnShipmentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnShipmentStateActionImpl.class)
public interface OrderSetReturnShipmentStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnShipmentStateAction
     */
    String SET_RETURN_SHIPMENT_STATE = "setReturnShipmentState";

    /**
     *
     * @return returnItemId
     */
    @NotNull
    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     * set returnItemId
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     * set shipmentState
     * @param shipmentState value to be set
     */

    public void setShipmentState(final ReturnShipmentState shipmentState);

    /**
     * factory method
     * @return instance of OrderSetReturnShipmentStateAction
     */
    public static OrderSetReturnShipmentStateAction of() {
        return new OrderSetReturnShipmentStateActionImpl();
    }

    /**
     * factory method to copy an instance of OrderSetReturnShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnShipmentStateAction of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionImpl instance = new OrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * builder factory method for OrderSetReturnShipmentStateAction
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder builder() {
        return OrderSetReturnShipmentStateActionBuilder.of();
    }

    /**
     * create builder for OrderSetReturnShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderSetReturnShipmentStateActionBuilder builder(final OrderSetReturnShipmentStateAction template) {
        return OrderSetReturnShipmentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withOrderSetReturnShipmentStateAction(Function<OrderSetReturnShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<OrderSetReturnShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<OrderSetReturnShipmentStateAction>";
            }
        };
    }
}
