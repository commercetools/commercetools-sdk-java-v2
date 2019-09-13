package com.commercetools.models.product;

import com.commercetools.models.product.ProductData;
import java.lang.Boolean;
import com.commercetools.models.product.ProductCatalogData;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductCatalogDataBuilder {
   
   
   private com.commercetools.models.product.ProductData current;
   
   
   private com.commercetools.models.product.ProductData staged;
   
   
   private java.lang.Boolean published;
   
   
   private java.lang.Boolean hasStagedChanges;
   
   public ProductCatalogDataBuilder current( final com.commercetools.models.product.ProductData current) {
      this.current = current;
      return this;
   }
   
   public ProductCatalogDataBuilder staged( final com.commercetools.models.product.ProductData staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductCatalogDataBuilder published( final java.lang.Boolean published) {
      this.published = published;
      return this;
   }
   
   public ProductCatalogDataBuilder hasStagedChanges( final java.lang.Boolean hasStagedChanges) {
      this.hasStagedChanges = hasStagedChanges;
      return this;
   }
   
   
   public com.commercetools.models.product.ProductData getCurrent(){
      return this.current;
   }
   
   
   public com.commercetools.models.product.ProductData getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Boolean getPublished(){
      return this.published;
   }
   
   
   public java.lang.Boolean getHasStagedChanges(){
      return this.hasStagedChanges;
   }

   public ProductCatalogData build() {
       return new ProductCatalogDataImpl(current, staged, published, hasStagedChanges);
   }
   
   public static ProductCatalogDataBuilder of() {
      return new ProductCatalogDataBuilder();
   }
   
   public static ProductCatalogDataBuilder of(final ProductCatalogData template) {
      ProductCatalogDataBuilder builder = new ProductCatalogDataBuilder();
      builder.current = template.getCurrent();
      builder.staged = template.getStaged();
      builder.published = template.getPublished();
      builder.hasStagedChanges = template.getHasStagedChanges();
      return builder;
   }
   
}