package com.commercetools.models.ProductDiscount;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ProductDiscount.ProductDiscountValue;
import java.lang.String;
import com.commercetools.models.ProductDiscount.ProductDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ProductDiscountValueAbsoluteBuilder {
   
   
   private java.util.List<com.commercetools.models.Common.Money> money;
   
   public ProductDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.models.Common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.models.Common.Money> getMoney(){
      return this.money;
   }

   public ProductDiscountValueAbsolute build() {
       return new ProductDiscountValueAbsoluteImpl(money);
   }
   
   public static ProductDiscountValueAbsoluteBuilder of() {
      return new ProductDiscountValueAbsoluteBuilder();
   }
   
   public static ProductDiscountValueAbsoluteBuilder of(final ProductDiscountValueAbsolute template) {
      ProductDiscountValueAbsoluteBuilder builder = new ProductDiscountValueAbsoluteBuilder();
      builder.money = template.getMoney();
      return builder;
   }
   
}