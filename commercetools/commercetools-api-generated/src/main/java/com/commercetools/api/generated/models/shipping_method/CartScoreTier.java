package com.commercetools.api.generated.models.shipping_method;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.shipping_method.PriceFunction;
import com.commercetools.api.generated.models.shipping_method.ShippingRatePriceTier;
import com.commercetools.api.generated.models.shipping_method.ShippingRateTierType;
import com.commercetools.api.generated.models.shipping_method.CartScoreTierImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.*;
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
@JsonDeserialize(as = CartScoreTierImpl.class)
public interface CartScoreTier extends ShippingRatePriceTier {

   
   @NotNull
   @JsonProperty("score")
   public Integer getScore();
   
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   
   @Valid
   @JsonProperty("priceFunction")
   public PriceFunction getPriceFunction();
   
   
   @JsonProperty("isMatching")
   public Boolean getIsMatching();

   public void setScore(final Integer score);
   
   public void setPrice(final Money price);
   
   public void setPriceFunction(final PriceFunction priceFunction);
   
   public void setIsMatching(final Boolean isMatching);
   
   public static CartScoreTierImpl of(){
      return new CartScoreTierImpl();
   }
   

   public static CartScoreTierImpl of(final CartScoreTier template) {
      CartScoreTierImpl instance = new CartScoreTierImpl();
      instance.setScore(template.getScore());
      instance.setPrice(template.getPrice());
      instance.setIsMatching(template.getIsMatching());
      instance.setPriceFunction(template.getPriceFunction());
      return instance;
   }

}