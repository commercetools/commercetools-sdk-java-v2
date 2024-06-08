
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
 *  <p>Discount is applied to CustomLineItems matching the <code>predicate</code>.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountCustomLineItemsTarget cartDiscountCustomLineItemsTarget = CartDiscountCustomLineItemsTarget.builder()
 *             .predicate("{predicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountCustomLineItemsTargetImpl.class)
public interface CartDiscountCustomLineItemsTarget extends CartDiscountTarget {

    /**
     * discriminator value for CartDiscountCustomLineItemsTarget
     */
    String CUSTOM_LINE_ITEMS = "customLineItems";

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @return predicate
     */
    @NotNull
    @JsonProperty("predicate")
    public String getPredicate();

    /**
     *  <p>Valid CustomLineItem target predicate.</p>
     * @param predicate value to be set
     */

    public void setPredicate(final String predicate);

    /**
     * factory method
     * @return instance of CartDiscountCustomLineItemsTarget
     */
    public static CartDiscountCustomLineItemsTarget of() {
        return new CartDiscountCustomLineItemsTargetImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountCustomLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountCustomLineItemsTarget of(final CartDiscountCustomLineItemsTarget template) {
        CartDiscountCustomLineItemsTargetImpl instance = new CartDiscountCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountCustomLineItemsTarget
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountCustomLineItemsTarget deepCopy(
            @Nullable final CartDiscountCustomLineItemsTarget template) {
        if (template == null) {
            return null;
        }
        CartDiscountCustomLineItemsTargetImpl instance = new CartDiscountCustomLineItemsTargetImpl();
        instance.setPredicate(template.getPredicate());
        return instance;
    }

    /**
     * builder factory method for CartDiscountCustomLineItemsTarget
     * @return builder
     */
    public static CartDiscountCustomLineItemsTargetBuilder builder() {
        return CartDiscountCustomLineItemsTargetBuilder.of();
    }

    /**
     * create builder for CartDiscountCustomLineItemsTarget instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountCustomLineItemsTargetBuilder builder(final CartDiscountCustomLineItemsTarget template) {
        return CartDiscountCustomLineItemsTargetBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountCustomLineItemsTarget(Function<CartDiscountCustomLineItemsTarget, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountCustomLineItemsTarget> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountCustomLineItemsTarget>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountCustomLineItemsTarget>";
            }
        };
    }
}
