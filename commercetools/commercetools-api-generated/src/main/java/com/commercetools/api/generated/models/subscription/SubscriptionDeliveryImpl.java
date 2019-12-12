package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.common.Reference;
import com.commercetools.api.generated.models.message.UserProvidedIdentifiers;
import com.commercetools.api.generated.models.subscription.MessageDelivery;
import com.commercetools.api.generated.models.subscription.ResourceCreatedDelivery;
import com.commercetools.api.generated.models.subscription.ResourceDeletedDelivery;
import com.commercetools.api.generated.models.subscription.ResourceUpdatedDelivery;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.List;
import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.*;
import com.fasterxml.jackson.databind.annotation.*;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;


@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class SubscriptionDeliveryImpl implements SubscriptionDelivery {

   private String projectKey;
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   private String notificationType;

   @JsonCreator
   SubscriptionDeliveryImpl(@JsonProperty("projectKey") final String projectKey, @JsonProperty("resource") final com.commercetools.api.generated.models.common.Reference resource, @JsonProperty("resourceUserProvidedIdentifiers") final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.projectKey = projectKey;
      this.resource = resource;
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      this.notificationType = "null";
   }
   public SubscriptionDeliveryImpl() {
      
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

   public void setProjectKey(final String projectKey){
      this.projectKey = projectKey;
   }
   
   public void setResource(final com.commercetools.api.generated.models.common.Reference resource){
      this.resource = resource;
   }
   
   public void setResourceUserProvidedIdentifiers(final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers){
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
   }

}