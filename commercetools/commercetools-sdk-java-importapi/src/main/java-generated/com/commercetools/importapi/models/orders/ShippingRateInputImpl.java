package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.orders.ClassificationShippingRateInput;
import com.commercetools.importapi.models.orders.ScoreShippingRateInput;
import com.commercetools.importapi.models.orders.ShippingRateInputType;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.ModelBase;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * ShippingRateInput
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ShippingRateInputImpl implements ShippingRateInput, ModelBase {

    
    private com.commercetools.importapi.models.orders.ShippingRateInputType type;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ShippingRateInputImpl(@JsonProperty("type") final com.commercetools.importapi.models.orders.ShippingRateInputType type) {
        this.type = type;
    }
    /**
     * create empty instance
     */
    public ShippingRateInputImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.importapi.models.orders.ShippingRateInputType getType(){
        return this.type;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ShippingRateInputImpl that = (ShippingRateInputImpl) o;
    
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
