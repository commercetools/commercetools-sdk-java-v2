
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSelectedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSelected shippingMethodSelected = ShippingMethodSelected.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSelectedBuilder implements Builder<ShippingMethodSelected> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ShippingMethodSelectedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Shipping Method selected.</p>
     * @param message value to be set
     * @return Builder
     */

    public ShippingMethodSelectedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ShippingMethodSelectedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>method</code> object with the <code>name</code> and <code>id</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ShippingMethodSelectedBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
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
     *  <p>Shipping Method selected.</p>
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
     *  <p>Contains the <code>method</code> object with the <code>name</code> and <code>id</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ShippingMethodSelected with checking for non-null required values
     * @return ShippingMethodSelected
     */
    public ShippingMethodSelected build() {
        Objects.requireNonNull(severity, ShippingMethodSelected.class + ": severity is missing");
        Objects.requireNonNull(message, ShippingMethodSelected.class + ": message is missing");
        Objects.requireNonNull(correlationId, ShippingMethodSelected.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ShippingMethodSelected.class + ": payload is missing");
        return new ShippingMethodSelectedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ShippingMethodSelected without checking for non-null required values
     * @return ShippingMethodSelected
     */
    public ShippingMethodSelected buildUnchecked() {
        return new ShippingMethodSelectedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ShippingMethodSelectedBuilder
     * @return builder
     */
    public static ShippingMethodSelectedBuilder of() {
        return new ShippingMethodSelectedBuilder();
    }

    /**
     * create builder for ShippingMethodSelected instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSelectedBuilder of(final ShippingMethodSelected template) {
        ShippingMethodSelectedBuilder builder = new ShippingMethodSelectedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
