package com.commercetools.api.generated.models.subscription;

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
public final class ResourceUpdatedDeliveryImpl implements ResourceUpdatedDelivery {

   private String projectKey;
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private String notificationType;
   
   private java.time.ZonedDateTime modifiedAt;
   
   private Long oldVersion;
   
   private Long version;

   @JsonCreator
   ResourceUpdatedDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.generated.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers, @JsonProperty("modifiedAt") final java.time.ZonedDateTime modifiedAt, @JsonProperty("oldVersion") final Long oldVersion, @JsonProperty("version") final Long version) {
      this.projectKey = projectKey;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.modifiedAt = modifiedAt;
      this.oldVersion = oldVersion;
      this.version = version;
      this.notificationType = "ResourceUpdated";
   }
   public ResourceUpdatedDeliveryImpl() {
      
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
   
   
   public java.time.ZonedDateTime getModifiedAt(){
      return this.modifiedAt;
   }
   
   
   public Long getOldVersion(){
      return this.oldVersion;
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
   
   public void setModifiedAt(final java.time.ZonedDateTime modifiedAt){
      this.modifiedAt = modifiedAt;
   }
   
   public void setOldVersion(final Long oldVersion){
      this.oldVersion = oldVersion;
   }
   
   public void setVersion(final Long version){
      this.version = version;
   }

}