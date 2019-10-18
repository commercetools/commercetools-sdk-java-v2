package com.commercetools.api.generated.models.common;

import com.commercetools.api.generated.models.common.Money;
import com.commercetools.api.generated.models.product_discount.ProductDiscountReference;
import com.commercetools.api.generated.models.common.DiscountedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class DiscountedPriceBuilder {
   
   
   private com.commercetools.api.generated.models.product_discount.ProductDiscountReference discount;
   
   
   private com.commercetools.api.generated.models.common.Money value;
   
   public DiscountedPriceBuilder discount( final com.commercetools.api.generated.models.product_discount.ProductDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   public DiscountedPriceBuilder value( final com.commercetools.api.generated.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.product_discount.ProductDiscountReference getDiscount(){
      return this.discount;
   }
   
   
   public com.commercetools.api.generated.models.common.Money getValue(){
      return this.value;
   }

   public DiscountedPrice build() {
       return new DiscountedPriceImpl(discount, value);
   }
   
   public static DiscountedPriceBuilder of() {
      return new DiscountedPriceBuilder();
   }
   
   public static DiscountedPriceBuilder of(final DiscountedPrice template) {
      DiscountedPriceBuilder builder = new DiscountedPriceBuilder();
      builder.discount = template.getDiscount();
      builder.value = template.getValue();
      return builder;
   }
   
}