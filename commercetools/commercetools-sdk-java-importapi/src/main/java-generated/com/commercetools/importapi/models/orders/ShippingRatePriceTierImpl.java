package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.CartClassificationTier;
import com.commercetools.importapi.models.orders.ShippingRateTierType;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingRatePriceTierImpl implements ShippingRatePriceTier {

    private com.commercetools.importapi.models.orders.ShippingRateTierType type;

    @JsonCreator
    ShippingRatePriceTierImpl(@JsonProperty("type") final com.commercetools.importapi.models.orders.ShippingRateTierType type) {
        this.type = type;
    }
    public ShippingRatePriceTierImpl() {
    }

    
    public com.commercetools.importapi.models.orders.ShippingRateTierType getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingRatePriceTierImpl that = (ShippingRatePriceTierImpl) o;
    
        return new EqualsBuilder()
                .append(type, that.type)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(type)
            .toHashCode();
    }

}
