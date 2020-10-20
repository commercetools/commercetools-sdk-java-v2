package com.commercetools.importapi.models.productdrafts;

import com.commercetools.importapi.models.common.ChannelKeyReference;
import com.commercetools.importapi.models.common.CustomerGroupKeyReference;
import com.commercetools.importapi.models.common.DiscountedPrice;
import com.commercetools.importapi.models.common.PriceTier;
import com.commercetools.importapi.models.common.TypedMoney;
import com.commercetools.importapi.models.customfields.Custom;
import java.time.ZonedDateTime;
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
public final class PriceDraftImportImpl implements PriceDraftImport {

    private com.commercetools.importapi.models.common.TypedMoney value;
    
    private String country;
    
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;
    
    private com.commercetools.importapi.models.common.ChannelKeyReference channel;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;
    
    private com.commercetools.importapi.models.customfields.Custom custom;
    
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;
    
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;
    
    private String key;

    @JsonCreator
    PriceDraftImportImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value, @JsonProperty("country") final String country, @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom, @JsonProperty("discounted") final com.commercetools.importapi.models.common.DiscountedPrice discounted, @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers, @JsonProperty("key") final String key) {
        this.value = value;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.custom = custom;
        this.discounted = discounted;
        this.tiers = tiers;
        this.key = key;
    }
    public PriceDraftImportImpl() {
       
    }

    
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    /**
    *  <p>References a customer group by its key.</p>
    */
    public com.commercetools.importapi.models.common.CustomerGroupKeyReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    /**
    *  <p>References a channel by its key.</p>
    */
    public com.commercetools.importapi.models.common.ChannelKeyReference getChannel(){
        return this.channel;
    }
    
    
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    /**
    *  <p>The custom fields for this category.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom(){
        return this.custom;
    }
    
    /**
    *  <p>Sets a discounted price from an external service.</p>
    */
    public com.commercetools.importapi.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }
    
    /**
    *  <p>The tiered prices for this price.</p>
    */
    public java.util.List<com.commercetools.importapi.models.common.PriceTier> getTiers(){
        return this.tiers;
    }
    
    
    public String getKey(){
        return this.key;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value){
        this.value = value;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setCustomerGroup(final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setChannel(final com.commercetools.importapi.models.common.ChannelKeyReference channel){
        this.channel = channel;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom){
        this.custom = custom;
    }
    
    public void setDiscounted(final com.commercetools.importapi.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }
    
    public void setTiers(final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers){
        this.tiers = tiers;
    }
    
    public void setKey(final String key){
        this.key = key;
    }

}
