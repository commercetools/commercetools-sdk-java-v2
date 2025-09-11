
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ErrorLoadingAllPaymentIntegrationsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ErrorLoadingAllPaymentIntegrations errorLoadingAllPaymentIntegrations = ErrorLoadingAllPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ErrorLoadingAllPaymentIntegrationsBuilder implements Builder<ErrorLoadingAllPaymentIntegrations> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ErrorLoadingAllPaymentIntegrationsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Error loading all payment integrations.</p>
     * @param message value to be set
     * @return Builder
     */

    public ErrorLoadingAllPaymentIntegrationsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ErrorLoadingAllPaymentIntegrationsBuilder correlationId(final String correlationId) {
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
     *  <p>Error loading all payment integrations.</p>
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
     * builds ErrorLoadingAllPaymentIntegrations with checking for non-null required values
     * @return ErrorLoadingAllPaymentIntegrations
     */
    public ErrorLoadingAllPaymentIntegrations build() {
        Objects.requireNonNull(severity, ErrorLoadingAllPaymentIntegrations.class + ": severity is missing");
        Objects.requireNonNull(message, ErrorLoadingAllPaymentIntegrations.class + ": message is missing");
        Objects.requireNonNull(correlationId, ErrorLoadingAllPaymentIntegrations.class + ": correlationId is missing");
        return new ErrorLoadingAllPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * builds ErrorLoadingAllPaymentIntegrations without checking for non-null required values
     * @return ErrorLoadingAllPaymentIntegrations
     */
    public ErrorLoadingAllPaymentIntegrations buildUnchecked() {
        return new ErrorLoadingAllPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of ErrorLoadingAllPaymentIntegrationsBuilder
     * @return builder
     */
    public static ErrorLoadingAllPaymentIntegrationsBuilder of() {
        return new ErrorLoadingAllPaymentIntegrationsBuilder();
    }

    /**
     * create builder for ErrorLoadingAllPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ErrorLoadingAllPaymentIntegrationsBuilder of(final ErrorLoadingAllPaymentIntegrations template) {
        ErrorLoadingAllPaymentIntegrationsBuilder builder = new ErrorLoadingAllPaymentIntegrationsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
