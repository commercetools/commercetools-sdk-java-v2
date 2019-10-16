package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.shipping_method.CartClassificationTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = CartClassificationTierImpl.class)
public interface CartClassificationTier extends ShippingRatePriceTier {

   
   @NotNull
   @JsonProperty("value")
   public String getValue();
   
   @NotNull
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   
   
   @JsonProperty("isMatching")
   public Boolean getIsMatching();

   public void setValue(final String value);
   
   public void setPrice(final Money price);
   
   public void setIsMatching(final Boolean isMatching);
   
   public static CartClassificationTierImpl of(){
      return new CartClassificationTierImpl();
   }
   

   public static CartClassificationTierImpl of(final CartClassificationTier template) {
      CartClassificationTierImpl instance = new CartClassificationTierImpl();
      instance.setPrice(template.getPrice());
      instance.setIsMatching(template.getIsMatching());
      instance.setValue(template.getValue());
      return instance;
   }

}