
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * BadInputDataBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     BadInputData badInputData = BadInputData.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class BadInputDataBuilder implements Builder<BadInputData> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public BadInputDataBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Some fields are invalid.</p>
     * @param message value to be set
     * @return Builder
     */

    public BadInputDataBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public BadInputDataBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>invalidFields</code> array of objects with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public BadInputDataBuilder payload(final java.lang.Object payload) {
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
     *  <p>Some fields are invalid.</p>
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
     *  <p>Contains the <code>invalidFields</code> array of objects with the related <code>schema</code>, <code>path</code>, <code>value</code> and <code>message</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds BadInputData with checking for non-null required values
     * @return BadInputData
     */
    public BadInputData build() {
        Objects.requireNonNull(severity, BadInputData.class + ": severity is missing");
        Objects.requireNonNull(message, BadInputData.class + ": message is missing");
        Objects.requireNonNull(correlationId, BadInputData.class + ": correlationId is missing");
        Objects.requireNonNull(payload, BadInputData.class + ": payload is missing");
        return new BadInputDataImpl(severity, message, correlationId, payload);
    }

    /**
     * builds BadInputData without checking for non-null required values
     * @return BadInputData
     */
    public BadInputData buildUnchecked() {
        return new BadInputDataImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of BadInputDataBuilder
     * @return builder
     */
    public static BadInputDataBuilder of() {
        return new BadInputDataBuilder();
    }

    /**
     * create builder for BadInputData instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static BadInputDataBuilder of(final BadInputData template) {
        BadInputDataBuilder builder = new BadInputDataBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
