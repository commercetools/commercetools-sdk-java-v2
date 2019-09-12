package com.commercetools.models.Cart;

import com.commercetools.models.Cart.ShippingRateInput;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Cart.ClassificationShippingRateInput;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ClassificationShippingRateInputBuilder {
   
   
   private com.commercetools.models.Common.LocalizedString label;
   
   
   private java.lang.String key;
   
   public ClassificationShippingRateInputBuilder label( final com.commercetools.models.Common.LocalizedString label) {
      this.label = label;
      return this;
   }
   
   public ClassificationShippingRateInputBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public com.commercetools.models.Common.LocalizedString getLabel(){
      return this.label;
   }
   
   
   public java.lang.String getKey(){
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