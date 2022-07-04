
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

/**
 * CartSetDirectDiscountsAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetDirectDiscountsActionImpl implements CartSetDirectDiscountsAction, ModelBase {

    private String action;

    private java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts;

    @JsonCreator
    CartSetDirectDiscountsActionImpl(
            @JsonProperty("discounts") final java.util.List<com.commercetools.api.models.cart.DirectDiscountDraft> discounts) {
        this.discounts = discounts;
        this.action = SET_DIRECT_DISCOUNTS;
    }

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
     *
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

        return new EqualsBuilder().append(action, that.action).append(discounts, that.discounts).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(discounts).toHashCode();
    }

}
