package com.commercetools.models.extension;

import com.commercetools.models.extension.ExtensionDestination;
import com.commercetools.models.extension.ExtensionHttpDestinationAuthentication;
import com.commercetools.models.extension.ExtensionHttpDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionHttpDestinationBuilder {
   
   
   private String url;
   
   @Nullable
   private com.commercetools.models.extension.ExtensionHttpDestinationAuthentication authentication;
   
   public ExtensionHttpDestinationBuilder url( final String url) {
      this.url = url;
      return this;
   }
   
   public ExtensionHttpDestinationBuilder authentication(@Nullable final com.commercetools.models.extension.ExtensionHttpDestinationAuthentication authentication) {
      this.authentication = authentication;
      return this;
   }
   
   
   public String getUrl(){
      return this.url;
   }
   
   @Nullable
   public com.commercetools.models.extension.ExtensionHttpDestinationAuthentication getAuthentication(){
      return this.authentication;
   }

   public ExtensionHttpDestination build() {
       return new ExtensionHttpDestinationImpl(url, authentication);
   }
   
   public static ExtensionHttpDestinationBuilder of() {
      return new ExtensionHttpDestinationBuilder();
   }
   
   public static ExtensionHttpDestinationBuilder of(final ExtensionHttpDestination template) {
      ExtensionHttpDestinationBuilder builder = new ExtensionHttpDestinationBuilder();
      builder.url = template.getUrl();
      builder.authentication = template.getAuthentication();
      return builder;
   }
   
}