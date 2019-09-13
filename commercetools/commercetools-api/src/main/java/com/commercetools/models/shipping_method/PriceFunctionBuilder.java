package com.commercetools.models.shipping_method;

import java.lang.String;
import com.commercetools.models.shipping_method.PriceFunction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceFunctionBuilder {
   
   
   private java.lang.String function;
   
   
   private java.lang.String currencyCode;
   
   public PriceFunctionBuilder function( final java.lang.String function) {
      this.function = function;
      return this;
   }
   
   public PriceFunctionBuilder currencyCode( final java.lang.String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public java.lang.String getFunction(){
      return this.function;
   }
   
   
   public java.lang.String getCurrencyCode(){
      return this.currencyCode;
   }

   public PriceFunction build() {
       return new PriceFunctionImpl(function, currencyCode);
   }
   
   public static PriceFunctionBuilder of() {
      return new PriceFunctionBuilder();
   }
   
   public static PriceFunctionBuilder of(final PriceFunction template) {
      PriceFunctionBuilder builder = new PriceFunctionBuilder();
      builder.function = template.getFunction();
      builder.currencyCode = template.getCurrencyCode();
      return builder;
   }
   
}