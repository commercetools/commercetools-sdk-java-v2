
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.constraints.NotNull;

/**
 * CartDiscountValue
 *
 * <hr>
 * Example to create a subtype instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountValue cartDiscountValue = CartDiscountValue.absoluteBuilder()
 *             plusMoney(moneyBuilder -> moneyBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@JsonTypeInfo(use = JsonTypeInfo.Id.NAME, include = JsonTypeInfo.As.EXISTING_PROPERTY, property = "type", defaultImpl = CartDiscountValueImpl.class, visible = true)
@JsonDeserialize(as = CartDiscountValueImpl.class)
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public interface CartDiscountValue extends CartDiscountValueMixin {

    /**
     *
     * @return type
     */
    @NotNull
    @JsonProperty("type")
    public String getType();

    public CartDiscountValue copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountValue
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountValue deepCopy(@Nullable final CartDiscountValue template) {
        if (template == null) {
            return null;
        }

        if (!(template instanceof CartDiscountValueImpl)) {
            return template.copyDeep();
        }
        CartDiscountValueImpl instance = new CartDiscountValueImpl();
        return instance;
    }

    /**
     * builder for absolute subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder absoluteBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueAbsoluteBuilder.of();
    }

    /**
     * builder for fixed subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder fixedBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueFixedBuilder.of();
    }

    /**
     * builder for giftLineItem subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder giftLineItemBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueGiftLineItemBuilder.of();
    }

    /**
     * builder for relative subtype
     * @return builder
     */
    public static com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder relativeBuilder() {
        return com.commercetools.api.models.cart_discount.CartDiscountValueRelativeBuilder.of();
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountValue(Function<CartDiscountValue, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountValue>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountValue>";
            }
        };
    }
}
