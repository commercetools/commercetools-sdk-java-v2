package com.commercetools.models.order_edit;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.order_edit.StagedOrderRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.models.discount_code.DiscountCodeReference discountCode;
   
   public StagedOrderRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public StagedOrderRemoveDiscountCodeAction build() {
       return new StagedOrderRemoveDiscountCodeActionImpl(discountCode);
   }
   
   public static StagedOrderRemoveDiscountCodeActionBuilder of() {
      return new StagedOrderRemoveDiscountCodeActionBuilder();
   }
   
   public static StagedOrderRemoveDiscountCodeActionBuilder of(final StagedOrderRemoveDiscountCodeAction template) {
      StagedOrderRemoveDiscountCodeActionBuilder builder = new StagedOrderRemoveDiscountCodeActionBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}