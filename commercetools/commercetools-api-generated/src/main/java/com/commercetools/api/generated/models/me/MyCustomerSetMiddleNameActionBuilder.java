package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerSetMiddleNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerSetMiddleNameActionBuilder {
   
   @Nullable
   private String middleName;
   
   public MyCustomerSetMiddleNameActionBuilder middleName(@Nullable final String middleName) {
      this.middleName = middleName;
      return this;
   }
   
   @Nullable
   public String getMiddleName(){
      return this.middleName;
   }

   public MyCustomerSetMiddleNameAction build() {
       return new MyCustomerSetMiddleNameActionImpl(middleName);
   }
   
   public static MyCustomerSetMiddleNameActionBuilder of() {
      return new MyCustomerSetMiddleNameActionBuilder();
   }
   
   public static MyCustomerSetMiddleNameActionBuilder of(final MyCustomerSetMiddleNameAction template) {
      MyCustomerSetMiddleNameActionBuilder builder = new MyCustomerSetMiddleNameActionBuilder();
      builder.middleName = template.getMiddleName();
      return builder;
   }
   
}