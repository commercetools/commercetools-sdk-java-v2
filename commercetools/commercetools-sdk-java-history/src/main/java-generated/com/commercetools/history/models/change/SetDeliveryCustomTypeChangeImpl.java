
package com.commercetools.history.models.change;

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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetDeliveryCustomTypeAction" rel="nofollow">Set Delivery Custom Type</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetDeliveryCustomTypeChangeImpl implements SetDeliveryCustomTypeChange, ModelBase {

    private String type;

    private String change;

    private String deliveryId;

    private com.commercetools.history.models.common.CustomFields previousValue;

    private com.commercetools.history.models.common.CustomFields nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetDeliveryCustomTypeChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("deliveryId") final String deliveryId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.CustomFields previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.CustomFields nextValue) {
        this.change = change;
        this.deliveryId = deliveryId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
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
                .append(type, that.type)
                .append(change, that.change)
                .append(deliveryId, that.deliveryId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(deliveryId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("deliveryId", deliveryId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetDeliveryCustomTypeChange copyDeep() {
        return SetDeliveryCustomTypeChange.deepCopy(this);
    }
}
