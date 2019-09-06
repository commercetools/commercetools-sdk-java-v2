package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.ChangeSubscription;
import com.commercetools.models.Subscription.DeliveryFormat;
import com.commercetools.models.Subscription.Destination;
import com.commercetools.models.Subscription.MessageSubscription;
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

import json.CommercetoolsJsonUtils;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionDraftImpl implements SubscriptionDraft {

   private com.commercetools.models.Subscription.DeliveryFormat format;
   
   private com.commercetools.models.Subscription.Destination destination;
   
   private java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes;
   
   private java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages;
   
   private java.lang.String key;

   @JsonCreator
   SubscriptionDraftImpl(@JsonProperty("format") final com.commercetools.models.Subscription.DeliveryFormat format, @JsonProperty("destination") final com.commercetools.models.Subscription.Destination destination, @JsonProperty("changes") final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes, @JsonProperty("messages") final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages, @JsonProperty("key") final java.lang.String key) {
      this.format = format;
      this.destination = destination;
      this.changes = changes;
      this.messages = messages;
      this.key = key;
   }
   public SubscriptionDraftImpl() {
      
   }
   
   
   public com.commercetools.models.Subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.models.Subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.models.Subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public java.util.List<com.commercetools.models.Subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public void setFormat(final com.commercetools.models.Subscription.DeliveryFormat format){
      this.format = format;
   }
   
   public void setDestination(final com.commercetools.models.Subscription.Destination destination){
      this.destination = destination;
   }
   
   public void setChanges(final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes){
      this.changes = changes;
   }
   
   public void setMessages(final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages){
      this.messages = messages;
   }
   
   public void setKey(final java.lang.String key){
      this.key = key;
   }

}