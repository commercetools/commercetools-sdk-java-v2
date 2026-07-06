
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartEmptyBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartEmpty cartEmpty = CartEmpty.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartEmptyBuilder implements Builder<CartEmpty> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CartEmptyBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Cart <code>{cartId}</code> is empty.</p>
     * @param message value to be set
     * @return Builder
     */

    public CartEmptyBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CartEmptyBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property.</p>
     * @param payload value to be set
     * @return Builder
     */

    public CartEmptyBuilder payload(final java.lang.Object payload) {
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
     *  <p>Cart <code>{cartId}</code> is empty.</p>
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
     * builds CartEmpty with checking for non-null required values
     * @return CartEmpty
     */
    public CartEmpty build() {
        Objects.requireNonNull(severity, CartEmpty.class + ": severity is missing");
        Objects.requireNonNull(message, CartEmpty.class + ": message is missing");
        Objects.requireNonNull(correlationId, CartEmpty.class + ": correlationId is missing");
        Objects.requireNonNull(payload, CartEmpty.class + ": payload is missing");
        return new CartEmptyImpl(severity, message, correlationId, payload);
    }

    /**
     * builds CartEmpty without checking for non-null required values
     * @return CartEmpty
     */
    public CartEmpty buildUnchecked() {
        return new CartEmptyImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of CartEmptyBuilder
     * @return builder
     */
    public static CartEmptyBuilder of() {
        return new CartEmptyBuilder();
    }

    /**
     * create builder for CartEmpty instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartEmptyBuilder of(final CartEmpty template) {
        CartEmptyBuilder builder = new CartEmptyBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
