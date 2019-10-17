package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class AzureServiceBusDestinationImpl implements AzureServiceBusDestination {

   private String type;
   
   private String connectionString;

   @JsonCreator
   AzureServiceBusDestinationImpl(@JsonProperty("connectionString") final String connectionString) {
      this.connectionString = connectionString;
      this.type = "AzureServiceBus";
   }
   public AzureServiceBusDestinationImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getConnectionString(){
      return this.connectionString;
   }

   public void setConnectionString(final String connectionString){
      this.connectionString = connectionString;
   }

}