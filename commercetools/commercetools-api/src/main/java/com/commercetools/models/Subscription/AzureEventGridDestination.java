package com.commercetools.models.subscription;

import com.commercetools.models.subscription.Destination;
import com.commercetools.models.subscription.AzureEventGridDestinationImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import javax.annotation.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = AzureEventGridDestinationImpl.class)
public interface AzureEventGridDestination extends Destination {

   
   @NotNull
   @JsonProperty("uri")
   public String getUri();
   
   @NotNull
   @JsonProperty("accessKey")
   public String getAccessKey();

   public void setUri(final String uri);
   
   public void setAccessKey(final String accessKey);
   
   public static AzureEventGridDestinationImpl of(){
      return new AzureEventGridDestinationImpl();
   }
   

   public static AzureEventGridDestinationImpl of(final AzureEventGridDestination template) {
      AzureEventGridDestinationImpl instance = new AzureEventGridDestinationImpl();
      instance.setAccessKey(template.getAccessKey());
      instance.setUri(template.getUri());
      return instance;
   }

}