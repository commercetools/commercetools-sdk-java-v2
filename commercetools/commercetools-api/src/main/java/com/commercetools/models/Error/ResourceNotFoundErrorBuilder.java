package com.commercetools.models.error;

import com.commercetools.models.error.ErrorObject;
import com.commercetools.models.error.ResourceNotFoundError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ResourceNotFoundErrorBuilder {
   
   
   private String message;
   
   public ResourceNotFoundErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
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