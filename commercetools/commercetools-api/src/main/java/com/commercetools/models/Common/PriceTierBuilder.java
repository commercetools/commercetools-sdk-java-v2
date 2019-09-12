package com.commercetools.models.Common;

import com.commercetools.models.Common.Money;
import java.lang.Long;
import com.commercetools.models.Common.PriceTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceTierBuilder {
   
   
   private com.commercetools.models.Common.Money value;
   
   
   private java.lang.Long minimumQuantity;
   
   public PriceTierBuilder value( final com.commercetools.models.Common.Money value) {
      this.value = value;
      return this;
   }
   
   public PriceTierBuilder minimumQuantity( final java.lang.Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
      return this.value;
   }
   
   
   public java.lang.Long getMinimumQuantity(){
      return this.minimumQuantity;
   }

   public PriceTier build() {
       return new PriceTierImpl(value, minimumQuantity);
   }
   
   public static PriceTierBuilder of() {
      return new PriceTierBuilder();
   }
   
   public static PriceTierBuilder of(final PriceTier template) {
      PriceTierBuilder builder = new PriceTierBuilder();
      builder.value = template.getValue();
      builder.minimumQuantity = template.getMinimumQuantity();
      return builder;
   }
   
}