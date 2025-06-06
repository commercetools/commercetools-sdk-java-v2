
package com.commercetools.api.models.order;

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
 *  <p>To set a <code>ReturnShipmentState</code>, the Order <code>returnInfo</code> must have at least one ReturnItem.</p>
 *  <p>Produces the Order Return Shipment State Changed Message.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderSetReturnShipmentStateActionImpl implements OrderSetReturnShipmentStateAction, ModelBase {

    private String action;

    private String returnItemId;

    private String returnItemKey;

    private com.commercetools.api.models.order.ReturnShipmentState shipmentState;

    /**
     * create instance with all properties
     */
    @JsonCreator
    OrderSetReturnShipmentStateActionImpl(@JsonProperty("returnItemId") final String returnItemId,
            @JsonProperty("returnItemKey") final String returnItemKey,
            @JsonProperty("shipmentState") final com.commercetools.api.models.order.ReturnShipmentState shipmentState) {
        this.returnItemId = returnItemId;
        this.returnItemKey = returnItemKey;
        this.shipmentState = shipmentState;
        this.action = SET_RETURN_SHIPMENT_STATE;
    }

    /**
     * create empty instance
     */
    public OrderSetReturnShipmentStateActionImpl() {
        this.action = SET_RETURN_SHIPMENT_STATE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>id</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemId() {
        return this.returnItemId;
    }

    /**
     *  <p><code>key</code> of the ReturnItem to update. Either <code>returnItemId</code> or <code>returnItemKey</code> is required.</p>
     */

    public String getReturnItemKey() {
        return this.returnItemKey;
    }

    /**
     *  <p>New shipment state of the ReturnItem.</p>
     */

    public com.commercetools.api.models.order.ReturnShipmentState getShipmentState() {
        return this.shipmentState;
    }

    public void setReturnItemId(final String returnItemId) {
        this.returnItemId = returnItemId;
    }

    public void setReturnItemKey(final String returnItemKey) {
        this.returnItemKey = returnItemKey;
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

        OrderSetReturnShipmentStateActionImpl that = (OrderSetReturnShipmentStateActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(shipmentState, that.shipmentState)
                .append(action, that.action)
                .append(returnItemId, that.returnItemId)
                .append(returnItemKey, that.returnItemKey)
                .append(shipmentState, that.shipmentState)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action)
                .append(returnItemId)
                .append(returnItemKey)
                .append(shipmentState)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("returnItemId", returnItemId)
                .append("returnItemKey", returnItemKey)
                .append("shipmentState", shipmentState)
                .build();
    }

    @Override
    public OrderSetReturnShipmentStateAction copyDeep() {
        return OrderSetReturnShipmentStateAction.deepCopy(this);
    }
}
