
package com.commercetools.checkout.models.recurring_payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RecurringPaymentSetRecurringOrderUpdateActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RecurringPaymentSetRecurringOrderUpdateAction recurringPaymentSetRecurringOrderUpdateAction = RecurringPaymentSetRecurringOrderUpdateAction.builder()
 *             .recurringOrder(recurringOrderBuilder -> recurringOrderBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RecurringPaymentSetRecurringOrderUpdateActionBuilder
        implements Builder<RecurringPaymentSetRecurringOrderUpdateAction> {

    private com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder;

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentSetRecurringOrderUpdateActionBuilder recurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @param builder function to build the recurringOrder value
     * @return Builder
     */

    public RecurringPaymentSetRecurringOrderUpdateActionBuilder withRecurringOrder(
            Function<com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder, com.commercetools.checkout.models.recurring_payment.RecurringOrderReference> builder) {
        this.recurringOrder = builder
                .apply(com.commercetools.checkout.models.recurring_payment.RecurringOrderReferenceBuilder.of());
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @param recurringOrder value to be set
     * @return Builder
     */

    public RecurringPaymentSetRecurringOrderUpdateActionBuilder recurringOrder(
            final com.commercetools.checkout.models.recurring_payment.RecurringOrderReference recurringOrder) {
        this.recurringOrder = recurringOrder;
        return this;
    }

    /**
     *  <p><a href="https://docs.commercetools.com/apis/ctp:api:type:RecurringOrder" rel="nofollow">RecurringOrder</a> to set.</p>
     * @return recurringOrder
     */

    public com.commercetools.checkout.models.recurring_payment.RecurringOrderReference getRecurringOrder() {
        return this.recurringOrder;
    }

    /**
     * builds RecurringPaymentSetRecurringOrderUpdateAction with checking for non-null required values
     * @return RecurringPaymentSetRecurringOrderUpdateAction
     */
    public RecurringPaymentSetRecurringOrderUpdateAction build() {
        Objects.requireNonNull(recurringOrder,
            RecurringPaymentSetRecurringOrderUpdateAction.class + ": recurringOrder is missing");
        return new RecurringPaymentSetRecurringOrderUpdateActionImpl(recurringOrder);
    }

    /**
     * builds RecurringPaymentSetRecurringOrderUpdateAction without checking for non-null required values
     * @return RecurringPaymentSetRecurringOrderUpdateAction
     */
    public RecurringPaymentSetRecurringOrderUpdateAction buildUnchecked() {
        return new RecurringPaymentSetRecurringOrderUpdateActionImpl(recurringOrder);
    }

    /**
     * factory method for an instance of RecurringPaymentSetRecurringOrderUpdateActionBuilder
     * @return builder
     */
    public static RecurringPaymentSetRecurringOrderUpdateActionBuilder of() {
        return new RecurringPaymentSetRecurringOrderUpdateActionBuilder();
    }

    /**
     * create builder for RecurringPaymentSetRecurringOrderUpdateAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RecurringPaymentSetRecurringOrderUpdateActionBuilder of(
            final RecurringPaymentSetRecurringOrderUpdateAction template) {
        RecurringPaymentSetRecurringOrderUpdateActionBuilder builder = new RecurringPaymentSetRecurringOrderUpdateActionBuilder();
        builder.recurringOrder = template.getRecurringOrder();
        return builder;
    }

}
