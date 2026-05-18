
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
 *  <p>Change triggered by the <a href="https://docs.commercetools.com/apis/ctp:api:type:StagedOrderSetLineItemPriceAction" rel="nofollow">Set LineItem Price</a> update action.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemPriceChangeImpl implements SetLineItemPriceChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.Price previousValue;

    private com.commercetools.history.models.common.Price nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String lineItemId;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLineItemPriceChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.Price previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.Price nextValue,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("lineItemId") final String lineItemId) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItem = lineItem;
        this.lineItemId = lineItemId;
        this.type = SET_LINE_ITEM_PRICE_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLineItemPriceChangeImpl() {
        this.type = SET_LINE_ITEM_PRICE_CHANGE;
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

    public com.commercetools.history.models.common.Price getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.Price getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the <a href="https://docs.commercetools.com/apis/ctp:api:type:Product" rel="nofollow">Product</a> the updated Line Item is based on.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:LineItem" rel="nofollow">LineItem</a>.</p>
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(final com.commercetools.history.models.common.Price previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(final com.commercetools.history.models.common.Price nextValue) {
        this.nextValue = nextValue;
    }

    public void setLineItem(final com.commercetools.history.models.common.LocalizedString lineItem) {
        this.lineItem = lineItem;
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

        SetLineItemPriceChangeImpl that = (SetLineItemPriceChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItem, that.lineItem)
                .append(lineItemId, that.lineItemId)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(previousValue)
                .append(nextValue)
                .append(lineItem)
                .append(lineItemId)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .append("lineItem", lineItem)
                .append("lineItemId", lineItemId)
                .build();
    }

    @Override
    public SetLineItemPriceChange copyDeep() {
        return SetLineItemPriceChange.deepCopy(this);
    }
}
