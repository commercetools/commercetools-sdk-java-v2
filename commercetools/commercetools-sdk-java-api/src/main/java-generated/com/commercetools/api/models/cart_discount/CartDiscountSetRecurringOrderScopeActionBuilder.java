
package com.commercetools.api.models.cart_discount;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartDiscountSetRecurringOrderScopeActionBuilder
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
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartDiscountSetRecurringOrderScopeActionBuilder
        implements Builder<CartDiscountSetRecurringOrderScopeAction> {

    private com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope;

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     * @param recurringOrderScope value to be set
     * @return Builder
     */

    public CartDiscountSetRecurringOrderScopeActionBuilder recurringOrderScope(
            final com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft recurringOrderScope) {
        this.recurringOrderScope = recurringOrderScope;
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     * @param builder function to build the recurringOrderScope value
     * @return Builder
     */

    public CartDiscountSetRecurringOrderScopeActionBuilder recurringOrderScope(
            Function<com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftBuilder, Builder<? extends com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft>> builder) {
        this.recurringOrderScope = builder
                .apply(com.commercetools.api.models.recurring_order.RecurringOrderScopeDraftBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Scope of the Cart Discount for Recurring Orders.</p>
     * @return recurringOrderScope
     */

    public com.commercetools.api.models.recurring_order.RecurringOrderScopeDraft getRecurringOrderScope() {
        return this.recurringOrderScope;
    }

    /**
     * builds CartDiscountSetRecurringOrderScopeAction with checking for non-null required values
     * @return CartDiscountSetRecurringOrderScopeAction
     */
    public CartDiscountSetRecurringOrderScopeAction build() {
        Objects.requireNonNull(recurringOrderScope,
            CartDiscountSetRecurringOrderScopeAction.class + ": recurringOrderScope is missing");
        return new CartDiscountSetRecurringOrderScopeActionImpl(recurringOrderScope);
    }

    /**
     * builds CartDiscountSetRecurringOrderScopeAction without checking for non-null required values
     * @return CartDiscountSetRecurringOrderScopeAction
     */
    public CartDiscountSetRecurringOrderScopeAction buildUnchecked() {
        return new CartDiscountSetRecurringOrderScopeActionImpl(recurringOrderScope);
    }

    /**
     * factory method for an instance of CartDiscountSetRecurringOrderScopeActionBuilder
     * @return builder
     */
    public static CartDiscountSetRecurringOrderScopeActionBuilder of() {
        return new CartDiscountSetRecurringOrderScopeActionBuilder();
    }

    /**
     * create builder for CartDiscountSetRecurringOrderScopeAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartDiscountSetRecurringOrderScopeActionBuilder of(
            final CartDiscountSetRecurringOrderScopeAction template) {
        CartDiscountSetRecurringOrderScopeActionBuilder builder = new CartDiscountSetRecurringOrderScopeActionBuilder();
        builder.recurringOrderScope = template.getRecurringOrderScope();
        return builder;
    }

}
