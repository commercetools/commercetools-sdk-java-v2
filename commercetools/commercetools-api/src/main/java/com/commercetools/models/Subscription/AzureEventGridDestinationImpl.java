package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
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
public final class AzureEventGridDestinationImpl implements AzureEventGridDestination {

   private String type;
   
   private String accessKey;
   
   private String uri;

   @JsonCreator
   AzureEventGridDestinationImpl(@JsonProperty("accessKey") final String accessKey, @JsonProperty("uri") final String uri) {
      this.accessKey = accessKey;
      this.uri = uri;
      this.type = "EventGrid";
   }
   public AzureEventGridDestinationImpl() {
      
   }
   
   
   public String getType(){
      return this.type;
   }
   
   
   public String getAccessKey(){
      return this.accessKey;
   }
   
   
   public String getUri(){
      return this.uri;
   }

   public void setAccessKey(final String accessKey){
      this.accessKey = accessKey;
   }
   
   public void setUri(final String uri){
      this.uri = uri;
   }

}