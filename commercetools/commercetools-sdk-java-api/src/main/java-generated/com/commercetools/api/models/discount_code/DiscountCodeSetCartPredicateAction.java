
package com.commercetools.api.models.discount_code;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeSetCartPredicateAction
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeSetCartPredicateAction discountCodeSetCartPredicateAction = DiscountCodeSetCartPredicateAction.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = DiscountCodeSetCartPredicateActionImpl.class)
public interface DiscountCodeSetCartPredicateAction extends DiscountCodeUpdateAction {

    /**
     * discriminator value for DiscountCodeSetCartPredicateAction
     */
    String SET_CART_PREDICATE = "setCartPredicate";

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @return cartPredicate
     */

    @JsonProperty("cartPredicate")
    public String getCartPredicate();

    /**
     *  <p>Value to set. If empty, any existing value will be removed.</p>
     * @param cartPredicate value to be set
     */

    public void setCartPredicate(final String cartPredicate);

    /**
     * factory method
     * @return instance of DiscountCodeSetCartPredicateAction
     */
    public static DiscountCodeSetCartPredicateAction of() {
        return new DiscountCodeSetCartPredicateActionImpl();
    }

    /**
     * factory method to create a shallow copy DiscountCodeSetCartPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static DiscountCodeSetCartPredicateAction of(final DiscountCodeSetCartPredicateAction template) {
        DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    /**
     * factory method to create a deep copy of DiscountCodeSetCartPredicateAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static DiscountCodeSetCartPredicateAction deepCopy(
            @Nullable final DiscountCodeSetCartPredicateAction template) {
        if (template == null) {
            return null;
        }
        DiscountCodeSetCartPredicateActionImpl instance = new DiscountCodeSetCartPredicateActionImpl();
        instance.setCartPredicate(template.getCartPredicate());
        return instance;
    }

    /**
     * builder factory method for DiscountCodeSetCartPredicateAction
     * @return builder
     */
    public static DiscountCodeSetCartPredicateActionBuilder builder() {
        return DiscountCodeSetCartPredicateActionBuilder.of();
    }

    /**
     * create builder for DiscountCodeSetCartPredicateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeSetCartPredicateActionBuilder builder(final DiscountCodeSetCartPredicateAction template) {
        return DiscountCodeSetCartPredicateActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withDiscountCodeSetCartPredicateAction(Function<DiscountCodeSetCartPredicateAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCartPredicateAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<DiscountCodeSetCartPredicateAction>() {
            @Override
            public String toString() {
                return "TypeReference<DiscountCodeSetCartPredicateAction>";
            }
        };
    }
}
