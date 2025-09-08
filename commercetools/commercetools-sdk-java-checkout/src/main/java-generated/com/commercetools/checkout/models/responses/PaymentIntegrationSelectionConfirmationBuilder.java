
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationSelectionConfirmationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelectionConfirmation paymentIntegrationSelectionConfirmation = PaymentIntegrationSelectionConfirmation.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationSelectionConfirmationBuilder
        implements Builder<PaymentIntegrationSelectionConfirmation> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration selected.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>hasVendorButton</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectionConfirmationBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integration selected.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>hasVendorButton</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationSelectionConfirmation with checking for non-null required values
     * @return PaymentIntegrationSelectionConfirmation
     */
    public PaymentIntegrationSelectionConfirmation build() {
        Objects.requireNonNull(severity, PaymentIntegrationSelectionConfirmation.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationSelectionConfirmation.class + ": message is missing");
        Objects.requireNonNull(correlationId,
            PaymentIntegrationSelectionConfirmation.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationSelectionConfirmation.class + ": payload is missing");
        return new PaymentIntegrationSelectionConfirmationImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationSelectionConfirmation without checking for non-null required values
     * @return PaymentIntegrationSelectionConfirmation
     */
    public PaymentIntegrationSelectionConfirmation buildUnchecked() {
        return new PaymentIntegrationSelectionConfirmationImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationSelectionConfirmationBuilder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationBuilder of() {
        return new PaymentIntegrationSelectionConfirmationBuilder();
    }

    /**
     * create builder for PaymentIntegrationSelectionConfirmation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectionConfirmationBuilder of(
            final PaymentIntegrationSelectionConfirmation template) {
        PaymentIntegrationSelectionConfirmationBuilder builder = new PaymentIntegrationSelectionConfirmationBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
