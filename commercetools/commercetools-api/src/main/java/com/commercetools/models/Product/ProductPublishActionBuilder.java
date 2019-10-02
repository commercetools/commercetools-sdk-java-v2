package com.commercetools.models.product;

import com.commercetools.models.cart.ProductPublishScope;
import com.commercetools.models.product.ProductUpdateAction;
import com.commercetools.models.product.ProductPublishAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductPublishActionBuilder {
   
   @Nullable
   private com.commercetools.models.cart.ProductPublishScope scope;
   
   public ProductPublishActionBuilder scope(@Nullable final com.commercetools.models.cart.ProductPublishScope scope) {
      this.scope = scope;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.cart.ProductPublishScope getScope(){
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