package com.commercetools.api.models.category;

import com.commercetools.api.models.category.CategoryUpdateAction;
import com.fasterxml.jackson.databind.JsonNode;
import com.commercetools.api.models.category.CategorySetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetCustomFieldActionBuilder {

   @Nullable
   private String assetId;


   private String name;

   @Nullable
   private com.fasterxml.jackson.databind.JsonNode value;

   @Nullable
   private String assetKey;

   public CategorySetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }

   public CategorySetAssetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }

   public CategorySetAssetCustomFieldActionBuilder value(@Nullable final com.fasterxml.jackson.databind.JsonNode value) {
      this.value = value;
      return this;
   }

   public CategorySetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }

   @Nullable
   public String getAssetId(){
      return this.assetId;
   }


   public String getName(){
      return this.name;
   }

   @Nullable
   public com.fasterxml.jackson.databind.JsonNode getValue(){
      return this.value;
   }

   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetCustomFieldAction build() {
       return new CategorySetAssetCustomFieldActionImpl(assetId, name, value, assetKey);
   }

   public static CategorySetAssetCustomFieldActionBuilder of() {
      return new CategorySetAssetCustomFieldActionBuilder();
   }

   public static CategorySetAssetCustomFieldActionBuilder of(final CategorySetAssetCustomFieldAction template) {
      CategorySetAssetCustomFieldActionBuilder builder = new CategorySetAssetCustomFieldActionBuilder();
      builder.assetId = template.getAssetId();
      builder.name = template.getName();
      builder.value = template.getValue();
      builder.assetKey = template.getAssetKey();
      return builder;
   }

}
