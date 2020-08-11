package com.commercetools.api.models.error;

import com.commercetools.api.models.error.ErrorObject;
import com.commercetools.api.models.error.InvalidCredentialsError;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class InvalidCredentialsErrorBuilder {


   private String message;

   public InvalidCredentialsErrorBuilder message( final String message) {
      this.message = message;
      return this;
   }


   public String getMessage(){
      return this.message;
   }

   public InvalidCredentialsError build() {
       return new InvalidCredentialsErrorImpl(message);
   }

   public static InvalidCredentialsErrorBuilder of() {
      return new InvalidCredentialsErrorBuilder();
   }

   public static InvalidCredentialsErrorBuilder of(final InvalidCredentialsError template) {
      InvalidCredentialsErrorBuilder builder = new InvalidCredentialsErrorBuilder();
      builder.message = template.getMessage();
      return builder;
   }

}
