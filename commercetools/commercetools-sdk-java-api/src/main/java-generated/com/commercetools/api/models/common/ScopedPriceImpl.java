package com.commercetools.api.models.common;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.common.DiscountedPrice;
import com.commercetools.api.models.common.TypedMoney;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.type.CustomFields;
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
public final class ScopedPriceImpl implements ScopedPrice {

    private String id;
    
    private com.commercetools.api.models.common.TypedMoney value;
    
    private com.commercetools.api.models.common.TypedMoney currentValue;
    
    private String country;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    private com.commercetools.api.models.channel.ChannelReference channel;
    
    private java.time.ZonedDateTime validFrom;
    
    private java.time.ZonedDateTime validUntil;
    
    private com.commercetools.api.models.common.DiscountedPrice discounted;
    
    private com.commercetools.api.models.type.CustomFields custom;

    @JsonCreator
    ScopedPriceImpl(@JsonProperty("id") final String id, @JsonProperty("value") final com.commercetools.api.models.common.TypedMoney value, @JsonProperty("currentValue") final com.commercetools.api.models.common.TypedMoney currentValue, @JsonProperty("country") final String country, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel, @JsonProperty("validFrom") final java.time.ZonedDateTime validFrom, @JsonProperty("validUntil") final java.time.ZonedDateTime validUntil, @JsonProperty("discounted") final com.commercetools.api.models.common.DiscountedPrice discounted, @JsonProperty("custom") final com.commercetools.api.models.type.CustomFields custom) {
        this.id = id;
        this.value = value;
        this.currentValue = currentValue;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.validFrom = validFrom;
        this.validUntil = validUntil;
        this.discounted = discounted;
        this.custom = custom;
    }
    public ScopedPriceImpl() {
    }

    
    public String getId(){
        return this.id;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getValue(){
        return this.value;
    }
    
    
    public com.commercetools.api.models.common.TypedMoney getCurrentValue(){
        return this.currentValue;
    }
    
    /**
    *  <p>A two-digit country code as per <a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1 alpha-2</a>.</p>
    */
    public String getCountry(){
        return this.country;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }
    
    
    public java.time.ZonedDateTime getValidFrom(){
        return this.validFrom;
    }
    
    
    public java.time.ZonedDateTime getValidUntil(){
        return this.validUntil;
    }
    
    
    public com.commercetools.api.models.common.DiscountedPrice getDiscounted(){
        return this.discounted;
    }
    
    
    public com.commercetools.api.models.type.CustomFields getCustom(){
        return this.custom;
    }

    public void setId(final String id){
        this.id = id;
    }
    
    public void setValue(final com.commercetools.api.models.common.TypedMoney value){
        this.value = value;
    }
    
    public void setCurrentValue(final com.commercetools.api.models.common.TypedMoney currentValue){
        this.currentValue = currentValue;
    }
    
    public void setCountry(final String country){
        this.country = country;
    }
    
    public void setCustomerGroup(final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup){
        this.customerGroup = customerGroup;
    }
    
    public void setChannel(final com.commercetools.api.models.channel.ChannelReference channel){
        this.channel = channel;
    }
    
    public void setValidFrom(final java.time.ZonedDateTime validFrom){
        this.validFrom = validFrom;
    }
    
    public void setValidUntil(final java.time.ZonedDateTime validUntil){
        this.validUntil = validUntil;
    }
    
    public void setDiscounted(final com.commercetools.api.models.common.DiscountedPrice discounted){
        this.discounted = discounted;
    }
    
    public void setCustom(final com.commercetools.api.models.type.CustomFields custom){
        this.custom = custom;
    }

}
