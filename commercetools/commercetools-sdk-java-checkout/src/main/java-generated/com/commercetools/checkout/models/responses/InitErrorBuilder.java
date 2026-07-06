
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InitErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InitError initError = InitError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InitErrorBuilder implements Builder<InitError> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public InitErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Error during initialization.</p>
     * @param message value to be set
     * @return Builder
     */

    public InitErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public InitErrorBuilder correlationId(final String correlationId) {
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
     *  <p>Error during initialization.</p>
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
     * builds InitError with checking for non-null required values
     * @return InitError
     */
    public InitError build() {
        Objects.requireNonNull(severity, InitError.class + ": severity is missing");
        Objects.requireNonNull(message, InitError.class + ": message is missing");
        Objects.requireNonNull(correlationId, InitError.class + ": correlationId is missing");
        return new InitErrorImpl(severity, message, correlationId);
    }

    /**
     * builds InitError without checking for non-null required values
     * @return InitError
     */
    public InitError buildUnchecked() {
        return new InitErrorImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of InitErrorBuilder
     * @return builder
     */
    public static InitErrorBuilder of() {
        return new InitErrorBuilder();
    }

    /**
     * create builder for InitError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InitErrorBuilder of(final InitError template) {
        InitErrorBuilder builder = new InitErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
