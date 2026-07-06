
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InitTimeoutBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InitTimeout initTimeout = InitTimeout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InitTimeoutBuilder implements Builder<InitTimeout> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public InitTimeoutBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Timeout error, no init message received.</p>
     * @param message value to be set
     * @return Builder
     */

    public InitTimeoutBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public InitTimeoutBuilder correlationId(final String correlationId) {
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
     *  <p>Timeout error, no init message received.</p>
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
     * builds InitTimeout with checking for non-null required values
     * @return InitTimeout
     */
    public InitTimeout build() {
        Objects.requireNonNull(severity, InitTimeout.class + ": severity is missing");
        Objects.requireNonNull(message, InitTimeout.class + ": message is missing");
        Objects.requireNonNull(correlationId, InitTimeout.class + ": correlationId is missing");
        return new InitTimeoutImpl(severity, message, correlationId);
    }

    /**
     * builds InitTimeout without checking for non-null required values
     * @return InitTimeout
     */
    public InitTimeout buildUnchecked() {
        return new InitTimeoutImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of InitTimeoutBuilder
     * @return builder
     */
    public static InitTimeoutBuilder of() {
        return new InitTimeoutBuilder();
    }

    /**
     * create builder for InitTimeout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InitTimeoutBuilder of(final InitTimeout template) {
        InitTimeoutBuilder builder = new InitTimeoutBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
