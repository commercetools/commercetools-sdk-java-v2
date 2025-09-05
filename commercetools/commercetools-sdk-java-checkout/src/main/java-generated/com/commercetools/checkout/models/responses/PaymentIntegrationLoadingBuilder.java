
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationLoadingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoading paymentIntegrationLoading = PaymentIntegrationLoading.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationLoadingBuilder implements Builder<PaymentIntegrationLoading> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration loading.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integration loading.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationLoading with checking for non-null required values
     * @return PaymentIntegrationLoading
     */
    public PaymentIntegrationLoading build() {
        Objects.requireNonNull(severity, PaymentIntegrationLoading.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationLoading.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationLoading.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationLoading.class + ": payload is missing");
        return new PaymentIntegrationLoadingImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationLoading without checking for non-null required values
     * @return PaymentIntegrationLoading
     */
    public PaymentIntegrationLoading buildUnchecked() {
        return new PaymentIntegrationLoadingImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationLoadingBuilder
     * @return builder
     */
    public static PaymentIntegrationLoadingBuilder of() {
        return new PaymentIntegrationLoadingBuilder();
    }

    /**
     * create builder for PaymentIntegrationLoading instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadingBuilder of(final PaymentIntegrationLoading template) {
        PaymentIntegrationLoadingBuilder builder = new PaymentIntegrationLoadingBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
