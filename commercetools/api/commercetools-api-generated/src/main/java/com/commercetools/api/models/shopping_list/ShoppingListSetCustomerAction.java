package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.List;
import java.util.Map;
import java.time.*;

import java.io.IOException;

@Generated(
    value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator",
    comments = "https://github.com/vrapio/rmf-codegen"
)
@JsonDeserialize(as = ShoppingListSetCustomerActionImpl.class)
public interface ShoppingListSetCustomerAction extends ShoppingListUpdateAction {

   
   @Valid
   @JsonProperty("customer")
   public CustomerResourceIdentifier getCustomer();

   public void setCustomer(final CustomerResourceIdentifier customer);
   
   public static ShoppingListSetCustomerActionImpl of(){
      return new ShoppingListSetCustomerActionImpl();
   }
   

   public static ShoppingListSetCustomerActionImpl of(final ShoppingListSetCustomerAction template) {
      ShoppingListSetCustomerActionImpl instance = new ShoppingListSetCustomerActionImpl();
      instance.setCustomer(template.getCustomer());
      return instance;
   }

}
