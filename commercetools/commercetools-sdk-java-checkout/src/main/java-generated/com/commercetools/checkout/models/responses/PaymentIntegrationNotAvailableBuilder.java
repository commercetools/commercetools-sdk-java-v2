
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationNotAvailableBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationNotAvailable paymentIntegrationNotAvailable = PaymentIntegrationNotAvailable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationNotAvailableBuilder implements Builder<PaymentIntegrationNotAvailable> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationNotAvailableBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration not available.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationNotAvailableBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationNotAvailableBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>method</code> object with the <code>type</code>, <code>id</code>, and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationNotAvailableBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`warn`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Payment integration not available.</p>
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
     *  <p>Contains the <code>method</code> object with the <code>type</code>, <code>id</code>, and <code>connectorId</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationNotAvailable with checking for non-null required values
     * @return PaymentIntegrationNotAvailable
     */
    public PaymentIntegrationNotAvailable build() {
        Objects.requireNonNull(severity, PaymentIntegrationNotAvailable.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationNotAvailable.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationNotAvailable.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationNotAvailable.class + ": payload is missing");
        return new PaymentIntegrationNotAvailableImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationNotAvailable without checking for non-null required values
     * @return PaymentIntegrationNotAvailable
     */
    public PaymentIntegrationNotAvailable buildUnchecked() {
        return new PaymentIntegrationNotAvailableImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationNotAvailableBuilder
     * @return builder
     */
    public static PaymentIntegrationNotAvailableBuilder of() {
        return new PaymentIntegrationNotAvailableBuilder();
    }

    /**
     * create builder for PaymentIntegrationNotAvailable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationNotAvailableBuilder of(final PaymentIntegrationNotAvailable template) {
        PaymentIntegrationNotAvailableBuilder builder = new PaymentIntegrationNotAvailableBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
