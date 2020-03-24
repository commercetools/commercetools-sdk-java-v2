package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCartUpdateAction;
import com.commercetools.api.generated.models.me.MyCartAddDiscountCodeAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCartAddDiscountCodeActionBuilder {
   
   
   private String code;
   
   public MyCartAddDiscountCodeActionBuilder code( final String code) {
      this.code = code;
      return this;
   }
   
   
   public String getCode(){
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