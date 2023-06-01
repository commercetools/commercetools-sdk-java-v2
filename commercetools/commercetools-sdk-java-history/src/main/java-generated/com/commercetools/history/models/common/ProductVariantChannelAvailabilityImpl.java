package com.commercetools.history.models.common;


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
 * ProductVariantChannelAvailability
 */
@Generated(
    value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator",
    comments = "https://github.com/commercetools/rmf-codegen"
)
public class ProductVariantChannelAvailabilityImpl implements ProductVariantChannelAvailability, ModelBase {

    
    private Boolean isOnStock;
    
    
    private Integer restockableInDays;
    
    
    private Integer availableQuantity;

    /**
     * create instance with all properties
     */
    @JsonCreator
    ProductVariantChannelAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock, @JsonProperty("restockableInDays") final Integer restockableInDays, @JsonProperty("availableQuantity") final Integer availableQuantity) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
    }
    /**
     * create empty instance
     */
    public ProductVariantChannelAvailabilityImpl() {
    }

    /**
     *
     */
    
    public Boolean getIsOnStock(){
        return this.isOnStock;
    }
    
    /**
     *
     */
    
    public Integer getRestockableInDays(){
        return this.restockableInDays;
    }
    
    /**
     *
     */
    
    public Integer getAvailableQuantity(){
        return this.availableQuantity;
    }

    
    public void setIsOnStock(final Boolean isOnStock){
        this.isOnStock = isOnStock;
    }
    
    
    public void setRestockableInDays(final Integer restockableInDays){
        this.restockableInDays = restockableInDays;
    }
    
    
    public void setAvailableQuantity(final Integer availableQuantity){
        this.availableQuantity = availableQuantity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
    
        if (o == null || getClass() != o.getClass()) return false;
    
        ProductVariantChannelAvailabilityImpl that = (ProductVariantChannelAvailabilityImpl) o;
    
        return new EqualsBuilder()
                .append(isOnStock, that.isOnStock)
                .append(restockableInDays, that.restockableInDays)
                .append(availableQuantity, that.availableQuantity)
                .isEquals();
    }
    
    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
            .append(isOnStock)
            .append(restockableInDays)
            .append(availableQuantity)
            .toHashCode();
    }

}
