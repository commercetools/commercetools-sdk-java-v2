package com.commercetools.models.order_edit;

import com.commercetools.models.order.StagedOrderUpdateAction;
import com.commercetools.models.order_edit.StagedOrderAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddDiscountCodeActionBuilder {
   
   
   private String code;
   
   public StagedOrderAddDiscountCodeActionBuilder code( final String code) {
      this.code = code;
      return this;
   }
   
   
   public String getCode(){
      return this.code;
   }

   public StagedOrderAddDiscountCodeAction build() {
       return new StagedOrderAddDiscountCodeActionImpl(code);
   }
   
   public static StagedOrderAddDiscountCodeActionBuilder of() {
      return new StagedOrderAddDiscountCodeActionBuilder();
   }
   
   public static StagedOrderAddDiscountCodeActionBuilder of(final StagedOrderAddDiscountCodeAction template) {
      StagedOrderAddDiscountCodeActionBuilder builder = new StagedOrderAddDiscountCodeActionBuilder();
      builder.code = template.getCode();
      return builder;
   }
   
}