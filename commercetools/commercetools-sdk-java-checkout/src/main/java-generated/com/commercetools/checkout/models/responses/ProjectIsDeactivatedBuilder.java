
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ProjectIsDeactivatedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ProjectIsDeactivated projectIsDeactivated = ProjectIsDeactivated.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ProjectIsDeactivatedBuilder implements Builder<ProjectIsDeactivated> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ProjectIsDeactivatedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Project <code>{projectKey}</code> is deactivated.</p>
     * @param message value to be set
     * @return Builder
     */

    public ProjectIsDeactivatedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ProjectIsDeactivatedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>project</code> object with the <code>key</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ProjectIsDeactivatedBuilder payload(final java.lang.Object payload) {
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
     *  <p>Project <code>{projectKey}</code> is deactivated.</p>
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
     *  <p>Contains the <code>project</code> object with the <code>key</code> property.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ProjectIsDeactivated with checking for non-null required values
     * @return ProjectIsDeactivated
     */
    public ProjectIsDeactivated build() {
        Objects.requireNonNull(severity, ProjectIsDeactivated.class + ": severity is missing");
        Objects.requireNonNull(message, ProjectIsDeactivated.class + ": message is missing");
        Objects.requireNonNull(correlationId, ProjectIsDeactivated.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ProjectIsDeactivated.class + ": payload is missing");
        return new ProjectIsDeactivatedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ProjectIsDeactivated without checking for non-null required values
     * @return ProjectIsDeactivated
     */
    public ProjectIsDeactivated buildUnchecked() {
        return new ProjectIsDeactivatedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ProjectIsDeactivatedBuilder
     * @return builder
     */
    public static ProjectIsDeactivatedBuilder of() {
        return new ProjectIsDeactivatedBuilder();
    }

    /**
     * create builder for ProjectIsDeactivated instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ProjectIsDeactivatedBuilder of(final ProjectIsDeactivated template) {
        ProjectIsDeactivatedBuilder builder = new ProjectIsDeactivatedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
