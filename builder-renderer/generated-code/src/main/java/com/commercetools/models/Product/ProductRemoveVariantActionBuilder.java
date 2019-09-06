package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Boolean;
import java.lang.Long;
import java.lang.String;
import com.commercetools.models.Product.ProductRemoveVariantAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductRemoveVariantActionBuilder {
   
   @Nullable
   private java.lang.Boolean staged;
   
   @Nullable
   private java.lang.Long id;
   
   @Nullable
   private java.lang.String sku;
   
   public ProductRemoveVariantActionBuilder staged(@Nullable final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductRemoveVariantActionBuilder id(@Nullable final java.lang.Long id) {
      this.id = id;
      return this;
   }
   
   public ProductRemoveVariantActionBuilder sku(@Nullable final java.lang.String sku) {
      this.sku = sku;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   @Nullable
   public java.lang.Long getId(){
      return this.id;
   }
   
   @Nullable
   public java.lang.String getSku(){
      return this.sku;
   }

   public ProductRemoveVariantAction build() {
       return new ProductRemoveVariantActionImpl(staged, id, sku);
   }
   
   public static ProductRemoveVariantActionBuilder of() {
      return new ProductRemoveVariantActionBuilder();
   }
   
   public static ProductRemoveVariantActionBuilder of(final ProductRemoveVariantAction template) {
      ProductRemoveVariantActionBuilder builder = new ProductRemoveVariantActionBuilder();
      builder.staged = template.getStaged();
      builder.id = template.getId();
      builder.sku = template.getSku();
      return builder;
   }
   
}