package com.commercetools.models.product_discount;

import com.commercetools.models.common.Price;
import java.lang.Boolean;
import java.lang.Integer;
import java.lang.String;
import com.commercetools.models.product_discount.ProductDiscountMatchQuery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountMatchQueryBuilder {
   
   
   private java.lang.String productId;
   
   
   private com.commercetools.models.common.Price price;
   
   
   private java.lang.Boolean staged;
   
   
   private java.lang.Integer variantId;
   
   public ProductDiscountMatchQueryBuilder productId( final java.lang.String productId) {
      this.productId = productId;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder price( final com.commercetools.models.common.Price price) {
      this.price = price;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder staged( final java.lang.Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder variantId( final java.lang.Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public java.lang.String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public java.lang.Boolean getStaged(){
      return this.staged;
   }
   
   
   public java.lang.Integer getVariantId(){
      return this.variantId;
   }

   public ProductDiscountMatchQuery build() {
       return new ProductDiscountMatchQueryImpl(productId, price, staged, variantId);
   }
   
   public static ProductDiscountMatchQueryBuilder of() {
      return new ProductDiscountMatchQueryBuilder();
   }
   
   public static ProductDiscountMatchQueryBuilder of(final ProductDiscountMatchQuery template) {
      ProductDiscountMatchQueryBuilder builder = new ProductDiscountMatchQueryBuilder();
      builder.productId = template.getProductId();
      builder.price = template.getPrice();
      builder.staged = template.getStaged();
      builder.variantId = template.getVariantId();
      return builder;
   }
   
}