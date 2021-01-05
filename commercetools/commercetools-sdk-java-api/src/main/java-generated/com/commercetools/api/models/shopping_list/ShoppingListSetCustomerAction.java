package com.commercetools.api.models.shopping_list;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.commercetools.api.models.shopping_list.ShoppingListUpdateAction;
import com.commercetools.api.models.shopping_list.ShoppingListSetCustomerActionImpl;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;
import io.vrap.rmf.base.client.utils.Generated;
import io.vrap.rmf.base.client.Accessor;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;
import java.util.*;
import java.time.*;
import java.util.function.Function;
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

    public static ShoppingListSetCustomerAction of(){
        return new ShoppingListSetCustomerActionImpl();
    }
    

    public static ShoppingListSetCustomerAction of(final ShoppingListSetCustomerAction template) {
        ShoppingListSetCustomerActionImpl instance = new ShoppingListSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static ShoppingListSetCustomerActionBuilder builder(){
        return ShoppingListSetCustomerActionBuilder.of();
    }
    
    public static ShoppingListSetCustomerActionBuilder builder(final ShoppingListSetCustomerAction template){
        return ShoppingListSetCustomerActionBuilder.of(template);
    }
    

    default <T> T withShoppingListSetCustomerAction(Function<ShoppingListSetCustomerAction, T> helper) {
        return helper.apply(this);
    }
}
