
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderCreatedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderCreated orderCreated = OrderCreated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderCreatedBuilder implements Builder<OrderCreated> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public OrderCreatedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Order <code>{orderId}</code> created.</p>
     * @param message value to be set
     * @return Builder
     */

    public OrderCreatedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public OrderCreatedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>order</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public OrderCreatedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Order <code>{orderId}</code> created.</p>
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
     * builds OrderCreated with checking for non-null required values
     * @return OrderCreated
     */
    public OrderCreated build() {
        Objects.requireNonNull(severity, OrderCreated.class + ": severity is missing");
        Objects.requireNonNull(message, OrderCreated.class + ": message is missing");
        Objects.requireNonNull(correlationId, OrderCreated.class + ": correlationId is missing");
        Objects.requireNonNull(payload, OrderCreated.class + ": payload is missing");
        return new OrderCreatedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds OrderCreated without checking for non-null required values
     * @return OrderCreated
     */
    public OrderCreated buildUnchecked() {
        return new OrderCreatedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of OrderCreatedBuilder
     * @return builder
     */
    public static OrderCreatedBuilder of() {
        return new OrderCreatedBuilder();
    }

    /**
     * create builder for OrderCreated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderCreatedBuilder of(final OrderCreated template) {
        OrderCreatedBuilder builder = new OrderCreatedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
