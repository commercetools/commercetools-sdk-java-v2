
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidModeBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidMode invalidMode = InvalidMode.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidModeBuilder implements Builder<InvalidMode> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public InvalidModeBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>`{mode}<code>mode requires an application with mode type</code>{modeTypeRequested}<code>. Current mode </code>{modeTypeReceived}`.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidModeBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public InvalidModeBuilder correlationId(final String correlationId) {
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
     *  <p>`{mode}<code>mode requires an application with mode type</code>{modeTypeRequested}<code>. Current mode </code>{modeTypeReceived}`.</p>
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
     * builds InvalidMode with checking for non-null required values
     * @return InvalidMode
     */
    public InvalidMode build() {
        Objects.requireNonNull(severity, InvalidMode.class + ": severity is missing");
        Objects.requireNonNull(message, InvalidMode.class + ": message is missing");
        Objects.requireNonNull(correlationId, InvalidMode.class + ": correlationId is missing");
        return new InvalidModeImpl(severity, message, correlationId);
    }

    /**
     * builds InvalidMode without checking for non-null required values
     * @return InvalidMode
     */
    public InvalidMode buildUnchecked() {
        return new InvalidModeImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of InvalidModeBuilder
     * @return builder
     */
    public static InvalidModeBuilder of() {
        return new InvalidModeBuilder();
    }

    /**
     * create builder for InvalidMode instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidModeBuilder of(final InvalidMode template) {
        InvalidModeBuilder builder = new InvalidModeBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
