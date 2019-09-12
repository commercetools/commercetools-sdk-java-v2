package com.commercetools.models.ShoppingList;

import com.commercetools.models.Customer.CustomerResourceIdentifier;
import com.commercetools.models.ShoppingList.ShoppingListUpdateAction;
import java.lang.String;
import com.commercetools.models.ShoppingList.ShoppingListSetCustomerAction;
import javax.annotation.Nullable;
import java.util.List;
import java.util.Map;
import java.time.ZonedDateTime;

public final class ShoppingListSetCustomerActionBuilder {
   
   @Nullable
   private com.commercetools.models.Customer.CustomerResourceIdentifier customer;
   
   public ShoppingListSetCustomerActionBuilder customer(@Nullable final com.commercetools.models.Customer.CustomerResourceIdentifier customer) {
      this.customer = customer;
      return this;
   }
   
   @Nullable
   public com.commercetools.models.Customer.CustomerResourceIdentifier getCustomer(){
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