
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>To set a <code>ReturnShipmentState</code>, the Order <code>returnInfo</code> must have at least one ReturnItem.</p>
 *  <p>Produces the Order Return Shipment State Changed Message.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = StagedOrderSetReturnShipmentStateAction.builder()
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnShipmentStateActionImpl.class)
public interface StagedOrderSetReturnShipmentStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderSetReturnShipmentStateAction
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
     * @return instance of StagedOrderSetReturnShipmentStateAction
     */
    public static StagedOrderSetReturnShipmentStateAction of() {
        return new StagedOrderSetReturnShipmentStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderSetReturnShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderSetReturnShipmentStateAction of(final StagedOrderSetReturnShipmentStateAction template) {
        StagedOrderSetReturnShipmentStateActionImpl instance = new StagedOrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderSetReturnShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderSetReturnShipmentStateAction deepCopy(
            @Nullable final StagedOrderSetReturnShipmentStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderSetReturnShipmentStateActionImpl instance = new StagedOrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setReturnItemKey(template.getReturnItemKey());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * builder factory method for StagedOrderSetReturnShipmentStateAction
     * @return builder
     */
    public static StagedOrderSetReturnShipmentStateActionBuilder builder() {
        return StagedOrderSetReturnShipmentStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderSetReturnShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderSetReturnShipmentStateActionBuilder builder(
            final StagedOrderSetReturnShipmentStateAction template) {
        return StagedOrderSetReturnShipmentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderSetReturnShipmentStateAction(
            Function<StagedOrderSetReturnShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnShipmentStateAction>";
            }
        };
    }
}
