package com.commercetools.api.generated.models.product_discount;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueDraft;
import com.commercetools.api.generated.models.product_discount.ProductDiscountValueAbsoluteDraft;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ProductDiscountValueAbsoluteDraftBuilder {
   
   
   private java.util.List<com.commercetools.api.generated.models.common.Money> money;
   
   public ProductDiscountValueAbsoluteDraftBuilder money( final java.util.List<com.commercetools.api.generated.models.common.Money> money) {
      this.money = money;
      return this;
   }
   
   
   public java.util.List<com.commercetools.api.generated.models.common.Money> getMoney(){
      return this.money;
   }

   public ProductDiscountValueAbsoluteDraft build() {
       return new ProductDiscountValueAbsoluteDraftImpl(money);
   }
   
   public static ProductDiscountValueAbsoluteDraftBuilder of() {
      return new ProductDiscountValueAbsoluteDraftBuilder();
   }
   
   public static ProductDiscountValueAbsoluteDraftBuilder of(final ProductDiscountValueAbsoluteDraft template) {
      ProductDiscountValueAbsoluteDraftBuilder builder = new ProductDiscountValueAbsoluteDraftBuilder();
      builder.money = template.getMoney();
      return builder;
   }
   
}