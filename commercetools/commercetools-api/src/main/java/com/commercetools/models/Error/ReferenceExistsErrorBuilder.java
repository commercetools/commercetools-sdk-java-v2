package com.commercetools.models.error;

import com.commercetools.models.common.ReferenceTypeId;
import com.commercetools.models.error.ErrorObject;
import java.lang.String;
import com.commercetools.models.error.ReferenceExistsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ReferenceExistsErrorBuilder {
   
   
   private java.lang.String message;
   
   @Nullable
   private com.commercetools.models.common.ReferenceTypeId referencedBy;
   
   public ReferenceExistsErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   public ReferenceExistsErrorBuilder referencedBy(@Nullable final com.commercetools.models.common.ReferenceTypeId referencedBy) {
      this.referencedBy = referencedBy;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }
   
   @Nullable
   public com.commercetools.models.common.ReferenceTypeId getReferencedBy(){
      return this.referencedBy;
   }

   public ReferenceExistsError build() {
       return new ReferenceExistsErrorImpl(message, referencedBy);
   }
   
   public static ReferenceExistsErrorBuilder of() {
      return new ReferenceExistsErrorBuilder();
   }
   
   public static ReferenceExistsErrorBuilder of(final ReferenceExistsError template) {
      ReferenceExistsErrorBuilder builder = new ReferenceExistsErrorBuilder();
      builder.message = template.getMessage();
      builder.referencedBy = template.getReferencedBy();
      return builder;
   }
   
}