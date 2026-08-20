
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import tools.jackson.databind.annotation.*;

/**
 * CartDiscountChangeRequiresDiscountCodeAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeRequiresDiscountCodeActionImpl
        implements CartDiscountChangeRequiresDiscountCodeAction, ModelBase {

    private String action;

    private Boolean requiresDiscountCode;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountChangeRequiresDiscountCodeActionImpl(
            @JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        this.action = CHANGE_REQUIRES_DISCOUNT_CODE;
    }

    /**
     * create empty instance
     */
    public CartDiscountChangeRequiresDiscountCodeActionImpl() {
        this.action = CHANGE_REQUIRES_DISCOUNT_CODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p>New value to set. If <code>true</code>, the Cart Discount can only be used with a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     *  <p>When set to <code>false</code>, if the number of active Cart Discounts without a Discount Code exceeds the <span>limit</span>, a <a href="https://docs.commercetools.com/apis/ctp:api:type:MaxCartDiscountsReachedError" rel="nofollow">MaxCartDiscountsReached</a> error is returned.</p>
     */

    public Boolean getRequiresDiscountCode() {
        return this.requiresDiscountCode;
    }

    public void setRequiresDiscountCode(final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountChangeRequiresDiscountCodeActionImpl that = (CartDiscountChangeRequiresDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(requiresDiscountCode, that.requiresDiscountCode)
                .append(action, that.action)
                .append(requiresDiscountCode, that.requiresDiscountCode)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(requiresDiscountCode).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("requiresDiscountCode", requiresDiscountCode)
                .build();
    }

    @Override
    public CartDiscountChangeRequiresDiscountCodeAction copyDeep() {
        return CartDiscountChangeRequiresDiscountCodeAction.deepCopy(this);
    }
}
