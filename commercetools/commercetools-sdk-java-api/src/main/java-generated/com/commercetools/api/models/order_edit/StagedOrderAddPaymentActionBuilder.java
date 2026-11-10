
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
     *  <p>Payment to add to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentInfo" rel="nofollow">PaymentInfo</a>. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public StagedOrderAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to add to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentInfo" rel="nofollow">PaymentInfo</a>. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public StagedOrderAddPaymentActionBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifier> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Payment to add to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentInfo" rel="nofollow">PaymentInfo</a>. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     * @return Builder
     */

    public StagedOrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to add to the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentInfo" rel="nofollow">PaymentInfo</a>. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds StagedOrderAddPaymentAction with checking for non-null required values
     * @return StagedOrderAddPaymentAction
     */
    public StagedOrderAddPaymentAction build() {
        Objects.requireNonNull(payment, StagedOrderAddPaymentAction.class + ": payment is missing");
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    /**
     * builds StagedOrderAddPaymentAction without checking for non-null required values
     * @return StagedOrderAddPaymentAction
     */
    public StagedOrderAddPaymentAction buildUnchecked() {
        return new StagedOrderAddPaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of StagedOrderAddPaymentActionBuilder
     * @return builder
     */
    public static StagedOrderAddPaymentActionBuilder of() {
        return new StagedOrderAddPaymentActionBuilder();
    }

    /**
     * create builder for StagedOrderAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static StagedOrderAddPaymentActionBuilder of(final StagedOrderAddPaymentAction template) {
        StagedOrderAddPaymentActionBuilder builder = new StagedOrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
