package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
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
public final class CartValueTierImpl implements CartValueTier {

    private com.commercetools.api.models.shipping_method.ShippingRateTierType type;
    
    private Long minimumCentAmount;
    
    private com.commercetools.api.models.common.Money price;
    
    private Boolean isMatching;

    @JsonCreator
    CartValueTierImpl(@JsonProperty("minimumCentAmount") final Long minimumCentAmount, @JsonProperty("price") final com.commercetools.api.models.common.Money price, @JsonProperty("isMatching") final Boolean isMatching) {
        this.minimumCentAmount = minimumCentAmount;
        this.price = price;
        this.isMatching = isMatching;
        this.type = ShippingRateTierType.findEnum("CartValue");
    }
    public CartValueTierImpl() {
       
    }

    
    public com.commercetools.api.models.shipping_method.ShippingRateTierType getType(){
        return this.type;
    }
    
    
    public Long getMinimumCentAmount(){
        return this.minimumCentAmount;
    }
    
    
    public com.commercetools.api.models.common.Money getPrice(){
        return this.price;
    }
    
    
    public Boolean getIsMatching(){
        return this.isMatching;
    }

    public void setMinimumCentAmount(final Long minimumCentAmount){
        this.minimumCentAmount = minimumCentAmount;
    }
    
    public void setPrice(final com.commercetools.api.models.common.Money price){
        this.price = price;
    }
    
    public void setIsMatching(final Boolean isMatching){
        this.isMatching = isMatching;
    }

}
