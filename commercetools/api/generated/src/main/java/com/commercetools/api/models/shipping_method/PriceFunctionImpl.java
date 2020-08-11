package com.commercetools.api.models.shipping_method;


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
public final class PriceFunctionImpl implements PriceFunction {

   private String function;

   private String currencyCode;

   @JsonCreator
   PriceFunctionImpl(@JsonProperty("function") final String function, @JsonProperty("currencyCode") final String currencyCode) {
      this.function = function;
      this.currencyCode = currencyCode;
   }
   public PriceFunctionImpl() {

   }


   public String getFunction(){
      return this.function;
   }

   /**
   *  <p>The currency code compliant to <a href="https://en.wikipedia.org/wiki/ISO_4217">ISO 4217</a>.</p>
   */
   public String getCurrencyCode(){
      return this.currencyCode;
   }

   public void setFunction(final String function){
      this.function = function;
   }

   public void setCurrencyCode(final String currencyCode){
      this.currencyCode = currencyCode;
   }

}
