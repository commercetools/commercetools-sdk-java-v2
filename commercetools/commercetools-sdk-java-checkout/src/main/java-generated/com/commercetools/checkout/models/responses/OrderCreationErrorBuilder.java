
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreationErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreationError orderCreationError = OrderCreationError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCreationErrorBuilder implements Builder<OrderCreationError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public OrderCreationErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Order creation failed with approved payment.</p>
     * @param message value to be set
     * @return Builder
     */

    public OrderCreationErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public OrderCreationErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains <code>paymentReference</code>, <code>sessionId</code>, and the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public OrderCreationErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Order creation failed with approved payment.</p>
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
     *  <p>Contains <code>paymentReference</code>, <code>sessionId</code>, and the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds OrderCreationError with checking for non-null required values
     * @return OrderCreationError
     */
    public OrderCreationError build() {
        Objects.requireNonNull(severity, OrderCreationError.class + ": severity is missing");
        Objects.requireNonNull(message, OrderCreationError.class + ": message is missing");
        Objects.requireNonNull(correlationId, OrderCreationError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, OrderCreationError.class + ": payload is missing");
        return new OrderCreationErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds OrderCreationError without checking for non-null required values
     * @return OrderCreationError
     */
    public OrderCreationError buildUnchecked() {
        return new OrderCreationErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of OrderCreationErrorBuilder
     * @return builder
     */
    public static OrderCreationErrorBuilder of() {
        return new OrderCreationErrorBuilder();
    }

    /**
     * create builder for OrderCreationError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreationErrorBuilder of(final OrderCreationError template) {
        OrderCreationErrorBuilder builder = new OrderCreationErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
