
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
 *  <p>Change triggered by the following update actions:</p>
 *  <ul>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetCustomLineItemShippingDetailsAction" rel="nofollow">Set CustomLineItem ShippingDetails</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemShippingDetailsChangeImpl implements SetCustomLineItemShippingDetailsChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private String customLineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomLineItemShippingDetailsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ItemShippingDetails previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ItemShippingDetails nextValue,
            @JsonProperty("customLineItemId") final String customLineItemId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.customLineItemId = customLineItemId;
        this.type = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomLineItemShippingDetailsChangeImpl() {
        this.type = SET_CUSTOM_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
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

    public com.commercetools.history.models.common.ItemShippingDetails getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.ItemShippingDetails getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.ItemShippingDetails previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.ItemShippingDetails nextValue) {
        this.nextValue = nextValue;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomLineItemShippingDetailsChangeImpl that = (SetCustomLineItemShippingDetailsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(customLineItemId, that.customLineItemId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(customLineItemId, that.customLineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(customLineItemId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("customLineItemId", customLineItemId)
                .build();
    }

    @Override
    public SetCustomLineItemShippingDetailsChange copyDeep() {
        return SetCustomLineItemShippingDetailsChange.deepCopy(this);
    }
}
