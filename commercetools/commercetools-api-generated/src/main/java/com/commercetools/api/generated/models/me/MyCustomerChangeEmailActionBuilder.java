package com.commercetools.api.generated.models.me;

import com.commercetools.api.generated.models.me.MyCustomerUpdateAction;
import com.commercetools.api.generated.models.me.MyCustomerChangeEmailAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import com.fasterxml.jackson.databind.*;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class MyCustomerChangeEmailActionBuilder {
   
   
   private String email;
   
   public MyCustomerChangeEmailActionBuilder email( final String email) {
      this.email = email;
      return this;
   }
   
   
   public String getEmail(){
      return this.email;
   }

   public MyCustomerChangeEmailAction build() {
       return new MyCustomerChangeEmailActionImpl(email);
   }
   
   public static MyCustomerChangeEmailActionBuilder of() {
      return new MyCustomerChangeEmailActionBuilder();
   }
   
   public static MyCustomerChangeEmailActionBuilder of(final MyCustomerChangeEmailAction template) {
      MyCustomerChangeEmailActionBuilder builder = new MyCustomerChangeEmailActionBuilder();
      builder.email = template.getEmail();
      return builder;
   }
   
}