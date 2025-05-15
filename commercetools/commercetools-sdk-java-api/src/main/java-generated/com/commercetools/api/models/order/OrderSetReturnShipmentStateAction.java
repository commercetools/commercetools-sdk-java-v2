
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
 *  <p>To set a <code>ReturnShipmentState</code>, the Order <code>returnInfo</code> must have at least one ReturnItem.</p>
 *  <p>Produces the Order Return Shipment State Changed Message.</p>
 *
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
@io.vrap.rmf.base.client.utils.json.SubType("setReturnShipmentState")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = OrderSetReturnShipmentStateActionImpl.class)
public interface OrderSetReturnShipmentStateAction extends OrderUpdateAction {

    /**
     * discriminator value for OrderSetReturnShipmentStateAction
     */
    String SET_RETURN_SHIPMENT_STATE = "setReturnShipmentState";

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemId
     */

    @JsonProperty("returnItemId")
    public String getReturnItemId();

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @return returnItemKey
     */

    @JsonProperty("returnItemKey")
    public String getReturnItemKey();

    /**
     *  <p>New shipment state of the ReturnItem.</p>
     * @return shipmentState
     */
    @NotNull
    @JsonProperty("shipmentState")
    public ReturnShipmentState getShipmentState();

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemId value to be set
     */

    public void setReturnItemId(final String returnItemId);

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     * @param returnItemKey value to be set
     */

    public void setReturnItemKey(final String returnItemKey);

    /**
     *  <p>New shipment state of the ReturnItem.</p>
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
     * factory method to create a shallow copy OrderSetReturnShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static OrderSetReturnShipmentStateAction of(final OrderSetReturnShipmentStateAction template) {
        OrderSetReturnShipmentStateActionImpl instance = new OrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public OrderSetReturnShipmentStateAction copyDeep();

    /**
     * factory method to create a deep copy of OrderSetReturnShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static OrderSetReturnShipmentStateAction deepCopy(
            @Nullable final OrderSetReturnShipmentStateAction template) {
        if (template == null) {
            return null;
        }
        OrderSetReturnShipmentStateActionImpl instance = new OrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
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
