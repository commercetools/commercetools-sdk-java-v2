package com.commercetools.api.generated.models.custom_object;


import com.commercetools.api.generated.models.custom_object.CustomObjectDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomObjectDraftBuilder {
   
   
   private String container;
   
   @Nullable
   private Long version;
   
   
   private Object value;
   
   
   private String key;
   
   public CustomObjectDraftBuilder container( final String container) {
      this.container = container;
      return this;
   }
   
   public CustomObjectDraftBuilder version(@Nullable final Long version) {
      this.version = version;
      return this;
   }
   
   public CustomObjectDraftBuilder value( final Object value) {
      this.value = value;
      return this;
   }
   
   public CustomObjectDraftBuilder key( final String key) {
      this.key = key;
      return this;
   }
   
   
   public String getContainer(){
      return this.container;
   }
   
   @Nullable
   public Long getVersion(){
      return this.version;
   }
   
   
   public Object getValue(){
      return this.value;
   }
   
   
   public String getKey(){
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