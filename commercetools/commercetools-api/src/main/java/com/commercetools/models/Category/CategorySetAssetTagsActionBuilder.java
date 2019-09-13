package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.category.CategorySetAssetTagsAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetTagsActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.String assetKey;
   
   @Nullable
   private java.util.List<java.lang.String> tags;
   
   public CategorySetAssetTagsActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetTagsActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   public CategorySetAssetTagsActionBuilder tags(@Nullable final java.util.List<java.lang.String> tags) {
      this.tags = tags;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }
   
   @Nullable
   public java.util.List<java.lang.String> getTags(){
      return this.tags;
   }

   public CategorySetAssetTagsAction build() {
       return new CategorySetAssetTagsActionImpl(assetId, assetKey, tags);
   }
   
   public static CategorySetAssetTagsActionBuilder of() {
      return new CategorySetAssetTagsActionBuilder();
   }
   
   public static CategorySetAssetTagsActionBuilder of(final CategorySetAssetTagsAction template) {
      CategorySetAssetTagsActionBuilder builder = new CategorySetAssetTagsActionBuilder();
      builder.assetId = template.getAssetId();
      builder.assetKey = template.getAssetKey();
      builder.tags = template.getTags();
      return builder;
   }
   
}