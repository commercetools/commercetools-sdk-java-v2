
package com.commercetools.api.models.cart_discount;

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
 *  <p>Sets the DiscountedLineItemPrice of the CartDiscountLineItemsTarget or CartDiscountCustomLineItemsTarget to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied. If the <code>quantity</code> of the Line Item eligible for the Discount is greater than <code>1</code>, the fixed price discount is only applied to the Line Item portion for which the <code>money</code> value is lesser than their current price.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedImpl implements CartDiscountValueFixed, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.TypedMoney> money;

    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueFixedImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.TypedMoney> money,
            @JsonProperty("applicationMode") final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.money = money;
        this.applicationMode = applicationMode;
        this.type = FIXED;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueFixedImpl() {
        this.type = FIXED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money values in cent precision or high precision of different currencies.</p>
     */

    public java.util.List<com.commercetools.api.models.common.TypedMoney> getMoney() {
        return this.money;
    }

    /**
     *  <p>Indicates how the discount is applied on CartDiscountLineItemTarget or CartDiscountCustomLineItemTarget.</p>
     *  <p>For CartDiscountPatternTarget, the mode can also be <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    public void setMoney(final com.commercetools.api.models.common.TypedMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.TypedMoney> money) {
        this.money = money;
    }

    public void setApplicationMode(
            final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.applicationMode = applicationMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueFixedImpl that = (CartDiscountValueFixedImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(money, that.money)
                .append(applicationMode, that.applicationMode)
                .append(type, that.type)
                .append(money, that.money)
                .append(applicationMode, that.applicationMode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(money).append(applicationMode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("money", money)
                .append("applicationMode", applicationMode)
                .build();
    }

    @Override
    public CartDiscountValueFixed copyDeep() {
        return CartDiscountValueFixed.deepCopy(this);
    }
}
