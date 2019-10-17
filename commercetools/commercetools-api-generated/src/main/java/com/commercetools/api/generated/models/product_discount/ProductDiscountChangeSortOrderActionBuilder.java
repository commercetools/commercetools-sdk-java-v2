package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.product_discount.ProductDiscountUpdateAction;
import com.commercetools.api.generated.models.product_discount.ProductDiscountChangeSortOrderAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountChangeSortOrderActionBuilder {
   
   
   private String sortOrder;
   
   public ProductDiscountChangeSortOrderActionBuilder sortOrder( final String sortOrder) {
      this.sortOrder = sortOrder;
      return this;
   }
   
   
   public String getSortOrder(){
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