
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * FailedToRefreshSessionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     FailedToRefreshSession failedToRefreshSession = FailedToRefreshSession.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class FailedToRefreshSessionBuilder implements Builder<FailedToRefreshSession> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public FailedToRefreshSessionBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Failed to refresh session.</p>
     * @param message value to be set
     * @return Builder
     */

    public FailedToRefreshSessionBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public FailedToRefreshSessionBuilder correlationId(final String correlationId) {
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
     *  <p>Failed to refresh session.</p>
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
     * builds FailedToRefreshSession with checking for non-null required values
     * @return FailedToRefreshSession
     */
    public FailedToRefreshSession build() {
        Objects.requireNonNull(severity, FailedToRefreshSession.class + ": severity is missing");
        Objects.requireNonNull(message, FailedToRefreshSession.class + ": message is missing");
        Objects.requireNonNull(correlationId, FailedToRefreshSession.class + ": correlationId is missing");
        return new FailedToRefreshSessionImpl(severity, message, correlationId);
    }

    /**
     * builds FailedToRefreshSession without checking for non-null required values
     * @return FailedToRefreshSession
     */
    public FailedToRefreshSession buildUnchecked() {
        return new FailedToRefreshSessionImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of FailedToRefreshSessionBuilder
     * @return builder
     */
    public static FailedToRefreshSessionBuilder of() {
        return new FailedToRefreshSessionBuilder();
    }

    /**
     * create builder for FailedToRefreshSession instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static FailedToRefreshSessionBuilder of(final FailedToRefreshSession template) {
        FailedToRefreshSessionBuilder builder = new FailedToRefreshSessionBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
