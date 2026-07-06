
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * SetShippingAddressErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     SetShippingAddressError setShippingAddressError = SetShippingAddressError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class SetShippingAddressErrorBuilder implements Builder<SetShippingAddressError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public SetShippingAddressErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Error setting shipping address.</p>
     * @param message value to be set
     * @return Builder
     */

    public SetShippingAddressErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public SetShippingAddressErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public SetShippingAddressErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Error setting shipping address.</p>
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
     *  <p>Contains the <code>errors</code> array of objects, with the related <code>code</code> and <code>message</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds SetShippingAddressError with checking for non-null required values
     * @return SetShippingAddressError
     */
    public SetShippingAddressError build() {
        Objects.requireNonNull(severity, SetShippingAddressError.class + ": severity is missing");
        Objects.requireNonNull(message, SetShippingAddressError.class + ": message is missing");
        Objects.requireNonNull(correlationId, SetShippingAddressError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, SetShippingAddressError.class + ": payload is missing");
        return new SetShippingAddressErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds SetShippingAddressError without checking for non-null required values
     * @return SetShippingAddressError
     */
    public SetShippingAddressError buildUnchecked() {
        return new SetShippingAddressErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of SetShippingAddressErrorBuilder
     * @return builder
     */
    public static SetShippingAddressErrorBuilder of() {
        return new SetShippingAddressErrorBuilder();
    }

    /**
     * create builder for SetShippingAddressError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static SetShippingAddressErrorBuilder of(final SetShippingAddressError template) {
        SetShippingAddressErrorBuilder builder = new SetShippingAddressErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
