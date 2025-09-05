
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationSelectedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationSelected paymentIntegrationSelected = PaymentIntegrationSelected.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationSelectedBuilder implements Builder<PaymentIntegrationSelected> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration selected.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> and <code>hasVendorButton</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationSelectedBuilder payload(final java.lang.Object payload) {
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
     * builds PaymentIntegrationSelected with checking for non-null required values
     * @return PaymentIntegrationSelected
     */
    public PaymentIntegrationSelected build() {
        Objects.requireNonNull(severity, PaymentIntegrationSelected.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationSelected.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationSelected.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationSelected.class + ": payload is missing");
        return new PaymentIntegrationSelectedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationSelected without checking for non-null required values
     * @return PaymentIntegrationSelected
     */
    public PaymentIntegrationSelected buildUnchecked() {
        return new PaymentIntegrationSelectedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationSelectedBuilder
     * @return builder
     */
    public static PaymentIntegrationSelectedBuilder of() {
        return new PaymentIntegrationSelectedBuilder();
    }

    /**
     * create builder for PaymentIntegrationSelected instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationSelectedBuilder of(final PaymentIntegrationSelected template) {
        PaymentIntegrationSelectedBuilder builder = new PaymentIntegrationSelectedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
