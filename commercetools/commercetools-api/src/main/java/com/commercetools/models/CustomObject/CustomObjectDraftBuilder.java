package com.commercetools.models.CustomObject;

import java.lang.Long;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.CustomObject.CustomObjectDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectDraftBuilder {
   
   
   private java.lang.String container;
   
   @Nullable
   private java.lang.Long version;
   
   
   private java.lang.Object value;
   
   
   private java.lang.String key;
   
   public CustomObjectDraftBuilder container( final java.lang.String container) {
      this.container = container;
      return this;
   }
   
   public CustomObjectDraftBuilder version(@Nullable final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   public CustomObjectDraftBuilder value( final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   public CustomObjectDraftBuilder key( final java.lang.String key) {
      this.key = key;
      return this;
   }
   
   
   public java.lang.String getContainer(){
      return this.container;
   }
   
   @Nullable
   public java.lang.Long getVersion(){
      return this.version;
   }
   
   
   public java.lang.Object getValue(){
      return this.value;
   }
   
   
   public java.lang.String getKey(){
      return this.key;
   }

   public CustomObjectDraft build() {
       return new CustomObjectDraftImpl(container, version, value, key);
   }
   
   public static CustomObjectDraftBuilder of() {
      return new CustomObjectDraftBuilder();
   }
   
   public static CustomObjectDraftBuilder of(final CustomObjectDraft template) {
      CustomObjectDraftBuilder builder = new CustomObjectDraftBuilder();
      builder.container = template.getContainer();
      builder.version = template.getVersion();
      builder.value = template.getValue();
      builder.key = template.getKey();
      return builder;
   }
   
}