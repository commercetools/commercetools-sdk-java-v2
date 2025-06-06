
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
 * CartDiscountChangeTargetAction
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountChangeTargetActionImpl implements CartDiscountChangeTargetAction, ModelBase {

    private String action;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountChangeTargetActionImpl(
            @JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
        this.action = CHANGE_TARGET;
    }

    /**
     * create empty instance
     */
    public CartDiscountChangeTargetActionImpl() {
        this.action = CHANGE_TARGET;
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

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public void setTarget(final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.target = target;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountChangeTargetActionImpl that = (CartDiscountChangeTargetActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(target, that.target)
                .append(action, that.action)
                .append(target, that.target)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(target).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("target", target)
                .build();
    }

    @Override
    public CartDiscountChangeTargetAction copyDeep() {
        return CartDiscountChangeTargetAction.deepCopy(this);
    }
}
