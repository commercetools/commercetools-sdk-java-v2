package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountUpdateAction;
import java.lang.Long;
import com.commercetools.models.product_discount.ProductDiscountUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ProductDiscountUpdateBuilder actions( final java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProductDiscountUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.product_discount.ProductDiscountUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ProductDiscountUpdate build() {
       return new ProductDiscountUpdateImpl(actions, version);
   }
   
   public static ProductDiscountUpdateBuilder of() {
      return new ProductDiscountUpdateBuilder();
   }
   
   public static ProductDiscountUpdateBuilder of(final ProductDiscountUpdate template) {
      ProductDiscountUpdateBuilder builder = new ProductDiscountUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}