package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.PayloadNotIncluded;
import com.commercetools.api.generated.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
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
public final class MessageDeliveryImpl implements MessageDelivery {

   private String projectKey;
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private String notificationType;
   
   private Long sequenceNumber;
   
   private java.time.ZonedDateTime createdAt;
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   private Long resourceVersion;
   
   private com.commercetools.api.generated.models.subscription.PayloadNotIncluded payloadNotIncluded;
   
   private String id;
   
   private Long version;

   @JsonCreator
   MessageDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.generated.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("sequenceNumber") final Long sequenceNumber, @JsonProperty("createdAt") final java.time.ZonedDateTime createdAt, @JsonProperty("lastModifiedAt") final java.time.ZonedDateTime lastModifiedAt, @JsonProperty("resourceVersion") final Long resourceVersion, @JsonProperty("payloadNotIncluded") final com.commercetools.api.generated.models.subscription.PayloadNotIncluded payloadNotIncluded, @JsonProperty("id") final String id, @JsonProperty("version") final Long version) {
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
   
   
   public String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public String getNotificationType(){
      return this.notificationType;
   }
   
   
   public Long getSequenceNumber(){
      return this.sequenceNumber;
   }
   
   
   public java.time.ZonedDateTime getCreatedAt(){
      return this.createdAt;
   }
   
   
   public java.time.ZonedDateTime getLastModifiedAt(){
      return this.lastModifiedAt;
   }
   
   
   public Long getResourceVersion(){
      return this.resourceVersion;
   }
   
   
   public com.commercetools.api.generated.models.subscription.PayloadNotIncluded getPayloadNotIncluded(){
      return this.payloadNotIncluded;
   }
   
   
   public String getId(){
      return this.id;
   }
   
   
   public Long getVersion(){
      return this.version;
   }

   public void setProjectKey(final String projectKey){
      this.projectKey = projectKey;
   }
   
   public void setResource(final com.commercetools.api.generated.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }
   
   public void setSequenceNumber(final Long sequenceNumber){
      this.sequenceNumber = sequenceNumber;
   }
   
   public void setCreatedAt(final java.time.ZonedDateTime createdAt){
      this.createdAt = createdAt;
   }
   
   public void setLastModifiedAt(final java.time.ZonedDateTime lastModifiedAt){
      this.lastModifiedAt = lastModifiedAt;
   }
   
   public void setResourceVersion(final Long resourceVersion){
      this.resourceVersion = resourceVersion;
   }
   
   public void setPayloadNotIncluded(final com.commercetools.api.generated.models.subscription.PayloadNotIncluded payloadNotIncluded){
      this.payloadNotIncluded = payloadNotIncluded;
   }
   
   public void setId(final String id){
      this.id = id;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}