
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
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a>, but only if no <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> has been added to the Cart. Either a Discount Code or a Direct Discount can exist on a Cart at the same time.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDirectDiscountsActionImpl implements CartSetDirectDiscountsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartSetDirectDiscountsActionImpl(
            @JsonProperty("discounts") final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
        this.action = SET_DIRECT_DISCOUNTS;
    }

    /**
     * create empty instance
     */
    public CartSetDirectDiscountsActionImpl() {
        this.action = SET_DIRECT_DISCOUNTS;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <ul>
     *   <li>If set, all existing Direct Discounts are replaced. The discounts apply in the order they are added to the list.</li>
     *   <li>If empty, all existing Direct Discounts are removed and all affected prices on the Cart or Order are recalculated.</li>
     *  </ul>
     */

    public java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> getDiscounts() {
        return this.discounts;
    }

    public void setDiscounts(final com.commercetools.api.models.cart.DirectDiscountDraft... discounts) {
        this.discounts = new ArrayList<>(Arrays.asList(discounts));
    }

    public void setDiscounts(final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartSetDirectDiscountsActionImpl that = (CartSetDirectDiscountsActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(discounts, that.discounts)
                .append(action, that.action)
                .append(discounts, that.discounts)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discounts).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("discounts", discounts)
                .build();
    }

    @Override
    public CartSetDirectDiscountsAction copyDeep() {
        return CartSetDirectDiscountsAction.deepCopy(this);
    }
}
