
package com.commercetools.api.models.cart_discount;

import java.time.*;
import java.util.*;
import java.util.function.Function;

import javax.annotation.Nullable;

import com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft;
import com.fasterxml.jackson.annotation.*;
import com.fasterxml.jackson.databind.annotation.*;

import io.vrap.rmf.base.client.utils.Generated;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotNull;

/**
 *  <p>Sets the scope of the Cart Discount for Recurring Orders.</p>
 *
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartDiscountSetRecurringOrderScopeAction cartDiscountSetRecurringOrderScopeAction = CartDiscountSetRecurringOrderScopeAction.builder()
 *             .recurringOrderScope(recurringOrderScopeBuilder -> recurringOrderScopeBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@io.vrap.rmf.base.client.utils.json.SubType("setRecurringOrderScope")
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
@JsonDeserialize(as = CartDiscountSetRecurringOrderScopeActionImpl.class)
public interface CartDiscountSetRecurringOrderScopeAction extends CartDiscountUpdateAction {

    /**
     * discriminator value for CartDiscountSetRecurringOrderScopeAction
     */
    String SET_RECURRING_ORDER_SCOPE = "setRecurringOrderScope";

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     * @return recurringOrderScope
     */
    @NotNull
    @Valid
    @JsonProperty("recurringOrderScope")
    public RecurringOrderScopeDraft getRecurringOrderScope();

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     * @param recurringOrderScope value to be set
     */

    public void setRecurringOrderScope(final RecurringOrderScopeDraft recurringOrderScope);

    /**
     * factory method
     * @return instance of CartDiscountSetRecurringOrderScopeAction
     */
    public static CartDiscountSetRecurringOrderScopeAction of() {
        return new CartDiscountSetRecurringOrderScopeActionImpl();
    }

    /**
     * factory method to create a shallow copy CartDiscountSetRecurringOrderScopeAction
     * @param template instance to be copied
     * @return copy instance
     */
    public static CartDiscountSetRecurringOrderScopeAction of(final CartDiscountSetRecurringOrderScopeAction template) {
        CartDiscountSetRecurringOrderScopeActionImpl instance = new CartDiscountSetRecurringOrderScopeActionImpl();
        instance.setRecurringOrderScope(template.getRecurringOrderScope());
        return instance;
    }

    public CartDiscountSetRecurringOrderScopeAction copyDeep();

    /**
     * factory method to create a deep copy of CartDiscountSetRecurringOrderScopeAction
     * @param template instance to be copied
     * @return copy instance
     */
    @Nullable
    public static CartDiscountSetRecurringOrderScopeAction deepCopy(
            @Nullable final CartDiscountSetRecurringOrderScopeAction template) {
        if (template == null) {
            return null;
        }
        CartDiscountSetRecurringOrderScopeActionImpl instance = new CartDiscountSetRecurringOrderScopeActionImpl();
        instance.setRecurringOrderScope(com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft
                .deepCopy(template.getRecurringOrderScope()));
        return instance;
    }

    /**
     * builder factory method for CartDiscountSetRecurringOrderScopeAction
     * @return builder
     */
    public static CartDiscountSetRecurringOrderScopeActionBuilder builder() {
        return CartDiscountSetRecurringOrderScopeActionBuilder.of();
    }

    /**
     * create builder for CartDiscountSetRecurringOrderScopeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetRecurringOrderScopeActionBuilder builder(
            final CartDiscountSetRecurringOrderScopeAction template) {
        return CartDiscountSetRecurringOrderScopeActionBuilder.of(template);
    }

    /**
     * accessor map function
     * @param <T> mapped type
     * @param helper function to map the object
     * @return mapped value
     */
    default <T> T withCartDiscountSetRecurringOrderScopeAction(
            Function<CartDiscountSetRecurringOrderScopeAction, T> helper) {
        return helper.apply(this);
    }

    /**
     * gives a TypeReference for usage with Jackson DataBind
     * @return TypeReference
     */
    public static com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetRecurringOrderScopeAction> typeReference() {
        return new com.fasterxml.jackson.core.type.TypeReference<CartDiscountSetRecurringOrderScopeAction>() {
            @Override
            public String toString() {
                return "TypeReference<CartDiscountSetRecurringOrderScopeAction>";
            }
        };
    }
}
