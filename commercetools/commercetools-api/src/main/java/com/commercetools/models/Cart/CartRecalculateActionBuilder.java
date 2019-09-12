package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import java.lang.Boolean;
import java.lang.String;
import com.commercetools.models.Cart.CartRecalculateAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartRecalculateActionBuilder {
   
   @Nullable
   private java.lang.Boolean updateProductData;
   
   public CartRecalculateActionBuilder updateProductData(@Nullable final java.lang.Boolean updateProductData) {
      this.updateProductData = updateProductData;
      return this;
   }
   
   @Nullable
   public java.lang.Boolean getUpdateProductData(){
      return this.updateProductData;
   }

   public CartRecalculateAction build() {
       return new CartRecalculateActionImpl(updateProductData);
   }
   
   public static CartRecalculateActionBuilder of() {
      return new CartRecalculateActionBuilder();
   }
   
   public static CartRecalculateActionBuilder of(final CartRecalculateAction template) {
      CartRecalculateActionBuilder builder = new CartRecalculateActionBuilder();
      builder.updateProductData = template.getUpdateProductData();
      return builder;
   }
   
}