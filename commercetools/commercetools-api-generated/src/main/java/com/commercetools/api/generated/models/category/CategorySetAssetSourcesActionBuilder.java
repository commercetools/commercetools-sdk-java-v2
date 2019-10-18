package com.commercetools.api.generated.models.category;

import com.commercetools.api.generated.models.category.CategoryUpdateAction;
import com.commercetools.api.generated.models.common.AssetSource;
import com.commercetools.api.generated.models.category.CategorySetAssetSourcesAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CategorySetAssetSourcesActionBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources;
   
   @Nullable
   private String assetId;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetSourcesActionBuilder sources( final java.util.List<com.commercetools.api.generated.models.common.AssetSource> sources) {
      this.sources = sources;
      return this;
   }
   
   public CategorySetAssetSourcesActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetSourcesActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.AssetSource> getSources(){
      return this.sources;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public String getAssetKey(){
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