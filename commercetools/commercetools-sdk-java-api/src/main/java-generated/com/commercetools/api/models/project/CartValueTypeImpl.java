
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.commercetools.api.models.shipping_method.ShippingRateTierType;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.ModelBase;
import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

/**
 *  <p>The ShippingRate maps to the value of the Cart and is used to select a tier. The value of the Cart is the sum of all Line Item totals and Custom Line Item totals (via the <code>totalPrice</code> field) after any Product Discounts and Cart Discounts have been applied. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartValueTypeImpl implements CartValueType, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    public CartValueTypeImpl() {
        this.type = ShippingRateTierType.findEnum("CartValue");
    }

    /**
     *
     */

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        CartValueTypeImpl that = (CartValueTypeImpl) o;

        return new EqualsBuilder().append(type, that.type).append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this, ToStringStyle.SHORT_PREFIX_STYLE).append("type", type).build();
    }

    @Override
    public CartValueType copyDeep() {
        return CartValueType.deepCopy(this);
    }
}
