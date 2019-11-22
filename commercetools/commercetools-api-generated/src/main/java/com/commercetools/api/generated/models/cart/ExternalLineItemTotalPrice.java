package com.commercetools.api.generated.models.cart;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.cart.ExternalLineItemTotalPriceImpl;

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
@JsonDeserialize(as = ExternalLineItemTotalPriceImpl.class)
public interface ExternalLineItemTotalPrice  {

   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("price")
   public Money getPrice();
   /**
   	
   */
   @NotNull
   @Valid
   @JsonProperty("totalPrice")
   public Money getTotalPrice();

   public void setPrice(final Money price);
   
   public void setTotalPrice(final Money totalPrice);
   
   public static ExternalLineItemTotalPriceImpl of(){
      return new ExternalLineItemTotalPriceImpl();
   }
   

   public static ExternalLineItemTotalPriceImpl of(final ExternalLineItemTotalPrice template) {
      ExternalLineItemTotalPriceImpl instance = new ExternalLineItemTotalPriceImpl();
      instance.setTotalPrice(template.getTotalPrice());
      instance.setPrice(template.getPrice());
      return instance;
   }

}