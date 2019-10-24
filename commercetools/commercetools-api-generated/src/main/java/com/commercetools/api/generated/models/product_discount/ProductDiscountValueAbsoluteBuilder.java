package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.TypedMoney;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValue;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsolute;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountValueAbsoluteBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.TypedMoney> money;
   
   public ProductDiscountValueAbsoluteBuilder money( final java.util.List<com.commercetools.api.generated.models.common.TypedMoney> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.TypedMoney> getMoney(){
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