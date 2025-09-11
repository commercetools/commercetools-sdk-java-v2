
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NoPaymentIntegrationsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoPaymentIntegrations noPaymentIntegrations = NoPaymentIntegrations.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NoPaymentIntegrationsBuilder implements Builder<NoPaymentIntegrations> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public NoPaymentIntegrationsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>There are no payment integrations configured.</p>
     * @param message value to be set
     * @return Builder
     */

    public NoPaymentIntegrationsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public NoPaymentIntegrationsBuilder correlationId(final String correlationId) {
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
     *  <p>There are no payment integrations configured.</p>
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
     * builds NoPaymentIntegrations with checking for non-null required values
     * @return NoPaymentIntegrations
     */
    public NoPaymentIntegrations build() {
        Objects.requireNonNull(severity, NoPaymentIntegrations.class + ": severity is missing");
        Objects.requireNonNull(message, NoPaymentIntegrations.class + ": message is missing");
        Objects.requireNonNull(correlationId, NoPaymentIntegrations.class + ": correlationId is missing");
        return new NoPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * builds NoPaymentIntegrations without checking for non-null required values
     * @return NoPaymentIntegrations
     */
    public NoPaymentIntegrations buildUnchecked() {
        return new NoPaymentIntegrationsImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of NoPaymentIntegrationsBuilder
     * @return builder
     */
    public static NoPaymentIntegrationsBuilder of() {
        return new NoPaymentIntegrationsBuilder();
    }

    /**
     * create builder for NoPaymentIntegrations instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoPaymentIntegrationsBuilder of(final NoPaymentIntegrations template) {
        NoPaymentIntegrationsBuilder builder = new NoPaymentIntegrationsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
