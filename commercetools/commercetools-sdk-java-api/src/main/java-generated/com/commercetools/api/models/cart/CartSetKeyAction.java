
package com.commercetools.api.models.cart;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetKeyAction cartSetKeyAction = CartSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartSetKeyActionImpl.class)
public interface CartSetKeyAction extends CartUpdateAction {

    /**
     * discriminator value for CartSetKeyAction
     */
    String SET_KEY = "setKey";

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @return key
     */

    @JsonProperty("key")
    public String getKey();

    /**
     *  <p>Value to set. If empty, any existing key will be removed.</p>
     * @param key value to be set
     */

    public void setKey(final String key);

    /**
     * factory method
     * @return instance of CartSetKeyAction
     */
    public static CartSetKeyAction of() {
        return new CartSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy CartSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartSetKeyAction of(final CartSetKeyAction template) {
        CartSetKeyActionImpl instance = new CartSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartSetKeyAction deepCopy(@Nullable final CartSetKeyAction template) {
        if (template == null) {
            return null;
        }
        CartSetKeyActionImpl instance = new CartSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartSetKeyAction
     * @return builder
     */
    public static CartSetKeyActionBuilder builder() {
        return CartSetKeyActionBuilder.of();
    }

    /**
     * create builder for CartSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetKeyActionBuilder builder(final CartSetKeyAction template) {
        return CartSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartSetKeyAction(Function<CartSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static CartSetKeyAction ofUnset() {
        return CartSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartSetKeyAction>";
            }
        };
    }
}
