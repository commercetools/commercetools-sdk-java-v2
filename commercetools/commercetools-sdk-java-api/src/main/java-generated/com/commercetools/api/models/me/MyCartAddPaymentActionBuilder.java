
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyCartAddPaymentActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyCartAddPaymentAction myCartAddPaymentAction = MyCartAddPaymentAction.builder()
 *             .payment(paymentBuilder -> paymentBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartAddPaymentActionBuilder implements Builder<MyCartAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param builder function to build the payment value
     * @return Builder
     */

    public MyCartAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @param payment value to be set
     * @return Builder
     */

    public MyCartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    /**
     *  <p>Payment to add to the Cart. Must not be assigned to another Order or active Cart already.</p>
     * @return payment
     */

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    /**
     * builds MyCartAddPaymentAction with checking for non-null required values
     * @return MyCartAddPaymentAction
     */
    public MyCartAddPaymentAction build() {
        Objects.requireNonNull(payment, MyCartAddPaymentAction.class + ": payment is missing");
        return new MyCartAddPaymentActionImpl(payment);
    }

    /**
     * builds MyCartAddPaymentAction without checking for non-null required values
     * @return MyCartAddPaymentAction
     */
    public MyCartAddPaymentAction buildUnchecked() {
        return new MyCartAddPaymentActionImpl(payment);
    }

    /**
     * factory method for an instance of MyCartAddPaymentActionBuilder
     * @return builder
     */
    public static MyCartAddPaymentActionBuilder of() {
        return new MyCartAddPaymentActionBuilder();
    }

    /**
     * create builder for MyCartAddPaymentAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
