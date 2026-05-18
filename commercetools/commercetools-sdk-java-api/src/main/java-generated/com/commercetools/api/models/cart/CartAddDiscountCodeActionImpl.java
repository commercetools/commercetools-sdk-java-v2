
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
 *  <p>Adds a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a> to the Cart to activate the related <span>Cart Discounts</span>. If the related Cart Discounts are inactive or invalid, or belong to a different Store than the Cart, a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeNonApplicableError" rel="nofollow">DiscountCodeNonApplicableError</a> is returned.</p>
 *  <p>A Discount Code can be added only if no <a href="https://docs.commercetools.com/apis/ctp:api:type:DirectDiscount" rel="nofollow">DirectDiscount</a> has been applied to the Cart. For <a href="https://docs.commercetools.com/apis/ctp:api:type:FrozenCarts" rel="nofollow">frozen Carts</a>, the <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCodeState" rel="nofollow">DiscountCodeState</a> must be <code>DoesNotMatchCart</code> when adding a Discount Code.</p>
 *  <p>The maximum number of Discount Codes in a Cart is restricted by a <span>limit</span>.</p>
 *  <p>Specific Error Code: <a href="https://docs.commercetools.com/apis/ctp:api:type:MatchingPriceNotFoundError" rel="nofollow">MatchingPriceNotFound</a></p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartAddDiscountCodeActionImpl implements CartAddDiscountCodeAction, ModelBase {

    private String action;

    private String code;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartAddDiscountCodeActionImpl(@JsonProperty("code") final String code) {
        this.code = code;
        this.action = ADD_DISCOUNT_CODE;
    }

    /**
     * create empty instance
     */
    public CartAddDiscountCodeActionImpl() {
        this.action = ADD_DISCOUNT_CODE;
    }

    /**
     *
     */

    public String getAction() {
        return this.action;
    }

    /**
     *  <p><code>code</code> of a <a href="https://docs.commercetools.com/apis/ctp:api:type:DiscountCode" rel="nofollow">DiscountCode</a>.</p>
     */

    public String getCode() {
        return this.code;
    }

    public void setCode(final String code) {
        this.code = code;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartAddDiscountCodeActionImpl that = (CartAddDiscountCodeActionImpl) o;

        return new EqualsBuilder().append(action, that.action)
                .append(code, that.code)
                .append(action, that.action)
                .append(code, that.code)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(action).append(code).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("action", action)
                .append("code", code)
                .build();
    }

    @Override
    public CartAddDiscountCodeAction copyDeep() {
        return CartAddDiscountCodeAction.deepCopy(this);
    }
}
