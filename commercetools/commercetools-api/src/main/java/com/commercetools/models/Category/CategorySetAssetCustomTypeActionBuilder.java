package com.commercetools.models.category;

import com.commercetools.models.category.CategoryUpdateAction;
import com.commercetools.models.type.TypeResourceIdentifier;
import java.lang.Object;
import java.lang.String;
import com.commercetools.models.category.CategorySetAssetCustomTypeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategorySetAssetCustomTypeActionBuilder {
   
   @Nullable
   private java.lang.String assetId;
   
   @Nullable
   private java.lang.Object fields;
   
   @Nullable
   private com.commercetools.models.type.TypeResourceIdentifier type;
   
   @Nullable
   private java.lang.String assetKey;
   
   public CategorySetAssetCustomTypeActionBuilder assetId(@Nullable final java.lang.String assetId) {
      this.assetId = assetId;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder fields(@Nullable final java.lang.Object fields) {
      this.fields = fields;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder type(@Nullable final com.commercetools.models.type.TypeResourceIdentifier type) {
      this.type = type;
      return this;
   }
   
   public CategorySetAssetCustomTypeActionBuilder assetKey(@Nullable final java.lang.String assetKey) {
      this.assetKey = assetKey;
      return this;
   }
   
   @Nullable
   public java.lang.String getAssetId(){
      return this.assetId;
   }
   
   @Nullable
   public java.lang.Object getFields(){
      return this.fields;
   }
   
   @Nullable
   public com.commercetools.models.type.TypeResourceIdentifier getType(){
      return this.type;
   }
   
   @Nullable
   public java.lang.String getAssetKey(){
      return this.assetKey;
   }

   public CategorySetAssetCustomTypeAction build() {
       return new CategorySetAssetCustomTypeActionImpl(assetId, fields, type, assetKey);
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of() {
      return new CategorySetAssetCustomTypeActionBuilder();
   }
   
   public static CategorySetAssetCustomTypeActionBuilder of(final CategorySetAssetCustomTypeAction template) {
      CategorySetAssetCustomTypeActionBuilder builder = new CategorySetAssetCustomTypeActionBuilder();
      builder.assetId = template.getAssetId();
      builder.fields = template.getFields();
      builder.type = template.getType();
      builder.assetKey = template.getAssetKey();
      return builder;
   }
   
}