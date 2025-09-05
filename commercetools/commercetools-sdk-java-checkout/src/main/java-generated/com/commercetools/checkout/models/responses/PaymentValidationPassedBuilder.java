
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentValidationPassedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationPassed paymentValidationPassed = PaymentValidationPassed.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentValidationPassedBuilder implements Builder<PaymentValidationPassed> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentValidationPassedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment validation passed.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentValidationPassedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentValidationPassedBuilder correlationId(final String correlationId) {
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
     *  <p>Payment validation passed.</p>
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
     * builds PaymentValidationPassed with checking for non-null required values
     * @return PaymentValidationPassed
     */
    public PaymentValidationPassed build() {
        Objects.requireNonNull(severity, PaymentValidationPassed.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentValidationPassed.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentValidationPassed.class + ": correlationId is missing");
        return new PaymentValidationPassedImpl(severity, message, correlationId);
    }

    /**
     * builds PaymentValidationPassed without checking for non-null required values
     * @return PaymentValidationPassed
     */
    public PaymentValidationPassed buildUnchecked() {
        return new PaymentValidationPassedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of PaymentValidationPassedBuilder
     * @return builder
     */
    public static PaymentValidationPassedBuilder of() {
        return new PaymentValidationPassedBuilder();
    }

    /**
     * create builder for PaymentValidationPassed instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationPassedBuilder of(final PaymentValidationPassed template) {
        PaymentValidationPassedBuilder builder = new PaymentValidationPassedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
