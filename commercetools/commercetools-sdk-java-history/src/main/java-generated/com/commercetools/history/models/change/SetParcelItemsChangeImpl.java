
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetParcelItemsAction" rel="nofollow">Set Parcel Items</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetParcelItemsAction" rel="nofollow">Set Parcel Items</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetParcelItemsChangeImpl implements SetParcelItemsChange, ModelBase {

    private String type;

    private String change;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue;

    private java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue;

    private com.commercetools.history.models.change_value.ParcelChangeValue parcel;

    private String shippingKey;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetParcelItemsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue,
            @JsonProperty("nextValue") final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue,
            @JsonProperty("parcel") final com.commercetools.history.models.change_value.ParcelChangeValue parcel,
            @JsonProperty("shippingKey") final String shippingKey) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.parcel = parcel;
        this.shippingKey = shippingKey;
        this.type = SET_PARCEL_ITEMS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetParcelItemsChangeImpl() {
        this.type = SET_PARCEL_ITEMS_CHANGE;
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

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public java.util.List<com.commercetools.history.models.common.DeliveryItem> getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Information about the updated Parcel.</p>
     */

    public com.commercetools.history.models.change_value.ParcelChangeValue getParcel() {
        return this.parcel;
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

    public void setPreviousValue(final com.commercetools.history.models.common.DeliveryItem... previousValue) {
        this.previousValue = new ArrayList<>(Arrays.asList(previousValue));
    }

    public void setPreviousValue(
            final java.util.List<com.commercetools.history.models.common.DeliveryItem> previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.DeliveryItem... nextValue) {
        this.nextValue = new ArrayList<>(Arrays.asList(nextValue));
    }

    public void setNextValue(final java.util.List<com.commercetools.history.models.common.DeliveryItem> nextValue) {
        this.nextValue = nextValue;
    }

    public void setParcel(final com.commercetools.history.models.change_value.ParcelChangeValue parcel) {
        this.parcel = parcel;
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

        SetParcelItemsChangeImpl that = (SetParcelItemsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(parcel, that.parcel)
                .append(shippingKey, that.shippingKey)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(parcel)
                .append(shippingKey)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("parcel", parcel)
                .append("shippingKey", shippingKey)
                .build();
    }

    @Override
    public SetParcelItemsChange copyDeep() {
        return SetParcelItemsChange.deepCopy(this);
    }
}
