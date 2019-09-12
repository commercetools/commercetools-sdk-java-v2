package com.commercetools.models.Product;

import com.commercetools.models.Cart.ProductPublishScope;
import com.commercetools.models.Product.ProductUpdateAction;
import java.lang.String;
import com.commercetools.models.Product.ProductPublishAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPublishActionBuilder {
   
   @Nullable
   private com.commercetools.models.Cart.ProductPublishScope scope;
   
   public ProductPublishActionBuilder scope(@Nullable final com.commercetools.models.Cart.ProductPublishScope scope) {
      this.scope = scope;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Cart.ProductPublishScope getScope(){
      return this.scope;
   }

   public ProductPublishAction build() {
       return new ProductPublishActionImpl(scope);
   }
   
   public static ProductPublishActionBuilder of() {
      return new ProductPublishActionBuilder();
   }
   
   public static ProductPublishActionBuilder of(final ProductPublishAction template) {
      ProductPublishActionBuilder builder = new ProductPublishActionBuilder();
      builder.scope = template.getScope();
      return builder;
   }
   
}