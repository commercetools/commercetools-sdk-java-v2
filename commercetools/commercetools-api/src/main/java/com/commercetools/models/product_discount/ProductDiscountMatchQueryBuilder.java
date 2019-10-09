package com.commercetools.models.product_discount;

import com.commercetools.models.common.Price;
import com.commercetools.models.product_discount.ProductDiscountMatchQuery;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountMatchQueryBuilder {
   
   
   private String productId;
   
   
   private com.commercetools.models.common.Price price;
   
   
   private Boolean staged;
   
   
   private Integer variantId;
   
   public ProductDiscountMatchQueryBuilder productId( final String productId) {
      this.productId = productId;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder price( final com.commercetools.models.common.Price price) {
      this.price = price;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder staged( final Boolean staged) {
      this.staged = staged;
      return this;
   }
   
   public ProductDiscountMatchQueryBuilder variantId( final Integer variantId) {
      this.variantId = variantId;
      return this;
   }
   
   
   public String getProductId(){
      return this.productId;
   }
   
   
   public com.commercetools.models.common.Price getPrice(){
      return this.price;
   }
   
   
   public Boolean getStaged(){
      return this.staged;
   }
   
   
   public Integer getVariantId(){
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