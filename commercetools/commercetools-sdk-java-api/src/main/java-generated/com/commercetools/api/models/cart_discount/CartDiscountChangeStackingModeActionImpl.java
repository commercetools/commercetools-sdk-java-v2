
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
public final class CartDiscountChangeStackingModeActionImpl implements CartDiscountChangeStackingModeAction {

    private String action;

    private com.commercetools.api.models.cart_discount.StackingMode stackingMode;

    @JsonCreator
    CartDiscountChangeStackingModeActionImpl(
            @JsonProperty("stackingMode") final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
        this.action = CHANGE_STACKING_MODE;
    }

    public CartDiscountChangeStackingModeActionImpl() {
        this.action = CHANGE_STACKING_MODE;
    }

    public String getAction() {
        return this.action;
    }

    public com.commercetools.api.models.cart_discount.StackingMode getStackingMode() {
        return this.stackingMode;
    }

    public void setStackingMode(final com.commercetools.api.models.cart_discount.StackingMode stackingMode) {
        this.stackingMode = stackingMode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountChangeStackingModeActionImpl that = (CartDiscountChangeStackingModeActionImpl) o;

        return new EqualsBuilder().append(action, that.action).append(stackingMode, that.stackingMode).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(stackingMode).toHashCode();
    }

}
