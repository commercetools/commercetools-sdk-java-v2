package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.AssetSource;
import java.lang.String;
import com.commercetools.models.Category.CategorySetAssetSourcesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetSourcesActionBuilder {
   
   
   private java.util.List<com.commercetools.models.Common.AssetSource> sources;
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategorySetAssetSourcesActionBuilder sources( final java.util.List<com.commercetools.models.Common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public CategorySetAssetSourcesActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetSourcesActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Common.AssetSource> getSources(){
      return this.sources;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetSourcesAction build() {
       return new CategorySetAssetSourcesActionImpl(sources, assetId, assetKey);
   }
   
   public static CategorySetAssetSourcesActionBuilder of() {
      return new CategorySetAssetSourcesActionBuilder();
   }
   
   public static CategorySetAssetSourcesActionBuilder of(final CategorySetAssetSourcesAction template) {
      CategorySetAssetSourcesActionBuilder builder = new CategorySetAssetSourcesActionBuilder();
      builder.sources = template.getSources();
      builder.assetId = template.getAssetId();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}