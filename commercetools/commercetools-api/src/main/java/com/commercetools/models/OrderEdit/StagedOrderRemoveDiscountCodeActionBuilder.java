package com.commercetools.models.OrderEdit;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public StagedOrderRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
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