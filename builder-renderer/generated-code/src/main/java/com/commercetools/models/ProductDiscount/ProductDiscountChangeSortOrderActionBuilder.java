package com.commercetools.models.ProductDiscount;

import com.commercetools.models.ProductDiscount.ProductDiscountUpdateAction;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountChangeSortOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeSortOrderActionBuilder {
   
   
   private java.lang.String sortOrder;
   
   public ProductDiscountChangeSortOrderActionBuilder sortOrder( final java.lang.String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   
   public java.lang.String getSortOrder(){
      return this.sortOrder;
   }

   public ProductDiscountChangeSortOrderAction build() {
       return new ProductDiscountChangeSortOrderActionImpl(sortOrder);
   }
   
   public static ProductDiscountChangeSortOrderActionBuilder of() {
      return new ProductDiscountChangeSortOrderActionBuilder();
   }
   
   public static ProductDiscountChangeSortOrderActionBuilder of(final ProductDiscountChangeSortOrderAction template) {
      ProductDiscountChangeSortOrderActionBuilder builder = new ProductDiscountChangeSortOrderActionBuilder();
      builder.sortOrder = template.getSortOrder();
      return builder;
   }
   
}