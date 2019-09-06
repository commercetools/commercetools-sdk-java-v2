package com.commercetools.models.Subscription;

import com.commercetools.models.Common.LoggedResource;
import com.commercetools.models.Subscription.ChangeSubscription;
import com.commercetools.models.Subscription.DeliveryFormat;
import com.commercetools.models.Subscription.Destination;
import com.commercetools.models.Subscription.MessageSubscription;
import com.commercetools.models.Subscription.SubscriptionHealthStatus;
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
public final class SubscriptionImpl implements Subscription {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.String id;
   
   private java.lang.Long version;
   
   private com.commercetools.models.Common.CreatedBy createdBy;
   
   private com.commercetools.models.Common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.models.Subscription.DeliveryFormat format;
   
   private com.commercetools.models.Subscription.Destination destination;
   
   private java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes;
   
   private java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages;
   
   private java.lang.String key;
   
   private com.commercetools.models.Subscription.SubscriptionHealthStatus status;

   @JsonCreator
   SubscriptionImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version, @JsonProperty("createdBy") final com.commercetools.models.Common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.models.Common.LastModifiedBy lastModifiedBy, @JsonProperty("format") final com.commercetools.models.Subscription.DeliveryFormat format, @JsonProperty("destination") final com.commercetools.models.Subscription.Destination destination, @JsonProperty("changes") final java.util.List<com.commercetools.models.Subscription.ChangeSubscription> changes, @JsonProperty("messages") final java.util.List<com.commercetools.models.Subscription.MessageSubscription> messages, @JsonProperty("key") final java.lang.String key, @JsonProperty("status") final com.commercetools.models.Subscription.SubscriptionHealthStatus status) {
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.id = id;
      this.version = version;
      this.createdBy = createdBy;
      this.lastModifiedBy = lastModifiedBy;
      this.format = format;
      this.destination = destination;
      this.changes = changes;
      this.messages = messages;
      this.key = key;
      this.status = status;
   }
   public SubscriptionImpl() {
      
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.models.Common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.models.Common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
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
   
   
   public com.commercetools.models.Subscription.SubscriptionHealthStatus getStatus(){
      return this.status;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.models.Common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.models.Common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
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
   
   public void setStatus(final com.commercetools.models.Subscription.SubscriptionHealthStatus status){
      this.status = status;
   }

}