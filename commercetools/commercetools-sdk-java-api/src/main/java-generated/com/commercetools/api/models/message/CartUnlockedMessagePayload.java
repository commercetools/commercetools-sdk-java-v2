
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUnlockCartAction" rel="nofollow">Unlock Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnlockedMessagePayload cartUnlockedMessagePayload = CartUnlockedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartUnlocked")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUnlockedMessagePayloadImpl.class)
public interface CartUnlockedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartUnlockedMessagePayload
     */
    String CART_UNLOCKED = "CartUnlocked";

    /**
     * factory method
     * @return instance of CartUnlockedMessagePayload
     */
    public static CartUnlockedMessagePayload of() {
        return new CartUnlockedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartUnlockedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUnlockedMessagePayload of(final CartUnlockedMessagePayload template) {
        CartUnlockedMessagePayloadImpl instance = new CartUnlockedMessagePayloadImpl();
        return instance;
    }

    public CartUnlockedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartUnlockedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUnlockedMessagePayload deepCopy(@Nullable final CartUnlockedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartUnlockedMessagePayloadImpl instance = new CartUnlockedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CartUnlockedMessagePayload
     * @return builder
     */
    public static CartUnlockedMessagePayloadBuilder builder() {
        return CartUnlockedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartUnlockedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnlockedMessagePayloadBuilder builder(final CartUnlockedMessagePayload template) {
        return CartUnlockedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUnlockedMessagePayload(Function<CartUnlockedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartUnlockedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartUnlockedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnlockedMessagePayload>";
            }
        };
    }
}
