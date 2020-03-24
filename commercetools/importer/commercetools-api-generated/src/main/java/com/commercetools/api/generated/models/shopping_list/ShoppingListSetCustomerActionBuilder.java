package com.commercetools.api.generated.models.shopping_list;

import com.commercetools.api.generated.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.generated.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.generated.models.shopping_list.ShoppingListSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;
import io.vrap.rmf.base.client.utils.Generated;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
public final class ShoppingListSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer;
   
   public ShoppingListSetCustomerActionBuilder customer(@Nullable final com.commercetools.api.generated.models.customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.api.generated.models.customer.CustomerResourceIdentifier getCustomer(){
      return this.customer;
   }

   public ShoppingListSetCustomerAction build() {
       return new ShoppingListSetCustomerActionImpl(customer);
   }
   
   public static ShoppingListSetCustomerActionBuilder of() {
      return new ShoppingListSetCustomerActionBuilder();
   }
   
   public static ShoppingListSetCustomerActionBuilder of(final ShoppingListSetCustomerAction template) {
      ShoppingListSetCustomerActionBuilder builder = new ShoppingListSetCustomerActionBuilder();
      builder.customer = template.getCustomer();
      return builder;
   }
   
}