
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentMethodStatusSetMessagePayload paymentMethodPaymentMethodStatusSetMessagePayload = PaymentMethodPaymentMethodStatusSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder
        implements Builder<PaymentMethodPaymentMethodStatusSetMessagePayload> {

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodStatus status;

    @Nullable
    private com.commercetools.api.models.payment_method.PaymentMethodStatus oldStatus;

    /**
     *  <p>Status of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     * @param status value to be set
     * @return Builder
     */

    public PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder status(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodStatus status) {
        this.status = status;
        return this;
    }

    /**
     *  <p>Status of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     * @param oldStatus value to be set
     * @return Builder
     */

    public PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder oldStatus(
            @Nullable final com.commercetools.api.models.payment_method.PaymentMethodStatus oldStatus) {
        this.oldStatus = oldStatus;
        return this;
    }

    /**
     *  <p>Status of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     * @return status
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodStatus getStatus() {
        return this.status;
    }

    /**
     *  <p>Status of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentMethodSetPaymentMethodStatusAction" rel="nofollow">Set PaymentMethodStatus</a> update action.</p>
     * @return oldStatus
     */

    @Nullable
    public com.commercetools.api.models.payment_method.PaymentMethodStatus getOldStatus() {
        return this.oldStatus;
    }

    /**
     * builds PaymentMethodPaymentMethodStatusSetMessagePayload with checking for non-null required values
     * @return PaymentMethodPaymentMethodStatusSetMessagePayload
     */
    public PaymentMethodPaymentMethodStatusSetMessagePayload build() {
        return new PaymentMethodPaymentMethodStatusSetMessagePayloadImpl(status, oldStatus);
    }

    /**
     * builds PaymentMethodPaymentMethodStatusSetMessagePayload without checking for non-null required values
     * @return PaymentMethodPaymentMethodStatusSetMessagePayload
     */
    public PaymentMethodPaymentMethodStatusSetMessagePayload buildUnchecked() {
        return new PaymentMethodPaymentMethodStatusSetMessagePayloadImpl(status, oldStatus);
    }

    /**
     * factory method for an instance of PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder of() {
        return new PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodPaymentMethodStatusSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder of(
            final PaymentMethodPaymentMethodStatusSetMessagePayload template) {
        PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder builder = new PaymentMethodPaymentMethodStatusSetMessagePayloadBuilder();
        builder.status = template.getStatus();
        builder.oldStatus = template.getOldStatus();
        return builder;
    }

}
