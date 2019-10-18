package com.commercetools.api.generated.models.shipping_method;


import com.commercetools.api.generated.models.shipping_method.PriceFunction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceFunctionBuilder {
   
   
   private String function;
   
   
   private String currencyCode;
   
   public PriceFunctionBuilder function( final String function) {
      this.function = function;
      return this;
   }
   
   public PriceFunctionBuilder currencyCode( final String currencyCode) {
      this.currencyCode = currencyCode;
      return this;
   }
   
   
   public String getFunction(){
      return this.function;
   }
   
   
   public String getCurrencyCode(){
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