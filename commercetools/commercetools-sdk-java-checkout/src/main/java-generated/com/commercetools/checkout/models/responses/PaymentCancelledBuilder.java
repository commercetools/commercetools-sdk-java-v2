
package com.commercetools.checkout.models.responses;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentCancelledBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentCancelled paymentCancelled = PaymentCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentCancelledBuilder implements Builder<PaymentCancelled> {

    private String severity;

    private String message;

    private String correlationId;

    private com.commercetools.checkout.models.payment.PaymentReference payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentCancelledBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment cancelled.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentCancelledBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentCancelledBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentCancelledBuilder payload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReferenceBuilder> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentCancelledBuilder withPayload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReference> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentCancelledBuilder payload(final com.commercetools.checkout.models.payment.PaymentReference payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`info`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Payment cancelled.</p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @return correlationId
     */

    public String getCorrelationId() {
        return this.correlationId;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @return payload
     */

    public com.commercetools.checkout.models.payment.PaymentReference getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentCancelled with checking for non-null required values
     * @return PaymentCancelled
     */
    public PaymentCancelled build() {
        Objects.requireNonNull(severity, PaymentCancelled.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentCancelled.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentCancelled.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentCancelled.class + ": payload is missing");
        return new PaymentCancelledImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentCancelled without checking for non-null required values
     * @return PaymentCancelled
     */
    public PaymentCancelled buildUnchecked() {
        return new PaymentCancelledImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentCancelledBuilder
     * @return builder
     */
    public static PaymentCancelledBuilder of() {
        return new PaymentCancelledBuilder();
    }

    /**
     * create builder for PaymentCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentCancelledBuilder of(final PaymentCancelled template) {
        PaymentCancelledBuilder builder = new PaymentCancelledBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
