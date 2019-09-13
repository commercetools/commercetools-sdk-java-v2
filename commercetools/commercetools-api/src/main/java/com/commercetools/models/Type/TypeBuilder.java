package com.commercetools.models.type;

import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.FieldDefinition;
import com.commercetools.models.type.ResourceTypeId;
import java.lang.String;
import com.commercetools.models.type.Type;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class TypeBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   
   private com.commercetools.models.common.LocalizedString name;
   
   
   private java.util.List<com.commercetools.models.type.FieldDefinition> fieldDefinitions;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   
   private java.lang.String key;
   
   
   private java.util.List<com.commercetools.models.type.ResourceTypeId> resourceTypeIds;
   
   public TypeBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public TypeBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public TypeBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public TypeBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public TypeBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public TypeBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public TypeBuilder name( final com.commercetools.models.common.LocalizedString name) {
      this.name = name;
      return this;
   }
   
   public TypeBuilder fieldDefinitions( final java.util.List<com.commercetools.models.type.FieldDefinition> fieldDefinitions) {
      this.fieldDefinitions = fieldDefinitions;
      return this;
   }
   
   public TypeBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public TypeBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   public TypeBuilder resourceTypeIds( final java.util.List<com.commercetools.models.type.ResourceTypeId> resourceTypeIds) {
      this.resourceTypeIds = resourceTypeIds;
      return this;
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
   
   @Nullable
   public com.commercetools.models.common.CreatedBy getCreatedBy(){
      return this.createdBy;
   }
   
   @Nullable
   public com.commercetools.models.common.LastModifiedBy getLastModifiedBy(){
      return this.lastModifiedBy;
   }
   
   
   public com.commercetools.models.common.LocalizedString getName(){
      return this.name;
   }
   
   
   public java.util.List<com.commercetools.models.type.FieldDefinition> getFieldDefinitions(){
      return this.fieldDefinitions;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }
   
   
   public java.util.List<com.commercetools.models.type.ResourceTypeId> getResourceTypeIds(){
      return this.resourceTypeIds;
   }

   public Type build() {
       return new TypeImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, name, fieldDefinitions, description, key, resourceTypeIds);
   }
   
   public static TypeBuilder of() {
      return new TypeBuilder();
   }
   
   public static TypeBuilder of(final Type template) {
      TypeBuilder builder = new TypeBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.name = template.getName();
      builder.fieldDefinitions = template.getFieldDefinitions();
      builder.description = template.getDescription();
      builder.key = template.getKey();
      builder.resourceTypeIds = template.getResourceTypeIds();
      return builder;
   }
   
}