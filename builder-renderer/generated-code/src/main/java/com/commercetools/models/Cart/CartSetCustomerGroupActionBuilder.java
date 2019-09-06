package com.commercetools.models.Cart;

import com.commercetools.models.Cart.CartUpdateAction;
import com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier;
import java.lang.String;
import com.commercetools.models.Cart.CartSetCustomerGroupAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class CartSetCustomerGroupActionBuilder {
   
   @Nullable
   private com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup;
   
   public CartSetCustomerGroupActionBuilder customerGroup(@Nullable final com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier customerGroup) {
      this.customerGroup = customerGroup;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.CustomerGroup.CustomerGroupResourceIdentifier getCustomerGroup(){
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