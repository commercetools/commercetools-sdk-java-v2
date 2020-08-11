package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.commercetools.api.models.type.TypeResourceIdentifier;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.category.CategorySetAssetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetCustomTypeActionBuilder {
   
   @Nullable
   private String assetId;
   
   @Nullable
   private com.fasterxml.jackson.databind.JsonNode fields;
   
   @Nullable
   private com.commercetools.api.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetCustomTypeActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder fields(@Nullable final com.fasterxml.jackson.databind.JsonNode fields) {
      this.fields = fields;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder type(@Nullable final com.commercetools.api.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.api.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetCustomTypeAction build() {
       return new CategorySetAssetCustomTypeActionImpl(assetId, fields, type, assetKey);
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of() {
      return new CategorySetAssetCustomTypeActionBuilder();
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of(final CategorySetAssetCustomTypeAction template) {
      CategorySetAssetCustomTypeActionBuilder builder = new CategorySetAssetCustomTypeActionBuilder();
      builder.assetId = template.getAssetId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}
