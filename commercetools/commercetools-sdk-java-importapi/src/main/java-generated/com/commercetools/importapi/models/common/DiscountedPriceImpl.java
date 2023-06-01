package com.commercetools.importapi.models.common;

import com.commercetools.importapi.models.common.ProductDiscountKeyReference;
import com.commercetools.importapi.models.common.TypedMoney;
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
 * DiscountedPrice
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountedPriceImpl implements DiscountedPrice, ModelBase {

    
    private com.commercetools.importapi.models.common.TypedMoney value;
    
    
    private com.commercetools.importapi.models.common.ProductDiscountKeyReference discount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedPriceImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value, @JsonProperty("discount") final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount) {
        this.value = value;
        this.discount = discount;
    }
    /**
     * create empty instance
     */
    public DiscountedPriceImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }
    
    /**
     *  <p>Reference to a ProductDiscount.</p>
     */
    
    public com.commercetools.importapi.models.common.ProductDiscountKeyReference getDiscount(){
        return this.discount;
    }

    
    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value){
        this.value = value;
    }
    
    
    public void setDiscount(final com.commercetools.importapi.models.common.ProductDiscountKeyReference discount){
        this.discount = discount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountedPriceImpl that = (DiscountedPriceImpl) o;
    
        return new EqualsBuilder()
                .append(value, that.value)
                .append(discount, that.discount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(value)
            .append(discount)
            .toHashCode();
    }

}
