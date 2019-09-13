package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.category.CategorySetAssetKeyAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetKeyActionBuilder {
   
   
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategorySetAssetKeyActionBuilder assetId( final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetKeyActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetKeyAction build() {
       return new CategorySetAssetKeyActionImpl(assetId, assetKey);
   }
   
   public static CategorySetAssetKeyActionBuilder of() {
      return new CategorySetAssetKeyActionBuilder();
   }
   
   public static CategorySetAssetKeyActionBuilder of(final CategorySetAssetKeyAction template) {
      CategorySetAssetKeyActionBuilder builder = new CategorySetAssetKeyActionBuilder();
      builder.assetId = template.getAssetId();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}