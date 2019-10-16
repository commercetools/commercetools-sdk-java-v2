package com.commercetools.api.generated.models.customer;

import com.commercetools.api.generated.models.customer.CustomerUpdateAction;
import com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier;
import com.commercetools.api.generated.models.customer.CustomerSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCustomerGroupActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   public CustomerSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   public CustomerSetCustomerGroupAction build() {
       return new CustomerSetCustomerGroupActionImpl(customerGroup);
   }
   
   public static CustomerSetCustomerGroupActionBuilder of() {
      return new CustomerSetCustomerGroupActionBuilder();
   }
   
   public static CustomerSetCustomerGroupActionBuilder of(final CustomerSetCustomerGroupAction template) {
      CustomerSetCustomerGroupActionBuilder builder = new CustomerSetCustomerGroupActionBuilder();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }
   
}