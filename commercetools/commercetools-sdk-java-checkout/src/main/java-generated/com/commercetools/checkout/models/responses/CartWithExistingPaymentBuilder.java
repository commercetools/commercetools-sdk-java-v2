
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartWithExistingPaymentBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartWithExistingPayment cartWithExistingPayment = CartWithExistingPayment.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartWithExistingPaymentBuilder implements Builder<CartWithExistingPayment> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CartWithExistingPaymentBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Cart with existing approved payment.</p>
     * @param message value to be set
     * @return Builder
     */

    public CartWithExistingPaymentBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CartWithExistingPaymentBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public CartWithExistingPaymentBuilder payload(final java.lang.Object payload) {
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
     *  <p>Cart with existing approved payment.</p>
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
     * builds CartWithExistingPayment with checking for non-null required values
     * @return CartWithExistingPayment
     */
    public CartWithExistingPayment build() {
        Objects.requireNonNull(severity, CartWithExistingPayment.class + ": severity is missing");
        Objects.requireNonNull(message, CartWithExistingPayment.class + ": message is missing");
        Objects.requireNonNull(correlationId, CartWithExistingPayment.class + ": correlationId is missing");
        Objects.requireNonNull(payload, CartWithExistingPayment.class + ": payload is missing");
        return new CartWithExistingPaymentImpl(severity, message, correlationId, payload);
    }

    /**
     * builds CartWithExistingPayment without checking for non-null required values
     * @return CartWithExistingPayment
     */
    public CartWithExistingPayment buildUnchecked() {
        return new CartWithExistingPaymentImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of CartWithExistingPaymentBuilder
     * @return builder
     */
    public static CartWithExistingPaymentBuilder of() {
        return new CartWithExistingPaymentBuilder();
    }

    /**
     * create builder for CartWithExistingPayment instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartWithExistingPaymentBuilder of(final CartWithExistingPayment template) {
        CartWithExistingPaymentBuilder builder = new CartWithExistingPaymentBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
