
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
 *  <p>Discount is applied to <a href="https://docs.commercetools.com/apis/ctp:api:type:CustomLineItem" rel="nofollow">CustomLineItems</a> matching the <code>predicate</code>.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountCustomLineItemsTargetImpl implements CartDiscountCustomLineItemsTarget, ModelBase {

    private String type;

    private String predicate;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountCustomLineItemsTargetImpl(@JsonProperty("predicate") final String predicate) {
        this.predicate = predicate;
        this.type = CUSTOM_LINE_ITEMS;
    }

    /**
     * create empty instance
     */
    public CartDiscountCustomLineItemsTargetImpl() {
        this.type = CUSTOM_LINE_ITEMS;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Valid <span>CustomLineItem target predicate</span>.</p>
     */

    public String getPredicate() {
        return this.predicate;
    }

    public void setPredicate(final String predicate) {
        this.predicate = predicate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountCustomLineItemsTargetImpl that = (CartDiscountCustomLineItemsTargetImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(predicate, that.predicate)
                .append(type, that.type)
                .append(predicate, that.predicate)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(predicate).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("predicate", predicate)
                .build();
    }

    @Override
    public CartDiscountCustomLineItemsTarget copyDeep() {
        return CartDiscountCustomLineItemsTarget.deepCopy(this);
    }
}
