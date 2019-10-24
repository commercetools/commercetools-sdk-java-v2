package com.commercetools.api.generated.models.error;

import com.commercetools.api.generated.models.error.ErrorObject;
import com.commercetools.api.generated.models.error.InsufficientScopeError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InsufficientScopeErrorBuilder {
   
   
   private String message;
   
   public InsufficientScopeErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }
   
   
   public String getMessage(){
      return this.message;
   }

   public InsufficientScopeError build() {
       return new InsufficientScopeErrorImpl(message);
   }
   
   public static InsufficientScopeErrorBuilder of() {
      return new InsufficientScopeErrorBuilder();
   }
   
   public static InsufficientScopeErrorBuilder of(final InsufficientScopeError template) {
      InsufficientScopeErrorBuilder builder = new InsufficientScopeErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }
   
}