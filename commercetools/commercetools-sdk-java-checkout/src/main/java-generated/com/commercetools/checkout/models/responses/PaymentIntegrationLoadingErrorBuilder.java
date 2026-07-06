
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentIntegrationLoadingErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentIntegrationLoadingError paymentIntegrationLoadingError = PaymentIntegrationLoadingError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentIntegrationLoadingErrorBuilder implements Builder<PaymentIntegrationLoadingError> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Payment integration loading failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains an <code>error</code> object and the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public PaymentIntegrationLoadingErrorBuilder payload(final java.lang.Object payload) {
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
     *  <p>Payment integration loading failed.</p>
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
     *  <p>Contains an <code>error</code> object and the <code>integration</code> object with the <code>type</code> and <code>connectorId</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds PaymentIntegrationLoadingError with checking for non-null required values
     * @return PaymentIntegrationLoadingError
     */
    public PaymentIntegrationLoadingError build() {
        Objects.requireNonNull(severity, PaymentIntegrationLoadingError.class + ": severity is missing");
        Objects.requireNonNull(message, PaymentIntegrationLoadingError.class + ": message is missing");
        Objects.requireNonNull(correlationId, PaymentIntegrationLoadingError.class + ": correlationId is missing");
        Objects.requireNonNull(payload, PaymentIntegrationLoadingError.class + ": payload is missing");
        return new PaymentIntegrationLoadingErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * builds PaymentIntegrationLoadingError without checking for non-null required values
     * @return PaymentIntegrationLoadingError
     */
    public PaymentIntegrationLoadingError buildUnchecked() {
        return new PaymentIntegrationLoadingErrorImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of PaymentIntegrationLoadingErrorBuilder
     * @return builder
     */
    public static PaymentIntegrationLoadingErrorBuilder of() {
        return new PaymentIntegrationLoadingErrorBuilder();
    }

    /**
     * create builder for PaymentIntegrationLoadingError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentIntegrationLoadingErrorBuilder of(final PaymentIntegrationLoadingError template) {
        PaymentIntegrationLoadingErrorBuilder builder = new PaymentIntegrationLoadingErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
