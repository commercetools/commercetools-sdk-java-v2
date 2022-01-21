
package com.commercetools.api.models.order_edit;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class StagedOrderChangeShipmentStateActionImpl implements StagedOrderChangeShipmentStateAction, ModelBase {

    private String action;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    @JsonCreator
    StagedOrderChangeShipmentStateActionImpl(
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
        this.action = CHANGE_SHIPMENT_STATE;
    }

    public StagedOrderChangeShipmentStateActionImpl() {
        this.action = CHANGE_SHIPMENT_STATE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        StagedOrderChangeShipmentStateActionImpl that = (StagedOrderChangeShipmentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(shipmentState, that.shipmentState).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(shipmentState).toHashCode();
    }

}
