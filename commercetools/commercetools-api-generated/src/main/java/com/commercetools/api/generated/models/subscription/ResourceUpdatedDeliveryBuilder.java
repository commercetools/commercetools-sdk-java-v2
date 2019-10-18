package com.commercetools.api.generated.models.subscription;

import com.commercetools.api.generated.models.subscription.SubscriptionDelivery;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.subscription.ResourceUpdatedDelivery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ResourceUpdatedDeliveryBuilder {
   
   
   private String projectKey;
   
   
   private com.commercetools.api.generated.models.common.Reference resource;
   
   @Nullable
   private com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers;
   
   
   private java.time.ZonedDateTime modifiedAt;
   
   
   private Long oldVersion;
   
   
   private Long version;
   
   public ResourceUpdatedDeliveryBuilder projectKey( final String projectKey) {
      this.projectKey = projectKey;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder resource( final com.commercetools.api.generated.models.common.Reference resource) {
      this.resource = resource;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder resourceUserProvidedIdentifiers(@Nullable final com.commercetools.api.generated.models.message.UserProvidedIdentifiers resourceUserProvidedIdentifiers) {
      this.resourceUserProvidedIdentifiers = resourceUserProvidedIdentifiers;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder modifiedAt( final java.time.ZonedDateTime modifiedAt) {
      this.modifiedAt = modifiedAt;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder oldVersion( final Long oldVersion) {
      this.oldVersion = oldVersion;
      return this;
   }
   
   public ResourceUpdatedDeliveryBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   
   public String getProjectKey(){
      return this.projectKey;
   }
   
   
   public com.commercetools.api.generated.models.common.Reference getResource(){
      return this.resource;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.message.UserProvidedIdentifiers getResourceUserProvidedIdentifiers(){
      return this.resourceUserProvidedIdentifiers;
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