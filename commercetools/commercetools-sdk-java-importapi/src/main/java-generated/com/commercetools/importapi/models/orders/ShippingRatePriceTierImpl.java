
package com.commercetools.importapi.models.orders;

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
 * ShippingRatePriceTier
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingRatePriceTierImpl implements ShippingRatePriceTier, ModelBase {

    private com.commercetools.importapi.models.orders.ShippingRateTierType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingRatePriceTierImpl(
            @JsonProperty("type") final com.commercetools.importapi.models.orders.ShippingRateTierType type) {
        this.type = type;
    }

    /**
     * create empty instance
     */
    public ShippingRatePriceTierImpl() {
    }

    /**
     *
     */

    public com.commercetools.importapi.models.orders.ShippingRateTierType getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRatePriceTierImpl that = (ShippingRatePriceTierImpl) o;

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
    public ShippingRatePriceTier copyDeep() {
        return ShippingRatePriceTier.deepCopy(this);
    }
}
