
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class StagedOrderSetReturnShipmentStateActionImpl implements StagedOrderSetReturnShipmentStateAction {

    private String action;

    private String returnItemId;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    @JsonCreator
    StagedOrderSetReturnShipmentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.returnItemId = returnItemId;
        this.shipmentState = shipmentState;
        this.action = SET_RETURN_SHIPMENT_STATE;
    }

    public StagedOrderSetReturnShipmentStateActionImpl() {
        this.action = SET_RETURN_SHIPMENT_STATE;
    }

    public String getAction() {
        return this.action;
    }

    public String getReturnItemId() {
        return this.returnItemId;
    }

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderSetReturnShipmentStateActionImpl that = (StagedOrderSetReturnShipmentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(shipmentState, that.shipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(returnItemId).append(shipmentState).toHashCode();
    }

}
