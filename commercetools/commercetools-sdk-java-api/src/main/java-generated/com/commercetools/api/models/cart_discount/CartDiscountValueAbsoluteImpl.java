
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
 *  <p>Discounts the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountTarget" rel="nofollow">CartDiscountTarget</a> by an absolute amount (not allowed for <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyLineItemsTarget" rel="nofollow">MultiBuyLineItemsTarget</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:MultiBuyCustomLineItemsTarget" rel="nofollow">MultiBuyCustomLineItemsTarget</a>).</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueAbsoluteImpl implements CartDiscountValueAbsolute, ModelBase {

    private String type;

    private java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money;

    private com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueAbsoluteImpl(
            @JsonProperty("money") final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money,
            @JsonProperty("applicationMode") final com.commercetools.api.models.cart_discount.DiscountApplicationMode applicationMode) {
        this.money = money;
        this.applicationMode = applicationMode;
        this.type = ABSOLUTE;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueAbsoluteImpl() {
        this.type = ABSOLUTE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Cent precision money values in different currencies.</p>
     */

    public java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> getMoney() {
        return this.money;
    }

    /**
     *  <p>Determines how the discount is applied on <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountLineItemsTarget" rel="nofollow">CartDiscountLineItemTarget</a> and <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountCustomLineItemsTarget" rel="nofollow">CartDiscountCustomLineItemTarget</a>.</p>
     */

    public com.commercetools.api.models.cart_discount.DiscountApplicationMode getApplicationMode() {
        return this.applicationMode;
    }

    public void setMoney(final com.commercetools.api.models.common.CentPrecisionMoney... money) {
        this.money = new ArrayList<>(Arrays.asList(money));
    }

    public void setMoney(final java.util.List<com.commercetools.api.models.common.CentPrecisionMoney> money) {
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

        CartDiscountValueAbsoluteImpl that = (CartDiscountValueAbsoluteImpl) o;

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
    public CartDiscountValueAbsolute copyDeep() {
        return CartDiscountValueAbsolute.deepCopy(this);
    }
}
