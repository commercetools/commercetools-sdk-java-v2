package com.commercetools.api.models.custom_object;

import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.custom_object.CustomObjectDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomObjectDraftBuilder {


   private String container;

   @Nullable
   private Long version;


   private com.fasterxml.jackson.databind.JsonNode value;


   private String key;

   public CustomObjectDraftBuilder container( final String container) {
      this.container = container;
      return this;
   }

   public CustomObjectDraftBuilder version(@Nullable final Long version) {
      this.version = version;
      return this;
   }

   public CustomObjectDraftBuilder value( final com.fasterxml.jackson.databind.JsonNode value) {
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


   public com.fasterxml.jackson.databind.JsonNode getValue(){
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
