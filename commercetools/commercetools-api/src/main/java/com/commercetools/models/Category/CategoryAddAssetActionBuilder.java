package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.AssetDraft;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.Category.CategoryAddAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryAddAssetActionBuilder {
   
   @Nullable
   private java.lang.Integer position;
   
   
   private com.commercetools.models.Common.AssetDraft asset;
   
   public CategoryAddAssetActionBuilder position(@Nullable final java.lang.Integer position) {
      this.position = position;
      return this;
   }
   
   public CategoryAddAssetActionBuilder asset( final com.commercetools.models.Common.AssetDraft asset) {
      this.asset = asset;
      return this;
   }
   
   @Nullable
   public java.lang.Integer getPosition(){
      return this.position;
   }
   
   
   public com.commercetools.models.Common.AssetDraft getAsset(){
      return this.asset;
   }

   public CategoryAddAssetAction build() {
       return new CategoryAddAssetActionImpl(position, asset);
   }
   
   public static CategoryAddAssetActionBuilder of() {
      return new CategoryAddAssetActionBuilder();
   }
   
   public static CategoryAddAssetActionBuilder of(final CategoryAddAssetAction template) {
      CategoryAddAssetActionBuilder builder = new CategoryAddAssetActionBuilder();
      builder.position = template.getPosition();
      builder.asset = template.getAsset();
      return builder;
   }
   
}