
package com.commercetools.api.models.message;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.cart_discount.CartDiscount;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Generated after a successful Create CartDiscount request.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCreatedMessagePayload cartDiscountCreatedMessagePayload = CartDiscountCreatedMessagePayload.builder()
 *             .cartDiscount(cartDiscountBuilder -> cartDiscountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("CartDiscountCreated")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountCreatedMessagePayloadImpl.class)
public interface CartDiscountCreatedMessagePayload extends MessagePayload {

    /**
     * discriminator value for CartDiscountCreatedMessagePayload
     */
    String CART_DISCOUNT_CREATED = "CartDiscountCreated";

    /**
     *  <p>The Cart Discount that was created.</p>
     * @return cartDiscount
     */
    @NotNull
    @Valid
    @JsonProperty("cartDiscount")
    public CartDiscount getCartDiscount();

    /**
     *  <p>The Cart Discount that was created.</p>
     * @param cartDiscount value to be set
     */

    public void setCartDiscount(final CartDiscount cartDiscount);

    /**
     * factory method
     * @return instance of CartDiscountCreatedMessagePayload
     */
    public static CartDiscountCreatedMessagePayload of() {
        return new CartDiscountCreatedMessagePayloadImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountCreatedMessagePayload of(final CartDiscountCreatedMessagePayload template) {
        CartDiscountCreatedMessagePayloadImpl instance = new CartDiscountCreatedMessagePayloadImpl();
        instance.setCartDiscount(template.getCartDiscount());
        return instance;
    }

    public CartDiscountCreatedMessagePayload copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountCreatedMessagePayload
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountCreatedMessagePayload deepCopy(
            @Nullable final CartDiscountCreatedMessagePayload template) {
        if (template == null) {
            return null;
        }
        CartDiscountCreatedMessagePayloadImpl instance = new CartDiscountCreatedMessagePayloadImpl();
        instance.setCartDiscount(
            com.commercetools.api.models.cart_discount.CartDiscount.deepCopy(template.getCartDiscount()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountCreatedMessagePayload
     * @return builder
     */
    public static CartDiscountCreatedMessagePayloadBuilder builder() {
        return CartDiscountCreatedMessagePayloadBuilder.of();
    }

    /**
     * create builder for CartDiscountCreatedMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountCreatedMessagePayloadBuilder builder(final CartDiscountCreatedMessagePayload template) {
        return CartDiscountCreatedMessagePayloadBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountCreatedMessagePayload(Function<CartDiscountCreatedMessagePayload, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountCreatedMessagePayload> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountCreatedMessagePayload>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountCreatedMessagePayload>";
            }
        };
    }
}
