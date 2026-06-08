
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeShipmentStateAction" rel="nofollow">Change ShipmentState</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderShipmentStateChangedMessagePayloadImpl implements OrderShipmentStateChangedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.order.ShipmentState shipmentState;

    private com.commercetools.api.models.order.ShipmentState oldShipmentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderShipmentStateChangedMessagePayloadImpl(
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ShipmentState shipmentState,
            @JsonProperty("oldShipmentState") final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.shipmentState = shipmentState;
        this.oldShipmentState = oldShipmentState;
        this.type = ORDER_SHIPMENT_STATE_CHANGED;
    }

    /**
     * create empty instance
     */
    public OrderShipmentStateChangedMessagePayloadImpl() {
        this.type = ORDER_SHIPMENT_STATE_CHANGED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShipmentState" rel="nofollow">ShipmentState</a> after the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeShipmentStateAction" rel="nofollow">Change Shipment State</a> update action.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getShipmentState() {
        return this.shipmentState;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:ShipmentState" rel="nofollow">ShipmentState</a> before the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderChangeShipmentStateAction" rel="nofollow">Change Shipment State</a> update action.</p>
     */

    public com.commercetools.api.models.order.ShipmentState getOldShipmentState() {
        return this.oldShipmentState;
    }

    public void setShipmentState(final com.commercetools.api.models.order.ShipmentState shipmentState) {
        this.shipmentState = shipmentState;
    }

    public void setOldShipmentState(final com.commercetools.api.models.order.ShipmentState oldShipmentState) {
        this.oldShipmentState = oldShipmentState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        OrderShipmentStateChangedMessagePayloadImpl that = (OrderShipmentStateChangedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(shipmentState, that.shipmentState)
                .append(oldShipmentState, that.oldShipmentState)
                .append(type, that.type)
                .append(shipmentState, that.shipmentState)
                .append(oldShipmentState, that.oldShipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(shipmentState).append(oldShipmentState).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("shipmentState", shipmentState)
                .append("oldShipmentState", oldShipmentState)
                .build();
    }

    @Override
    public OrderShipmentStateChangedMessagePayload copyDeep() {
        return OrderShipmentStateChangedMessagePayload.deepCopy(this);
    }
}
