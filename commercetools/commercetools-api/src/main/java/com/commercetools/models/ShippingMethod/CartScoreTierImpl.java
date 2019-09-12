package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.PriceFunction;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import java.lang.Boolean;
import java.lang.Integer;
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
public final class CartScoreTierImpl implements CartScoreTier {

   private com.commercetools.models.ShippingMethod.ShippingRateTierType type;
   
   private java.lang.Integer score;
   
   private com.commercetools.models.Common.Money price;
   
   private java.lang.Boolean isMatching;
   
   private com.commercetools.models.ShippingMethod.PriceFunction priceFunction;

   @JsonCreator
   CartScoreTierImpl(@JsonProperty("score") final java.lang.Integer score, @JsonProperty("price") final com.commercetools.models.Common.Money price, @JsonProperty("isMatching") final java.lang.Boolean isMatching, @JsonProperty("priceFunction") final com.commercetools.models.ShippingMethod.PriceFunction priceFunction) {
      this.score = score;
      this.price = price;
      this.isMatching = isMatching;
      this.priceFunction = priceFunction;
      this.type = ShippingRateTierType.findEnumViaJsonName("CartScore").get();
   }
   public CartScoreTierImpl() {
      
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateTierType getType(){
      return this.type;
   }
   
   
   public java.lang.Integer getScore(){
      return this.score;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }
   
   
   public com.commercetools.models.ShippingMethod.PriceFunction getPriceFunction(){
      return this.priceFunction;
   }

   public void setScore(final java.lang.Integer score){
      this.score = score;
   }
   
   public void setPrice(final com.commercetools.models.Common.Money price){
      this.price = price;
   }
   
   public void setIsMatching(final java.lang.Boolean isMatching){
      this.isMatching = isMatching;
   }
   
   public void setPriceFunction(final com.commercetools.models.ShippingMethod.PriceFunction priceFunction){
      this.priceFunction = priceFunction;
   }

}