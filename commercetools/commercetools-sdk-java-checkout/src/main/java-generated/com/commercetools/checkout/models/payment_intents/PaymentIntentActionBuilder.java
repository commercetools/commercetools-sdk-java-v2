
package com.commercetools.checkout.models.payment_intents;

import java.util.*;

import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntentActionBuilder
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntentActionBuilder {

    public com.commercetools.checkout.models.payment_intents.PaymentIntentCancelActionBuilder cancelPaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentCancelActionBuilder.of();
    }

    public com.commercetools.checkout.models.payment_intents.PaymentIntentCaptureActionBuilder capturePaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentCaptureActionBuilder.of();
    }

    public com.commercetools.checkout.models.payment_intents.PaymentIntentRefundActionBuilder refundPaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentRefundActionBuilder.of();
    }

    public com.commercetools.checkout.models.payment_intents.PaymentIntentReverseActionBuilder reversePaymentBuilder() {
        return com.commercetools.checkout.models.payment_intents.PaymentIntentReverseActionBuilder.of();
    }

    /**
     * factory method for an instance of PaymentIntentActionBuilder
     * @return builder
     */
    public static PaymentIntentActionBuilder of() {
        return new PaymentIntentActionBuilder();
    }

}
