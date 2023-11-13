
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
 *  <p>Represents a CartDiscount that can only be associated with a single Cart or Order.</p>
 *  <p>Direct Discounts are always active and valid, and have the default <code>Stacking</code> StackingMode. They apply in the order in which they are listed in the <code>directDiscounts</code> array of Carts or Orders, and do not have a sorting order like Cart Discounts.</p>
 *  <p>If a Direct Discount is present, any matching Cart Discounts in the Project are ignored. Additionally, a Cart or Order supports either Discount Codes or Direct Discounts at the same time.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountDraftImpl implements DirectDiscountDraft, ModelBase {

    private com.commercetools.api.models.cart_discount.CartDiscountValue value;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DirectDiscountDraftImpl(
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValue value,
            @JsonProperty("target") final com.commercetools.api.models.cart_discount.CartDiscountTarget target) {
        this.value = value;
        this.target = target;
    }

    /**
     * create empty instance
     */
    public DirectDiscountDraftImpl() {
    }

    /**
     *  <p>Defines the effect the Discount will have.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountValue getValue() {
        return this.value;
    }

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValue value) {
        this.value = value;
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

        DirectDiscountDraftImpl that = (DirectDiscountDraftImpl) o;

        return new EqualsBuilder().append(value, that.value)
                .append(target, that.target)
                .append(value, that.value)
                .append(target, that.target)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(value).append(target).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("value", value)
                .append("target", target)
                .build();
    }

}
