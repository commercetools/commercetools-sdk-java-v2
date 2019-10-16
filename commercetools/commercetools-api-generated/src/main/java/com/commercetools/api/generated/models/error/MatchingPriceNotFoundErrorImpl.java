package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.channel.ChannelReference;
import com.commercetools.api.generated.models.customer_group.CustomerGroupReference;
import com.commercetools.api.generated.models.error.ErrorObject;
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


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MatchingPriceNotFoundErrorImpl implements MatchingPriceNotFoundError {

   private String code;
   
   private String message;
   
   private String country;
   
   private String productId;
   
   private com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup;
   
   private com.commercetools.api.generated.models.channel.ChannelReference channel;
   
   private String currency;
   
   private Integer variantId;

   @JsonCreator
   MatchingPriceNotFoundErrorImpl(@JsonProperty("message") final String message, @JsonProperty("country") final String country, @JsonProperty("productId") final String productId, @JsonProperty("customerGroup") final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup, @JsonProperty("channel") final com.commercetools.api.generated.models.channel.ChannelReference channel, @JsonProperty("currency") final String currency, @JsonProperty("variantId") final Integer variantId) {
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
   
   
   public String getCode(){
      return this.code;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public String getCountry(){
      return this.country;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.api.generated.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }
   
   
   public com.commercetools.api.generated.models.channel.ChannelReference getChannel(){
      return this.channel;
   }
   
   
   public String getCurrency(){
      return this.currency;
   }
   
   
   public Integer getVariantId(){
      return this.variantId;
   }

   public void setMessage(final String message){
      this.message = message;
   }
   
   public void setCountry(final String country){
      this.country = country;
   }
   
   public void setProductId(final String productId){
      this.productId = productId;
   }
   
   public void setCustomerGroup(final com.commercetools.api.generated.models.customer_group.CustomerGroupReference customerGroup){
      this.customerGroup = customerGroup;
   }
   
   public void setChannel(final com.commercetools.api.generated.models.channel.ChannelReference channel){
      this.channel = channel;
   }
   
   public void setCurrency(final String currency){
      this.currency = currency;
   }
   
   public void setVariantId(final Integer variantId){
      this.variantId = variantId;
   }

}