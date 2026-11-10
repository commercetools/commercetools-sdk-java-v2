
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ExpressMultipleContainersFoundBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ExpressMultipleContainersFound expressMultipleContainersFound = ExpressMultipleContainersFound.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ExpressMultipleContainersFoundBuilder implements Builder<ExpressMultipleContainersFound> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ExpressMultipleContainersFoundBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Multiple elements with data-ctc-express attribute found. Use expressId to specify which container to use.</p>
     * @param message value to be set
     * @return Builder
     */

    public ExpressMultipleContainersFoundBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ExpressMultipleContainersFoundBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>count</code> property indicating the number of containers found.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ExpressMultipleContainersFoundBuilder payload(final java.lang.Object payload) {
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
     *  <p>Multiple elements with data-ctc-express attribute found. Use expressId to specify which container to use.</p>
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
     *  <p>Contains the <code>count</code> property indicating the number of containers found.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ExpressMultipleContainersFound with checking for non-null required values
     * @return ExpressMultipleContainersFound
     */
    public ExpressMultipleContainersFound build() {
        Objects.requireNonNull(severity, ExpressMultipleContainersFound.class + ": severity is missing");
        Objects.requireNonNull(message, ExpressMultipleContainersFound.class + ": message is missing");
        Objects.requireNonNull(correlationId, ExpressMultipleContainersFound.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ExpressMultipleContainersFound.class + ": payload is missing");
        return new ExpressMultipleContainersFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ExpressMultipleContainersFound without checking for non-null required values
     * @return ExpressMultipleContainersFound
     */
    public ExpressMultipleContainersFound buildUnchecked() {
        return new ExpressMultipleContainersFoundImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ExpressMultipleContainersFoundBuilder
     * @return builder
     */
    public static ExpressMultipleContainersFoundBuilder of() {
        return new ExpressMultipleContainersFoundBuilder();
    }

    /**
     * create builder for ExpressMultipleContainersFound instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ExpressMultipleContainersFoundBuilder of(final ExpressMultipleContainersFound template) {
        ExpressMultipleContainersFoundBuilder builder = new ExpressMultipleContainersFoundBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
