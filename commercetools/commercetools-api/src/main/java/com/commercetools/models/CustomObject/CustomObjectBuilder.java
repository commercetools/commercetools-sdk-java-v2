package com.commercetools.models.CustomObject;

import com.commercetools.models.Common.BaseResource;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.CustomObject.CustomObject;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectBuilder {
   
   
   private java.time.ZonedDateTime createdAt;
   
   
   private java.time.ZonedDateTime lastModifiedAt;
   
   
   private java.lang.String id;
   
   
   private java.lang.Long version;
   
   
   private java.lang.String container;
   
   
   private java.lang.Object value;
   
   
   private java.lang.String key;
   
   public CustomObjectBuilder createdAt( final java.time.ZonedDateTime createdAt) {
      this.createdAt = createdAt;
      return this;
   }
   
   public CustomObjectBuilder lastModifiedAt( final java.time.ZonedDateTime lastModifiedAt) {
      this.lastModifiedAt = lastModifiedAt;
      return this;
   }
   
   public CustomObjectBuilder id( final java.lang.String id) {
      this.id = id;
      return this;
   }
   
   public CustomObjectBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomObjectBuilder container( final java.lang.String container) {
      this.container = container;
      return this;
   }
   
   public CustomObjectBuilder value( final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   public CustomObjectBuilder key( final java.lang.String key) {
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
   
   
   public java.lang.String getContainer(){
      return this.container;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomObject build() {
       return new CustomObjectImpl(createdAt, lastModifiedAt, id, version, container, value, key);
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
      builder.container = template.getContainer();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}