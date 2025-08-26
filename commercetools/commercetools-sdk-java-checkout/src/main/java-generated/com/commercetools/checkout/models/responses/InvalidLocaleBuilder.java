
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * InvalidLocaleBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     InvalidLocale invalidLocale = InvalidLocale.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class InvalidLocaleBuilder implements Builder<InvalidLocale> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public InvalidLocaleBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>The provided <code>{locale}</code> is invalid.</p>
     * @param message value to be set
     * @return Builder
     */

    public InvalidLocaleBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public InvalidLocaleBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the provided locale string, the related locale field (language or currency), and the used fallback one.</p>
     * @param payload value to be set
     * @return Builder
     */

    public InvalidLocaleBuilder payload(final java.lang.Object payload) {
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
     *  <p>The provided <code>{locale}</code> is invalid.</p>
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
     *  <p>Contains the provided locale string, the related locale field (language or currency), and the used fallback one.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds InvalidLocale with checking for non-null required values
     * @return InvalidLocale
     */
    public InvalidLocale build() {
        Objects.requireNonNull(severity, InvalidLocale.class + ": severity is missing");
        Objects.requireNonNull(message, InvalidLocale.class + ": message is missing");
        Objects.requireNonNull(correlationId, InvalidLocale.class + ": correlationId is missing");
        Objects.requireNonNull(payload, InvalidLocale.class + ": payload is missing");
        return new InvalidLocaleImpl(severity, message, correlationId, payload);
    }

    /**
     * builds InvalidLocale without checking for non-null required values
     * @return InvalidLocale
     */
    public InvalidLocale buildUnchecked() {
        return new InvalidLocaleImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of InvalidLocaleBuilder
     * @return builder
     */
    public static InvalidLocaleBuilder of() {
        return new InvalidLocaleBuilder();
    }

    /**
     * create builder for InvalidLocale instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static InvalidLocaleBuilder of(final InvalidLocale template) {
        InvalidLocaleBuilder builder = new InvalidLocaleBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
