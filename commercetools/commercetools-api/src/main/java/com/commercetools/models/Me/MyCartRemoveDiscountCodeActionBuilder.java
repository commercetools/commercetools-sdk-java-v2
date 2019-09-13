package com.commercetools.models.me;

import com.commercetools.models.discount_code.DiscountCodeReference;
import com.commercetools.models.me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.me.MyCartRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.models.discount_code.DiscountCodeReference discountCode;
   
   public MyCartRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.discount_code.DiscountCodeReference getDiscountCode(){
      return this.discountCode;
   }

   public MyCartRemoveDiscountCodeAction build() {
       return new MyCartRemoveDiscountCodeActionImpl(discountCode);
   }
   
   public static MyCartRemoveDiscountCodeActionBuilder of() {
      return new MyCartRemoveDiscountCodeActionBuilder();
   }
   
   public static MyCartRemoveDiscountCodeActionBuilder of(final MyCartRemoveDiscountCodeAction template) {
      MyCartRemoveDiscountCodeActionBuilder builder = new MyCartRemoveDiscountCodeActionBuilder();
      builder.discountCode = template.getDiscountCode();
      return builder;
   }
   
}