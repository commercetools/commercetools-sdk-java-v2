
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpiredSessionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpiredSession expiredSession = ExpiredSession.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpiredSessionBuilder implements Builder<ExpiredSession> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpiredSessionBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Session is expired.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpiredSessionBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpiredSessionBuilder correlationId(final String correlationId) {
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
     *  <p>Session is expired.</p>
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
     * builds ExpiredSession with checking for non-null required values
     * @return ExpiredSession
     */
    public ExpiredSession build() {
        Objects.requireNonNull(severity, ExpiredSession.class + ": severity is missing");
        Objects.requireNonNull(message, ExpiredSession.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpiredSession.class + ": correlationId is missing");
        return new ExpiredSessionImpl(severity, message, correlationId);
    }

    /**
     * builds ExpiredSession without checking for non-null required values
     * @return ExpiredSession
     */
    public ExpiredSession buildUnchecked() {
        return new ExpiredSessionImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of ExpiredSessionBuilder
     * @return builder
     */
    public static ExpiredSessionBuilder of() {
        return new ExpiredSessionBuilder();
    }

    /**
     * create builder for ExpiredSession instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpiredSessionBuilder of(final ExpiredSession template) {
        ExpiredSessionBuilder builder = new ExpiredSessionBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
