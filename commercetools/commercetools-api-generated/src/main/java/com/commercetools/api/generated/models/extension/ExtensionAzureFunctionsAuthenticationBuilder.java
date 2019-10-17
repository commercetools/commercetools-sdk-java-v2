package com.commercetools.api.generated.models.extension;

import com.commercetools.api.generated.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.api.generated.models.extension.ExtensionAzureFunctionsAuthentication;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionAzureFunctionsAuthenticationBuilder {
   
   
   private String key;
   
   public ExtensionAzureFunctionsAuthenticationBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public ExtensionAzureFunctionsAuthentication build() {
       return new ExtensionAzureFunctionsAuthenticationImpl(key);
   }
   
   public static ExtensionAzureFunctionsAuthenticationBuilder of() {
      return new ExtensionAzureFunctionsAuthenticationBuilder();
   }
   
   public static ExtensionAzureFunctionsAuthenticationBuilder of(final ExtensionAzureFunctionsAuthentication template) {
      ExtensionAzureFunctionsAuthenticationBuilder builder = new ExtensionAzureFunctionsAuthenticationBuilder();
      builder.key = template.getKey();
      return builder;
   }
   
}