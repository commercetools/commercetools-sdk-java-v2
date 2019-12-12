package com.commercetools.api.generated.models.custom_object;

import com.commercetools.api.generated.models.common.CreatedBy;
import com.commercetools.api.generated.models.common.LastModifiedBy;
import com.commercetools.api.generated.models.common.LoggedResource;
import java.time.ZonedDateTime;
import com.commercetools.api.generated.models.custom_object.CustomObject;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomObjectBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private String id;
   
   
   private Long version;
   
   @Nullable
   private com.commercetools.api.generated.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy;
   
   
   private String container;
   
   
   private JsonNode value;
   
   
   private String key;
   
   public CustomObjectBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomObjectBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomObjectBuilder id( final String id) {
      this.id = id;
      return this;
   }
   
   public CustomObjectBuilder version( final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomObjectBuilder createdBy(@Nullable final com.commercetools.api.generated.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CustomObjectBuilder lastModifiedBy(@Nullable final com.commercetools.api.generated.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CustomObjectBuilder container( final String container) {
      this.container = container;
      return this;
   }
   
   public CustomObjectBuilder value( final JsonNode value) {
      this.value = value;
      return this;
   }
   
   public CustomObjectBuilder key( final String key) {
      this.key = key;
      return this;
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
   
   @Nullable
   public com.commercetools.api.generated.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public String getContainer(){
      return this.container;
   }
   
   
   public JsonNode getValue(){
      return this.value;
   }
   
   
   public String getKey(){
      return this.key;
   }

   public CustomObject build() {
       return new CustomObjectImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, container, value, key);
   }
   
   public static CustomObjectBuilder of() {
      return new CustomObjectBuilder();
   }
   
   public static CustomObjectBuilder of(final CustomObject template) {
      CustomObjectBuilder builder = new CustomObjectBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.container = template.getContainer();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}