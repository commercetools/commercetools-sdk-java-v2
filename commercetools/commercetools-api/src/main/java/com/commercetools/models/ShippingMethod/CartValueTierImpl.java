package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import java.lang.Boolean;
import java.lang.Long;
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
public final class CartValueTierImpl implements CartValueTier {

   private com.commercetools.models.ShippingMethod.ShippingRateTierType type;
   
   private java.lang.Long minimumCentAmount;
   
   private com.commercetools.models.Common.Money price;
   
   private java.lang.Boolean isMatching;

   @JsonCreator
   CartValueTierImpl(@JsonProperty("minimumCentAmount") final java.lang.Long minimumCentAmount, @JsonProperty("price") final com.commercetools.models.Common.Money price, @JsonProperty("isMatching") final java.lang.Boolean isMatching) {
      this.minimumCentAmount = minimumCentAmount;
      this.price = price;
      this.isMatching = isMatching;
      this.type = ShippingRateTierType.findEnumViaJsonName("CartValue").get();
   }
   public CartValueTierImpl() {
      
   }
   
   
   public com.commercetools.models.ShippingMethod.ShippingRateTierType getType(){
      return this.type;
   }
   
   
   public java.lang.Long getMinimumCentAmount(){
      return this.minimumCentAmount;
   }
   
   
   public com.commercetools.models.Common.Money getPrice(){
      return this.price;
   }
   
   
   public java.lang.Boolean getIsMatching(){
      return this.isMatching;
   }

   public void setMinimumCentAmount(final java.lang.Long minimumCentAmount){
      this.minimumCentAmount = minimumCentAmount;
   }
   
   public void setPrice(final com.commercetools.models.Common.Money price){
      this.price = price;
   }
   
   public void setIsMatching(final java.lang.Boolean isMatching){
      this.isMatching = isMatching;
   }

}