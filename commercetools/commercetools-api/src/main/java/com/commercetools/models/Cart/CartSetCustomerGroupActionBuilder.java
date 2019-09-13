package com.commercetools.models.cart;

import com.commercetools.models.cart.CartUpdateAction;
import com.commercetools.models.customer_group.CustomerGroupResourceIdentifier;
import java.lang.String;
import com.commercetools.models.cart.CartSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomerGroupActionBuilder {
   
   @Nullable
   private com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup;
   
   public CartSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.models.customer_group.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.customer_group.CustomerGroupResourceIdentifier getCustomerGroup(){
      return this.customerGroup;
   }

   public CartSetCustomerGroupAction build() {
       return new CartSetCustomerGroupActionImpl(customerGroup);
   }
   
   public static CartSetCustomerGroupActionBuilder of() {
      return new CartSetCustomerGroupActionBuilder();
   }
   
   public static CartSetCustomerGroupActionBuilder of(final CartSetCustomerGroupAction template) {
      CartSetCustomerGroupActionBuilder builder = new CartSetCustomerGroupActionBuilder();
      builder.customerGroup = template.getCustomerGroup();
      return builder;
   }
   
}