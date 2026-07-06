
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationLoadedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoaded paymentIntegrationLoaded = PaymentIntegrationLoaded.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationLoadedBuilder implements Builder<PaymentIntegrationLoaded> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration loaded.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integration loaded.</p>
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
     * builds PaymentIntegrationLoaded with checking for non-null required values
     * @return PaymentIntegrationLoaded
     */
    public PaymentIntegrationLoaded build() {
        Objects.requireNonNull(severity, PaymentIntegrationLoaded.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationLoaded.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationLoaded.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationLoaded.class + ": payload is missing");
        return new PaymentIntegrationLoadedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationLoaded without checking for non-null required values
     * @return PaymentIntegrationLoaded
     */
    public PaymentIntegrationLoaded buildUnchecked() {
        return new PaymentIntegrationLoadedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationLoadedBuilder
     * @return builder
     */
    public static PaymentIntegrationLoadedBuilder of() {
        return new PaymentIntegrationLoadedBuilder();
    }

    /**
     * create builder for PaymentIntegrationLoaded instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadedBuilder of(final PaymentIntegrationLoaded template) {
        PaymentIntegrationLoadedBuilder builder = new PaymentIntegrationLoadedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
