package com.commercetools.importer.models.errors;

import com.commercetools.importer.models.errors.ErrorObject;
import com.commercetools.importer.models.errors.ResourceUpdateError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceUpdateErrorBuilder {
   
   
   private String message;
   
   @Nullable
   private Object resource;
   
   public ResourceUpdateErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   public ResourceUpdateErrorBuilder resource(@Nullable final Object resource) {
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

   public ResourceUpdateError build() {
       return new ResourceUpdateErrorImpl(message, resource);
   }
   
   public static ResourceUpdateErrorBuilder of() {
      return new ResourceUpdateErrorBuilder();
   }
   
   public static ResourceUpdateErrorBuilder of(final ResourceUpdateError template) {
      ResourceUpdateErrorBuilder builder = new ResourceUpdateErrorBuilder();
      builder.message = template.getMessage();
      builder.resource = template.getResource();
      return builder;
   }
   
}