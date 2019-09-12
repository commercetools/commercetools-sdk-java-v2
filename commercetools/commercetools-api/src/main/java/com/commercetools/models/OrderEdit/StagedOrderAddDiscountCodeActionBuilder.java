package com.commercetools.models.OrderEdit;

import com.commercetools.models.Order.StagedOrderUpdateAction;
import java.lang.String;
import com.commercetools.models.OrderEdit.StagedOrderAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class StagedOrderAddDiscountCodeActionBuilder {
   
   
   private java.lang.String code;
   
   public StagedOrderAddDiscountCodeActionBuilder code( final java.lang.String code) {
      this.code = code;
      return this;
   }
   
   
   public java.lang.String getCode(){
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