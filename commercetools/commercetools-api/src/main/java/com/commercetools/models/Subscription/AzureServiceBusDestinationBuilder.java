package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import java.lang.String;
import com.commercetools.models.subscription.AzureServiceBusDestination;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class AzureServiceBusDestinationBuilder {
   
   
   private java.lang.String connectionString;
   
   public AzureServiceBusDestinationBuilder connectionString( final java.lang.String connectionString) {
      this.connectionString = connectionString;
      return this;
   }
   
   
   public java.lang.String getConnectionString(){
      return this.connectionString;
   }

   public AzureServiceBusDestination build() {
       return new AzureServiceBusDestinationImpl(connectionString);
   }
   
   public static AzureServiceBusDestinationBuilder of() {
      return new AzureServiceBusDestinationBuilder();
   }
   
   public static AzureServiceBusDestinationBuilder of(final AzureServiceBusDestination template) {
      AzureServiceBusDestinationBuilder builder = new AzureServiceBusDestinationBuilder();
      builder.connectionString = template.getConnectionString();
      return builder;
   }
   
}