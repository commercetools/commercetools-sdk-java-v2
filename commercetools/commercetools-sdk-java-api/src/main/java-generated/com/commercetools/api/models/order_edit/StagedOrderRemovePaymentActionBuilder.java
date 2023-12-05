
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderRemovePaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderRemovePaymentAction stagedOrderRemovePaymentAction = StagedOrderRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderRemovePaymentActionBuilder implements Builder<StagedOrderRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public StagedOrderRemovePaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public StagedOrderRemovePaymentActionBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifier> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @param payment value to be set
     * @return Builder
     */

    public StagedOrderRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to remove from the PaymentInfo.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds StagedOrderRemovePaymentAction with checking for non-null required values
     * @return StagedOrderRemovePaymentAction
     */
    public StagedOrderRemovePaymentAction build() {
        Objects.requireNonNull(payment, StagedOrderRemovePaymentAction.class + ": payment is missing");
        return new StagedOrderRemovePaymentActionImpl(payment);
    }

    /**
     * builds StagedOrderRemovePaymentAction without checking for non-null required values
     * @return StagedOrderRemovePaymentAction
     */
    public StagedOrderRemovePaymentAction buildUnchecked() {
        return new StagedOrderRemovePaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of StagedOrderRemovePaymentActionBuilder
     * @return builder
     */
    public static StagedOrderRemovePaymentActionBuilder of() {
        return new StagedOrderRemovePaymentActionBuilder();
    }

    /**
     * create builder for StagedOrderRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderRemovePaymentActionBuilder of(final StagedOrderRemovePaymentAction template) {
        StagedOrderRemovePaymentActionBuilder builder = new StagedOrderRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
