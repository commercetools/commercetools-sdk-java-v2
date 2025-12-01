
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
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:OrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a> on Orders.</li>
 *   <li><a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemShippingDetailsAction" rel="nofollow">Set LineItem ShippingDetails</a> on Staged Orders.</li>
 *  </ul>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemShippingDetailsChangeImpl implements SetLineItemShippingDetailsChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.ItemShippingDetails previousValue;

    private com.commercetools.history.models.common.ItemShippingDetails nextValue;

    private String lineItemId;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLineItemShippingDetailsChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.ItemShippingDetails previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.ItemShippingDetails nextValue,
            @JsonProperty("lineItemId") final String lineItemId,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("variant") final String variant) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItemId = lineItemId;
        this.lineItem = lineItem;
        this.variant = variant;
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
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p>Identifier of the updated Product Variant.</p>
     *  <p>This field holds the SKU, if defined; otherwise the key; otherwise the ID.</p>
     */

    public String getVariant() {
        return this.variant;
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

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
    }

    public void setVariant(final String variant) {
        this.variant = variant;
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
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItemId, that.lineItemId)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(lineItemId)
                .append(lineItem)
                .append(variant)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("lineItemId", lineItemId)
                .append("lineItem", lineItem)
                .append("variant", variant)
                .build();
    }

    @Override
    public SetLineItemShippingDetailsChange copyDeep() {
        return SetLineItemShippingDetailsChange.deepCopy(this);
    }
}
