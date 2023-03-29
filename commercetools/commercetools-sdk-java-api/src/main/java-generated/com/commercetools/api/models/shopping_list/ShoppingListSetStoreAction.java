
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;
import javax.validation.Valid;

import com.commercetools.api.models.store.StoreResourceIdentifier;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetStoreAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetStoreAction shoppingListSetStoreAction = ShoppingListSetStoreAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetStoreActionImpl.class)
public interface ShoppingListSetStoreAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetStoreAction
     */
    String SET_STORE = "setStore";

    /**
     *  <p>The Store the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @return store
     */
    @Valid
    @JsonProperty("store")
    public StoreResourceIdentifier getStore();

    /**
     *  <p>The Store the ShoppingList should be assigned to. If empty, any existing value will be removed.</p>
     * @param store value to be set
     */

    public void setStore(final StoreResourceIdentifier store);

    /**
     * factory method
     * @return instance of ShoppingListSetStoreAction
     */
    public static ShoppingListSetStoreAction of() {
        return new ShoppingListSetStoreActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetStoreAction of(final ShoppingListSetStoreAction template) {
        ShoppingListSetStoreActionImpl instance = new ShoppingListSetStoreActionImpl();
        instance.setStore(template.getStore());
        return instance;
    }

    /**
     * factory method to create a deep copy of ShoppingListSetStoreAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetStoreAction deepCopy(@Nullable final ShoppingListSetStoreAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetStoreActionImpl instance = new ShoppingListSetStoreActionImpl();
        instance.setStore(Optional.ofNullable(template.getStore())
                .map(com.commercetools.api.models.store.StoreResourceIdentifier::deepCopy)
                .orElse(null));
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetStoreAction
     * @return builder
     */
    public static ShoppingListSetStoreActionBuilder builder() {
        return ShoppingListSetStoreActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetStoreAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetStoreActionBuilder builder(final ShoppingListSetStoreAction template) {
        return ShoppingListSetStoreActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetStoreAction(Function<ShoppingListSetStoreAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetStoreAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetStoreAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetStoreAction>";
            }
        };
    }
}
