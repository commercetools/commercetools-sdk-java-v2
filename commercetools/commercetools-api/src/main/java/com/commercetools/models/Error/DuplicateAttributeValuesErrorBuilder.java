package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Product.Attribute;
import java.lang.String;
import com.commercetools.models.Error.DuplicateAttributeValuesError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateAttributeValuesErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private java.util.List<com.commercetools.models.Product.Attribute> attributes;
   
   public DuplicateAttributeValuesErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValuesErrorBuilder attributes( final java.util.List<com.commercetools.models.Product.Attribute> attributes) {
      this.attributes = attributes;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public java.util.List<com.commercetools.models.Product.Attribute> getAttributes(){
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