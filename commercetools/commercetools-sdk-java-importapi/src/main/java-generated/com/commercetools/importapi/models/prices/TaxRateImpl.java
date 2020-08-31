package com.commercetools.importapi.models.prices;

import com.commercetools.importapi.models.prices.SubRate;
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
public final class TaxRateImpl implements TaxRate {

    private String id;
    
    private String name;
    
    private Double amount;
    
    private Boolean includedInPrice;
    
    private String country;
    
    private String state;
    
    private java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates;

    @JsonCreator
    TaxRateImpl(@JsonProperty("id") final String id, @JsonProperty("name") final String name, @JsonProperty("amount") final Double amount, @JsonProperty("includedInPrice") final Boolean includedInPrice, @JsonProperty("country") final String country, @JsonProperty("state") final String state, @JsonProperty("subRates") final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates) {
        this.id = id;
        this.name = name;
        this.amount = amount;
        this.includedInPrice = includedInPrice;
        this.country = country;
        this.state = state;
        this.subRates = subRates;
    }
    public TaxRateImpl() {
       
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public String getName(){
        return this.name;
    }
    
    
    public Double getAmount(){
        return this.amount;
    }
    
    
    public Boolean getIncludedInPrice(){
        return this.includedInPrice;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    
    public String getState(){
        return this.state;
    }
    
    
    public java.util.List<com.commercetools.importapi.models.prices.SubRate> getSubRates(){
        return this.subRates;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setName(final String name){
        this.name = name;
    }
    
    public void setAmount(final Double amount){
        this.amount = amount;
    }
    
    public void setIncludedInPrice(final Boolean includedInPrice){
        this.includedInPrice = includedInPrice;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setState(final String state){
        this.state = state;
    }
    
    public void setSubRates(final java.util.List<com.commercetools.importapi.models.prices.SubRate> subRates){
        this.subRates = subRates;
    }

}
