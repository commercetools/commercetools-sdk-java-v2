package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.category.CategorySetAssetCustomFieldAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetCustomFieldActionBuilder {
   
   @Nullable
   private String assetId;
   
   
   private String name;
   
   @Nullable
   private Object value;
   
   @Nullable
   private String assetKey;
   
   public CategorySetAssetCustomFieldActionBuilder assetId(@Nullable final String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder name( final String name) {
      this.name = name;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder value(@Nullable final Object value) {
      this.value = value;
      return this;
   }
   
   public CategorySetAssetCustomFieldActionBuilder assetKey(@Nullable final String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public String getAssetId(){
      return this.assetId;
   }
   
   
   public String getName(){
      return this.name;
   }
   
   @Nullable
   public Object getValue(){
      return this.value;
   }
   
   @Nullable
   public String getAssetKey(){
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