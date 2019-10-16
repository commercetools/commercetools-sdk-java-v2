package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.SubscriptionUpdateAction;
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
public final class SubscriptionChangeDestinationActionImpl implements SubscriptionChangeDestinationAction {

   private String action;
   
   private com.commercetools.api.generated.models.subscription.Destination destination;

   @JsonCreator
   SubscriptionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.api.generated.models.subscription.Destination destination) {
      this.destination = destination;
      this.action = "changeDestination";
   }
   public SubscriptionChangeDestinationActionImpl() {
      
   }
   
   
   public String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.api.generated.models.subscription.Destination getDestination(){
      return this.destination;
   }

   public void setDestination(final com.commercetools.api.generated.models.subscription.Destination destination){
      this.destination = destination;
   }

}