
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NoExpressPaymentIntegrationsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoExpressPaymentIntegrations noExpressPaymentIntegrations = NoExpressPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NoExpressPaymentIntegrationsBuilder implements Builder<NoExpressPaymentIntegrations> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public NoExpressPaymentIntegrationsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>There are no Express Payments integrations configured.</p>
     * @param message value to be set
     * @return Builder
     */

    public NoExpressPaymentIntegrationsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public NoExpressPaymentIntegrationsBuilder correlationId(final String correlationId) {
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
     *  <p>There are no Express Payments integrations configured.</p>
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
     * builds NoExpressPaymentIntegrations with checking for non-null required values
     * @return NoExpressPaymentIntegrations
     */
    public NoExpressPaymentIntegrations build() {
        Objects.requireNonNull(severity, NoExpressPaymentIntegrations.class + ": severity is missing");
        Objects.requireNonNull(message, NoExpressPaymentIntegrations.class + ": message is missing");
        Objects.requireNonNull(correlationId, NoExpressPaymentIntegrations.class + ": correlationId is missing");
        return new NoExpressPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * builds NoExpressPaymentIntegrations without checking for non-null required values
     * @return NoExpressPaymentIntegrations
     */
    public NoExpressPaymentIntegrations buildUnchecked() {
        return new NoExpressPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of NoExpressPaymentIntegrationsBuilder
     * @return builder
     */
    public static NoExpressPaymentIntegrationsBuilder of() {
        return new NoExpressPaymentIntegrationsBuilder();
    }

    /**
     * create builder for NoExpressPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoExpressPaymentIntegrationsBuilder of(final NoExpressPaymentIntegrations template) {
        NoExpressPaymentIntegrationsBuilder builder = new NoExpressPaymentIntegrationsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
