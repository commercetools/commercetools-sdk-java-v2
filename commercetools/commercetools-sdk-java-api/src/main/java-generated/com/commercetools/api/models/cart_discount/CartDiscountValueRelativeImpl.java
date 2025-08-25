
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
 *  <p>Discounts the <a href="https://docs.commercetools.com/apis/ctp:api:type:CartDiscountTarget" rel="nofollow">CartDiscountTarget</a> relative to its price.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountValueRelativeImpl implements CartDiscountValueRelative, ModelBase {

    private String type;

    private Long permyriad;

    /**
     * create instance with all properties
     */
    @JsonCreator
    CartDiscountValueRelativeImpl(@JsonProperty("permyriad") final Long permyriad) {
        this.permyriad = permyriad;
        this.type = RELATIVE;
    }

    /**
     * create empty instance
     */
    public CartDiscountValueRelativeImpl() {
        this.type = RELATIVE;
    }

    /**
     *
     */

    public String getType() {
        return this.type;
    }

    /**
     *  <p>Fraction (per ten thousand) the price is reduced by. For example, <code>1000</code> will result in a 10% price reduction.</p>
     */

    public Long getPermyriad() {
        return this.permyriad;
    }

    public void setPermyriad(final Long permyriad) {
        this.permyriad = permyriad;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartDiscountValueRelativeImpl that = (CartDiscountValueRelativeImpl) o;

        return new EqualsBuilder().append(type, that.type)
                .append(permyriad, that.permyriad)
                .append(type, that.type)
                .append(permyriad, that.permyriad)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).append(permyriad).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type)
                .append("permyriad", permyriad)
                .build();
    }

    @Override
    public CartDiscountValueRelative copyDeep() {
        return CartDiscountValueRelative.deepCopy(this);
    }
}
