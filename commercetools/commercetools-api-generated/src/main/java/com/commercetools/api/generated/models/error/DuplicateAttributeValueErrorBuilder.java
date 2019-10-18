package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.product.Attribute;
import com.commercetools.api.generated.models.error.DuplicateAttributeValueError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DuplicateAttributeValueErrorBuilder {
   
   
   private String message;
   
   
   private com.commercetools.api.generated.models.product.Attribute attribute;
   
   public DuplicateAttributeValueErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public DuplicateAttributeValueErrorBuilder attribute( final com.commercetools.api.generated.models.product.Attribute attribute) {
      this.attribute = attribute;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   
   public com.commercetools.api.generated.models.product.Attribute getAttribute(){
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