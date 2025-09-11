
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
 *  <p>Sets the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountedLineItemPrice" rel="nofollow">DiscountedLineItemPrice</a> of the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemsTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemsTarget</a> to the value specified in the <code>money</code> field, if it is lower than the current Line Item price for the same currency. If the Line Item price is already discounted to a price equal to or lower than the respective price in the <code>money</code> field, this Discount is not applied.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueFixedDraftImpl implements CartDiscountValueFixedDraft, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.Money> money;

    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueFixedDraftImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.Money> money,
            @JsonProperty("applicationMode") final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.money = money;
        this.applicationMode = applicationMode;
        this.type = FIXED;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueFixedDraftImpl() {
        this.type = FIXED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Money values provided either in <a href="https://docs.commercetools.com/apis/ctp:api:type:Money" rel="nofollow">cent precision</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:HighPrecisionMoneyDraft" rel="nofollow">high precision</a> for different currencies. A fixed Cart Discount will match a price only if the array contains a value with the same currency. For example, if it contains 10&euro; and 15$, the matching &euro; price will be discounted by 10&euro; and the matching $ price will be discounted to 15$.</p>
     *  <p>If the array is empty or has multiple values of the same currency, the API returns an <a href="https://docs.commercetools.com/apis/ctp:api:type:InvalidOperationError" rel="nofollow">InvalidOperation</a> error.</p>
     */

    public java.util.List<com.commercetools.api.models.common.Money> getMoney() {
        return this.money;
    }

    /**
     *  <p>Determines how the discount applies on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> or <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     *  <p>For <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountPatternTarget" rel="nofollow">CartDiscountPatternTarget</a>, you can also set the mode to <code>ProportionateDistribution</code> or <code>EvenDistribution</code>.</p>
     */

    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    public void setMoney(final com.commercetools.api.models.common.Money... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.Money> money) {
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

        CartDiscountValueFixedDraftImpl that = (CartDiscountValueFixedDraftImpl) o;

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
    public CartDiscountValueFixedDraft copyDeep() {
        return CartDiscountValueFixedDraft.deepCopy(this);
    }
}
