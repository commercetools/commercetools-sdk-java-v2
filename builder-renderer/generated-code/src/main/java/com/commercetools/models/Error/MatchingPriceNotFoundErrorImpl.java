package com.commercetools.models.Error;

import com.commercetools.models.Channel.ChannelReference;
import com.commercetools.models.CustomerGroup.CustomerGroupReference;
import com.commercetools.models.Error.ErrorObject;
import java.lang.Integer;
import java.lang.String;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MatchingPriceNotFoundErrorImpl implements MatchingPriceNotFoundError {

   private java.lang.String code;
   
   private java.lang.String message;
   
   private java.lang.String country;
   
   private java.lang.String productId;
   
   private com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup;
   
   private com.commercetools.models.Channel.ChannelReference channel;
   
   private java.lang.String currency;
   
   private java.lang.Integer variantId;

   @JsonCreator
   MatchingPriceNotFoundErrorImpl(@JsonProperty("message") final java.lang.String message, @JsonProperty("country") final java.lang.String country, @JsonProperty("productId") final java.lang.String productId, @JsonProperty("customerGroup") final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup, @JsonProperty("channel") final com.commercetools.models.Channel.ChannelReference channel, @JsonProperty("currency") final java.lang.String currency, @JsonProperty("variantId") final java.lang.Integer variantId) {
      this.message = message;
      this.country = country;
      this.productId = productId;
      this.customerGroup = customerGroup;
      this.channel = channel;
      this.currency = currency;
      this.variantId = variantId;
      this.code = "MatchingPriceNotFound";
   }
   public MatchingPriceNotFoundErrorImpl() {
      
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.lang.String getCountry(){
      return this.country;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.CustomerGroup.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.models.Channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public java.lang.String getCurrency(){
      return this.currency;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }

   public void setMessage(final java.lang.String message){
      this.message = message;
   }
   
   public void setCountry(final java.lang.String country){
      this.country = country;
   }
   
   public void setProductId(final java.lang.String productId){
      this.productId = productId;
   }
   
   public void setCustomerGroup(final com.commercetools.models.CustomerGroup.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setChannel(final com.commercetools.models.Channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setCurrency(final java.lang.String currency){
      this.currency = currency;
   }
   
   public void setVariantId(final java.lang.Integer variantId){
      this.variantId = variantId;
   }

}