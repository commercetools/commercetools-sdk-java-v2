package com.commercetools.api.models.product;


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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductVariantChannelAvailabilityImpl implements ProductVariantChannelAvailability {

    private Boolean isOnStock;
    
    private Long restockableInDays;
    
    private Long availableQuantity;

    @JsonCreator
    ProductVariantChannelAvailabilityImpl(@JsonProperty("isOnStock") final Boolean isOnStock, @JsonProperty("restockableInDays") final Long restockableInDays, @JsonProperty("availableQuantity") final Long availableQuantity) {
        this.isOnStock = isOnStock;
        this.restockableInDays = restockableInDays;
        this.availableQuantity = availableQuantity;
    }
    public ProductVariantChannelAvailabilityImpl() {
       
    }

    
    public Boolean getIsOnStock(){
        return this.isOnStock;
    }
    
    
    public Long getRestockableInDays(){
        return this.restockableInDays;
    }
    
    
    public Long getAvailableQuantity(){
        return this.availableQuantity;
    }

    public void setIsOnStock(final Boolean isOnStock){
        this.isOnStock = isOnStock;
    }
    
    public void setRestockableInDays(final Long restockableInDays){
        this.restockableInDays = restockableInDays;
    }
    
    public void setAvailableQuantity(final Long availableQuantity){
        this.availableQuantity = availableQuantity;
    }

}
