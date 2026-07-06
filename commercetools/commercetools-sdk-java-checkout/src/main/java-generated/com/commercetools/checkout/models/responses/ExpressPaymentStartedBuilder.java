
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentStarted expressPaymentStarted = ExpressPaymentStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentStartedBuilder implements Builder<ExpressPaymentStarted> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express payment started.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentStartedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>integration</code> object with the <code>type</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressPaymentStartedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Express payment started.</p>
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
     * builds ExpressPaymentStarted with checking for non-null required values
     * @return ExpressPaymentStarted
     */
    public ExpressPaymentStarted build() {
        Objects.requireNonNull(severity, ExpressPaymentStarted.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressPaymentStarted.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressPaymentStarted.class + ": payload is missing");
        return new ExpressPaymentStartedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressPaymentStarted without checking for non-null required values
     * @return ExpressPaymentStarted
     */
    public ExpressPaymentStarted buildUnchecked() {
        return new ExpressPaymentStartedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressPaymentStartedBuilder
     * @return builder
     */
    public static ExpressPaymentStartedBuilder of() {
        return new ExpressPaymentStartedBuilder();
    }

    /**
     * create builder for ExpressPaymentStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentStartedBuilder of(final ExpressPaymentStarted template) {
        ExpressPaymentStartedBuilder builder = new ExpressPaymentStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
