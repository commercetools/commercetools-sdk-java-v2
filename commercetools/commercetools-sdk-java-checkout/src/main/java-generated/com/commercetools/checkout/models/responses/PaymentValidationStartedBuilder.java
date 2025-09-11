
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentValidationStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentValidationStarted paymentValidationStarted = PaymentValidationStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentValidationStartedBuilder implements Builder<PaymentValidationStarted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentValidationStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment validation started.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentValidationStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentValidationStartedBuilder correlationId(final String correlationId) {
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
     *  <p>Payment validation started.</p>
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
     * builds PaymentValidationStarted with checking for non-null required values
     * @return PaymentValidationStarted
     */
    public PaymentValidationStarted build() {
        Objects.requireNonNull(severity, PaymentValidationStarted.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentValidationStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentValidationStarted.class + ": correlationId is missing");
        return new PaymentValidationStartedImpl(severity, message, correlationId);
    }

    /**
     * builds PaymentValidationStarted without checking for non-null required values
     * @return PaymentValidationStarted
     */
    public PaymentValidationStarted buildUnchecked() {
        return new PaymentValidationStartedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of PaymentValidationStartedBuilder
     * @return builder
     */
    public static PaymentValidationStartedBuilder of() {
        return new PaymentValidationStartedBuilder();
    }

    /**
     * create builder for PaymentValidationStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentValidationStartedBuilder of(final PaymentValidationStarted template) {
        PaymentValidationStartedBuilder builder = new PaymentValidationStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
