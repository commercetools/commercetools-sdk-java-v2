
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationSelectionConfirmationFailedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelectionConfirmationFailed paymentIntegrationSelectionConfirmationFailed = PaymentIntegrationSelectionConfirmationFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationSelectionConfirmationFailedBuilder
        implements Builder<PaymentIntegrationSelectionConfirmationFailed> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationFailedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration selection failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationFailedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationFailedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationFailedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integration selection failed.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationSelectionConfirmationFailed with checking for non-null required values
     * @return PaymentIntegrationSelectionConfirmationFailed
     */
    public PaymentIntegrationSelectionConfirmationFailed build() {
        Objects.requireNonNull(severity, PaymentIntegrationSelectionConfirmationFailed.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationSelectionConfirmationFailed.class + ": message is missing");
        Objects.requireNonNull(correlationId,
            PaymentIntegrationSelectionConfirmationFailed.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationSelectionConfirmationFailed.class + ": payload is missing");
        return new PaymentIntegrationSelectionConfirmationFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationSelectionConfirmationFailed without checking for non-null required values
     * @return PaymentIntegrationSelectionConfirmationFailed
     */
    public PaymentIntegrationSelectionConfirmationFailed buildUnchecked() {
        return new PaymentIntegrationSelectionConfirmationFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationSelectionConfirmationFailedBuilder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationFailedBuilder of() {
        return new PaymentIntegrationSelectionConfirmationFailedBuilder();
    }

    /**
     * create builder for PaymentIntegrationSelectionConfirmationFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationFailedBuilder of(
            final PaymentIntegrationSelectionConfirmationFailed template) {
        PaymentIntegrationSelectionConfirmationFailedBuilder builder = new PaymentIntegrationSelectionConfirmationFailedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
