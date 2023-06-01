package com.commercetools.history.models.common;

import com.commercetools.history.models.common.DiscountedLineItemPortion;
import com.commercetools.history.models.common.Money;
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
 * DiscountedLineItemPrice
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class DiscountedLineItemPriceImpl implements DiscountedLineItemPrice, ModelBase {

    
    private com.commercetools.history.models.common.Money value;
    
    
    private java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts;

    /**
     * create instance with all properties
     */
    @JsonCreator
    DiscountedLineItemPriceImpl(@JsonProperty("value") final com.commercetools.history.models.common.Money value, @JsonProperty("includedDiscounts") final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts) {
        this.value = value;
        this.includedDiscounts = includedDiscounts;
    }
    /**
     * create empty instance
     */
    public DiscountedLineItemPriceImpl() {
    }

    /**
     *
     */
    
    public com.commercetools.history.models.common.Money getValue(){
        return this.value;
    }
    
    /**
     *
     */
    
    public java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> getIncludedDiscounts(){
        return this.includedDiscounts;
    }

    
    public void setValue(final com.commercetools.history.models.common.Money value){
        this.value = value;
    }
    
    
    public void setIncludedDiscounts(final com.commercetools.history.models.common.DiscountedLineItemPortion ...includedDiscounts){
       this.includedDiscounts = new ArrayList<>(Arrays.asList(includedDiscounts));
    }
    
    
    public void setIncludedDiscounts(final java.util.List<com.commercetools.history.models.common.DiscountedLineItemPortion> includedDiscounts){
       this.includedDiscounts = includedDiscounts;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        DiscountedLineItemPriceImpl that = (DiscountedLineItemPriceImpl) o;
    
        return new EqualsBuilder()
                .append(value, that.value)
                .append(includedDiscounts, that.includedDiscounts)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(value)
            .append(includedDiscounts)
            .toHashCode();
    }

}
