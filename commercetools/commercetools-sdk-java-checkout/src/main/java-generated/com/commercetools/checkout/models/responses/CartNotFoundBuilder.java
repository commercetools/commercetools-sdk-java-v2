
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CartNotFoundBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CartNotFound cartNotFound = CartNotFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CartNotFoundBuilder implements Builder<CartNotFound> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public CartNotFoundBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Cart for <code>{projectKey}</code> and session <code>{sessionId}</code> not found.</p>
     * @param message value to be set
     * @return Builder
     */

    public CartNotFoundBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public CartNotFoundBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>project</code> and <code>session</code> objects with the related <code>key</code> and <code>id</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public CartNotFoundBuilder payload(final java.lang.Object payload) {
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
     *  <p>Cart for <code>{projectKey}</code> and session <code>{sessionId}</code> not found.</p>
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
     *  <p>Contains the <code>project</code> and <code>session</code> objects with the related <code>key</code> and <code>id</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds CartNotFound with checking for non-null required values
     * @return CartNotFound
     */
    public CartNotFound build() {
        Objects.requireNonNull(severity, CartNotFound.class + ": severity is missing");
        Objects.requireNonNull(message, CartNotFound.class + ": message is missing");
        Objects.requireNonNull(correlationId, CartNotFound.class + ": correlationId is missing");
        Objects.requireNonNull(payload, CartNotFound.class + ": payload is missing");
        return new CartNotFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * builds CartNotFound without checking for non-null required values
     * @return CartNotFound
     */
    public CartNotFound buildUnchecked() {
        return new CartNotFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of CartNotFoundBuilder
     * @return builder
     */
    public static CartNotFoundBuilder of() {
        return new CartNotFoundBuilder();
    }

    /**
     * create builder for CartNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CartNotFoundBuilder of(final CartNotFound template) {
        CartNotFoundBuilder builder = new CartNotFoundBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
