
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
 *  <p>Represents a <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">CartDiscount</a> that can only be associated with a single Cart or Order.</p>
 *  <p>For an introduction to Direct Discounts and to understand how they work in Composable Commerce, see the <span>Direct Discounts overview</span>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DirectDiscountDraftImpl implements DirectDiscountDraft, ModelBase {

    private com.commercetools.api.models.cart_discount.CartDiscountValueDraft value;

    private com.commercetools.api.models.cart_discount.CartDiscountTarget target;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DirectDiscountDraftImpl(
            @JsonProperty("value") final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value,
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

    public com.commercetools.api.models.cart_discount.CartDiscountValueDraft getValue() {
        return this.value;
    }

    /**
     *  <p>Defines what segment of the Cart will be discounted.</p>
     *  <p>If <code>value</code> is set to <code>giftLineItem</code>, this must not be set.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscountTarget getTarget() {
        return this.target;
    }

    public void setValue(final com.commercetools.api.models.cart_discount.CartDiscountValueDraft value) {
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

    @Override
    public DirectDiscountDraft copyDeep() {
        return DirectDiscountDraft.deepCopy(this);
    }
}
