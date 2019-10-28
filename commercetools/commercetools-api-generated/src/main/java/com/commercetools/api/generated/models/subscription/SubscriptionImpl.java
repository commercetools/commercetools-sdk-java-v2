package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.common.LoggedResource;
import com.commercetools.api.generated.models.subscription.ChangeSubscription;
import com.commercetools.api.generated.models.subscription.DeliveryFormat;
import com.commercetools.api.generated.models.subscription.Destination;
import com.commercetools.api.generated.models.subscription.MessageSubscription;
import com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus;
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
public final class SubscriptionImpl implements Subscription {

   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private String id;
   
   private Long version;
   
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   private com.commercetools.api.generated.models.subscription.DeliveryFormat format;
   
   private com.commercetools.api.generated.models.subscription.Destination destination;
   
   private java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes;
   
   private java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages;
   
   private String key;
   
   private com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus status;

   @JsonCreator
   SubscriptionImpl(@JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("id") final String id, @JsonProperty("version") final Long version, @JsonProperty("createdBy") final com.commercetools.api.generated.models.common.CreatedBy createdBy, @JsonProperty("lastModifiedBy") final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy, @JsonProperty("format") final com.commercetools.api.generated.models.subscription.DeliveryFormat format, @JsonProperty("destination") final com.commercetools.api.generated.models.subscription.Destination destination, @JsonProperty("changes") final java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> changes, @JsonProperty("messages") final java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> messages, @JsonProperty("key") final String key, @JsonProperty("status") final com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus status) {
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
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }
   
   
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.api.generated.models.subscription.DeliveryFormat getFormat(){
      return this.format;
   }
   
   
   public com.commercetools.api.generated.models.subscription.Destination getDestination(){
      return this.destination;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.ChangeSubscription> getChanges(){
      return this.changes;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.subscription.MessageSubscription> getMessages(){
      return this.messages;
   }
   
   
   public String getKey(){
      return this.key;
   }
   
   
   public com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus getStatus(){
      return this.status;
   }

   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }
   
   public void setCreatedBy(final com.commercetools.api.generated.models.common.CreatedBy createdBy){
      this.createdBy = createdBy;
   }
   
   public void setLastModifiedBy(final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy){
      this.lastModifiedBy = lastModifiedBy;
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
   
   public void setStatus(final com.commercetools.api.generated.models.subscription.SubscriptionHealthStatus status){
      this.status = status;
   }

}