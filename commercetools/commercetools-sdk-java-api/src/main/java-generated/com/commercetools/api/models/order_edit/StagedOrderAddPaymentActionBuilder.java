
package com.commercetools.api.models.order_edit;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * StagedOrderAddPaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     StagedOrderAddPaymentAction stagedOrderAddPaymentAction = StagedOrderAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class StagedOrderAddPaymentActionBuilder implements Builder<StagedOrderAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>ResourceIdentifier of a Payment.</p>
     * @return Builder
     */

    public StagedOrderAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier of a Payment.</p>
     * @param payment
     * @return Builder
     */

    public StagedOrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public StagedOrderAddPaymentAction build() {
        Objects.requireNonNull(payment, StagedOrderAddPaymentAction.class + ": payment is missing");
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    /**
     * builds StagedOrderAddPaymentAction without checking for non null required values
     */
    public StagedOrderAddPaymentAction buildUnchecked() {
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    public static StagedOrderAddPaymentActionBuilder of() {
        return new StagedOrderAddPaymentActionBuilder();
    }

    public static StagedOrderAddPaymentActionBuilder of(final StagedOrderAddPaymentAction template) {
        StagedOrderAddPaymentActionBuilder builder = new StagedOrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
