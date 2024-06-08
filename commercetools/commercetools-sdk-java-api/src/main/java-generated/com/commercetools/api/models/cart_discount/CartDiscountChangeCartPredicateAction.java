
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
 * CartDiscountChangeCartPredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountChangeCartPredicateAction cartDiscountChangeCartPredicateAction = CartDiscountChangeCartPredicateAction.builder()
 *             .cartPredicate("{cartPredicate}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountChangeCartPredicateActionImpl.class)
public interface CartDiscountChangeCartPredicateAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountChangeCartPredicateAction
     */
    String CHANGE_CART_PREDICATE = "changeCartPredicate";

    /**
     *  <p>New value to set.</p>
     * @return cartPredicate
     */
    @NotNull
    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>New value to set.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     * factory method
     * @return instance of CartDiscountChangeCartPredicateAction
     */
    public static CartDiscountChangeCartPredicateAction of() {
        return new CartDiscountChangeCartPredicateActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountChangeCartPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountChangeCartPredicateAction of(final CartDiscountChangeCartPredicateAction template) {
        CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of CartDiscountChangeCartPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountChangeCartPredicateAction deepCopy(
            @Nullable final CartDiscountChangeCartPredicateAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountChangeCartPredicateActionImpl instance = new CartDiscountChangeCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    /**
     * builder factory method for CartDiscountChangeCartPredicateAction
     * @return builder
     */
    public static CartDiscountChangeCartPredicateActionBuilder builder() {
        return CartDiscountChangeCartPredicateActionBuilder.of();
    }

    /**
     * create builder for CartDiscountChangeCartPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountChangeCartPredicateActionBuilder builder(
            final CartDiscountChangeCartPredicateAction template) {
        return CartDiscountChangeCartPredicateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountChangeCartPredicateAction(Function<CartDiscountChangeCartPredicateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeCartPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountChangeCartPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountChangeCartPredicateAction>";
            }
        };
    }
}
