package com.commercetools.api.models.message;

import com.commercetools.api.models.customer_group.CustomerGroupReference;
import com.commercetools.api.models.message.MessagePayload;
import com.commercetools.api.models.message.CustomerGroupSetMessagePayload;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class CustomerGroupSetMessagePayloadBuilder {


   private com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup;

   public CustomerGroupSetMessagePayloadBuilder customerGroup( final com.commercetools.api.models.customer_group.CustomerGroupReference customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }


   public com.commercetools.api.models.customer_group.CustomerGroupReference getCustomerGroup(){
      return this.customerGroup;
   }

   public CustomerGroupSetMessagePayload build() {
       return new CustomerGroupSetMessagePayloadImpl(customerGroup);
   }

   public static CustomerGroupSetMessagePayloadBuilder of() {
      return new CustomerGroupSetMessagePayloadBuilder();
   }

   public static CustomerGroupSetMessagePayloadBuilder of(final CustomerGroupSetMessagePayload template) {
      CustomerGroupSetMessagePayloadBuilder builder = new CustomerGroupSetMessagePayloadBuilder();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }

}
