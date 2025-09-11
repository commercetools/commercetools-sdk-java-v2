
package com.commercetools.api.models.message;

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
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:endpoint:/{projectKey}/cart-discounts:POST" rel="nofollow">Create CartDiscount</a> request.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountCreatedMessagePayloadImpl implements CartDiscountCreatedMessagePayload, ModelBase {

    private String type;

    private com.commercetools.api.models.cart_discount.CartDiscount cartDiscount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountCreatedMessagePayloadImpl(
            @JsonProperty("cartDiscount") final com.commercetools.api.models.cart_discount.CartDiscount cartDiscount) {
        this.cartDiscount = cartDiscount;
        this.type = CART_DISCOUNT_CREATED;
    }

    /**
     * create empty instance
     */
    public CartDiscountCreatedMessagePayloadImpl() {
        this.type = CART_DISCOUNT_CREATED;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>The <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscount" rel="nofollow">Cart Discount</a> that was created.</p>
     */

    public com.commercetools.api.models.cart_discount.CartDiscount getCartDiscount() {
        return this.cartDiscount;
    }

    public void setCartDiscount(final com.commercetools.api.models.cart_discount.CartDiscount cartDiscount) {
        this.cartDiscount = cartDiscount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountCreatedMessagePayloadImpl that = (CartDiscountCreatedMessagePayloadImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(cartDiscount, that.cartDiscount)
                .append(type, that.type)
                .append(cartDiscount, that.cartDiscount)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(cartDiscount).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("cartDiscount", cartDiscount)
                .build();
    }

    @Override
    public CartDiscountCreatedMessagePayload copyDeep() {
        return CartDiscountCreatedMessagePayload.deepCopy(this);
    }
}
