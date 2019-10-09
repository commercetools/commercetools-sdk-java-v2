package com.commercetools.models.product_discount;

import com.commercetools.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.models.product_discount.ProductDiscountValueExternalDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountValueExternalDraftBuilder {
   
   
   

   public ProductDiscountValueExternalDraft build() {
       return new ProductDiscountValueExternalDraftImpl();
   }
   
   public static ProductDiscountValueExternalDraftBuilder of() {
      return new ProductDiscountValueExternalDraftBuilder();
   }
   
   public static ProductDiscountValueExternalDraftBuilder of(final ProductDiscountValueExternalDraft template) {
      ProductDiscountValueExternalDraftBuilder builder = new ProductDiscountValueExternalDraftBuilder();
      return builder;
   }
   
}