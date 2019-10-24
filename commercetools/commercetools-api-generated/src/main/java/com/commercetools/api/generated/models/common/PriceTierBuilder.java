package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.common.PriceTier;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceTierBuilder {
   
   
   private com.commercetools.api.generated.models.common.TypedMoney value;
   
   
   private Long minimumQuantity;
   
   public PriceTierBuilder value( final com.commercetools.api.generated.models.common.TypedMoney value) {
      this.value = value;
      return this;
   }
   
   public PriceTierBuilder minimumQuantity( final Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.TypedMoney getValue(){
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