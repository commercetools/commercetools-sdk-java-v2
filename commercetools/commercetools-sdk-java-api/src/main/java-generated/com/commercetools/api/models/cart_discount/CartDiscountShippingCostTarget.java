
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 *  <p>Discount is applied to the shipping costs of the Cart.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountShippingCostTarget cartDiscountShippingCostTarget = CartDiscountShippingCostTarget.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountShippingCostTargetImpl.class)
public interface CartDiscountShippingCostTarget extends CartDiscountTarget {

    /**
     * discriminator value for CartDiscountShippingCostTarget
     */
    String SHIPPING = "shipping";

    /**
     * factory method
     * @return instance of CartDiscountShippingCostTarget
     */
    public static CartDiscountShippingCostTarget of() {
        return new CartDiscountShippingCostTargetImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountShippingCostTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountShippingCostTarget of(final CartDiscountShippingCostTarget template) {
        CartDiscountShippingCostTargetImpl instance = new CartDiscountShippingCostTargetImpl();
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountShippingCostTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountShippingCostTarget deepCopy(@Nullable final CartDiscountShippingCostTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountShippingCostTargetImpl instance = new CartDiscountShippingCostTargetImpl();
        return instance;
    }

    /**
     * builder factory method for CartDiscountShippingCostTarget
     * @return builder
     */
    public static CartDiscountShippingCostTargetBuilder builder() {
        return CartDiscountShippingCostTargetBuilder.of();
    }

    /**
     * create builder for CartDiscountShippingCostTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountShippingCostTargetBuilder builder(final CartDiscountShippingCostTarget template) {
        return CartDiscountShippingCostTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountShippingCostTarget(Function<CartDiscountShippingCostTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountShippingCostTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountShippingCostTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountShippingCostTarget>";
            }
        };
    }
}
