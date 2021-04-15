
package com.commercetools.api.models.project;

import java.time.*;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public final class ShippingRateInputTypeImpl implements ShippingRateInputType {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;

    @JsonCreator
    ShippingRateInputTypeImpl(
            @JsonProperty("type") final com.commercetools.api.models.shipping_method.ShippingRateTierType type) {
        this.type = type;
    }

    public ShippingRateInputTypeImpl() {
    }

    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateInputTypeImpl that = (ShippingRateInputTypeImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
