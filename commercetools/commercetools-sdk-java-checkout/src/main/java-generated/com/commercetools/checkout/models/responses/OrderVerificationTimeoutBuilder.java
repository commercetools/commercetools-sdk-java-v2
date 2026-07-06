
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderVerificationTimeoutBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationTimeout orderVerificationTimeout = OrderVerificationTimeout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderVerificationTimeoutBuilder implements Builder<OrderVerificationTimeout> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public OrderVerificationTimeoutBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Order verification timeout.</p>
     * @param message value to be set
     * @return Builder
     */

    public OrderVerificationTimeoutBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public OrderVerificationTimeoutBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
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
     *  <p>Order verification timeout.</p>
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
     * builds OrderVerificationTimeout with checking for non-null required values
     * @return OrderVerificationTimeout
     */
    public OrderVerificationTimeout build() {
        Objects.requireNonNull(severity, OrderVerificationTimeout.class + ": severity is missing");
        Objects.requireNonNull(message, OrderVerificationTimeout.class + ": message is missing");
        Objects.requireNonNull(correlationId, OrderVerificationTimeout.class + ": correlationId is missing");
        return new OrderVerificationTimeoutImpl(severity, message, correlationId);
    }

    /**
     * builds OrderVerificationTimeout without checking for non-null required values
     * @return OrderVerificationTimeout
     */
    public OrderVerificationTimeout buildUnchecked() {
        return new OrderVerificationTimeoutImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of OrderVerificationTimeoutBuilder
     * @return builder
     */
    public static OrderVerificationTimeoutBuilder of() {
        return new OrderVerificationTimeoutBuilder();
    }

    /**
     * create builder for OrderVerificationTimeout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationTimeoutBuilder of(final OrderVerificationTimeout template) {
        OrderVerificationTimeoutBuilder builder = new OrderVerificationTimeoutBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
