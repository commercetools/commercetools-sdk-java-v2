package com.commercetools.models.ShippingMethod;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ShippingMethod.ShippingRatePriceTier;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import java.lang.Boolean;
import java.lang.Long;
import com.commercetools.models.ShippingMethod.CartValueTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import json.CommercetoolsJsonUtils;
import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartValueTierImpl.class)
public interface CartValueTier extends ShippingRatePriceTier {

   
   @NotNull
   @JsonProperty("minimumCentAmount")
   public Long getMinimumCentAmount();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   
   
   @JsonProperty("isMatching")
   public Boolean getIsMatching();

   public void setMinimumCentAmount(final Long minimumCentAmount);
   
   public void setPrice(final Money price);
   
   public void setIsMatching(final Boolean isMatching);
   
   public static CartValueTierImpl of(){
      return new CartValueTierImpl();
   }
   

   public static CartValueTierImpl of(final CartValueTier template) {
      CartValueTierImpl instance = new CartValueTierImpl();
      instance.setMinimumCentAmount(template.getMinimumCentAmount());
      instance.setPrice(template.getPrice());
      instance.setIsMatching(template.getIsMatching());
      return instance;
   }

}