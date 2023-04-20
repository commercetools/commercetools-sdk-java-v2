
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartRemovePaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartRemovePaymentAction myCartRemovePaymentAction = MyCartRemovePaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartRemovePaymentActionBuilder implements Builder<MyCartRemovePaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public MyCartRemovePaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public MyCartRemovePaymentActionBuilder withPayment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifier> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of());
        return this;
    }

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @param payment value to be set
     * @return Builder
     */

    public MyCartRemovePaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to remove from the Cart.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds MyCartRemovePaymentAction with checking for non-null required values
     * @return MyCartRemovePaymentAction
     */
    public MyCartRemovePaymentAction build() {
        Objects.requireNonNull(payment, MyCartRemovePaymentAction.class + ": payment is missing");
        return new MyCartRemovePaymentActionImpl(payment);
    }

    /**
     * builds MyCartRemovePaymentAction without checking for non-null required values
     * @return MyCartRemovePaymentAction
     */
    public MyCartRemovePaymentAction buildUnchecked() {
        return new MyCartRemovePaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of MyCartRemovePaymentActionBuilder
     * @return builder
     */
    public static MyCartRemovePaymentActionBuilder of() {
        return new MyCartRemovePaymentActionBuilder();
    }

    /**
     * create builder for MyCartRemovePaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartRemovePaymentActionBuilder of(final MyCartRemovePaymentAction template) {
        MyCartRemovePaymentActionBuilder builder = new MyCartRemovePaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
