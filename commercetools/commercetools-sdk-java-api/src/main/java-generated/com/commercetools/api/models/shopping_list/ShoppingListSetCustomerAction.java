
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.customer.CustomerResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;

/**
 * ShoppingListSetCustomerAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetCustomerAction shoppingListSetCustomerAction = ShoppingListSetCustomerAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetCustomerActionImpl.class)
public interface ShoppingListSetCustomerAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetCustomerAction
     */
    String SET_CUSTOMER = "setCustomer";

    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @return customer
     */
    @Valid
    @JsonProperty("customer")
    public CustomerResourceIdentifier getCustomer();

    /**
     *  <p>The Customer the ShoppingList should be associated to. If empty, any existing value will be removed.</p>
     * @param customer value to be set
     */

    public void setCustomer(final CustomerResourceIdentifier customer);

    /**
     * factory method
     * @return instance of ShoppingListSetCustomerAction
     */
    public static ShoppingListSetCustomerAction of() {
        return new ShoppingListSetCustomerActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetCustomerAction of(final ShoppingListSetCustomerAction template) {
        ShoppingListSetCustomerActionImpl instance = new ShoppingListSetCustomerActionImpl();
        instance.setCustomer(template.getCustomer());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListSetCustomerAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetCustomerAction deepCopy(@Nullable final ShoppingListSetCustomerAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetCustomerActionImpl instance = new ShoppingListSetCustomerActionImpl();
        instance.setCustomer(
            com.commercetools.api.models.customer.CustomerResourceIdentifier.deepCopy(template.getCustomer()));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetCustomerAction
     * @return builder
     */
    public static ShoppingListSetCustomerActionBuilder builder() {
        return ShoppingListSetCustomerActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetCustomerAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetCustomerActionBuilder builder(final ShoppingListSetCustomerAction template) {
        return ShoppingListSetCustomerActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetCustomerAction(Function<ShoppingListSetCustomerAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetCustomerAction ofUnset() {
        return ShoppingListSetCustomerAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomerAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetCustomerAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetCustomerAction>";
            }
        };
    }
}
