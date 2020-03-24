package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.discount_code.DiscountCodeReference;
import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartRemoveDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartRemoveDiscountCodeActionBuilder {
   
   
   private com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode;
   
   public MyCartRemoveDiscountCodeActionBuilder discountCode( final com.commercetools.api.generated.models.discount_code.DiscountCodeReference discountCode) {
      this.discountCode = discountCode;
      return this;
   }
   
   
   public com.commercetools.api.generated.models.discount_code.DiscountCodeReference getDiscountCode(){
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