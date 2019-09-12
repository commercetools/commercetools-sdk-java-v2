package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import com.commercetools.models.Common.LocalizedString;
import java.lang.String;
import com.commercetools.models.Category.CategorySetAssetDescriptionAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetDescriptionActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private com.commercetools.models.Common.LocalizedString description;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategorySetAssetDescriptionActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetDescriptionActionBuilder description(@Nullable final com.commercetools.models.Common.LocalizedString description) {
      this.description = description;
      return this;
   }
   
   public CategorySetAssetDescriptionActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public com.commercetools.models.Common.LocalizedString getDescription(){
      return this.description;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
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