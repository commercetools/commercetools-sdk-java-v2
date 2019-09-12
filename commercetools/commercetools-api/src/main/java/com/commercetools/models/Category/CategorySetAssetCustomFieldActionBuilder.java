package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.Category.CategorySetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetCustomFieldActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   
   private java.lang.String name;
   
   @Nullable
   private java.lang.Object value;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategorySetAssetCustomFieldActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder name( final java.lang.String name) {
      this.name = name;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder value(@Nullable final java.lang.Object value) {
      this.value = value;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   
   public java.lang.String getName(){
      return this.name;
   }
   
   @Nullable
   public java.lang.Object getValue(){
      return this.value;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
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