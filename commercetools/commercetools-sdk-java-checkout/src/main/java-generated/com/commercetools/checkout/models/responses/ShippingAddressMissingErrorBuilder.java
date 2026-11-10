
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingAddressMissingErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingAddressMissingError shippingAddressMissingError = ShippingAddressMissingError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingAddressMissingErrorBuilder implements Builder<ShippingAddressMissingError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ShippingAddressMissingErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>The shippingAddress field is missing for cart <code>{cartId}</code>.</p>
     * @param message value to be set
     * @return Builder
     */

    public ShippingAddressMissingErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ShippingAddressMissingErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ShippingAddressMissingErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>The shippingAddress field is missing for cart <code>{cartId}</code>.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ShippingAddressMissingError with checking for non-null required values
     * @return ShippingAddressMissingError
     */
    public ShippingAddressMissingError build() {
        Objects.requireNonNull(severity, ShippingAddressMissingError.class + ": severity is missing");
        Objects.requireNonNull(message, ShippingAddressMissingError.class + ": message is missing");
        Objects.requireNonNull(correlationId, ShippingAddressMissingError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ShippingAddressMissingError.class + ": payload is missing");
        return new ShippingAddressMissingErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ShippingAddressMissingError without checking for non-null required values
     * @return ShippingAddressMissingError
     */
    public ShippingAddressMissingError buildUnchecked() {
        return new ShippingAddressMissingErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ShippingAddressMissingErrorBuilder
     * @return builder
     */
    public static ShippingAddressMissingErrorBuilder of() {
        return new ShippingAddressMissingErrorBuilder();
    }

    /**
     * create builder for ShippingAddressMissingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingAddressMissingErrorBuilder of(final ShippingAddressMissingError template) {
        ShippingAddressMissingErrorBuilder builder = new ShippingAddressMissingErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
