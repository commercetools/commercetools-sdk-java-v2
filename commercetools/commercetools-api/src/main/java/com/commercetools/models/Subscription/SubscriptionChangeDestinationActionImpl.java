package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.Destination;
import com.commercetools.models.Subscription.SubscriptionUpdateAction;
import java.lang.String;
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

   private java.lang.String action;
   
   private com.commercetools.models.Subscription.Destination destination;

   @JsonCreator
   SubscriptionChangeDestinationActionImpl(@JsonProperty("destination") final com.commercetools.models.Subscription.Destination destination) {
      this.destination = destination;
      this.action = "changeDestination";
   }
   public SubscriptionChangeDestinationActionImpl() {
      
   }
   
   
   public java.lang.String getAction(){
      return this.action;
   }
   
   
   public com.commercetools.models.Subscription.Destination getDestination(){
      return this.destination;
   }

   public void setDestination(final com.commercetools.models.Subscription.Destination destination){
      this.destination = destination;
   }

}