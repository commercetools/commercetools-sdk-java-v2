
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Generated after a successful Delete CartDiscount request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountDeletedMessagePayload cartDiscountDeletedMessagePayload = CartDiscountDeletedMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountDeletedMessagePayloadImpl.class)
public interface CartDiscountDeletedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartDiscountDeletedMessagePayload
     */
    String CART_DISCOUNT_DELETED = "CartDiscountDeleted";

    /**
     * factory method
     * @return instance of CartDiscountDeletedMessagePayload
     */
    public static CartDiscountDeletedMessagePayload of() {
        return new CartDiscountDeletedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountDeletedMessagePayload of(final CartDiscountDeletedMessagePayload template) {
        CartDiscountDeletedMessagePayloadImpl instance = new CartDiscountDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountDeletedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountDeletedMessagePayload deepCopy(
            @Nullable final CartDiscountDeletedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartDiscountDeletedMessagePayloadImpl instance = new CartDiscountDeletedMessagePayloadImpl();
        return instance;
    }

    /**
     * builder factory method for CartDiscountDeletedMessagePayload
     * @return builder
     */
    public static CartDiscountDeletedMessagePayloadBuilder builder() {
        return CartDiscountDeletedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartDiscountDeletedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountDeletedMessagePayloadBuilder builder(final CartDiscountDeletedMessagePayload template) {
        return CartDiscountDeletedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountDeletedMessagePayload(Function<CartDiscountDeletedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountDeletedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountDeletedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountDeletedMessagePayload>";
            }
        };
    }
}
