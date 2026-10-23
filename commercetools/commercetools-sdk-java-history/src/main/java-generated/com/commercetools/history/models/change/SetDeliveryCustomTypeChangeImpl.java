
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomTypeAction" rel="nofollow">Set Delivery Custom Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryCustomTypeChangeImpl implements SetDeliveryCustomTypeChange, ModelBase {

    private String type;

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDeliveryCustomTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.shippingKey = shippingKey;
        this.type = SET_DELIVERY_CUSTOM_TYPE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetDeliveryCustomTypeChangeImpl() {
        this.type = SET_DELIVERY_CUSTOM_TYPE_CHANGE;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:Delivery" rel="nofollow">Delivery</a>.</p>
     */

    public String getDeliveryId() {
        return this.deliveryId;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.CustomFields getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.CustomFields getNextValue() {
        return this.nextValue;
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

    public void setDeliveryId(final String deliveryId) {
        this.deliveryId = deliveryId;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.CustomFields previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.CustomFields nextValue) {
        this.nextValue = nextValue;
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

        SetDeliveryCustomTypeChangeImpl that = (SetDeliveryCustomTypeChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(deliveryId)
                .append(previousValue)
                .append(nextValue)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("deliveryId", deliveryId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public SetDeliveryCustomTypeChange copyDeep() {
        return SetDeliveryCustomTypeChange.deepCopy(this);
    }
}
