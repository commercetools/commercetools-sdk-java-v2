
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentCompletedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentCompleted expressPaymentCompleted = ExpressPaymentCompleted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentCompletedBuilder implements Builder<ExpressPaymentCompleted> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentCompletedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express payment for <code>{orderId}</code> completed.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentCompletedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentCompletedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressPaymentCompletedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Express payment for <code>{orderId}</code> completed.</p>
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
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressPaymentCompleted with checking for non-null required values
     * @return ExpressPaymentCompleted
     */
    public ExpressPaymentCompleted build() {
        Objects.requireNonNull(severity, ExpressPaymentCompleted.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentCompleted.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressPaymentCompleted.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressPaymentCompleted.class + ": payload is missing");
        return new ExpressPaymentCompletedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressPaymentCompleted without checking for non-null required values
     * @return ExpressPaymentCompleted
     */
    public ExpressPaymentCompleted buildUnchecked() {
        return new ExpressPaymentCompletedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressPaymentCompletedBuilder
     * @return builder
     */
    public static ExpressPaymentCompletedBuilder of() {
        return new ExpressPaymentCompletedBuilder();
    }

    /**
     * create builder for ExpressPaymentCompleted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentCompletedBuilder of(final ExpressPaymentCompleted template) {
        ExpressPaymentCompletedBuilder builder = new ExpressPaymentCompletedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
