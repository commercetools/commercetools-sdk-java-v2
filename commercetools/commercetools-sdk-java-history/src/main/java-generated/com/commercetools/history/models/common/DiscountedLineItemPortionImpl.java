package com.commercetools.history.models.common;

import com.commercetools.history.models.common.Money;
import com.commercetools.history.models.common.Reference;
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
 * DiscountedLineItemPortion
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountedLineItemPortionImpl implements DiscountedLineItemPortion, ModelBase {

    
    private com.commercetools.history.models.common.Reference discount;
    
    
    private com.commercetools.history.models.common.Money discountedAmount;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPortionImpl(@JsonProperty("discount") final com.commercetools.history.models.common.Reference discount, @JsonProperty("discountedAmount") final com.commercetools.history.models.common.Money discountedAmount) {
        this.discount = discount;
        this.discountedAmount = discountedAmount;
    }
    /**
     * create empty instance
     */
    public DiscountedLineItemPortionImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.history.models.common.Reference getDiscount(){
        return this.discount;
    }
    
    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getDiscountedAmount(){
        return this.discountedAmount;
    }

    
    public void setDiscount(final com.commercetools.history.models.common.Reference discount){
        this.discount = discount;
    }
    
    
    public void setDiscountedAmount(final com.commercetools.history.models.common.Money discountedAmount){
        this.discountedAmount = discountedAmount;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountedLineItemPortionImpl that = (DiscountedLineItemPortionImpl) o;
    
        return new EqualsBuilder()
                .append(discount, that.discount)
                .append(discountedAmount, that.discountedAmount)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(discount)
            .append(discountedAmount)
            .toHashCode();
    }

}
