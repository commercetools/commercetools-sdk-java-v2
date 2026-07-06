
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import tools.jackson.databind.annotation.*;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartLockCartAction" rel="nofollow">Lock Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartLockedMessagePayload cartLockedMessagePayload = CartLockedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartLocked")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartLockedMessagePayloadImpl.class)
public interface CartLockedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartLockedMessagePayload
     */
    String CART_LOCKED = "CartLocked";

    /**
     * factory method
     * @return instance of CartLockedMessagePayload
     */
    public static CartLockedMessagePayload of() {
        return new CartLockedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartLockedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartLockedMessagePayload of(final CartLockedMessagePayload template) {
        CartLockedMessagePayloadImpl instance = new CartLockedMessagePayloadImpl();
        return instance;
    }

    public CartLockedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartLockedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartLockedMessagePayload deepCopy(@Nullable final CartLockedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartLockedMessagePayloadImpl instance = new CartLockedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CartLockedMessagePayload
     * @return builder
     */
    public static CartLockedMessagePayloadBuilder builder() {
        return CartLockedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartLockedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartLockedMessagePayloadBuilder builder(final CartLockedMessagePayload template) {
        return CartLockedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartLockedMessagePayload(Function<CartLockedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static tools.jackson.core.type.TypeReference<CartLockedMessagePayload> typeReference() {
        return new tools.jackson.core.type.TypeReference<CartLockedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartLockedMessagePayload>";
            }
        };
    }
}
