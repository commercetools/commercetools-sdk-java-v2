
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.validation.Valid;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

@Generated(value = "io.vrap.rmf.codegen.rendring.CoreCodeGenerator", comments = "https://github.com/vrapio/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetCustomerActionImpl.class)
public interface ShoppingListSetCustomerAction extends ShoppingListUpdateAction {

    String SET_CUSTOMER = "setCustomer";

    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    public void setCustomer(final CustomerResourceIdentifier customer);

    public static ShoppingListSetCustomerAction of() {
        return new ShoppingListSetCustomerActionImpl();
    }

    public static ShoppingListSetCustomerAction of(final ShoppingListSetCustomerAction template) {
        ShoppingListSetCustomerActionImpl instance = new ShoppingListSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    public static ShoppingListSetCustomerActionBuilder builder() {
        return ShoppingListSetCustomerActionBuilder.of();
    }

    public static ShoppingListSetCustomerActionBuilder builder(final ShoppingListSetCustomerAction template) {
        return ShoppingListSetCustomerActionBuilder.of(template);
    }

    default <T> T withShoppingListSetCustomerAction(Function<ShoppingListSetCustomerAction, T> helper) {
        return helper.apply(this);
    }

    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetCustomerAction>";
            }
        };
    }
}
