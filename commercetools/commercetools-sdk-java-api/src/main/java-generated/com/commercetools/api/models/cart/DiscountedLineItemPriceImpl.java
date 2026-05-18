
package com.commercetools.api.models.cart;

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
 * DiscountedLineItemPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedLineItemPriceImpl implements DiscountedLineItemPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney value;

    private java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPriceImpl(@JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value,
            @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.value = value;
        this.includedDiscounts = includedDiscounts;
    }

    /**
     * create empty instance
     */
    public DiscountedLineItemPriceImpl() {
    }

    /**
     *  <p>Money value of the discounted Line Item or Custom Line Item.</p>
     *  <p>When multiple discounts from <code>includedDiscounts</code> apply, they are applied sequentially based on the <code>sortOrder</code> of their associated <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discounts</a> (discounts with higher <code>sortOrder</code> values are applied first). The Cart's <code>priceRoundingMode</code> field (<a href="https://docs.commercetools.com/apis/ctp:api:type:RoundingMode" rel="nofollow">RoundingMode</a>) is applied after each discount calculation, so rounding occurs after each discount step rather than only once on the final cumulative amount.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getValue() {
        return this.value;
    }

    /**
     *  <p>Discount applicable on the Line Item or Custom Line Item.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    public void setValue(final com.commercetools.api.models.common.TypedMoney value) {
        this.value = value;
    }

    public void setIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedLineItemPortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
    }

    public void setIncludedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedLineItemPortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedLineItemPriceImpl that = (DiscountedLineItemPriceImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(includedDiscounts, that.includedDiscounts)
                .append(value, that.value)
                .append(includedDiscounts, that.includedDiscounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(includedDiscounts).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("includedDiscounts", includedDiscounts)
                .build();
    }

    @Override
    public DiscountedLineItemPrice copyDeep() {
        return DiscountedLineItemPrice.deepCopy(this);
    }
}
