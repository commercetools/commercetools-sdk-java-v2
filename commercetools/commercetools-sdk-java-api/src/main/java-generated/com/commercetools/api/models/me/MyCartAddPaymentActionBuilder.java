
package com.commercetools.api.models.me;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 Example to create an instance using the builder pattern
 <div class=code-example>
 <pre><code class='java'>
   MyCartAddPaymentAction myCartAddPaymentAction = MyCartAddPaymentAction.builder()
           .payment(paymentBuilder -> paymentBuilder)
           .build()
 </code></pre>
 </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyCartAddPaymentActionBuilder implements Builder<MyCartAddPaymentAction> {

    private com.commercetools.api.models.payment.PaymentResourceIdentifier payment;

    /**
     *  <p>ResourceIdentifier to a Payment.</p>
     */

    public MyCartAddPaymentActionBuilder payment(
            Function<com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder, com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder> builder) {
        this.payment = builder.apply(com.commercetools.api.models.payment.PaymentResourceIdentifierBuilder.of())
                .build();
        return this;
    }

    /**
     *  <p>ResourceIdentifier to a Payment.</p>
     */

    public MyCartAddPaymentActionBuilder payment(
            final com.commercetools.api.models.payment.PaymentResourceIdentifier payment) {
        this.payment = payment;
        return this;
    }

    public com.commercetools.api.models.payment.PaymentResourceIdentifier getPayment() {
        return this.payment;
    }

    public MyCartAddPaymentAction build() {
        Objects.requireNonNull(payment, MyCartAddPaymentAction.class + ": payment is missing");
        return new MyCartAddPaymentActionImpl(payment);
    }

    /**
     * builds MyCartAddPaymentAction without checking for non null required values
     */
    public MyCartAddPaymentAction buildUnchecked() {
        return new MyCartAddPaymentActionImpl(payment);
    }

    public static MyCartAddPaymentActionBuilder of() {
        return new MyCartAddPaymentActionBuilder();
    }

    public static MyCartAddPaymentActionBuilder of(final MyCartAddPaymentAction template) {
        MyCartAddPaymentActionBuilder builder = new MyCartAddPaymentActionBuilder();
        builder.payment = template.getPayment();
        return builder;
    }

}
