
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartFreezeCartAction" rel="nofollow">Freeze Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartFrozenMessagePayload cartFrozenMessagePayload = CartFrozenMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartFrozen")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartFrozenMessagePayloadImpl.class)
public interface CartFrozenMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartFrozenMessagePayload
     */
    String CART_FROZEN = "CartFrozen";

    /**
     * factory method
     * @return instance of CartFrozenMessagePayload
     */
    public static CartFrozenMessagePayload of() {
        return new CartFrozenMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartFrozenMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartFrozenMessagePayload of(final CartFrozenMessagePayload template) {
        CartFrozenMessagePayloadImpl instance = new CartFrozenMessagePayloadImpl();
        return instance;
    }

    public CartFrozenMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartFrozenMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartFrozenMessagePayload deepCopy(@Nullable final CartFrozenMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartFrozenMessagePayloadImpl instance = new CartFrozenMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CartFrozenMessagePayload
     * @return builder
     */
    public static CartFrozenMessagePayloadBuilder builder() {
        return CartFrozenMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartFrozenMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartFrozenMessagePayloadBuilder builder(final CartFrozenMessagePayload template) {
        return CartFrozenMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartFrozenMessagePayload(Function<CartFrozenMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartFrozenMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartFrozenMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartFrozenMessagePayload>";
            }
        };
    }
}
