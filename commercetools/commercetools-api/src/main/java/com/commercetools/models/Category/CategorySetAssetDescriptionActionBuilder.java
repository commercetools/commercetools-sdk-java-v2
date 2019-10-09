package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.common.LocalizedString;
import com.commercetools.models.category.CategorySetAssetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetDescriptionActionBuilder {
   
   @Nullable
   private String assetId;
   
   @Nullable
   private com.commercetools.models.common.LocalizedString description;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetDescriptionActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetDescriptionActionBuilder description(@Nullable final com.commercetools.models.common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CategorySetAssetDescriptionActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public com.commercetools.models.common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetDescriptionAction build() {
       return new CategorySetAssetDescriptionActionImpl(assetId, description, assetKey);
   }
   
   public static CategorySetAssetDescriptionActionBuilder of() {
      return new CategorySetAssetDescriptionActionBuilder();
   }
   
   public static CategorySetAssetDescriptionActionBuilder of(final CategorySetAssetDescriptionAction template) {
      CategorySetAssetDescriptionActionBuilder builder = new CategorySetAssetDescriptionActionBuilder();
      builder.assetId = template.getAssetId();
      builder.description = template.getDescription();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}