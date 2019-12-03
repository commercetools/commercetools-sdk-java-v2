package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.ResourceDeletionError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceDeletionErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private Object resource;
   
   public ResourceDeletionErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ResourceDeletionErrorBuilder resource(@Nullable final Object resource) {
      this.resource = resource;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }
   
   @Nullable
   public Object getResource(){
      return this.resource;
   }

   public ResourceDeletionError build() {
       return new ResourceDeletionErrorImpl(message, resource);
   }
   
   public static ResourceDeletionErrorBuilder of() {
      return new ResourceDeletionErrorBuilder();
   }
   
   public static ResourceDeletionErrorBuilder of(final ResourceDeletionError template) {
      ResourceDeletionErrorBuilder builder = new ResourceDeletionErrorBuilder();
      builder.message = template.getMessage();
      builder.resource = template.getResource();
      return builder;
   }
   
}