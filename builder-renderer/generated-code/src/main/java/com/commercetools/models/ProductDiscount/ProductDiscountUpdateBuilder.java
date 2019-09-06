package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.Long;
import com.commercetools.models.ProductDiscount.ProductDiscountUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ProductDiscountUpdateBuilder actions( final java.util.List<com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProductDiscountUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction> getActions(){
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