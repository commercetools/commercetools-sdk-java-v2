package com.commercetools.models.Subscription;

import com.commercetools.models.Subscription.SubscriptionDelivery;
import java.lang.Long;
import java.lang.String;
import java.time.ZonedDateTime;
import com.commercetools.models.Subscription.ResourceUpdatedDelivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ResourceUpdatedDeliveryBuilder {
   
   
   private java.lang.String projectKey;
   
   
   private com.commercetools.models.Common.Reference resource;
   
   @Nullable
   private com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.time.ZonedDateTime modifiedAt;
   
   
   private java.lang.Long oldVersion;
   
   
   private java.lang.Long version;
   
   public ResourceUpdatedDeliveryBuilder projectKey( final java.lang.String projectKey) {
      this.projectKey = projectKey;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder resource( final com.commercetools.models.Common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.models.Message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder modifiedAt( final java.time.ZonedDateTime modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder oldVersion( final java.lang.Long oldVersion) {
      this.oldVersion = oldVersion;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.lang.String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.models.Common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.models.Message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
   }
   
   
   public java.time.ZonedDateTime getModifiedAt(){
      return this.modifiedAt;
   }
   
   
   public java.lang.Long getOldVersion(){
      return this.oldVersion;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ResourceUpdatedDelivery build() {
       return new ResourceUpdatedDeliveryImpl(projectKey, resource, resourceUserProvidedIdentifiers, modifiedAt, oldVersion, version);
   }
   
   public static ResourceUpdatedDeliveryBuilder of() {
      return new ResourceUpdatedDeliveryBuilder();
   }
   
   public static ResourceUpdatedDeliveryBuilder of(final ResourceUpdatedDelivery template) {
      ResourceUpdatedDeliveryBuilder builder = new ResourceUpdatedDeliveryBuilder();
      builder.projectKey = template.getProjectKey();
      builder.resource = template.getResource();
      builder.resourceUserProvidedIdentifiers = template.getResourceUserProvidedIdentifiers();
      builder.modifiedAt = template.getModifiedAt();
      builder.oldVersion = template.getOldVersion();
      builder.version = template.getVersion();
      return builder;
   }
   
}