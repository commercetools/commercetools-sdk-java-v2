package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetLastNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import javax.annotation.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetLastNameActionBuilder {
   
   @Nullable
   private String lastName;
   
   public MyCustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   @Nullable
   public String getLastName(){
      return this.lastName;
   }

   public MyCustomerSetLastNameAction build() {
       return new MyCustomerSetLastNameActionImpl(lastName);
   }
   
   public static MyCustomerSetLastNameActionBuilder of() {
      return new MyCustomerSetLastNameActionBuilder();
   }
   
   public static MyCustomerSetLastNameActionBuilder of(final MyCustomerSetLastNameAction template) {
      MyCustomerSetLastNameActionBuilder builder = new MyCustomerSetLastNameActionBuilder();
      builder.lastName = template.getLastName();
      return builder;
   }
   
}