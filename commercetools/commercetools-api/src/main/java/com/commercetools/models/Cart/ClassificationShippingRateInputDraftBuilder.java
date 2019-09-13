package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInputDraft;
import java.lang.String;
import com.commercetools.models.cart.ClassificationShippingRateInputDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ClassificationShippingRateInputDraftBuilder {
   
   
   private java.lang.String key;
   
   public ClassificationShippingRateInputDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public ClassificationShippingRateInputDraft build() {
       return new ClassificationShippingRateInputDraftImpl(key);
   }
   
   public static ClassificationShippingRateInputDraftBuilder of() {
      return new ClassificationShippingRateInputDraftBuilder();
   }
   
   public static ClassificationShippingRateInputDraftBuilder of(final ClassificationShippingRateInputDraft template) {
      ClassificationShippingRateInputDraftBuilder builder = new ClassificationShippingRateInputDraftBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}