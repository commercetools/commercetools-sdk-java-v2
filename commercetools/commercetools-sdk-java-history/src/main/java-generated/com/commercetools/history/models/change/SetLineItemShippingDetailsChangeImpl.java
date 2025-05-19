
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
 *   <li>Set LineItem ShippingDetails on Orders.</li>
 *   <li>Set LineItem ShippingDetails on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemShippingDetailsChangeImpl implements SetLineItemShippingDetailsChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private String lineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLineItemShippingDetailsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ItemShippingDetails previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ItemShippingDetails nextValue,
            @JsonProperty("lineItemId") final String lineItemId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItemId = lineItemId;
        this.type = SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLineItemShippingDetailsChangeImpl() {
        this.type = SET_LINE_ITEM_SHIPPING_DETAILS_CHANGE;
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
     *  <p><code>id</code> of the updated LineItem.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
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

    public void setLineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetLineItemShippingDetailsChangeImpl that = (SetLineItemShippingDetailsChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItemId, that.lineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(lineItemId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("lineItemId", lineItemId)
                .build();
    }

    @Override
    public SetLineItemShippingDetailsChange copyDeep() {
        return SetLineItemShippingDetailsChange.deepCopy(this);
    }
}
