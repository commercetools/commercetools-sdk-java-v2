package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
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

   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("price")
   public TypedMoney getPrice();
   /**
   	<p>The shipping is free if the order total (the sum of line item prices) exceeds the <code>freeAbove</code> value.
   	Note: <code>freeAbove</code> applies before any Cart or Product discounts, and can cause discounts to apply in invalid scenarios.
   	Use a Cart Discount to set the shipping price to 0 to avoid providing free shipping in invalid discount scenarios.</p>
   */
   @Valid
   @JsonProperty("freeAbove")
   public TypedMoney getFreeAbove();
   /**
   	<p>Only appears in response to requests for shipping methods by cart or location to mark this shipping rate as one that matches the cart or location.</p>
   */
   
   @JsonProperty("isMatching")
   public Boolean getIsMatching();
   /**
   	<p>A list of shipping rate price tiers.</p>
   */
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