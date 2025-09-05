
package com.commercetools.checkout.models.responses;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentFailedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentFailed paymentFailed = PaymentFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentFailedBuilder implements Builder<PaymentFailed> {

    private String severity;

    private String message;

    private String correlationId;

    private com.commercetools.checkout.models.payment.PaymentReference payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentFailedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentFailedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentFailedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentFailedBuilder payload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReferenceBuilder> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentFailedBuilder withPayload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReference> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentFailedBuilder payload(final com.commercetools.checkout.models.payment.PaymentReference payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`error`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Payment failed.</p>
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
     * builds PaymentFailed with checking for non-null required values
     * @return PaymentFailed
     */
    public PaymentFailed build() {
        Objects.requireNonNull(severity, PaymentFailed.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentFailed.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentFailed.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentFailed.class + ": payload is missing");
        return new PaymentFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentFailed without checking for non-null required values
     * @return PaymentFailed
     */
    public PaymentFailed buildUnchecked() {
        return new PaymentFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentFailedBuilder
     * @return builder
     */
    public static PaymentFailedBuilder of() {
        return new PaymentFailedBuilder();
    }

    /**
     * create builder for PaymentFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentFailedBuilder of(final PaymentFailed template) {
        PaymentFailedBuilder builder = new PaymentFailedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
