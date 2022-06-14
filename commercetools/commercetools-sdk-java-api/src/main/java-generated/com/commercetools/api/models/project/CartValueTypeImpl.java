
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

/**
 *  <p>Used when the ShippingRate maps to the sum of LineItem Prices. The value of the Cart is used to select a tier. If chosen, it is not possible to set a value for the <code>shippingRateInput</code> on the Cart.</p>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartValueTypeImpl implements CartValueType, ModelBase {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    @JsonCreator
    CartValueTypeImpl() {
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

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
