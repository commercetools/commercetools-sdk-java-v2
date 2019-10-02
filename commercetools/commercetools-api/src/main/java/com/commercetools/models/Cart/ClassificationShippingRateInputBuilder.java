package com.commercetools.models.cart;

import com.commercetools.models.cart.ShippingRateInput;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.cart.ClassificationShippingRateInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ClassificationShippingRateInputBuilder {
   
   
   private com.commercetools.models.common.LocalizedString label;
   
   
   private String key;
   
   public ClassificationShippingRateInputBuilder label( final com.commercetools.models.common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public ClassificationShippingRateInputBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public ClassificationShippingRateInput build() {
       return new ClassificationShippingRateInputImpl(label, key);
   }
   
   public static ClassificationShippingRateInputBuilder of() {
      return new ClassificationShippingRateInputBuilder();
   }
   
   public static ClassificationShippingRateInputBuilder of(final ClassificationShippingRateInput template) {
      ClassificationShippingRateInputBuilder builder = new ClassificationShippingRateInputBuilder();
      builder.label = template.getLabel();
      builder.key = template.getKey();
      return builder;
   }
   
}