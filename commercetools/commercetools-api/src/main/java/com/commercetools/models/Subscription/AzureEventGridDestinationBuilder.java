package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import java.lang.String;
import com.commercetools.models.subscription.AzureEventGridDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AzureEventGridDestinationBuilder {
   
   
   private java.lang.String accessKey;
   
   
   private java.lang.String uri;
   
   public AzureEventGridDestinationBuilder accessKey( final java.lang.String accessKey) {
      this.accessKey = accessKey;
      return this;
   }
   
   public AzureEventGridDestinationBuilder uri( final java.lang.String uri) {
      this.uri = uri;
      return this;
   }
   
   
   public java.lang.String getAccessKey(){
      return this.accessKey;
   }
   
   
   public java.lang.String getUri(){
      return this.uri;
   }

   public AzureEventGridDestination build() {
       return new AzureEventGridDestinationImpl(accessKey, uri);
   }
   
   public static AzureEventGridDestinationBuilder of() {
      return new AzureEventGridDestinationBuilder();
   }
   
   public static AzureEventGridDestinationBuilder of(final AzureEventGridDestination template) {
      AzureEventGridDestinationBuilder builder = new AzureEventGridDestinationBuilder();
      builder.accessKey = template.getAccessKey();
      builder.uri = template.getUri();
      return builder;
   }
   
}