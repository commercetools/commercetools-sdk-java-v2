
package com.commercetools.history.models.change;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderRemoveParcelFromDeliveryAction" rel="nofollow">Remove Parcel From Delivery</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderRemoveParcelFromDeliveryAction" rel="nofollow">Remove Parcel From Delivery</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveParcelFromDeliveryChangeImpl implements RemoveParcelFromDeliveryChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Parcel previousValue;

    private String deliveryId;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    RemoveParcelFromDeliveryChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Parcel previousValue,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.change = change;
        this.previousValue = previousValue;
        this.deliveryId = deliveryId;
        this.shippingKey = shippingKey;
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
    }

    /**
     * create empty instance
     */
    public RemoveParcelFromDeliveryChangeImpl() {
        this.type = REMOVE_PARCEL_FROM_DELIVERY_CHANGE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *
     */

    public String getChange() {
        return this.change;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.Parcel getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p><code>id</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a> from which the Parcel was removed.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p><code>key</code> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMethod" rel="nofollow">ShippingMethod</a> associated with the Delivery. Only present when the Order uses the <code>Multiple</code> <a href="https://docs.commercetools.com/apis/ctp:api:type:ShippingMode" rel="nofollow">ShippingMode</a>.</p>
     */

    public String getShippingKey() {
        return this.shippingKey;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Parcel previousValue) {
        this.previousValue = previousValue;
    }

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setShippingKey(final String shippingKey) {
        this.shippingKey = shippingKey;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        RemoveParcelFromDeliveryChangeImpl that = (RemoveParcelFromDeliveryChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(deliveryId, that.deliveryId)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(deliveryId, that.deliveryId)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(deliveryId)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("deliveryId", deliveryId)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public RemoveParcelFromDeliveryChange copyDeep() {
        return RemoveParcelFromDeliveryChange.deepCopy(this);
    }
}
