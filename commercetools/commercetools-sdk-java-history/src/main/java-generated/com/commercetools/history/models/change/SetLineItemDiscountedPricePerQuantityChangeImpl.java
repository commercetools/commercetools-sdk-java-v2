
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
 * SetLineItemDiscountedPricePerQuantityChange
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetLineItemDiscountedPricePerQuantityChangeImpl
        implements SetLineItemDiscountedPricePerQuantityChange, ModelBase {

    private String type;

    private String change;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue;

    private com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue;

    private com.commercetools.history.models.common.LocalizedString lineItem;

    private String variant;

    /**
     * create instance with all properties
     */
    @JsonCreator
    SetLineItemDiscountedPricePerQuantityChangeImpl(@JsonProperty("change") final String change,
            @JsonProperty("previousValue") final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue,
            @JsonProperty("nextValue") final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue,
            @JsonProperty("lineItem") final com.commercetools.history.models.common.LocalizedString lineItem,
            @JsonProperty("variant") final String variant) {
        this.change = change;
        this.previousValue = previousValue;
        this.nextValue = nextValue;
        this.lineItem = lineItem;
        this.variant = variant;
        this.type = SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE;
    }

    /**
     * create empty instance
     */
    public SetLineItemDiscountedPricePerQuantityChangeImpl() {
        this.type = SET_LINE_ITEM_DISCOUNTED_PRICE_PER_QUANTITY_CHANGE;
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

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getPreviousValue() {
        return this.previousValue;
    }

    /**
     *  <p>Value after the change.</p>
     */

    public com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity getNextValue() {
        return this.nextValue;
    }

    /**
     *  <p>Name of the Product the Line Item is based on.</p>
     */

    public com.commercetools.history.models.common.LocalizedString getLineItem() {
        return this.lineItem;
    }

    /**
     *  <p><code>sku</code> or <code>key</code> of the updated ProductVariant.</p>
     */

    public String getVariant() {
        return this.variant;
    }

    public void setChange(final String change) {
        this.change = change;
    }

    public void setPreviousValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity previousValue) {
        this.previousValue = previousValue;
    }

    public void setNextValue(
            final com.commercetools.history.models.common.DiscountedLineItemPriceForQuantity nextValue) {
        this.nextValue = nextValue;
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

        SetLineItemDiscountedPricePerQuantityChangeImpl that = (SetLineItemDiscountedPricePerQuantityChangeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
                .append(lineItem, that.lineItem)
                .append(variant, that.variant)
                .append(type, that.type)
                .append(change, that.change)
                .append(previousValue, that.previousValue)
                .append(nextValue, that.nextValue)
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
                .append("lineItem", lineItem)
                .append("variant", variant)
                .build();
    }

    @Override
    public SetLineItemDiscountedPricePerQuantityChange copyDeep() {
        return SetLineItemDiscountedPricePerQuantityChange.deepCopy(this);
    }
}
