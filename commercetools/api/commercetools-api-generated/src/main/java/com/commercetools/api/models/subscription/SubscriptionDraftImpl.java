package com.commercetools.api.models.subscription;

import com.commercetools.api.models.subscription.ChangeSubscription;
import com.commercetools.api.models.subscription.DeliveryFormat;
import com.commercetools.api.models.subscription.Destination;
import com.commercetools.api.models.subscription.MessageSubscription;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionDraftImpl implements SubscriptionDraft {

   private java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes;
   
   private com.commercetools.api.models.subscription.Destination destination;
   
   private String key;
   
   private java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages;
   
   private com.commercetools.api.models.subscription.DeliveryFormat format;

   @JsonCreator
   SubscriptionDraftImpl(@JsonProperty("changes") final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes, @JsonProperty("destination") final com.commercetools.api.models.subscription.Destination destination, @JsonProperty("key") final String key, @JsonProperty("messages") final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages, @JsonProperty("format") final com.commercetools.api.models.subscription.DeliveryFormat format) {
      this.changes = changes;
      this.destination = destination;
      this.key = key;
      this.messages = messages;
      this.format = format;
   }
   public SubscriptionDraftImpl() {
      
   }
   
   
   public java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public com.commercetools.api.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.api.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   
   public com.commercetools.api.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }

   public void setChanges(final java.util.List<com.commercetools.api.models.subscription.ChangeSubscription> changes){
      this.changes = changes;
   }
   
   public void setDestination(final com.commercetools.api.models.subscription.Destination destination){
      this.destination = destination;
   }
   
   public void setKey(final String key){
      this.key = key;
   }
   
   public void setMessages(final java.util.List<com.commercetools.api.models.subscription.MessageSubscription> messages){
      this.messages = messages;
   }
   
   public void setFormat(final com.commercetools.api.models.subscription.DeliveryFormat format){
      this.format = format;
   }

}
