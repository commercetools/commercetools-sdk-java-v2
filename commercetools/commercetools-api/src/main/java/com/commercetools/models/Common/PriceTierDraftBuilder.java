package com.commercetools.models.common;

import com.commercetools.models.common.Money;
import com.commercetools.models.common.PriceTierDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class PriceTierDraftBuilder {
   
   
   private com.commercetools.models.common.Money value;
   
   
   private Long minimumQuantity;
   
   public PriceTierDraftBuilder value( final com.commercetools.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   public PriceTierDraftBuilder minimumQuantity( final Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
   }
   
   
   public com.commercetools.models.common.Money getValue(){
      return this.value;
   }
   
   
   public Long getMinimumQuantity(){
      return this.minimumQuantity;
   }

   public PriceTierDraft build() {
       return new PriceTierDraftImpl(value, minimumQuantity);
   }
   
   public static PriceTierDraftBuilder of() {
      return new PriceTierDraftBuilder();
   }
   
   public static PriceTierDraftBuilder of(final PriceTierDraft template) {
      PriceTierDraftBuilder builder = new PriceTierDraftBuilder();
      builder.value = template.getValue();
      builder.minimumQuantity = template.getMinimumQuantity();
      return builder;
   }
   
}