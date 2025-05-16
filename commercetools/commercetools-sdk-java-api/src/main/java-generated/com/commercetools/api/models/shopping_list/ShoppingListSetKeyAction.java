
package com.commercetools.api.models.shopping_list;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShoppingListSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShoppingListSetKeyAction shoppingListSetKeyAction = ShoppingListSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = ShoppingListSetKeyActionImpl.class)
public interface ShoppingListSetKeyAction extends ShoppingListUpdateAction {

    /**
     * discriminator value for ShoppingListSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of ShoppingListSetKeyAction
     */
    public static ShoppingListSetKeyAction of() {
        return new ShoppingListSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy ShoppingListSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static ShoppingListSetKeyAction of(final ShoppingListSetKeyAction template) {
        ShoppingListSetKeyActionImpl instance = new ShoppingListSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public ShoppingListSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of ShoppingListSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static ShoppingListSetKeyAction deepCopy(@Nullable final ShoppingListSetKeyAction template) {
        if (template == null) {
            return null;
        }
        ShoppingListSetKeyActionImpl instance = new ShoppingListSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for ShoppingListSetKeyAction
     * @return builder
     */
    public static ShoppingListSetKeyActionBuilder builder() {
        return ShoppingListSetKeyActionBuilder.of();
    }

    /**
     * create builder for ShoppingListSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShoppingListSetKeyActionBuilder builder(final ShoppingListSetKeyAction template) {
        return ShoppingListSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withShoppingListSetKeyAction(Function<ShoppingListSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static ShoppingListSetKeyAction ofUnset() {
        return ShoppingListSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<ShoppingListSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<ShoppingListSetKeyAction>";
            }
        };
    }
}
