package com.commercetools.models.subscription;

import com.commercetools.models.subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.subscription.ResourceDeletedDelivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ResourceDeletedDeliveryBuilder {
   
   
   private java.lang.String projectKey;
   
   
   private com.commercetools.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.time.ZonedDateTime modifiedAt;
   
   
   private java.lang.Long version;
   
   public ResourceDeletedDeliveryBuilder projectKey( final java.lang.String projectKey) {
      this.projectKey = projectKey;
      return this;
   }
   
   public ResourceDeletedDeliveryBuilder resource( final com.commercetools.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ResourceDeletedDeliveryBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ResourceDeletedDeliveryBuilder modifiedAt( final java.time.ZonedDateTime modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
   }
   
   public ResourceDeletedDeliveryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.time.ZonedDateTime getModifiedAt(){
      return this.modifiedAt;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ResourceDeletedDelivery build() {
       return new ResourceDeletedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, modifiedAt, version);
   }
   
   public static ResourceDeletedDeliveryBuilder of() {
      return new ResourceDeletedDeliveryBuilder();
   }
   
   public static ResourceDeletedDeliveryBuilder of(final ResourceDeletedDelivery template) {
      ResourceDeletedDeliveryBuilder builder = new ResourceDeletedDeliveryBuilder();
      builder.projectKey = template.getProjectKey();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.modifiedAt = template.getModifiedAt();
      builder.version = template.getVersion();
      return builder;
   }
   
}