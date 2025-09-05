
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderVerificationRetryErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationRetryError orderVerificationRetryError = OrderVerificationRetryError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderVerificationRetryErrorBuilder implements Builder<OrderVerificationRetryError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public OrderVerificationRetryErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Order verification retry error.</p>
     * @param message value to be set
     * @return Builder
     */

    public OrderVerificationRetryErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public OrderVerificationRetryErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>error</code> property that can be either <code>orderReferenceNotAvailable</code> or <code>orderVerificationOngoing</code>.</p>
     * @param payload value to be set
     * @return Builder
     */

    public OrderVerificationRetryErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Order verification retry error.</p>
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
     *  <p>Contains the <code>error</code> property that can be either <code>orderReferenceNotAvailable</code> or <code>orderVerificationOngoing</code>.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds OrderVerificationRetryError with checking for non-null required values
     * @return OrderVerificationRetryError
     */
    public OrderVerificationRetryError build() {
        Objects.requireNonNull(severity, OrderVerificationRetryError.class + ": severity is missing");
        Objects.requireNonNull(message, OrderVerificationRetryError.class + ": message is missing");
        Objects.requireNonNull(correlationId, OrderVerificationRetryError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, OrderVerificationRetryError.class + ": payload is missing");
        return new OrderVerificationRetryErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds OrderVerificationRetryError without checking for non-null required values
     * @return OrderVerificationRetryError
     */
    public OrderVerificationRetryError buildUnchecked() {
        return new OrderVerificationRetryErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of OrderVerificationRetryErrorBuilder
     * @return builder
     */
    public static OrderVerificationRetryErrorBuilder of() {
        return new OrderVerificationRetryErrorBuilder();
    }

    /**
     * create builder for OrderVerificationRetryError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationRetryErrorBuilder of(final OrderVerificationRetryError template) {
        OrderVerificationRetryErrorBuilder builder = new OrderVerificationRetryErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
