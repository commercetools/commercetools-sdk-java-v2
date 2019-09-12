package com.commercetools.models.Project;

import com.commercetools.models.Project.ShippingRateInputType;
import com.commercetools.models.ShippingMethod.ShippingRateTierType;
import com.commercetools.models.Type.CustomFieldLocalizedEnumValue;
import com.commercetools.models.Project.CartClassificationType;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartClassificationTypeBuilder {
   
   
   private java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values;
   
   public CartClassificationTypeBuilder values( final java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> values) {
      this.values = values;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Type.CustomFieldLocalizedEnumValue> getValues(){
      return this.values;
   }

   public CartClassificationType build() {
       return new CartClassificationTypeImpl(values);
   }
   
   public static CartClassificationTypeBuilder of() {
      return new CartClassificationTypeBuilder();
   }
   
   public static CartClassificationTypeBuilder of(final CartClassificationType template) {
      CartClassificationTypeBuilder builder = new CartClassificationTypeBuilder();
      builder.values = template.getValues();
      return builder;
   }
   
}