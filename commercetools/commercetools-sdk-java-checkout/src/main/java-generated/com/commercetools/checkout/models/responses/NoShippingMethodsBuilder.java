
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NoShippingMethodsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NoShippingMethods noShippingMethods = NoShippingMethods.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NoShippingMethodsBuilder implements Builder<NoShippingMethods> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public NoShippingMethodsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>There are no shipping methods matching cart.</p>
     * @param message value to be set
     * @return Builder
     */

    public NoShippingMethodsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public NoShippingMethodsBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public NoShippingMethodsBuilder payload(final java.lang.Object payload) {
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
     *  <p>There are no shipping methods matching cart.</p>
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
     * builds NoShippingMethods with checking for non-null required values
     * @return NoShippingMethods
     */
    public NoShippingMethods build() {
        Objects.requireNonNull(severity, NoShippingMethods.class + ": severity is missing");
        Objects.requireNonNull(message, NoShippingMethods.class + ": message is missing");
        Objects.requireNonNull(correlationId, NoShippingMethods.class + ": correlationId is missing");
        Objects.requireNonNull(payload, NoShippingMethods.class + ": payload is missing");
        return new NoShippingMethodsImpl(severity, message, correlationId, payload);
    }

    /**
     * builds NoShippingMethods without checking for non-null required values
     * @return NoShippingMethods
     */
    public NoShippingMethods buildUnchecked() {
        return new NoShippingMethodsImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of NoShippingMethodsBuilder
     * @return builder
     */
    public static NoShippingMethodsBuilder of() {
        return new NoShippingMethodsBuilder();
    }

    /**
     * create builder for NoShippingMethods instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NoShippingMethodsBuilder of(final NoShippingMethods template) {
        NoShippingMethodsBuilder builder = new NoShippingMethodsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
