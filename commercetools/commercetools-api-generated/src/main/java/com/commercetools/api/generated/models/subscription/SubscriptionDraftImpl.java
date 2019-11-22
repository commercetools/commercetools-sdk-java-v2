package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import com.commercetools.api.generated.models.subscription.DeliveryFormat;
import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.MessageSubscription;
import io.vrap.rmf.base.client.utils.Generated;
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
public final class SubscriptionDraftImpl implements SubscriptionDraft {

   private com.commercetools.api.generated.models.subscription.DeliveryFormat format;
   
   private com.commercetools.api.generated.models.subscription.Destination destination;
   
   private java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes;
   
   private java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages;
   
   private String key;

   @JsonCreator
   SubscriptionDraftImpl(@JsonProperty("format") final com.commercetools.api.generated.models.subscription.DeliveryFormat format, @JsonProperty("destination") final com.commercetools.api.generated.models.subscription.Destination destination, @JsonProperty("changes") final java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes, @JsonProperty("messages") final java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages, @JsonProperty("key") final String key) {
      this.format = format;
      this.destination = destination;
      this.changes = changes;
      this.messages = messages;
      this.key = key;
   }
   public SubscriptionDraftImpl() {
      
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   /**
   	
   */
   public com.commercetools.api.generated.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   /**
   	
   */
   public java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   /**
   	
   */
   public String getKey(){
      return this.key;
   }

   public void setFormat(final com.commercetools.api.generated.models.subscription.DeliveryFormat format){
      this.format = format;
   }
   
   public void setDestination(final com.commercetools.api.generated.models.subscription.Destination destination){
      this.destination = destination;
   }
   
   public void setChanges(final java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes){
      this.changes = changes;
   }
   
   public void setMessages(final java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages){
      this.messages = messages;
   }
   
   public void setKey(final String key){
      this.key = key;
   }

}