
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * OrderVerificationStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     OrderVerificationStarted orderVerificationStarted = OrderVerificationStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class OrderVerificationStartedBuilder implements Builder<OrderVerificationStarted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public OrderVerificationStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Order verification started.</p>
     * @param message value to be set
     * @return Builder
     */

    public OrderVerificationStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public OrderVerificationStartedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
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
     *  <p>Order verification started.</p>
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
     * builds OrderVerificationStarted with checking for non-null required values
     * @return OrderVerificationStarted
     */
    public OrderVerificationStarted build() {
        Objects.requireNonNull(severity, OrderVerificationStarted.class + ": severity is missing");
        Objects.requireNonNull(message, OrderVerificationStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, OrderVerificationStarted.class + ": correlationId is missing");
        return new OrderVerificationStartedImpl(severity, message, correlationId);
    }

    /**
     * builds OrderVerificationStarted without checking for non-null required values
     * @return OrderVerificationStarted
     */
    public OrderVerificationStarted buildUnchecked() {
        return new OrderVerificationStartedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of OrderVerificationStartedBuilder
     * @return builder
     */
    public static OrderVerificationStartedBuilder of() {
        return new OrderVerificationStartedBuilder();
    }

    /**
     * create builder for OrderVerificationStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static OrderVerificationStartedBuilder of(final OrderVerificationStarted template) {
        OrderVerificationStartedBuilder builder = new OrderVerificationStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
