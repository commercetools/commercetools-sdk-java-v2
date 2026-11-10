
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartEmptiedDuringCheckoutBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEmptiedDuringCheckout cartEmptiedDuringCheckout = CartEmptiedDuringCheckout.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartEmptiedDuringCheckoutBuilder implements Builder<CartEmptiedDuringCheckout> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CartEmptiedDuringCheckoutBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Cart <code>{cartId}</code> was emptied during checkout.</p>
     * @param message value to be set
     * @return Builder
     */

    public CartEmptiedDuringCheckoutBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CartEmptiedDuringCheckoutBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public CartEmptiedDuringCheckoutBuilder payload(final java.lang.Object payload) {
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
     *  <p>Cart <code>{cartId}</code> was emptied during checkout.</p>
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
     * builds CartEmptiedDuringCheckout with checking for non-null required values
     * @return CartEmptiedDuringCheckout
     */
    public CartEmptiedDuringCheckout build() {
        Objects.requireNonNull(severity, CartEmptiedDuringCheckout.class + ": severity is missing");
        Objects.requireNonNull(message, CartEmptiedDuringCheckout.class + ": message is missing");
        Objects.requireNonNull(correlationId, CartEmptiedDuringCheckout.class + ": correlationId is missing");
        Objects.requireNonNull(payload, CartEmptiedDuringCheckout.class + ": payload is missing");
        return new CartEmptiedDuringCheckoutImpl(severity, message, correlationId, payload);
    }

    /**
     * builds CartEmptiedDuringCheckout without checking for non-null required values
     * @return CartEmptiedDuringCheckout
     */
    public CartEmptiedDuringCheckout buildUnchecked() {
        return new CartEmptiedDuringCheckoutImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of CartEmptiedDuringCheckoutBuilder
     * @return builder
     */
    public static CartEmptiedDuringCheckoutBuilder of() {
        return new CartEmptiedDuringCheckoutBuilder();
    }

    /**
     * create builder for CartEmptiedDuringCheckout instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEmptiedDuringCheckoutBuilder of(final CartEmptiedDuringCheckout template) {
        CartEmptiedDuringCheckoutBuilder builder = new CartEmptiedDuringCheckoutBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
