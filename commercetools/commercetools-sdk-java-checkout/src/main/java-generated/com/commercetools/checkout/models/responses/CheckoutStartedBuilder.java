
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutStarted checkoutStarted = CheckoutStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutStartedBuilder implements Builder<CheckoutStarted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CheckoutStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Checkout started.</p>
     * @param message value to be set
     * @return Builder
     */

    public CheckoutStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CheckoutStartedBuilder correlationId(final String correlationId) {
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
     *  <p>Checkout started.</p>
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
     * builds CheckoutStarted with checking for non-null required values
     * @return CheckoutStarted
     */
    public CheckoutStarted build() {
        Objects.requireNonNull(severity, CheckoutStarted.class + ": severity is missing");
        Objects.requireNonNull(message, CheckoutStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, CheckoutStarted.class + ": correlationId is missing");
        return new CheckoutStartedImpl(severity, message, correlationId);
    }

    /**
     * builds CheckoutStarted without checking for non-null required values
     * @return CheckoutStarted
     */
    public CheckoutStarted buildUnchecked() {
        return new CheckoutStartedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of CheckoutStartedBuilder
     * @return builder
     */
    public static CheckoutStartedBuilder of() {
        return new CheckoutStartedBuilder();
    }

    /**
     * create builder for CheckoutStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutStartedBuilder of(final CheckoutStarted template) {
        CheckoutStartedBuilder builder = new CheckoutStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
