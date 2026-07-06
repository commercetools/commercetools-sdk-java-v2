
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * UnavailableLocaleBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     UnavailableLocale unavailableLocale = UnavailableLocale.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class UnavailableLocaleBuilder implements Builder<UnavailableLocale> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public UnavailableLocaleBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>The provided locale <code>{locale}</code> is not available for translated definitions.</p>
     * @param message value to be set
     * @return Builder
     */

    public UnavailableLocaleBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public UnavailableLocaleBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>locale</code> and the <code>fallback</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public UnavailableLocaleBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`warn`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>The provided locale <code>{locale}</code> is not available for translated definitions.</p>
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
     *  <p>Contains the <code>locale</code> and the <code>fallback</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds UnavailableLocale with checking for non-null required values
     * @return UnavailableLocale
     */
    public UnavailableLocale build() {
        Objects.requireNonNull(severity, UnavailableLocale.class + ": severity is missing");
        Objects.requireNonNull(message, UnavailableLocale.class + ": message is missing");
        Objects.requireNonNull(correlationId, UnavailableLocale.class + ": correlationId is missing");
        Objects.requireNonNull(payload, UnavailableLocale.class + ": payload is missing");
        return new UnavailableLocaleImpl(severity, message, correlationId, payload);
    }

    /**
     * builds UnavailableLocale without checking for non-null required values
     * @return UnavailableLocale
     */
    public UnavailableLocale buildUnchecked() {
        return new UnavailableLocaleImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of UnavailableLocaleBuilder
     * @return builder
     */
    public static UnavailableLocaleBuilder of() {
        return new UnavailableLocaleBuilder();
    }

    /**
     * create builder for UnavailableLocale instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static UnavailableLocaleBuilder of(final UnavailableLocale template) {
        UnavailableLocaleBuilder builder = new UnavailableLocaleBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
