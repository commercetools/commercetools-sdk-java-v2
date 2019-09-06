package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import com.commercetools.models.Product.Attribute;
import java.lang.String;
import com.commercetools.models.Error.DuplicateAttributeValueError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateAttributeValueErrorBuilder {
   
   
   private java.lang.String message;
   
   
   private com.commercetools.models.Product.Attribute attribute;
   
   public DuplicateAttributeValueErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValueErrorBuilder attribute( final com.commercetools.models.Product.Attribute attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.Product.Attribute getAttribute(){
      return this.attribute;
   }

   public DuplicateAttributeValueError build() {
       return new DuplicateAttributeValueErrorImpl(message, attribute);
   }
   
   public static DuplicateAttributeValueErrorBuilder of() {
      return new DuplicateAttributeValueErrorBuilder();
   }
   
   public static DuplicateAttributeValueErrorBuilder of(final DuplicateAttributeValueError template) {
      DuplicateAttributeValueErrorBuilder builder = new DuplicateAttributeValueErrorBuilder();
      builder.message = template.getMessage();
      builder.attribute = template.getAttribute();
      return builder;
   }
   
}