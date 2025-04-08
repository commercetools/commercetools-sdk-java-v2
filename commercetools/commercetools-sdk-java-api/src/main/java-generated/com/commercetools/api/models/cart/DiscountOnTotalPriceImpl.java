
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
 * DiscountOnTotalPrice
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountOnTotalPriceImpl implements DiscountOnTotalPrice, ModelBase {

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    private java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> includedDiscounts;

    private com.commercetools.api.models.common.TypedMoney discountedNetAmount;

    private com.commercetools.api.models.common.TypedMoney discountedGrossAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountOnTotalPriceImpl(
            @JsonProperty("discountedAmount") final com.commercetools.api.models.common.TypedMoney discountedAmount,
            @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> includedDiscounts,
            @JsonProperty("discountedNetAmount") final com.commercetools.api.models.common.TypedMoney discountedNetAmount,
            @JsonProperty("discountedGrossAmount") final com.commercetools.api.models.common.TypedMoney discountedGrossAmount) {
        this.discountedAmount = discountedAmount;
        this.includedDiscounts = includedDiscounts;
        this.discountedNetAmount = discountedNetAmount;
        this.discountedGrossAmount = discountedGrossAmount;
    }

    /**
     * create empty instance
     */
    public DiscountOnTotalPriceImpl() {
    }

    /**
     *  <p>Money value of the discount on the total price of the Cart or Order.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    /**
     *  <p>Discounts that impact the total price of the Cart or Order.</p>
     */

    public java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> getIncludedDiscounts() {
        return this.includedDiscounts;
    }

    /**
     *  <p>Money value of the discount on the total net price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedNetAmount() {
        return this.discountedNetAmount;
    }

    /**
     *  <p>Money value of the discount on the total gross price of the Cart or Order.</p>
     *  <p>The same percentage of discount applies as on the <code>discountedAmount</code>. Present only when <code>taxedPrice</code> of the Cart or Order exists.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedGrossAmount() {
        return this.discountedGrossAmount;
    }

    public void setDiscountedAmount(final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    public void setIncludedDiscounts(
            final com.commercetools.api.models.cart.DiscountedTotalPricePortion... includedDiscounts) {
        this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
    }

    public void setIncludedDiscounts(
            final java.util.List<com.commercetools.api.models.cart.DiscountedTotalPricePortion> includedDiscounts) {
        this.includedDiscounts = includedDiscounts;
    }

    public void setDiscountedNetAmount(final com.commercetools.api.models.common.TypedMoney discountedNetAmount) {
        this.discountedNetAmount = discountedNetAmount;
    }

    public void setDiscountedGrossAmount(final com.commercetools.api.models.common.TypedMoney discountedGrossAmount) {
        this.discountedGrossAmount = discountedGrossAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountOnTotalPriceImpl that = (DiscountOnTotalPriceImpl) o;

        return new EqualsBuilder().append(discountedAmount, that.discountedAmount)
                .append(includedDiscounts, that.includedDiscounts)
                .append(discountedNetAmount, that.discountedNetAmount)
                .append(discountedGrossAmount, that.discountedGrossAmount)
                .append(discountedAmount, that.discountedAmount)
                .append(includedDiscounts, that.includedDiscounts)
                .append(discountedNetAmount, that.discountedNetAmount)
                .append(discountedGrossAmount, that.discountedGrossAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discountedAmount)
                .append(includedDiscounts)
                .append(discountedNetAmount)
                .append(discountedGrossAmount)
                .toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("discountedAmount", discountedAmount)
                .append("includedDiscounts", includedDiscounts)
                .append("discountedNetAmount", discountedNetAmount)
                .append("discountedGrossAmount", discountedGrossAmount)
                .build();
    }

}
