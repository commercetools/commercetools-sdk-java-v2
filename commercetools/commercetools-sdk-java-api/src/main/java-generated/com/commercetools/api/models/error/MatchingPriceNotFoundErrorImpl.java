package com.commercetools.api.models.error;

import com.commercetools.api.models.channel.ChannelReference;
import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.error.ErrorObject;
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
public final class MatchingPriceNotFoundErrorImpl implements MatchingPriceNotFoundError {

    private String code;
    
    private String message;
    
    private String productId;
    
    private Integer variantId;
    
    private String currency;
    
    private String country;
    
    private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;
    
    private com.commercetools.api.models.channel.ChannelReference channel;

    @JsonCreator
    MatchingPriceNotFoundErrorImpl(@JsonProperty("message") final String message, @JsonProperty("productId") final String productId, @JsonProperty("variantId") final Integer variantId, @JsonProperty("currency") final String currency, @JsonProperty("country") final String country, @JsonProperty("customerGroup") final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("channel") final com.commercetools.api.models.channel.ChannelReference channel) {
        this.message = message;
        this.productId = productId;
        this.variantId = variantId;
        this.currency = currency;
        this.country = country;
        this.customerGroup = customerGroup;
        this.channel = channel;
        this.code = "MatchingPriceNotFound";
    }
    public MatchingPriceNotFoundErrorImpl() {
        this.code = "MatchingPriceNotFound";
    }

    
    public String getCode(){
        return this.code;
    }
    
    
    public String getMessage(){
        return this.message;
    }
    
    
    public String getProductId(){
        return this.productId;
    }
    
    
    public Integer getVariantId(){
        return this.variantId;
    }
    
    
    public String getCurrency(){
        return this.currency;
    }
    
    
    public String getCountry(){
        return this.country;
    }
    
    
    public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
        return this.customerGroup;
    }
    
    
    public com.commercetools.api.models.channel.ChannelReference getChannel(){
        return this.channel;
    }

    public void setMessage(final String message){
        this.message = message;
    }
    
    public void setProductId(final String productId){
        this.productId = productId;
    }
    
    public void setVariantId(final Integer variantId){
        this.variantId = variantId;
    }
    
    public void setCurrency(final String currency){
        this.currency = currency;
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

}
