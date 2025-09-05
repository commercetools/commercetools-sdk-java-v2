
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationsReceivedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationsReceived paymentIntegrationsReceived = PaymentIntegrationsReceived.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationsReceivedBuilder implements Builder<PaymentIntegrationsReceived> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationsReceivedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integrations received.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationsReceivedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationsReceivedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>paymentIntegrations</code> array of objects with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationsReceivedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integrations received.</p>
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
     *  <p>Contains the <code>paymentIntegrations</code> array of objects with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationsReceived with checking for non-null required values
     * @return PaymentIntegrationsReceived
     */
    public PaymentIntegrationsReceived build() {
        Objects.requireNonNull(severity, PaymentIntegrationsReceived.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationsReceived.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationsReceived.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationsReceived.class + ": payload is missing");
        return new PaymentIntegrationsReceivedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationsReceived without checking for non-null required values
     * @return PaymentIntegrationsReceived
     */
    public PaymentIntegrationsReceived buildUnchecked() {
        return new PaymentIntegrationsReceivedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationsReceivedBuilder
     * @return builder
     */
    public static PaymentIntegrationsReceivedBuilder of() {
        return new PaymentIntegrationsReceivedBuilder();
    }

    /**
     * create builder for PaymentIntegrationsReceived instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationsReceivedBuilder of(final PaymentIntegrationsReceived template) {
        PaymentIntegrationsReceivedBuilder builder = new PaymentIntegrationsReceivedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
