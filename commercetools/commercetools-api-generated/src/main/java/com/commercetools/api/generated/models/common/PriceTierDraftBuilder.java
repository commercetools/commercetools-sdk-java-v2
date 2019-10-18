package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.common.PriceTierDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class PriceTierDraftBuilder {
   
   
   private com.commercetools.api.generated.models.common.Money value;
   
   
   private Long minimumQuantity;
   
   public PriceTierDraftBuilder value( final com.commercetools.api.generated.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   public PriceTierDraftBuilder minimumQuantity( final Long minimumQuantity) {
      this.minimumQuantity = minimumQuantity;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
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