
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.constraints.NotNull;

import com.commercetools.api.models.order.ReturnShipmentState;
import com.commercetools.api.models.order.StagedOrderUpdateAction;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderSetReturnShipmentStateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderSetReturnShipmentStateAction stagedOrderSetReturnShipmentStateAction = StagedOrderSetReturnShipmentStateAction.builder()
 *             .returnItemId("{returnItemId}")
 *             .shipmentState(ReturnShipmentState.ADVISED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = StagedOrderSetReturnShipmentStateActionImpl.class)
public interface StagedOrderSetReturnShipmentStateAction extends StagedOrderUpdateAction {

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

    public void setReturnItemId(final String returnItemId);

    public void setShipmentState(final ReturnShipmentState shipmentState);

    public static StagedOrderSetReturnShipmentStateAction of() {
        return new StagedOrderSetReturnShipmentStateActionImpl();
    }

    public static StagedOrderSetReturnShipmentStateAction of(final StagedOrderSetReturnShipmentStateAction template) {
        StagedOrderSetReturnShipmentStateActionImpl instance = new StagedOrderSetReturnShipmentStateActionImpl();
        instance.setReturnItemId(template.getReturnItemId());
        instance.setShipmentState(template.getShipmentState());
        return instance;
    }

    public static StagedOrderSetReturnShipmentStateActionBuilder builder() {
        return StagedOrderSetReturnShipmentStateActionBuilder.of();
    }

    public static StagedOrderSetReturnShipmentStateActionBuilder builder(
            final StagedOrderSetReturnShipmentStateAction template) {
        return StagedOrderSetReturnShipmentStateActionBuilder.of(template);
    }

    default <T> T withStagedOrderSetReturnShipmentStateAction(
            Function<StagedOrderSetReturnShipmentStateAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnShipmentStateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<StagedOrderSetReturnShipmentStateAction>() {
            @Override
            public String toString() {
                return "TypeReference<StagedOrderSetReturnShipmentStateAction>";
            }
        };
    }
}
