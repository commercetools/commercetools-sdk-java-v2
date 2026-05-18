
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p><span>Locks</span> a Cart, preventing all updates from API Clients without an elevated <span>OAuth 2.0 Scope</span>. This action sets the Cart's <code>lock</code> <span>field</span> which identifies the API Client that locked the Cart and when the lock was applied. This action requires an additional OAuth 2.0 Scope <code>manage_locked_carts</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLockCartAction cartLockCartAction = CartLockCartAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("lockCart")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartLockCartActionImpl.class)
public interface CartLockCartAction extends CartUpdateAction {

    /**
     * discriminator value for CartLockCartAction
     */
    String LOCK_CART = "lockCart";

    /**
     * factory method
     * @return instance of CartLockCartAction
     */
    public static CartLockCartAction of() {
        return new CartLockCartActionImpl();
    }

    /**
     * factory method to create a shallow copy CartLockCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartLockCartAction of(final CartLockCartAction template) {
        CartLockCartActionImpl instance = new CartLockCartActionImpl();
        return instance;
    }

    public CartLockCartAction copyDeep();

    /**
     * factory method to create a deep copy of CartLockCartAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartLockCartAction deepCopy(@Nullable final CartLockCartAction template) {
        if (template == null) {
            return null;
        }
        CartLockCartActionImpl instance = new CartLockCartActionImpl();
        return instance;
    }

    /**
     * builder factory method for CartLockCartAction
     * @return builder
     */
    public static CartLockCartActionBuilder builder() {
        return CartLockCartActionBuilder.of();
    }

    /**
     * create builder for CartLockCartAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockCartActionBuilder builder(final CartLockCartAction template) {
        return CartLockCartActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartLockCartAction(Function<CartLockCartAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartLockCartAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartLockCartAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartLockCartAction>";
            }
        };
    }
}
