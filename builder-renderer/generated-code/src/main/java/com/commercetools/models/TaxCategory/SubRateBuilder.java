package com.commercetools.models.TaxCategory;

import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.TaxCategory.SubRate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class SubRateBuilder {
   
   
   private java.lang.Integer amount;
   
   
   private java.lang.String name;
   
   public SubRateBuilder amount( final java.lang.Integer amount) {
      this.amount = amount;
      return this;
   }
   
   public SubRateBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   
   public java.lang.Integer getAmount(){
      return this.amount;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }

   public SubRate build() {
       return new SubRateImpl(amount, name);
   }
   
   public static SubRateBuilder of() {
      return new SubRateBuilder();
   }
   
   public static SubRateBuilder of(final SubRate template) {
      SubRateBuilder builder = new SubRateBuilder();
      builder.amount = template.getAmount();
      builder.name = template.getName();
      return builder;
   }
   
}