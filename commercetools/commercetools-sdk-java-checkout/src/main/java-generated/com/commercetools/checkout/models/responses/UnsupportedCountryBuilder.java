
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnsupportedCountryBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnsupportedCountry unsupportedCountry = UnsupportedCountry.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnsupportedCountryBuilder implements Builder<UnsupportedCountry> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public UnsupportedCountryBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Cart <code>{cartId}</code> has unsupported country.</p>
     * @param message value to be set
     * @return Builder
     */

    public UnsupportedCountryBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public UnsupportedCountryBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property, <code>shippingCountry</code>, <code>billingCountry</code>, and the <code>supportedCountries</code> array.</p>
     * @param payload value to be set
     * @return Builder
     */

    public UnsupportedCountryBuilder payload(final java.lang.Object payload) {
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
     *  <p>Cart <code>{cartId}</code> has unsupported country.</p>
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
     *  <p>Contains the <code>cart</code> object with the <code>id</code> property, <code>shippingCountry</code>, <code>billingCountry</code>, and the <code>supportedCountries</code> array.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds UnsupportedCountry with checking for non-null required values
     * @return UnsupportedCountry
     */
    public UnsupportedCountry build() {
        Objects.requireNonNull(severity, UnsupportedCountry.class + ": severity is missing");
        Objects.requireNonNull(message, UnsupportedCountry.class + ": message is missing");
        Objects.requireNonNull(correlationId, UnsupportedCountry.class + ": correlationId is missing");
        Objects.requireNonNull(payload, UnsupportedCountry.class + ": payload is missing");
        return new UnsupportedCountryImpl(severity, message, correlationId, payload);
    }

    /**
     * builds UnsupportedCountry without checking for non-null required values
     * @return UnsupportedCountry
     */
    public UnsupportedCountry buildUnchecked() {
        return new UnsupportedCountryImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of UnsupportedCountryBuilder
     * @return builder
     */
    public static UnsupportedCountryBuilder of() {
        return new UnsupportedCountryBuilder();
    }

    /**
     * create builder for UnsupportedCountry instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnsupportedCountryBuilder of(final UnsupportedCountry template) {
        UnsupportedCountryBuilder builder = new UnsupportedCountryBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
