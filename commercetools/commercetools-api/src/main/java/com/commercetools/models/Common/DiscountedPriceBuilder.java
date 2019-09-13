package com.commercetools.models.common;

import com.commercetools.models.common.Money;
import com.commercetools.models.product_discount.ProductDiscountReference;
import com.commercetools.models.common.DiscountedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedPriceBuilder {
   
   
   private com.commercetools.models.product_discount.ProductDiscountReference discount;
   
   
   private com.commercetools.models.common.Money value;
   
   public DiscountedPriceBuilder discount( final com.commercetools.models.product_discount.ProductDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   public DiscountedPriceBuilder value( final com.commercetools.models.common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.product_discount.ProductDiscountReference getDiscount(){
      return this.discount;
   }
   
   
   public com.commercetools.models.common.Money getValue(){
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