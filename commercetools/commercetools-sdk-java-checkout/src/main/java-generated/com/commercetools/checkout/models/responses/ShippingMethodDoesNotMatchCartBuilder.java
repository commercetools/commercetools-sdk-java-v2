
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ShippingMethodDoesNotMatchCartBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ShippingMethodDoesNotMatchCart shippingMethodDoesNotMatchCart = ShippingMethodDoesNotMatchCart.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ShippingMethodDoesNotMatchCartBuilder implements Builder<ShippingMethodDoesNotMatchCart> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Selected shipping method no longer matches cart.</p>
     * @param message value to be set
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ShippingMethodDoesNotMatchCartBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
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
     *  <p>Selected shipping method no longer matches cart.</p>
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
     * builds ShippingMethodDoesNotMatchCart with checking for non-null required values
     * @return ShippingMethodDoesNotMatchCart
     */
    public ShippingMethodDoesNotMatchCart build() {
        Objects.requireNonNull(severity, ShippingMethodDoesNotMatchCart.class + ": severity is missing");
        Objects.requireNonNull(message, ShippingMethodDoesNotMatchCart.class + ": message is missing");
        Objects.requireNonNull(correlationId, ShippingMethodDoesNotMatchCart.class + ": correlationId is missing");
        return new ShippingMethodDoesNotMatchCartImpl(severity, message, correlationId);
    }

    /**
     * builds ShippingMethodDoesNotMatchCart without checking for non-null required values
     * @return ShippingMethodDoesNotMatchCart
     */
    public ShippingMethodDoesNotMatchCart buildUnchecked() {
        return new ShippingMethodDoesNotMatchCartImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of ShippingMethodDoesNotMatchCartBuilder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartBuilder of() {
        return new ShippingMethodDoesNotMatchCartBuilder();
    }

    /**
     * create builder for ShippingMethodDoesNotMatchCart instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ShippingMethodDoesNotMatchCartBuilder of(final ShippingMethodDoesNotMatchCart template) {
        ShippingMethodDoesNotMatchCartBuilder builder = new ShippingMethodDoesNotMatchCartBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
