package com.commercetools.models.customer_group;

import com.commercetools.models.common.LoggedResource;
import com.commercetools.models.type.CustomFields;
import java.lang.String;
import com.commercetools.models.customer_group.CustomerGroup;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerGroupBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   @Nullable
   private com.commercetools.models.common.CreatedBy createdBy;
   
   @Nullable
   private com.commercetools.models.common.LastModifiedBy lastModifiedBy;
   
   @Nullable
   private com.commercetools.models.type.CustomFields custom;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.String key;
   
   public CustomerGroupBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomerGroupBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomerGroupBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomerGroupBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomerGroupBuilder createdBy(@Nullable final com.commercetools.models.common.CreatedBy createdBy) {
      this.createdBy = createdBy;
      return this;
   }
   
   public CustomerGroupBuilder lastModifiedBy(@Nullable final com.commercetools.models.common.LastModifiedBy lastModifiedBy) {
      this.lastModifiedBy = lastModifiedBy;
      return this;
   }
   
   public CustomerGroupBuilder custom(@Nullable final com.commercetools.models.type.CustomFields custom) {
      this.custom = custom;
      return this;
   }
   
   public CustomerGroupBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CustomerGroupBuilder key(@Nullable final java.lang.String key) {
      this.key = key;
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
   
   @Nullable
   public com.commercetools.models.type.CustomFields getCustom(){
      return this.custom;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomerGroup build() {
       return new CustomerGroupImpl(createdAt, lastModifiedAt, id, version, createdBy, lastModifiedBy, custom, name, key);
   }
   
   public static CustomerGroupBuilder of() {
      return new CustomerGroupBuilder();
   }
   
   public static CustomerGroupBuilder of(final CustomerGroup template) {
      CustomerGroupBuilder builder = new CustomerGroupBuilder();
      builder.createdAt = template.getCreatedAt();
      builder.lastModifiedAt = template.getLastModifiedAt();
      builder.id = template.getId();
      builder.version = template.getVersion();
      builder.createdBy = template.getCreatedBy();
      builder.lastModifiedBy = template.getLastModifiedBy();
      builder.custom = template.getCustom();
      builder.name = template.getName();
      builder.key = template.getKey();
      return builder;
   }
   
}