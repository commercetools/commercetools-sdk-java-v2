package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
import java.lang.String;
import com.commercetools.models.Subscription.IronMqDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class IronMqDestinationBuilder {
   
   
   private java.lang.String uri;
   
   public IronMqDestinationBuilder uri( final java.lang.String uri) {
      this.uri = uri;
      return this;
   }
   
   
   public java.lang.String getUri(){
      return this.uri;
   }

   public IronMqDestination build() {
       return new IronMqDestinationImpl(uri);
   }
   
   public static IronMqDestinationBuilder of() {
      return new IronMqDestinationBuilder();
   }
   
   public static IronMqDestinationBuilder of(final IronMqDestination template) {
      IronMqDestinationBuilder builder = new IronMqDestinationBuilder();
      builder.uri = template.getUri();
      return builder;
   }
   
}