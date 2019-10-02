package com.commercetools.models.common;

import com.commercetools.models.common.TypedMoney;
import com.commercetools.models.common.PriceTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceTierBuilder {
   
   
   private com.commercetools.models.common.TypedMoney value;
   
   
   private Long minimumQuantity;
   
   public PriceTierBuilder value( final com.commercetools.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   public PriceTierBuilder minimumQuantity( final Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
   }
   
   
   public com.commercetools.models.common.TypedMoney getValue(){
      return this.value;
   }
   
   
   public Long getMinimumQuantity(){
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