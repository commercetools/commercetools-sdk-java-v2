
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class CartDiscountChangeRequiresDiscountCodeActionImpl
        implements CartDiscountChangeRequiresDiscountCodeAction {

    private String action;

    private Boolean requiresDiscountCode;

    @JsonCreator
    CartDiscountChangeRequiresDiscountCodeActionImpl(
            @JsonProperty("requiresDiscountCode") final Boolean requiresDiscountCode) {
        this.requiresDiscountCode = requiresDiscountCode;
        this.action = CHANGE_REQUIRES_DISCOUNT_CODE;
    }

    public CartDiscountChangeRequiresDiscountCodeActionImpl() {
        this.action = CHANGE_REQUIRES_DISCOUNT_CODE;
    }

    public String getAction() {
        return this.action;
    }

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

        return new EqualsBuilder().append(action, that.action).append(requiresDiscountCode,
            that.requiresDiscountCode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(requiresDiscountCode).toHashCode();
    }

}
