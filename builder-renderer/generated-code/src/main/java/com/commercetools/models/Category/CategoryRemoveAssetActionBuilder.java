package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategoryRemoveAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryRemoveAssetActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategoryRemoveAssetActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategoryRemoveAssetActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
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

   public CategoryRemoveAssetAction build() {
       return new CategoryRemoveAssetActionImpl(assetId, assetKey);
   }
   
   public static CategoryRemoveAssetActionBuilder of() {
      return new CategoryRemoveAssetActionBuilder();
   }
   
   public static CategoryRemoveAssetActionBuilder of(final CategoryRemoveAssetAction template) {
      CategoryRemoveAssetActionBuilder builder = new CategoryRemoveAssetActionBuilder();
      builder.assetId = template.getAssetId();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}