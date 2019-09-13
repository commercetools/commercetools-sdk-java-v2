package com.commercetools.models.subscription;

import com.commercetools.models.subscription.PayloadNotIncluded;
import com.commercetools.models.subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
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
public final class MessageDeliveryImpl implements MessageDelivery {

   private java.lang.String projectKey;
   
   private com.commercetools.models.common.Reference resource;
   
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private java.lang.String notificationType;
   
   private java.lang.Long sequenceNumber;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private java.lang.Long resourceVersion;
   
   private com.commercetools.models.subscription.PayloadNotIncluded payloadNotIncluded;
   
   private java.lang.String id;
   
   private java.lang.Long version;

   @JsonCreator
   MessageDeliveryImpl(@JsonProperty("projectKey") final java.lang.String projectKey, @JsonProperty("resource") final com.commercetools.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("sequenceNumber") final java.lang.Long sequenceNumber, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("resourceVersion") final java.lang.Long resourceVersion, @JsonProperty("payloadNotIncluded") final com.commercetools.models.subscription.PayloadNotIncluded payloadNotIncluded, @JsonProperty("id") final java.lang.String id, @JsonProperty("version") final java.lang.Long version) {
      this.projectKey = projectKey;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.sequenceNumber = sequenceNumber;
      this.createdAt = createdAt;
      this.lastModifiedAt = lastModifiedAt;
      this.resourceVersion = resourceVersion;
      this.payloadNotIncluded = payloadNotIncluded;
      this.id = id;
      this.version = version;
      this.notificationType = "Message";
   }
   public MessageDeliveryImpl() {
      
   }
   
   
   public java.lang.String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.lang.String getNotificationType(){
      return this.notificationType;
   }
   
   
   public java.lang.Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public java.lang.Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.models.subscription.PayloadNotIncluded getPayloadNotIncluded(){
      return this.payloadNotIncluded;
   }
   
   
   public java.lang.String getId(){
      return this.id;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public void setProjectKey(final java.lang.String projectKey){
      this.projectKey = projectKey;
   }
   
   public void setResource(final com.commercetools.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setSequenceNumber(final java.lang.Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setResourceVersion(final java.lang.Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setPayloadNotIncluded(final com.commercetools.models.subscription.PayloadNotIncluded payloadNotIncluded){
      this.payloadNotIncluded = payloadNotIncluded;
   }
   
   public void setId(final java.lang.String id){
      this.id = id;
   }
   
   public void setVersion(final java.lang.Long version){
      this.version = version;
   }

}