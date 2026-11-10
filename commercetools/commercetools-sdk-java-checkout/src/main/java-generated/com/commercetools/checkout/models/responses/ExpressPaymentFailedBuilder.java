
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentFailedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentFailed expressPaymentFailed = ExpressPaymentFailed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentFailedBuilder implements Builder<ExpressPaymentFailed> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentFailedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express payment failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentFailedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentFailedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>paymentReference</code>, <code>error</code>, and <code>method</code> object with the <code>type</code> property (if available).</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressPaymentFailedBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`error`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Express payment failed.</p>
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
     *  <p>Contains the <code>paymentReference</code>, <code>error</code>, and <code>method</code> object with the <code>type</code> property (if available).</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressPaymentFailed with checking for non-null required values
     * @return ExpressPaymentFailed
     */
    public ExpressPaymentFailed build() {
        Objects.requireNonNull(severity, ExpressPaymentFailed.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentFailed.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressPaymentFailed.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressPaymentFailed.class + ": payload is missing");
        return new ExpressPaymentFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressPaymentFailed without checking for non-null required values
     * @return ExpressPaymentFailed
     */
    public ExpressPaymentFailed buildUnchecked() {
        return new ExpressPaymentFailedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressPaymentFailedBuilder
     * @return builder
     */
    public static ExpressPaymentFailedBuilder of() {
        return new ExpressPaymentFailedBuilder();
    }

    /**
     * create builder for ExpressPaymentFailed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentFailedBuilder of(final ExpressPaymentFailed template) {
        ExpressPaymentFailedBuilder builder = new ExpressPaymentFailedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
