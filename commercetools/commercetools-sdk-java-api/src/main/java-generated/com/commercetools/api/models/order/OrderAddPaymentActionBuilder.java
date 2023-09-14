
package com.commercetools.api.models.order;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderAddPaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderAddPaymentAction orderAddPaymentAction = OrderAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderAddPaymentActionBuilder implements Builder<OrderAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public OrderAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public OrderAddPaymentActionBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifier> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     * @return Builder
     */

    public OrderAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to add to the PaymentInfo. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds OrderAddPaymentAction with checking for non-null required values
     * @return OrderAddPaymentAction
     */
    public OrderAddPaymentAction build() {
        Objects.requireNonNull(payment, OrderAddPaymentAction.class + ": payment is missing");
        return new OrderAddPaymentActionImpl(payment);
    }

    /**
     * builds OrderAddPaymentAction without checking for non-null required values
     * @return OrderAddPaymentAction
     */
    public OrderAddPaymentAction buildUnchecked() {
        return new OrderAddPaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of OrderAddPaymentActionBuilder
     * @return builder
     */
    public static OrderAddPaymentActionBuilder of() {
        return new OrderAddPaymentActionBuilder();
    }

    /**
     * create builder for OrderAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderAddPaymentActionBuilder of(final OrderAddPaymentAction template) {
        OrderAddPaymentActionBuilder builder = new OrderAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
