package com.commercetools.models.Customer;

import com.commercetools.models.Customer.CustomerUpdateAction;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Customer.CustomerSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CustomerSetCustomerGroupActionBuilder {
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   public CustomerSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
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