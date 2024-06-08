
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.order.ShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
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
 *     StagedOrderChangeShipmentStateAction stagedOrderChangeShipmentStateAction = StagedOrderChangeShipmentStateAction.builder()
 *             .shipmentState(ShipmentState.SHIPPED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderChangeShipmentStateActionImpl.class)
public interface StagedOrderChangeShipmentStateAction extends StagedOrderUpdateAction {

    /**
     * discriminator value for StagedOrderChangeShipmentStateAction
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
     * @return instance of StagedOrderChangeShipmentStateAction
     */
    public static StagedOrderChangeShipmentStateAction of() {
        return new StagedOrderChangeShipmentStateActionImpl();
    }

    /**
     * factory method to create a shallow copy StagedOrderChangeShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static StagedOrderChangeShipmentStateAction of(final StagedOrderChangeShipmentStateAction template) {
        StagedOrderChangeShipmentStateActionImpl instance = new StagedOrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * factory method to create a deep copy of StagedOrderChangeShipmentStateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static StagedOrderChangeShipmentStateAction deepCopy(
            @Nullable final StagedOrderChangeShipmentStateAction template) {
        if (template == null) {
            return null;
        }
        StagedOrderChangeShipmentStateActionImpl instance = new StagedOrderChangeShipmentStateActionImpl();
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    /**
     * builder factory method for StagedOrderChangeShipmentStateAction
     * @return builder
     */
    public static StagedOrderChangeShipmentStateActionBuilder builder() {
        return StagedOrderChangeShipmentStateActionBuilder.of();
    }

    /**
     * create builder for StagedOrderChangeShipmentStateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderChangeShipmentStateActionBuilder builder(
            final StagedOrderChangeShipmentStateAction template) {
        return StagedOrderChangeShipmentStateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withStagedOrderChangeShipmentStateAction(Function<StagedOrderChangeShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderChangeShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderChangeShipmentStateAction>";
            }
        };
    }
}
