package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.IronMqDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class IronMqDestinationBuilder {
   
   
   private String uri;
   
   public IronMqDestinationBuilder uri( final String uri) {
      this.uri = uri;
      return this;
   }
   
   
   public String getUri(){
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