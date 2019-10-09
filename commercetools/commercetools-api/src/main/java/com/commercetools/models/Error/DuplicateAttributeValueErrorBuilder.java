package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.product.Attribute;
import com.commercetools.models.error.DuplicateAttributeValueError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DuplicateAttributeValueErrorBuilder {
   
   
   private String message;
   
   
   private com.commercetools.models.product.Attribute attribute;
   
   public DuplicateAttributeValueErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValueErrorBuilder attribute( final com.commercetools.models.product.Attribute attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.models.product.Attribute getAttribute(){
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