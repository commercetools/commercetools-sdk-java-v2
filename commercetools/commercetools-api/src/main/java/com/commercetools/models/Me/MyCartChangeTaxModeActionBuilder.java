package com.commercetools.models.Me;

import com.commercetools.models.Cart.TaxMode;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartChangeTaxModeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartChangeTaxModeActionBuilder {
   
   
   private com.commercetools.models.Cart.TaxMode taxMode;
   
   public MyCartChangeTaxModeActionBuilder taxMode( final com.commercetools.models.Cart.TaxMode taxMode) {
      this.taxMode = taxMode;
      return this;
   }
   
   
   public com.commercetools.models.Cart.TaxMode getTaxMode(){
      return this.taxMode;
   }

   public MyCartChangeTaxModeAction build() {
       return new MyCartChangeTaxModeActionImpl(taxMode);
   }
   
   public static MyCartChangeTaxModeActionBuilder of() {
      return new MyCartChangeTaxModeActionBuilder();
   }
   
   public static MyCartChangeTaxModeActionBuilder of(final MyCartChangeTaxModeAction template) {
      MyCartChangeTaxModeActionBuilder builder = new MyCartChangeTaxModeActionBuilder();
      builder.taxMode = template.getTaxMode();
      return builder;
   }
   
}