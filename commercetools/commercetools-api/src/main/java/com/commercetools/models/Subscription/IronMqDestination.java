package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
import java.lang.String;
import com.commercetools.models.Subscription.IronMqDestinationImpl;

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
@JsonDeserialize(as = IronMqDestinationImpl.class)
public interface IronMqDestination extends Destination {

   
   @NotNull
   @JsonProperty("uri")
   public String getUri();

   public void setUri(final String uri);
   
   public static IronMqDestinationImpl of(){
      return new IronMqDestinationImpl();
   }
   

   public static IronMqDestinationImpl of(final IronMqDestination template) {
      IronMqDestinationImpl instance = new IronMqDestinationImpl();
      instance.setUri(template.getUri());
      return instance;
   }

}