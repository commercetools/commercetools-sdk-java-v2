
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discount is applied to the total price of the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountTotalPriceTarget cartDiscountTotalPriceTarget = CartDiscountTotalPriceTarget.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountTotalPriceTargetImpl.class)
public interface CartDiscountTotalPriceTarget extends CartDiscountTarget {

    /**
     * discriminator value for CartDiscountTotalPriceTarget
     */
    String TOTAL_PRICE = "totalPrice";

    /**
     * factory method
     * @return instance of CartDiscountTotalPriceTarget
     */
    public static CartDiscountTotalPriceTarget of() {
        return new CartDiscountTotalPriceTargetImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountTotalPriceTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountTotalPriceTarget of(final CartDiscountTotalPriceTarget template) {
        CartDiscountTotalPriceTargetImpl instance = new CartDiscountTotalPriceTargetImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountTotalPriceTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountTotalPriceTarget deepCopy(@Nullable final CartDiscountTotalPriceTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountTotalPriceTargetImpl instance = new CartDiscountTotalPriceTargetImpl();
        return instance;
    }

    /**
     * builder factory method for CartDiscountTotalPriceTarget
     * @return builder
     */
    public static CartDiscountTotalPriceTargetBuilder builder() {
        return CartDiscountTotalPriceTargetBuilder.of();
    }

    /**
     * create builder for CartDiscountTotalPriceTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountTotalPriceTargetBuilder builder(final CartDiscountTotalPriceTarget template) {
        return CartDiscountTotalPriceTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountTotalPriceTarget(Function<CartDiscountTotalPriceTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountTotalPriceTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountTotalPriceTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountTotalPriceTarget>";
            }
        };
    }
}
