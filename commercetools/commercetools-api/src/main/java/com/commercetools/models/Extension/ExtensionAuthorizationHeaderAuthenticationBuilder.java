package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionAuthorizationHeaderAuthentication;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionAuthorizationHeaderAuthenticationBuilder {
   
   
   private java.lang.String headerValue;
   
   public ExtensionAuthorizationHeaderAuthenticationBuilder headerValue( final java.lang.String headerValue) {
      this.headerValue = headerValue;
      return this;
   }
   
   
   public java.lang.String getHeaderValue(){
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