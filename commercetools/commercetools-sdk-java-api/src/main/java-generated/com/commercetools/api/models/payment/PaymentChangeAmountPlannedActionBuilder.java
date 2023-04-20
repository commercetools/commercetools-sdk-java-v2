
package com.commercetools.api.models.payment;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentChangeAmountPlannedActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentChangeAmountPlannedAction paymentChangeAmountPlannedAction = PaymentChangeAmountPlannedAction.builder()
 *             .amount(amountBuilder -> amountBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentChangeAmountPlannedActionBuilder implements Builder<PaymentChangeAmountPlannedAction> {

    private com.commercetools.api.models.common.Money amount;

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentChangeAmountPlannedActionBuilder amount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.MoneyBuilder> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of()).build();
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param builder function to build the amount value
     * @return Builder
     */

    public PaymentChangeAmountPlannedActionBuilder withAmount(
            Function<com.commercetools.api.models.common.MoneyBuilder, com.commercetools.api.models.common.Money> builder) {
        this.amount = builder.apply(com.commercetools.api.models.common.MoneyBuilder.of());
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @param amount value to be set
     * @return Builder
     */

    public PaymentChangeAmountPlannedActionBuilder amount(final com.commercetools.api.models.common.Money amount) {
        this.amount = amount;
        return this;
    }

    /**
     *  <p>New value to set.</p>
     * @return amount
     */

    public com.commercetools.api.models.common.Money getAmount() {
        return this.amount;
    }

    /**
     * builds PaymentChangeAmountPlannedAction with checking for non-null required values
     * @return PaymentChangeAmountPlannedAction
     */
    public PaymentChangeAmountPlannedAction build() {
        Objects.requireNonNull(amount, PaymentChangeAmountPlannedAction.class + ": amount is missing");
        return new PaymentChangeAmountPlannedActionImpl(amount);
    }

    /**
     * builds PaymentChangeAmountPlannedAction without checking for non-null required values
     * @return PaymentChangeAmountPlannedAction
     */
    public PaymentChangeAmountPlannedAction buildUnchecked() {
        return new PaymentChangeAmountPlannedActionImpl(amount);
    }

    /**
     * factory method for an instance of PaymentChangeAmountPlannedActionBuilder
     * @return builder
     */
    public static PaymentChangeAmountPlannedActionBuilder of() {
        return new PaymentChangeAmountPlannedActionBuilder();
    }

    /**
     * create builder for PaymentChangeAmountPlannedAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentChangeAmountPlannedActionBuilder of(final PaymentChangeAmountPlannedAction template) {
        PaymentChangeAmountPlannedActionBuilder builder = new PaymentChangeAmountPlannedActionBuilder();
        builder.amount = template.getAmount();
        return builder;
    }

}
