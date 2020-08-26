package com.commercetools.importapi.models.orders;

import com.commercetools.importapi.models.common.Money;
import com.commercetools.importapi.models.orders.ShippingRatePriceTier;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShippingRateDraftImpl implements ShippingRateDraft {

    private com.commercetools.importapi.models.common.Money price;
    
    private com.commercetools.importapi.models.common.Money freeAbove;
    
    private java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers;

    @JsonCreator
    ShippingRateDraftImpl(@JsonProperty("price") final com.commercetools.importapi.models.common.Money price, @JsonProperty("freeAbove") final com.commercetools.importapi.models.common.Money freeAbove, @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers) {
        this.price = price;
        this.freeAbove = freeAbove;
        this.tiers = tiers;
    }
    public ShippingRateDraftImpl() {
       
    }

    
    public com.commercetools.importapi.models.common.Money getPrice(){
        return this.price;
    }
    
    
    public com.commercetools.importapi.models.common.Money getFreeAbove(){
        return this.freeAbove;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> getTiers(){
        return this.tiers;
    }

    public void setPrice(final com.commercetools.importapi.models.common.Money price){
        this.price = price;
    }
    
    public void setFreeAbove(final com.commercetools.importapi.models.common.Money freeAbove){
        this.freeAbove = freeAbove;
    }
    
    public void setTiers(final java.util.List<com.commercetools.importapi.models.orders.ShippingRatePriceTier> tiers){
        this.tiers = tiers;
    }

}
