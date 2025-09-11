
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DeprecatedFieldsBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DeprecatedFields deprecatedFields = DeprecatedFields.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DeprecatedFieldsBuilder implements Builder<DeprecatedFields> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public DeprecatedFieldsBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Some fields are deprecated.</p>
     * @param message value to be set
     * @return Builder
     */

    public DeprecatedFieldsBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public DeprecatedFieldsBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>deprecatedFields</code> array.</p>
     * @param payload value to be set
     * @return Builder
     */

    public DeprecatedFieldsBuilder payload(final java.lang.Object payload) {
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
     *  <p>Some fields are deprecated.</p>
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
     *  <p>Contains the <code>deprecatedFields</code> array.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds DeprecatedFields with checking for non-null required values
     * @return DeprecatedFields
     */
    public DeprecatedFields build() {
        Objects.requireNonNull(severity, DeprecatedFields.class + ": severity is missing");
        Objects.requireNonNull(message, DeprecatedFields.class + ": message is missing");
        Objects.requireNonNull(correlationId, DeprecatedFields.class + ": correlationId is missing");
        Objects.requireNonNull(payload, DeprecatedFields.class + ": payload is missing");
        return new DeprecatedFieldsImpl(severity, message, correlationId, payload);
    }

    /**
     * builds DeprecatedFields without checking for non-null required values
     * @return DeprecatedFields
     */
    public DeprecatedFields buildUnchecked() {
        return new DeprecatedFieldsImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of DeprecatedFieldsBuilder
     * @return builder
     */
    public static DeprecatedFieldsBuilder of() {
        return new DeprecatedFieldsBuilder();
    }

    /**
     * create builder for DeprecatedFields instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DeprecatedFieldsBuilder of(final DeprecatedFields template) {
        DeprecatedFieldsBuilder builder = new DeprecatedFieldsBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
