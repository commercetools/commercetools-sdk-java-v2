
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExternalTermsAndConditionsPendingBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExternalTermsAndConditionsPending externalTermsAndConditionsPending = ExternalTermsAndConditionsPending.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExternalTermsAndConditionsPendingBuilder implements Builder<ExternalTermsAndConditionsPending> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExternalTermsAndConditionsPendingBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>External terms and conditions pending.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExternalTermsAndConditionsPendingBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExternalTermsAndConditionsPendingBuilder correlationId(final String correlationId) {
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
     *  <p>External terms and conditions pending.</p>
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
     * builds ExternalTermsAndConditionsPending with checking for non-null required values
     * @return ExternalTermsAndConditionsPending
     */
    public ExternalTermsAndConditionsPending build() {
        Objects.requireNonNull(severity, ExternalTermsAndConditionsPending.class + ": severity is missing");
        Objects.requireNonNull(message, ExternalTermsAndConditionsPending.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExternalTermsAndConditionsPending.class + ": correlationId is missing");
        return new ExternalTermsAndConditionsPendingImpl(severity, message, correlationId);
    }

    /**
     * builds ExternalTermsAndConditionsPending without checking for non-null required values
     * @return ExternalTermsAndConditionsPending
     */
    public ExternalTermsAndConditionsPending buildUnchecked() {
        return new ExternalTermsAndConditionsPendingImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of ExternalTermsAndConditionsPendingBuilder
     * @return builder
     */
    public static ExternalTermsAndConditionsPendingBuilder of() {
        return new ExternalTermsAndConditionsPendingBuilder();
    }

    /**
     * create builder for ExternalTermsAndConditionsPending instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExternalTermsAndConditionsPendingBuilder of(final ExternalTermsAndConditionsPending template) {
        ExternalTermsAndConditionsPendingBuilder builder = new ExternalTermsAndConditionsPendingBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
