package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyPaymentUpdateAction;
import com.commercetools.api.generated.models.me.MyPaymentSetMethodInfoMethodAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyPaymentSetMethodInfoMethodActionBuilder {
   
   @Nullable
   private String method;
   
   public MyPaymentSetMethodInfoMethodActionBuilder method(@Nullable final String method) {
      this.method = method;
      return this;
   }
   
   @Nullable
   public String getMethod(){
      return this.method;
   }

   public MyPaymentSetMethodInfoMethodAction build() {
       return new MyPaymentSetMethodInfoMethodActionImpl(method);
   }
   
   public static MyPaymentSetMethodInfoMethodActionBuilder of() {
      return new MyPaymentSetMethodInfoMethodActionBuilder();
   }
   
   public static MyPaymentSetMethodInfoMethodActionBuilder of(final MyPaymentSetMethodInfoMethodAction template) {
      MyPaymentSetMethodInfoMethodActionBuilder builder = new MyPaymentSetMethodInfoMethodActionBuilder();
      builder.method = template.getMethod();
      return builder;
   }
   
}