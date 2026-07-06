
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressPaymentInterruptedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressPaymentInterrupted expressPaymentInterrupted = ExpressPaymentInterrupted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressPaymentInterruptedBuilder implements Builder<ExpressPaymentInterrupted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressPaymentInterruptedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express Payments process was interrupted by a callback.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressPaymentInterruptedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressPaymentInterruptedBuilder correlationId(final String correlationId) {
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
     *  <p>Express Payments process was interrupted by a callback.</p>
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
     * builds ExpressPaymentInterrupted with checking for non-null required values
     * @return ExpressPaymentInterrupted
     */
    public ExpressPaymentInterrupted build() {
        Objects.requireNonNull(severity, ExpressPaymentInterrupted.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressPaymentInterrupted.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressPaymentInterrupted.class + ": correlationId is missing");
        return new ExpressPaymentInterruptedImpl(severity, message, correlationId);
    }

    /**
     * builds ExpressPaymentInterrupted without checking for non-null required values
     * @return ExpressPaymentInterrupted
     */
    public ExpressPaymentInterrupted buildUnchecked() {
        return new ExpressPaymentInterruptedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of ExpressPaymentInterruptedBuilder
     * @return builder
     */
    public static ExpressPaymentInterruptedBuilder of() {
        return new ExpressPaymentInterruptedBuilder();
    }

    /**
     * create builder for ExpressPaymentInterrupted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressPaymentInterruptedBuilder of(final ExpressPaymentInterrupted template) {
        ExpressPaymentInterruptedBuilder builder = new ExpressPaymentInterruptedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
