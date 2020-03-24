package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer.CustomerSetLastNameAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerSetLastNameActionBuilder {
   
   @Nullable
   private String lastName;
   
   public CustomerSetLastNameActionBuilder lastName(@Nullable final String lastName) {
      this.lastName = lastName;
      return this;
   }
   
   @Nullable
   public String getLastName(){
      return this.lastName;
   }

   public CustomerSetLastNameAction build() {
       return new CustomerSetLastNameActionImpl(lastName);
   }
   
   public static CustomerSetLastNameActionBuilder of() {
      return new CustomerSetLastNameActionBuilder();
   }
   
   public static CustomerSetLastNameActionBuilder of(final CustomerSetLastNameAction template) {
      CustomerSetLastNameActionBuilder builder = new CustomerSetLastNameActionBuilder();
      builder.lastName = template.getLastName();
      return builder;
   }
   
}