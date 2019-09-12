package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderSetCountryAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderSetCountryActionBuilder {
   
   @Nullable
   private java.lang.String country;
   
   public StagedOrderSetCountryActionBuilder country(@Nullable final java.lang.String country) {
      this.country = country;
      return this;
   }
   
   @Nullable
   public java.lang.String getCountry(){
      return this.country;
   }

   public StagedOrderSetCountryAction build() {
       return new StagedOrderSetCountryActionImpl(country);
   }
   
   public static StagedOrderSetCountryActionBuilder of() {
      return new StagedOrderSetCountryActionBuilder();
   }
   
   public static StagedOrderSetCountryActionBuilder of(final StagedOrderSetCountryAction template) {
      StagedOrderSetCountryActionBuilder builder = new StagedOrderSetCountryActionBuilder();
      builder.country = template.getCountry();
      return builder;
   }
   
}