package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.error.DuplicateAttributeValuesError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateAttributeValuesErrorBuilder {
   
   
   private String message;
   
   
   private java.util.List<com.commercetools.models.product.Attribute> attributes;
   
   public DuplicateAttributeValuesErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValuesErrorBuilder attributes( final java.util.List<com.commercetools.models.product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.product.Attribute> getAttributes(){
      return this.attributes;
   }

   public DuplicateAttributeValuesError build() {
       return new DuplicateAttributeValuesErrorImpl(message, attributes);
   }
   
   public static DuplicateAttributeValuesErrorBuilder of() {
      return new DuplicateAttributeValuesErrorBuilder();
   }
   
   public static DuplicateAttributeValuesErrorBuilder of(final DuplicateAttributeValuesError template) {
      DuplicateAttributeValuesErrorBuilder builder = new DuplicateAttributeValuesErrorBuilder();
      builder.message = template.getMessage();
      builder.attributes = template.getAttributes();
      return builder;
   }
   
}