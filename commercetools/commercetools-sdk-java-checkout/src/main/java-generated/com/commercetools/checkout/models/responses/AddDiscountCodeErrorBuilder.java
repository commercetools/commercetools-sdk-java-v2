
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * AddDiscountCodeErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     AddDiscountCodeError addDiscountCodeError = AddDiscountCodeError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class AddDiscountCodeErrorBuilder implements Builder<AddDiscountCodeError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public AddDiscountCodeErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Error adding discount code.</p>
     * @param message value to be set
     * @return Builder
     */

    public AddDiscountCodeErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public AddDiscountCodeErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>error</code> object.</p>
     * @param payload value to be set
     * @return Builder
     */

    public AddDiscountCodeErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Error adding discount code.</p>
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
     * builds AddDiscountCodeError with checking for non-null required values
     * @return AddDiscountCodeError
     */
    public AddDiscountCodeError build() {
        Objects.requireNonNull(severity, AddDiscountCodeError.class + ": severity is missing");
        Objects.requireNonNull(message, AddDiscountCodeError.class + ": message is missing");
        Objects.requireNonNull(correlationId, AddDiscountCodeError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, AddDiscountCodeError.class + ": payload is missing");
        return new AddDiscountCodeErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds AddDiscountCodeError without checking for non-null required values
     * @return AddDiscountCodeError
     */
    public AddDiscountCodeError buildUnchecked() {
        return new AddDiscountCodeErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of AddDiscountCodeErrorBuilder
     * @return builder
     */
    public static AddDiscountCodeErrorBuilder of() {
        return new AddDiscountCodeErrorBuilder();
    }

    /**
     * create builder for AddDiscountCodeError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static AddDiscountCodeErrorBuilder of(final AddDiscountCodeError template) {
        AddDiscountCodeErrorBuilder builder = new AddDiscountCodeErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
