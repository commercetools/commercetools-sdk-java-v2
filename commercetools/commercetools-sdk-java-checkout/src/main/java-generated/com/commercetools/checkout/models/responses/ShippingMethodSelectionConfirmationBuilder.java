
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodSelectionConfirmationBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodSelectionConfirmation shippingMethodSelectionConfirmation = ShippingMethodSelectionConfirmation.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodSelectionConfirmationBuilder implements Builder<ShippingMethodSelectionConfirmation> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ShippingMethodSelectionConfirmationBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Shipping Method selection confirmed.</p>
     * @param message value to be set
     * @return Builder
     */

    public ShippingMethodSelectionConfirmationBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ShippingMethodSelectionConfirmationBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>method</code> object with the <code>name</code> and <code>id</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ShippingMethodSelectionConfirmationBuilder payload(final java.lang.Object payload) {
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
     *  <p>Shipping Method selection confirmed.</p>
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
     * builds ShippingMethodSelectionConfirmation with checking for non-null required values
     * @return ShippingMethodSelectionConfirmation
     */
    public ShippingMethodSelectionConfirmation build() {
        Objects.requireNonNull(severity, ShippingMethodSelectionConfirmation.class + ": severity is missing");
        Objects.requireNonNull(message, ShippingMethodSelectionConfirmation.class + ": message is missing");
        Objects.requireNonNull(correlationId, ShippingMethodSelectionConfirmation.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ShippingMethodSelectionConfirmation.class + ": payload is missing");
        return new ShippingMethodSelectionConfirmationImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ShippingMethodSelectionConfirmation without checking for non-null required values
     * @return ShippingMethodSelectionConfirmation
     */
    public ShippingMethodSelectionConfirmation buildUnchecked() {
        return new ShippingMethodSelectionConfirmationImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ShippingMethodSelectionConfirmationBuilder
     * @return builder
     */
    public static ShippingMethodSelectionConfirmationBuilder of() {
        return new ShippingMethodSelectionConfirmationBuilder();
    }

    /**
     * create builder for ShippingMethodSelectionConfirmation instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodSelectionConfirmationBuilder of(final ShippingMethodSelectionConfirmation template) {
        ShippingMethodSelectionConfirmationBuilder builder = new ShippingMethodSelectionConfirmationBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
