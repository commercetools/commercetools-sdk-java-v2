
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
 *  <p>Change triggered after a recalculation of discount on a <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">Custom Line Item</a>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetCustomLineItemDiscountedPricePerQuantityChangeImpl
        implements SetCustomLineItemDiscountedPricePerQuantityChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.LocalizedString customLineItem;

    private String customLineItemId;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetCustomLineItemDiscountedPricePerQuantityChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("customLineItem") final com.commercetools.history.models.common.LocalizedString customLineItem,
            @JsonProperty("customLineItemId") final String customLineItemId,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.change = change;
        this.customLineItem = customLineItem;
        this.customLineItemId = customLineItemId;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.type = SET_CUSTOM_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetCustomLineItemDiscountedPricePerQuantityChangeImpl() {
        this.type = SET_CUSTOM_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE;
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
     *  <p>Name of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getCustomLineItem() {
        return this.customLineItem;
    }

    /**
     *  <p><code>id</code> of the updated <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItem</a>.</p>
     */

    public String getCustomLineItemId() {
        return this.customLineItemId;
    }

    /**
     *  <p>Value before the change.</p>
     */

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue() {
        return this.nextValue;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setCustomLineItem(final com.commercetools.history.models.common.LocalizedString customLineItem) {
        this.customLineItem = customLineItem;
    }

    public void setCustomLineItemId(final String customLineItemId) {
        this.customLineItemId = customLineItemId;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.nextValue = nextValue;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        SetCustomLineItemDiscountedPricePerQuantityChangeImpl that = (SetCustomLineItemDiscountedPricePerQuantityChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(type, that.type)
                .append(change, that.change)
                .append(customLineItem, that.customLineItem)
                .append(customLineItemId, that.customLineItemId)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type)
                .append(change)
                .append(customLineItem)
                .append(customLineItemId)
                .append(previousValue)
                .append(nextValue)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("change", change)
                .append("customLineItem", customLineItem)
                .append("customLineItemId", customLineItemId)
                .append("previousValue", previousValue)
                .append("nextValue", nextValue)
                .build();
    }

    @Override
    public SetCustomLineItemDiscountedPricePerQuantityChange copyDeep() {
        return SetCustomLineItemDiscountedPricePerQuantityChange.deepCopy(this);
    }
}
