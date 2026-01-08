
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentCancelledBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentCancelled expressPaymentCancelled = ExpressPaymentCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentCancelledBuilder implements Builder<ExpressPaymentCancelled> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentCancelledBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express Payments process cancelled.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentCancelledBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentCancelledBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>paymentReference</code> and <code>method</code> object with the <code>type</code> property (if available).</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressPaymentCancelledBuilder payload(final java.lang.Object payload) {
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
     *  <p>Express Payments process cancelled.</p>
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
     *  <p>Contains the <code>paymentReference</code> and <code>method</code> object with the <code>type</code> property (if available).</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressPaymentCancelled with checking for non-null required values
     * @return ExpressPaymentCancelled
     */
    public ExpressPaymentCancelled build() {
        Objects.requireNonNull(severity, ExpressPaymentCancelled.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentCancelled.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressPaymentCancelled.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressPaymentCancelled.class + ": payload is missing");
        return new ExpressPaymentCancelledImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressPaymentCancelled without checking for non-null required values
     * @return ExpressPaymentCancelled
     */
    public ExpressPaymentCancelled buildUnchecked() {
        return new ExpressPaymentCancelledImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressPaymentCancelledBuilder
     * @return builder
     */
    public static ExpressPaymentCancelledBuilder of() {
        return new ExpressPaymentCancelledBuilder();
    }

    /**
     * create builder for ExpressPaymentCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentCancelledBuilder of(final ExpressPaymentCancelled template) {
        ExpressPaymentCancelledBuilder builder = new ExpressPaymentCancelledBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
