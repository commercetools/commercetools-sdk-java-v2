
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * RemoveDiscountCodeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     RemoveDiscountCodeError removeDiscountCodeError = RemoveDiscountCodeError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class RemoveDiscountCodeErrorBuilder implements Builder<RemoveDiscountCodeError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public RemoveDiscountCodeErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Error removing discount code.</p>
     * @param message value to be set
     * @return Builder
     */

    public RemoveDiscountCodeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public RemoveDiscountCodeErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>error</code> object.</p>
     * @param payload value to be set
     * @return Builder
     */

    public RemoveDiscountCodeErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Error removing discount code.</p>
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
     *  <p>Contains the <code>error</code> object.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds RemoveDiscountCodeError with checking for non-null required values
     * @return RemoveDiscountCodeError
     */
    public RemoveDiscountCodeError build() {
        Objects.requireNonNull(severity, RemoveDiscountCodeError.class + ": severity is missing");
        Objects.requireNonNull(message, RemoveDiscountCodeError.class + ": message is missing");
        Objects.requireNonNull(correlationId, RemoveDiscountCodeError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, RemoveDiscountCodeError.class + ": payload is missing");
        return new RemoveDiscountCodeErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds RemoveDiscountCodeError without checking for non-null required values
     * @return RemoveDiscountCodeError
     */
    public RemoveDiscountCodeError buildUnchecked() {
        return new RemoveDiscountCodeErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of RemoveDiscountCodeErrorBuilder
     * @return builder
     */
    public static RemoveDiscountCodeErrorBuilder of() {
        return new RemoveDiscountCodeErrorBuilder();
    }

    /**
     * create builder for RemoveDiscountCodeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static RemoveDiscountCodeErrorBuilder of(final RemoveDiscountCodeError template) {
        RemoveDiscountCodeErrorBuilder builder = new RemoveDiscountCodeErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
