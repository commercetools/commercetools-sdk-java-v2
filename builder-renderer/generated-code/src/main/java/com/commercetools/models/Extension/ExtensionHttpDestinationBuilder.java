package com.commercetools.models.Extension;

import com.commercetools.models.Extension.ExtensionDestination;
import com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication;
import java.lang.String;
import com.commercetools.models.Extension.ExtensionHttpDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ExtensionHttpDestinationBuilder {
   
   
   private java.lang.String url;
   
   @Nullable
   private com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication authentication;
   
   public ExtensionHttpDestinationBuilder url( final java.lang.String url) {
      this.url = url;
      return this;
   }
   
   public ExtensionHttpDestinationBuilder authentication(@Nullable final com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication authentication) {
      this.authentication = authentication;
      return this;
   }
   
   
   public java.lang.String getUrl(){
      return this.url;
   }
   
   @Nullable
   public com.commercetools.models.Extension.ExtensionHttpDestinationAuthentication getAuthentication(){
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