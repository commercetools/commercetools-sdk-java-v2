package com.commercetools.models.Error;

import com.commercetools.models.Error.ErrorObject;
import java.lang.String;
import com.commercetools.models.Error.ResourceNotFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ResourceNotFoundErrorBuilder {
   
   
   private java.lang.String message;
   
   public ResourceNotFoundErrorBuilder message( final java.lang.String message) {
      this.message = message;
      return this;
   }
   
   
   public java.lang.String getMessage(){
      return this.message;
   }

   public ResourceNotFoundError build() {
       return new ResourceNotFoundErrorImpl(message);
   }
   
   public static ResourceNotFoundErrorBuilder of() {
      return new ResourceNotFoundErrorBuilder();
   }
   
   public static ResourceNotFoundErrorBuilder of(final ResourceNotFoundError template) {
      ResourceNotFoundErrorBuilder builder = new ResourceNotFoundErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}