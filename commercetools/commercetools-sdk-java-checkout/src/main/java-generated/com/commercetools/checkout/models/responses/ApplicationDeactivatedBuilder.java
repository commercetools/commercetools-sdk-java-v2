
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ApplicationDeactivatedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ApplicationDeactivated applicationDeactivated = ApplicationDeactivated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ApplicationDeactivatedBuilder implements Builder<ApplicationDeactivated> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ApplicationDeactivatedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Application <code>{applicationKey}</code> for <code>{projectKey}</code> is disabled.</p>
     * @param message value to be set
     * @return Builder
     */

    public ApplicationDeactivatedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ApplicationDeactivatedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>project</code> and <code>application</code> objects with the related <code>key</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ApplicationDeactivatedBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
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
     *  <p>Application <code>{applicationKey}</code> for <code>{projectKey}</code> is disabled.</p>
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
     *  <p>Contains the <code>project</code> and <code>application</code> objects with the related <code>key</code> property.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ApplicationDeactivated with checking for non-null required values
     * @return ApplicationDeactivated
     */
    public ApplicationDeactivated build() {
        Objects.requireNonNull(severity, ApplicationDeactivated.class + ": severity is missing");
        Objects.requireNonNull(message, ApplicationDeactivated.class + ": message is missing");
        Objects.requireNonNull(correlationId, ApplicationDeactivated.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ApplicationDeactivated.class + ": payload is missing");
        return new ApplicationDeactivatedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ApplicationDeactivated without checking for non-null required values
     * @return ApplicationDeactivated
     */
    public ApplicationDeactivated buildUnchecked() {
        return new ApplicationDeactivatedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ApplicationDeactivatedBuilder
     * @return builder
     */
    public static ApplicationDeactivatedBuilder of() {
        return new ApplicationDeactivatedBuilder();
    }

    /**
     * create builder for ApplicationDeactivated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ApplicationDeactivatedBuilder of(final ApplicationDeactivated template) {
        ApplicationDeactivatedBuilder builder = new ApplicationDeactivatedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
