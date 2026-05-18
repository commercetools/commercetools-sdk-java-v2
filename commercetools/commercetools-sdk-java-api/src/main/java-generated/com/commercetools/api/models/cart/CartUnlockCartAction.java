
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Unlocks a Cart, removing all update restrictions that are in place while a Cart is <span>locked</span>. This action requires an additional OAuth 2.0 Scope <code>manage_locked_carts</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnlockCartAction cartUnlockCartAction = CartUnlockCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("unlockCart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUnlockCartActionImpl.class)
public interface CartUnlockCartAction extends CartUpdateAction {

    /**
     * discriminator value for CartUnlockCartAction
     */
    String UNLOCK_CART = "unlockCart";

    /**
     * factory method
     * @return instance of CartUnlockCartAction
     */
    public static CartUnlockCartAction of() {
        return new CartUnlockCartActionImpl();
    }

    /**
     * factory method to create a shallow copy CartUnlockCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUnlockCartAction of(final CartUnlockCartAction template) {
        CartUnlockCartActionImpl instance = new CartUnlockCartActionImpl();
        return instance;
    }

    public CartUnlockCartAction copyDeep();

    /**
     * factory method to create a deep copy of CartUnlockCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUnlockCartAction deepCopy(@Nullable final CartUnlockCartAction template) {
        if (template == null) {
            return null;
        }
        CartUnlockCartActionImpl instance = new CartUnlockCartActionImpl();
        return instance;
    }

    /**
     * builder factory method for CartUnlockCartAction
     * @return builder
     */
    public static CartUnlockCartActionBuilder builder() {
        return CartUnlockCartActionBuilder.of();
    }

    /**
     * create builder for CartUnlockCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnlockCartActionBuilder builder(final CartUnlockCartAction template) {
        return CartUnlockCartActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUnlockCartAction(Function<CartUnlockCartAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUnlockCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUnlockCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnlockCartAction>";
            }
        };
    }
}
