package com.commercetools.api.models.shipping_method;


import com.commercetools.api.models.shipping_method.PriceFunctionImpl;

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
@JsonDeserialize(as = PriceFunctionImpl.class)
public interface PriceFunction  {

   /**
   *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   @NotNull
   @JsonProperty("currencyCode")
   public String getCurrencyCode();

   @NotNull
   @JsonProperty("function")
   public String getFunction();

   public void setCurrencyCode(final String currencyCode);

   public void setFunction(final String function);

   public static PriceFunctionImpl of(){
      return new PriceFunctionImpl();
   }


   public static PriceFunctionImpl of(final PriceFunction template) {
      PriceFunctionImpl instance = new PriceFunctionImpl();
      instance.setFunction(template.getFunction());
      instance.setCurrencyCode(template.getCurrencyCode());
      return instance;
   }

}
