
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NonOrderableCartErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NonOrderableCartError nonOrderableCartError = NonOrderableCartError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NonOrderableCartErrorBuilder implements Builder<NonOrderableCartError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public NonOrderableCartErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>This cart is not orderable.</p>
     * @param message value to be set
     * @return Builder
     */

    public NonOrderableCartErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public NonOrderableCartErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> and <code>errors</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public NonOrderableCartErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>This cart is not orderable.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> and <code>errors</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds NonOrderableCartError with checking for non-null required values
     * @return NonOrderableCartError
     */
    public NonOrderableCartError build() {
        Objects.requireNonNull(severity, NonOrderableCartError.class + ": severity is missing");
        Objects.requireNonNull(message, NonOrderableCartError.class + ": message is missing");
        Objects.requireNonNull(correlationId, NonOrderableCartError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, NonOrderableCartError.class + ": payload is missing");
        return new NonOrderableCartErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds NonOrderableCartError without checking for non-null required values
     * @return NonOrderableCartError
     */
    public NonOrderableCartError buildUnchecked() {
        return new NonOrderableCartErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of NonOrderableCartErrorBuilder
     * @return builder
     */
    public static NonOrderableCartErrorBuilder of() {
        return new NonOrderableCartErrorBuilder();
    }

    /**
     * create builder for NonOrderableCartError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NonOrderableCartErrorBuilder of(final NonOrderableCartError template) {
        NonOrderableCartErrorBuilder builder = new NonOrderableCartErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
