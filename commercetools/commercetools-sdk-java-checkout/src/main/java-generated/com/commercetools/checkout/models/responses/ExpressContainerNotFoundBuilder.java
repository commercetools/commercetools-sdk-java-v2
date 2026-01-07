
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressContainerNotFoundBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressContainerNotFound expressContainerNotFound = ExpressContainerNotFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressContainerNotFoundBuilder implements Builder<ExpressContainerNotFound> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressContainerNotFoundBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Express container not found.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressContainerNotFoundBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressContainerNotFoundBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>id</code> of the container that was not found.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressContainerNotFoundBuilder payload(final java.lang.Object payload) {
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
     *  <p>Express container not found.</p>
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
     *  <p>Contains the <code>id</code> of the container that was not found.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressContainerNotFound with checking for non-null required values
     * @return ExpressContainerNotFound
     */
    public ExpressContainerNotFound build() {
        Objects.requireNonNull(severity, ExpressContainerNotFound.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressContainerNotFound.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressContainerNotFound.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressContainerNotFound.class + ": payload is missing");
        return new ExpressContainerNotFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressContainerNotFound without checking for non-null required values
     * @return ExpressContainerNotFound
     */
    public ExpressContainerNotFound buildUnchecked() {
        return new ExpressContainerNotFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressContainerNotFoundBuilder
     * @return builder
     */
    public static ExpressContainerNotFoundBuilder of() {
        return new ExpressContainerNotFoundBuilder();
    }

    /**
     * create builder for ExpressContainerNotFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressContainerNotFoundBuilder of(final ExpressContainerNotFound template) {
        ExpressContainerNotFoundBuilder builder = new ExpressContainerNotFoundBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
