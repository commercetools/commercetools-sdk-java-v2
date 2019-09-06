package com.commercetools.models.Product;

import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.Long;
import com.commercetools.models.Product.ProductUpdate;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductUpdateBuilder {
   
   
   private java.util.List<com.commercetools.models.Product.ProductUpdateAction> actions;
   
   
   private java.lang.Long version;
   
   public ProductUpdateBuilder actions( final java.util.List<com.commercetools.models.Product.ProductUpdateAction> actions) {
      this.actions = actions;
      return this;
   }
   
   public ProductUpdateBuilder version( final java.lang.Long version) {
      this.version = version;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Product.ProductUpdateAction> getActions(){
      return this.actions;
   }
   
   
   public java.lang.Long getVersion(){
      return this.version;
   }

   public ProductUpdate build() {
       return new ProductUpdateImpl(actions, version);
   }
   
   public static ProductUpdateBuilder of() {
      return new ProductUpdateBuilder();
   }
   
   public static ProductUpdateBuilder of(final ProductUpdate template) {
      ProductUpdateBuilder builder = new ProductUpdateBuilder();
      builder.actions = template.getActions();
      builder.version = template.getVersion();
      return builder;
   }
   
}