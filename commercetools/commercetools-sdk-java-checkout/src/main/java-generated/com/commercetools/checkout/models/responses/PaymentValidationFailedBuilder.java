
package com.commercetools.checkout.models.responses;

import java.util.*;
import java.util.function.Function;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentValidationFailedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationFailed paymentValidationFailed = PaymentValidationFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentValidationFailedBuilder implements Builder<PaymentValidationFailed> {

    private String severity;

    private String message;

    private String correlationId;

    private com.commercetools.checkout.models.payment.PaymentReference payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentValidationFailedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment validation failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentValidationFailedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentValidationFailedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentValidationFailedBuilder payload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReferenceBuilder> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of()).build();
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param builder function to build the payload value
     * @return Builder
     */

    public PaymentValidationFailedBuilder withPayload(
            Function<com.commercetools.checkout.models.payment.PaymentReferenceBuilder, com.commercetools.checkout.models.payment.PaymentReference> builder) {
        this.payload = builder.apply(com.commercetools.checkout.models.payment.PaymentReferenceBuilder.of());
        return this;
    }

    /**
     *  <p>Contains the reference data of a Payment.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentValidationFailedBuilder payload(
            final com.commercetools.checkout.models.payment.PaymentReference payload) {
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
     *  <p>Payment validation failed.</p>
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
     * builds PaymentValidationFailed with checking for non-null required values
     * @return PaymentValidationFailed
     */
    public PaymentValidationFailed build() {
        Objects.requireNonNull(severity, PaymentValidationFailed.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentValidationFailed.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentValidationFailed.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentValidationFailed.class + ": payload is missing");
        return new PaymentValidationFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentValidationFailed without checking for non-null required values
     * @return PaymentValidationFailed
     */
    public PaymentValidationFailed buildUnchecked() {
        return new PaymentValidationFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentValidationFailedBuilder
     * @return builder
     */
    public static PaymentValidationFailedBuilder of() {
        return new PaymentValidationFailedBuilder();
    }

    /**
     * create builder for PaymentValidationFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationFailedBuilder of(final PaymentValidationFailed template) {
        PaymentValidationFailedBuilder builder = new PaymentValidationFailedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
