
package com.commercetools.api.models.discount_code;

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
 * DiscountCodeChangeCartDiscountsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeChangeCartDiscountsActionImpl implements DiscountCodeChangeCartDiscountsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountCodeChangeCartDiscountsActionImpl(
            @JsonProperty("cartDiscounts") final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
        this.action = CHANGE_CART_DISCOUNTS;
    }

    /**
     * create empty instance
     */
    public DiscountCodeChangeCartDiscountsActionImpl() {
        this.action = CHANGE_CART_DISCOUNTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set.</p>
     */

    public java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> getCartDiscounts() {
        return this.cartDiscounts;
    }

    public void setCartDiscounts(
            final com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier... cartDiscounts) {
        this.cartDiscounts = new ArrayList<>(Arrays.asList(cartDiscounts));
    }

    public void setCartDiscounts(
            final java.util.List<com.commercetools.api.models.cart_discount.CartDiscountResourceIdentifier> cartDiscounts) {
        this.cartDiscounts = cartDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        DiscountCodeChangeCartDiscountsActionImpl that = (DiscountCodeChangeCartDiscountsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(cartDiscounts, that.cartDiscounts)
                .append(action, that.action)
                .append(cartDiscounts, that.cartDiscounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(cartDiscounts).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("cartDiscounts", cartDiscounts)
                .build();
    }

    @Override
    public DiscountCodeChangeCartDiscountsAction copyDeep() {
        return DiscountCodeChangeCartDiscountsAction.deepCopy(this);
    }
}
