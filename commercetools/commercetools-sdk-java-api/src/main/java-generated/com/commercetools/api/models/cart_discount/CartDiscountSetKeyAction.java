
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetKeyAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetKeyAction cartDiscountSetKeyAction = CartDiscountSetKeyAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setKey")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetKeyActionImpl.class)
public interface CartDiscountSetKeyAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetKeyAction
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
     * @return instance of CartDiscountSetKeyAction
     */
    public static CartDiscountSetKeyAction of() {
        return new CartDiscountSetKeyActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetKeyAction of(final CartDiscountSetKeyAction template) {
        CartDiscountSetKeyActionImpl instance = new CartDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    public CartDiscountSetKeyAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountSetKeyAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetKeyAction deepCopy(@Nullable final CartDiscountSetKeyAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetKeyActionImpl instance = new CartDiscountSetKeyActionImpl();
        instance.setKey(template.getKey());
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetKeyAction
     * @return builder
     */
    public static CartDiscountSetKeyActionBuilder builder() {
        return CartDiscountSetKeyActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetKeyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetKeyActionBuilder builder(final CartDiscountSetKeyAction template) {
        return CartDiscountSetKeyActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetKeyAction(Function<CartDiscountSetKeyAction, T> helper) {
        return helper.apply(this);
    }

    public static CartDiscountSetKeyAction ofUnset() {
        return CartDiscountSetKeyAction.of();
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetKeyAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetKeyAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetKeyAction>";
            }
        };
    }
}
