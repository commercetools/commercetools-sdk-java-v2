package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateImpl;

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
@JsonDeserialize(as = ShippingRateImpl.class)
public interface ShippingRate  {

   
   @NotNull
   @Valid
   @JsonProperty("price")
   public TypedMoney getPrice();
   
   @Valid
   @JsonProperty("freeAbove")
   public TypedMoney getFreeAbove();
   
   
   @JsonProperty("isMatching")
   public Boolean getIsMatching();
   
   @NotNull
   @Valid
   @JsonProperty("tiers")
   public List<ShippingRatePriceTier> getTiers();

   public void setPrice(final TypedMoney price);
   
   public void setFreeAbove(final TypedMoney freeAbove);
   
   public void setIsMatching(final Boolean isMatching);
   
   public void setTiers(final List<ShippingRatePriceTier> tiers);
   
   public static ShippingRateImpl of(){
      return new ShippingRateImpl();
   }
   

   public static ShippingRateImpl of(final ShippingRate template) {
      ShippingRateImpl instance = new ShippingRateImpl();
      instance.setTiers(template.getTiers());
      instance.setPrice(template.getPrice());
      instance.setFreeAbove(template.getFreeAbove());
      instance.setIsMatching(template.getIsMatching());
      return instance;
   }

}