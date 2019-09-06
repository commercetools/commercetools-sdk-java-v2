package com.commercetools.models.Common;

import com.commercetools.models.Common.Money;
import com.commercetools.models.ProductDiscount.ProductDiscountReference;
import com.commercetools.models.Common.DiscountedPrice;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class DiscountedPriceBuilder {
   
   
   private com.commercetools.models.ProductDiscount.ProductDiscountReference discount;
   
   
   private com.commercetools.models.Common.Money value;
   
   public DiscountedPriceBuilder discount( final com.commercetools.models.ProductDiscount.ProductDiscountReference discount) {
      this.discount = discount;
      return this;
   }
   
   public DiscountedPriceBuilder value( final com.commercetools.models.Common.Money value) {
      this.value = value;
      return this;
   }
   
   
   public com.commercetools.models.ProductDiscount.ProductDiscountReference getDiscount(){
      return this.discount;
   }
   
   
   public com.commercetools.models.Common.Money getValue(){
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