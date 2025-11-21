
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful <a href="https://docs.commercetools.com/apis/ctp:api:type:CartUnfreezeCartAction" rel="nofollow">Unfreeze Cart</a> update action.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartUnfrozenMessagePayload cartUnfrozenMessagePayload = CartUnfrozenMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartUnfrozen")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartUnfrozenMessagePayloadImpl.class)
public interface CartUnfrozenMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartUnfrozenMessagePayload
     */
    String CART_UNFROZEN = "CartUnfrozen";

    /**
     * factory method
     * @return instance of CartUnfrozenMessagePayload
     */
    public static CartUnfrozenMessagePayload of() {
        return new CartUnfrozenMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartUnfrozenMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartUnfrozenMessagePayload of(final CartUnfrozenMessagePayload template) {
        CartUnfrozenMessagePayloadImpl instance = new CartUnfrozenMessagePayloadImpl();
        return instance;
    }

    public CartUnfrozenMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartUnfrozenMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartUnfrozenMessagePayload deepCopy(@Nullable final CartUnfrozenMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartUnfrozenMessagePayloadImpl instance = new CartUnfrozenMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CartUnfrozenMessagePayload
     * @return builder
     */
    public static CartUnfrozenMessagePayloadBuilder builder() {
        return CartUnfrozenMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartUnfrozenMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartUnfrozenMessagePayloadBuilder builder(final CartUnfrozenMessagePayload template) {
        return CartUnfrozenMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartUnfrozenMessagePayload(Function<CartUnfrozenMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartUnfrozenMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartUnfrozenMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartUnfrozenMessagePayload>";
            }
        };
    }
}
