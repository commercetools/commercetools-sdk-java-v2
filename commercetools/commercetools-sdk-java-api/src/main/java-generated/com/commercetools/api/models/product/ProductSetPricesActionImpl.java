package com.commercetools.api.models.product;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.ProductUpdateAction;
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
public final class ProductSetPricesActionImpl implements ProductSetPricesAction {

    private String action;
    
    private Long variantId;
    
    private String sku;
    
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;
    
    private Boolean staged;

    @JsonCreator
    ProductSetPricesActionImpl(@JsonProperty("variantId") final Long variantId, @JsonProperty("sku") final String sku, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices, @JsonProperty("staged") final Boolean staged) {
        this.variantId = variantId;
        this.sku = sku;
        this.prices = prices;
        this.staged = staged;
        this.action = "setPrices";
    }
    public ProductSetPricesActionImpl() {
       
    }

    
    public String getAction(){
        return this.action;
    }
    
    
    public Long getVariantId(){
        return this.variantId;
    }
    
    
    public String getSku(){
        return this.sku;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices(){
        return this.prices;
    }
    
    
    public Boolean getStaged(){
        return this.staged;
    }

    public void setVariantId(final Long variantId){
        this.variantId = variantId;
    }
    
    public void setSku(final String sku){
        this.sku = sku;
    }
    
    public void setPrices(final com.commercetools.api.models.common.PriceDraft ...prices){
       this.prices = new ArrayList<>(Arrays.asList(prices));
    }
    
    public void setPrices(final java.util.List<com.commercetools.api.models.common.PriceDraft> prices){
       this.prices = prices;
    }
    
    public void setStaged(final Boolean staged){
        this.staged = staged;
    }

}
