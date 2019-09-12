package com.commercetools.models.Me;

import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartAddDiscountCodeActionBuilder {
   
   
   private java.lang.String code;
   
   public MyCartAddDiscountCodeActionBuilder code( final java.lang.String code) {
      this.code = code;
      return this;
   }
   
   
   public java.lang.String getCode(){
      return this.code;
   }

   public MyCartAddDiscountCodeAction build() {
       return new MyCartAddDiscountCodeActionImpl(code);
   }
   
   public static MyCartAddDiscountCodeActionBuilder of() {
      return new MyCartAddDiscountCodeActionBuilder();
   }
   
   public static MyCartAddDiscountCodeActionBuilder of(final MyCartAddDiscountCodeAction template) {
      MyCartAddDiscountCodeActionBuilder builder = new MyCartAddDiscountCodeActionBuilder();
      builder.code = template.getCode();
      return builder;
   }
   
}