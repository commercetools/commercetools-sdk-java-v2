
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CheckoutCancelledBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CheckoutCancelled checkoutCancelled = CheckoutCancelled.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CheckoutCancelledBuilder implements Builder<CheckoutCancelled> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CheckoutCancelledBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Checkout cancelled.</p>
     * @param message value to be set
     * @return Builder
     */

    public CheckoutCancelledBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CheckoutCancelledBuilder correlationId(final String correlationId) {
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
     *  <p>Checkout cancelled.</p>
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
     * builds CheckoutCancelled with checking for non-null required values
     * @return CheckoutCancelled
     */
    public CheckoutCancelled build() {
        Objects.requireNonNull(severity, CheckoutCancelled.class + ": severity is missing");
        Objects.requireNonNull(message, CheckoutCancelled.class + ": message is missing");
        Objects.requireNonNull(correlationId, CheckoutCancelled.class + ": correlationId is missing");
        return new CheckoutCancelledImpl(severity, message, correlationId);
    }

    /**
     * builds CheckoutCancelled without checking for non-null required values
     * @return CheckoutCancelled
     */
    public CheckoutCancelled buildUnchecked() {
        return new CheckoutCancelledImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of CheckoutCancelledBuilder
     * @return builder
     */
    public static CheckoutCancelledBuilder of() {
        return new CheckoutCancelledBuilder();
    }

    /**
     * create builder for CheckoutCancelled instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CheckoutCancelledBuilder of(final CheckoutCancelled template) {
        CheckoutCancelledBuilder builder = new CheckoutCancelledBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
