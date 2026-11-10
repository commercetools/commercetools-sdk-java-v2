
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * ConnectorErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     ConnectorError connectorError = ConnectorError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class ConnectorErrorBuilder implements Builder<ConnectorError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public ConnectorErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Connector error.</p>
     * @param message value to be set
     * @return Builder
     */

    public ConnectorErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public ConnectorErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>connector</code> object with the <code>id</code> property and optional <code>error</code>, <code>message</code>, and <code>data</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public ConnectorErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Connector error.</p>
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
     *  <p>Contains the <code>connector</code> object with the <code>id</code> property and optional <code>error</code>, <code>message</code>, and <code>data</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds ConnectorError with checking for non-null required values
     * @return ConnectorError
     */
    public ConnectorError build() {
        Objects.requireNonNull(severity, ConnectorError.class + ": severity is missing");
        Objects.requireNonNull(message, ConnectorError.class + ": message is missing");
        Objects.requireNonNull(correlationId, ConnectorError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, ConnectorError.class + ": payload is missing");
        return new ConnectorErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds ConnectorError without checking for non-null required values
     * @return ConnectorError
     */
    public ConnectorError buildUnchecked() {
        return new ConnectorErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of ConnectorErrorBuilder
     * @return builder
     */
    public static ConnectorErrorBuilder of() {
        return new ConnectorErrorBuilder();
    }

    /**
     * create builder for ConnectorError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static ConnectorErrorBuilder of(final ConnectorError template) {
        ConnectorErrorBuilder builder = new ConnectorErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
