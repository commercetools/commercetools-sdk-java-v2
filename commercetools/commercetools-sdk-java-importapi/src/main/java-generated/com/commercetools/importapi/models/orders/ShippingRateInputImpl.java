
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

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
public class ShippingRateInputImpl implements ShippingRateInput, ModelBase {

    private com.commercetools.importapi.models.orders.ShippingRateInputType type;

    @JsonCreator
    ShippingRateInputImpl(
            @JsonProperty("type") final com.commercetools.importapi.models.orders.ShippingRateInputType type) {
        this.type = type;
    }

    public ShippingRateInputImpl() {
    }

    public com.commercetools.importapi.models.orders.ShippingRateInputType getType() {
        return this.type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRateInputImpl that = (ShippingRateInputImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
