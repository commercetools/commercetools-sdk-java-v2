
package com.commercetools.checkout.models.payment_intents;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentResponseBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntentResponse paymentIntentResponse = PaymentIntentResponse.builder()
 *             .outcome(PaymentIntentOutcome.APPROVED)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentResponseBuilder implements Builder<PaymentIntentResponse> {

    private com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome outcome;

    /**
     *  <p>The outcome of the Payment Intent as reported by the payment <span>Connector</span>.</p>
     * @param outcome value to be set
     * @return Builder
     */

    public PaymentIntentResponseBuilder outcome(
            final com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome outcome) {
        this.outcome = outcome;
        return this;
    }

    /**
     *  <p>The outcome of the Payment Intent as reported by the payment <span>Connector</span>.</p>
     * @return outcome
     */

    public com.commercetools.checkout.models.payment_intents.PaymentIntentOutcome getOutcome() {
        return this.outcome;
    }

    /**
     * builds PaymentIntentResponse with checking for non-null required values
     * @return PaymentIntentResponse
     */
    public PaymentIntentResponse build() {
        Objects.requireNonNull(outcome, PaymentIntentResponse.class + ": outcome is missing");
        return new PaymentIntentResponseImpl(outcome);
    }

    /**
     * builds PaymentIntentResponse without checking for non-null required values
     * @return PaymentIntentResponse
     */
    public PaymentIntentResponse buildUnchecked() {
        return new PaymentIntentResponseImpl(outcome);
    }

    /**
     * factory method for an instance of PaymentIntentResponseBuilder
     * @return builder
     */
    public static PaymentIntentResponseBuilder of() {
        return new PaymentIntentResponseBuilder();
    }

    /**
     * create builder for PaymentIntentResponse instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntentResponseBuilder of(final PaymentIntentResponse template) {
        PaymentIntentResponseBuilder builder = new PaymentIntentResponseBuilder();
        builder.outcome = template.getOutcome();
        return builder;
    }

}
