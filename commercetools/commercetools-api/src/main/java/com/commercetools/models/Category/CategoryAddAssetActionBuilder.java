package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.AssetDraft;
import com.commercetools.models.category.CategoryAddAssetAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryAddAssetActionBuilder {
   
   @Nullable
   private Integer position;
   
   
   private com.commercetools.models.common.AssetDraft asset;
   
   public CategoryAddAssetActionBuilder position(@Nullable final Integer position) {
      this.position = position;
      return this;
   }
   
   public CategoryAddAssetActionBuilder asset( final com.commercetools.models.common.AssetDraft asset) {
      this.asset = asset;
      return this;
   }
   
   @Nullable
   public Integer getPosition(){
      return this.position;
   }
   
   
   public com.commercetools.models.common.AssetDraft getAsset(){
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