
package com.commercetools.api.models.cart;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartSetRecurringPaymentStrategyActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartSetRecurringPaymentStrategyAction cartSetRecurringPaymentStrategyAction = CartSetRecurringPaymentStrategyAction.builder()
 *             .paymentStrategy(PaymentStrategy.CHECKOUT)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartSetRecurringPaymentStrategyActionBuilder implements Builder<CartSetRecurringPaymentStrategyAction> {

    private com.commercetools.api.models.cart.PaymentStrategy paymentStrategy;

    /**
     *  <p>New value to set.</p>
     * @param paymentStrategy value to be set
     * @return Builder
     */

    public CartSetRecurringPaymentStrategyActionBuilder paymentStrategy(
            final com.commercetools.api.models.cart.PaymentStrategy paymentStrategy) {
        this.paymentStrategy = paymentStrategy;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return paymentStrategy
     */

    public com.commercetools.api.models.cart.PaymentStrategy getPaymentStrategy() {
        return this.paymentStrategy;
    }

    /**
     * builds CartSetRecurringPaymentStrategyAction with checking for non-null required values
     * @return CartSetRecurringPaymentStrategyAction
     */
    public CartSetRecurringPaymentStrategyAction build() {
        Objects.requireNonNull(paymentStrategy,
            CartSetRecurringPaymentStrategyAction.class + ": paymentStrategy is missing");
        return new CartSetRecurringPaymentStrategyActionImpl(paymentStrategy);
    }

    /**
     * builds CartSetRecurringPaymentStrategyAction without checking for non-null required values
     * @return CartSetRecurringPaymentStrategyAction
     */
    public CartSetRecurringPaymentStrategyAction buildUnchecked() {
        return new CartSetRecurringPaymentStrategyActionImpl(paymentStrategy);
    }

    /**
     * factory method for an instance of CartSetRecurringPaymentStrategyActionBuilder
     * @return builder
     */
    public static CartSetRecurringPaymentStrategyActionBuilder of() {
        return new CartSetRecurringPaymentStrategyActionBuilder();
    }

    /**
     * create builder for CartSetRecurringPaymentStrategyAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartSetRecurringPaymentStrategyActionBuilder of(
            final CartSetRecurringPaymentStrategyAction template) {
        CartSetRecurringPaymentStrategyActionBuilder builder = new CartSetRecurringPaymentStrategyActionBuilder();
        builder.paymentStrategy = template.getPaymentStrategy();
        return builder;
    }

}
