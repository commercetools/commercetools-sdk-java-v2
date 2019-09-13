package com.commercetools.models.cart_discount;

import com.commercetools.models.cart_discount.CartDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.cart_discount.CartDiscountChangeSortOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartDiscountChangeSortOrderActionBuilder {
   
   
   private java.lang.String sortOrder;
   
   public CartDiscountChangeSortOrderActionBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }

   public CartDiscountChangeSortOrderAction build() {
       return new CartDiscountChangeSortOrderActionImpl(sortOrder);
   }
   
   public static CartDiscountChangeSortOrderActionBuilder of() {
      return new CartDiscountChangeSortOrderActionBuilder();
   }
   
   public static CartDiscountChangeSortOrderActionBuilder of(final CartDiscountChangeSortOrderAction template) {
      CartDiscountChangeSortOrderActionBuilder builder = new CartDiscountChangeSortOrderActionBuilder();
      builder.sortOrder = template.getSortOrder();
      return builder;
   }
   
}