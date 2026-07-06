
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentIntegrationNotAvailableBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentIntegrationNotAvailable expressPaymentIntegrationNotAvailable = ExpressPaymentIntegrationNotAvailable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentIntegrationNotAvailableBuilder implements Builder<ExpressPaymentIntegrationNotAvailable> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentIntegrationNotAvailableBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express Payments integration not available.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentIntegrationNotAvailableBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentIntegrationNotAvailableBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property indicating the requested payment integration type, and <code>availableMethods</code> array listing the available payment methods.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressPaymentIntegrationNotAvailableBuilder payload(final java.lang.Object payload) {
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
     *  <p>Express Payments integration not available.</p>
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
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property indicating the requested payment integration type, and <code>availableMethods</code> array listing the available payment methods.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressPaymentIntegrationNotAvailable with checking for non-null required values
     * @return ExpressPaymentIntegrationNotAvailable
     */
    public ExpressPaymentIntegrationNotAvailable build() {
        Objects.requireNonNull(severity, ExpressPaymentIntegrationNotAvailable.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentIntegrationNotAvailable.class + ": message is missing");
        Objects.requireNonNull(correlationId,
            ExpressPaymentIntegrationNotAvailable.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressPaymentIntegrationNotAvailable.class + ": payload is missing");
        return new ExpressPaymentIntegrationNotAvailableImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressPaymentIntegrationNotAvailable without checking for non-null required values
     * @return ExpressPaymentIntegrationNotAvailable
     */
    public ExpressPaymentIntegrationNotAvailable buildUnchecked() {
        return new ExpressPaymentIntegrationNotAvailableImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressPaymentIntegrationNotAvailableBuilder
     * @return builder
     */
    public static ExpressPaymentIntegrationNotAvailableBuilder of() {
        return new ExpressPaymentIntegrationNotAvailableBuilder();
    }

    /**
     * create builder for ExpressPaymentIntegrationNotAvailable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentIntegrationNotAvailableBuilder of(
            final ExpressPaymentIntegrationNotAvailable template) {
        ExpressPaymentIntegrationNotAvailableBuilder builder = new ExpressPaymentIntegrationNotAvailableBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
