
package com.commercetools.history.models.common;

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
public class ShippingRatePriceTierImpl implements ShippingRatePriceTier, ModelBase {

    private com.commercetools.history.models.common.ShippingRateTierType type;

    @JsonCreator
    ShippingRatePriceTierImpl(
            @JsonProperty("type") final com.commercetools.history.models.common.ShippingRateTierType type) {
        this.type = type;
    }

    public ShippingRatePriceTierImpl() {
    }

    public com.commercetools.history.models.common.ShippingRateTierType getType() {
        return this.type;
    }

    public void setType(final com.commercetools.history.models.common.ShippingRateTierType type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (o == null || getClass() != o.getClass())
            return false;

        ShippingRatePriceTierImpl that = (ShippingRatePriceTierImpl) o;

        return new EqualsBuilder().append(type, that.type).isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37).append(type).toHashCode();
    }

}
