
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
 * DiscountedTotalPricePortion
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountedTotalPricePortionImpl implements DiscountedTotalPricePortion, ModelBase {

    private com.commercetools.api.models.cart_discount.CartDiscountReference discount;

    private com.commercetools.api.models.common.TypedMoney discountedAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedTotalPricePortionImpl(
            @JsonProperty("discount") final com.commercetools.api.models.cart_discount.CartDiscountReference discount,
            @JsonProperty("discountedAmount") final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }

    /**
     * create empty instance
     */
    public DiscountedTotalPricePortionImpl() {
    }

    /**
     *  <p>Cart Discount related to the discounted price.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountReference getDiscount() {
        return this.discount;
    }

    /**
     *  <p>Money value of the discount.</p>
     */

    public com.commercetools.api.models.common.TypedMoney getDiscountedAmount() {
        return this.discountedAmount;
    }

    public void setDiscount(final com.commercetools.api.models.cart_discount.CartDiscountReference discount) {
        this.discount = discount;
    }

    public void setDiscountedAmount(final com.commercetools.api.models.common.TypedMoney discountedAmount) {
        this.discountedAmount = discountedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountedTotalPricePortionImpl that = (DiscountedTotalPricePortionImpl) o;

        return new EqualsBuilder().append(discount, that.discount)
                .append(discountedAmount, that.discountedAmount)
                .append(discount, that.discount)
                .append(discountedAmount, that.discountedAmount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(discount).append(discountedAmount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("discount", discount)
                .append("discountedAmount", discountedAmount)
                .build();
    }

}
