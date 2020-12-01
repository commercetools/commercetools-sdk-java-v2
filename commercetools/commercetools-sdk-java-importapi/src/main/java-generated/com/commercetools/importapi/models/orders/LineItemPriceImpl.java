package com.commercetools.importapi.models.orders;

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

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class LineItemPriceImpl implements LineItemPrice {

    private com.commercetools.importapi.models.common.TypedMoney value;
    
    private String country;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;
    
    private com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup;
    
    private com.commercetools.importapi.models.common.ChannelKeyReference channel;
    
    private com.commercetools.importapi.models.common.DiscountedPrice discounted;
    
    private java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers;
    
    private com.commercetools.importapi.models.customfields.Custom custom;

    @JsonCreator
    LineItemPriceImpl(@JsonProperty("value") final com.commercetools.importapi.models.common.TypedMoney value, @JsonProperty("country") final String country, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("customerGroup") final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup, @JsonProperty("channel") final com.commercetools.importapi.models.common.ChannelKeyReference channel, @JsonProperty("discounted") final com.commercetools.importapi.models.common.DiscountedPrice discounted, @JsonProperty("tiers") final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers, @JsonProperty("custom") final com.commercetools.importapi.models.customfields.Custom custom) {
        this.value = value;
        this.country = country;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.discounted = discounted;
        this.tiers = tiers;
        this.custom = custom;
    }
    public LineItemPriceImpl() {
    }

    /**
    *  <p>Maps to <code>Price.value</code>.</p>
    */
    public com.commercetools.importapi.models.common.TypedMoney getValue(){
        return this.value;
    }
    
    /**
    *  <p>Maps to <code>Price.county</code>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    /**
    *  <p>Maps to <code>Price.validFrom</code>.</p>
    */
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    /**
    *  <p>Maps to <code>Price.validUntil</code>.</p>
    */
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
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
    
    /**
    *  <p>Maps to <code>Price.custom</code>.</p>
    */
    public com.commercetools.importapi.models.customfields.Custom getCustom(){
        return this.custom;
    }

    public void setValue(final com.commercetools.importapi.models.common.TypedMoney value){
        this.value = value;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    public void setCustomerGroup(final com.commercetools.importapi.models.common.CustomerGroupKeyReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setChannel(final com.commercetools.importapi.models.common.ChannelKeyReference channel){
        this.channel = channel;
    }
    
    public void setDiscounted(final com.commercetools.importapi.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }
    
    public void setTiers(final com.commercetools.importapi.models.common.PriceTier ...tiers){
       this.tiers = new ArrayList<>(Arrays.asList(tiers));
    }
    
    public void setTiers(final java.util.List<com.commercetools.importapi.models.common.PriceTier> tiers){
       this.tiers = tiers;
    }
    
    public void setCustom(final com.commercetools.importapi.models.customfields.Custom custom){
        this.custom = custom;
    }

}
