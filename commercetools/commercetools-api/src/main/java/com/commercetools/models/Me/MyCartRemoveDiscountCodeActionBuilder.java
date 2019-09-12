package com.commercetools.models.Me;

import com.commercetools.models.DiscountCode.DiscountCodeReference;
import com.commercetools.models.Me.MyCartUpdateAction;
import java.lang.String;
import com.commercetools.models.Me.MyCartRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class MyCartRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.models.DiscountCode.DiscountCodeReference discountCode;
   
   public MyCartRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.models.DiscountCode.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.models.DiscountCode.DiscountCodeReference getDiscountCode(){
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