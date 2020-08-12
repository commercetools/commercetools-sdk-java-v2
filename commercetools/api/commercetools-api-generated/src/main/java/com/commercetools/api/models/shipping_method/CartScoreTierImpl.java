package com.commercetools.api.models.shipping_method;

import com.commercetools.api.models.common.Money;
import com.commercetools.api.models.shipping_method.PriceFunction;
import com.commercetools.api.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.models.shipping_method.ShippingRateTierType;
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
public final class CartScoreTierImpl implements CartScoreTier {

   private com.commercetools.api.models.shipping_method.ShippingRateTierType type;
   
   private Double score;
   
   private com.commercetools.api.models.common.Money price;
   
   private com.commercetools.api.models.shipping_method.PriceFunction priceFunction;
   
   private Boolean isMatching;

   @JsonCreator
   CartScoreTierImpl(@JsonProperty("score") final Double score, @JsonProperty("price") final com.commercetools.api.models.common.Money price, @JsonProperty("priceFunction") final com.commercetools.api.models.shipping_method.PriceFunction priceFunction, @JsonProperty("isMatching") final Boolean isMatching) {
      this.score = score;
      this.price = price;
      this.priceFunction = priceFunction;
      this.isMatching = isMatching;
      this.type = ShippingRateTierType.findEnumViaJsonName("CartScore").get();
   }
   public CartScoreTierImpl() {
      
   }
   
   
   public com.commercetools.api.models.shipping_method.ShippingRateTierType getType(){
      return this.type;
   }
   
   
   public Double getScore(){
      return this.score;
   }
   
   
   public com.commercetools.api.models.common.Money getPrice(){
      return this.price;
   }
   
   
   public com.commercetools.api.models.shipping_method.PriceFunction getPriceFunction(){
      return this.priceFunction;
   }
   
   
   public Boolean getIsMatching(){
      return this.isMatching;
   }

   public void setScore(final Double score){
      this.score = score;
   }
   
   public void setPrice(final com.commercetools.api.models.common.Money price){
      this.price = price;
   }
   
   public void setPriceFunction(final com.commercetools.api.models.shipping_method.PriceFunction priceFunction){
      this.priceFunction = priceFunction;
   }
   
   public void setIsMatching(final Boolean isMatching){
      this.isMatching = isMatching;
   }

}
