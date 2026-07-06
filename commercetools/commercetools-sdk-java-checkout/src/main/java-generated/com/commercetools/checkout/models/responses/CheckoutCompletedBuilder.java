
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutCompletedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutCompleted checkoutCompleted = CheckoutCompleted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutCompletedBuilder implements Builder<CheckoutCompleted> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CheckoutCompletedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Checkout for <code>{orderId}</code> completed.</p>
     * @param message value to be set
     * @return Builder
     */

    public CheckoutCompletedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CheckoutCompletedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public CheckoutCompletedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Checkout for <code>{orderId}</code> completed.</p>
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
     * builds CheckoutCompleted with checking for non-null required values
     * @return CheckoutCompleted
     */
    public CheckoutCompleted build() {
        Objects.requireNonNull(severity, CheckoutCompleted.class + ": severity is missing");
        Objects.requireNonNull(message, CheckoutCompleted.class + ": message is missing");
        Objects.requireNonNull(correlationId, CheckoutCompleted.class + ": correlationId is missing");
        Objects.requireNonNull(payload, CheckoutCompleted.class + ": payload is missing");
        return new CheckoutCompletedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds CheckoutCompleted without checking for non-null required values
     * @return CheckoutCompleted
     */
    public CheckoutCompleted buildUnchecked() {
        return new CheckoutCompletedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of CheckoutCompletedBuilder
     * @return builder
     */
    public static CheckoutCompletedBuilder of() {
        return new CheckoutCompletedBuilder();
    }

    /**
     * create builder for CheckoutCompleted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutCompletedBuilder of(final CheckoutCompleted template) {
        CheckoutCompletedBuilder builder = new CheckoutCompletedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
