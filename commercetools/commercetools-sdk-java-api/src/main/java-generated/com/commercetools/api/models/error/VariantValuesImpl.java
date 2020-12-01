package com.commercetools.api.models.error;

import com.commercetools.api.models.common.PriceDraft;
import com.commercetools.api.models.product.Attribute;
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
public final class VariantValuesImpl implements VariantValues {

    private String sku;
    
    private java.util.List<com.commercetools.api.models.common.PriceDraft> prices;
    
    private java.util.List<com.commercetools.api.models.product.Attribute> attributes;

    @JsonCreator
    VariantValuesImpl(@JsonProperty("sku") final String sku, @JsonProperty("prices") final java.util.List<com.commercetools.api.models.common.PriceDraft> prices, @JsonProperty("attributes") final java.util.List<com.commercetools.api.models.product.Attribute> attributes) {
        this.sku = sku;
        this.prices = prices;
        this.attributes = attributes;
    }
    public VariantValuesImpl() {
    }

    
    public String getSku(){
        return this.sku;
    }
    
    
    public java.util.List<com.commercetools.api.models.common.PriceDraft> getPrices(){
        return this.prices;
    }
    
    
    public java.util.List<com.commercetools.api.models.product.Attribute> getAttributes(){
        return this.attributes;
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
    
    public void setAttributes(final com.commercetools.api.models.product.Attribute ...attributes){
       this.attributes = new ArrayList<>(Arrays.asList(attributes));
    }
    
    public void setAttributes(final java.util.List<com.commercetools.api.models.product.Attribute> attributes){
       this.attributes = attributes;
    }

}
