package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.api.generated.models.extension.ExtensionAuthorizationHeaderAuthentication;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ExtensionAuthorizationHeaderAuthenticationBuilder {
   
   
   private String headerValue;
   
   public ExtensionAuthorizationHeaderAuthenticationBuilder headerValue( final String headerValue) {
      this.headerValue = headerValue;
      return this;
   }
   
   
   public String getHeaderValue(){
      return this.headerValue;
   }

   public ExtensionAuthorizationHeaderAuthentication build() {
       return new ExtensionAuthorizationHeaderAuthenticationImpl(headerValue);
   }
   
   public static ExtensionAuthorizationHeaderAuthenticationBuilder of() {
      return new ExtensionAuthorizationHeaderAuthenticationBuilder();
   }
   
   public static ExtensionAuthorizationHeaderAuthenticationBuilder of(final ExtensionAuthorizationHeaderAuthentication template) {
      ExtensionAuthorizationHeaderAuthenticationBuilder builder = new ExtensionAuthorizationHeaderAuthenticationBuilder();
      builder.headerValue = template.getHeaderValue();
      return builder;
   }
   
}