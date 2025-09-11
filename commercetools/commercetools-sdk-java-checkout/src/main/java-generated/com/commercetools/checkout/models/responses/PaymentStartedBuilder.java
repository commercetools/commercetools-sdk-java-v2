
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStarted paymentStarted = PaymentStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStartedBuilder implements Builder<PaymentStarted> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment started.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentStartedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentStartedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment started.</p>
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
     * builds PaymentStarted with checking for non-null required values
     * @return PaymentStarted
     */
    public PaymentStarted build() {
        Objects.requireNonNull(severity, PaymentStarted.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentStarted.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentStarted.class + ": payload is missing");
        return new PaymentStartedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentStarted without checking for non-null required values
     * @return PaymentStarted
     */
    public PaymentStarted buildUnchecked() {
        return new PaymentStartedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentStartedBuilder
     * @return builder
     */
    public static PaymentStartedBuilder of() {
        return new PaymentStartedBuilder();
    }

    /**
     * create builder for PaymentStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStartedBuilder of(final PaymentStarted template) {
        PaymentStartedBuilder builder = new PaymentStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
