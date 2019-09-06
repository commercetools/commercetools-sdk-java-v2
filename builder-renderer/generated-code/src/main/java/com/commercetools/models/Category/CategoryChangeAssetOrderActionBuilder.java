package com.commercetools.models.Category;

import com.commercetools.models.Category.CategoryUpdateAction;
import java.lang.String;
import com.commercetools.models.Category.CategoryChangeAssetOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CategoryChangeAssetOrderActionBuilder {
   
   
   private java.util.List<java.lang.String> assetOrder;
   
   public CategoryChangeAssetOrderActionBuilder assetOrder( final java.util.List<java.lang.String> assetOrder) {
      this.assetOrder = assetOrder;
      return this;
   }
   
   
   public java.util.List<java.lang.String> getAssetOrder(){
      return this.assetOrder;
   }

   public CategoryChangeAssetOrderAction build() {
       return new CategoryChangeAssetOrderActionImpl(assetOrder);
   }
   
   public static CategoryChangeAssetOrderActionBuilder of() {
      return new CategoryChangeAssetOrderActionBuilder();
   }
   
   public static CategoryChangeAssetOrderActionBuilder of(final CategoryChangeAssetOrderAction template) {
      CategoryChangeAssetOrderActionBuilder builder = new CategoryChangeAssetOrderActionBuilder();
      builder.assetOrder = template.getAssetOrder();
      return builder;
   }
   
}