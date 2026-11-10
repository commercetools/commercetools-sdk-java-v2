
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardBalanceSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceSuccess giftCardBalanceSuccess = GiftCardBalanceSuccess.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardBalanceSuccessBuilder implements Builder<GiftCardBalanceSuccess> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardBalanceSuccessBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card balance started.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardBalanceSuccessBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardBalanceSuccessBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>amount</code> and <code>isBalanceSufficient</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public GiftCardBalanceSuccessBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
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
     *  <p>Gift card balance started.</p>
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
     *  <p>Contains the <code>amount</code> and <code>isBalanceSufficient</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds GiftCardBalanceSuccess with checking for non-null required values
     * @return GiftCardBalanceSuccess
     */
    public GiftCardBalanceSuccess build() {
        Objects.requireNonNull(severity, GiftCardBalanceSuccess.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardBalanceSuccess.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardBalanceSuccess.class + ": correlationId is missing");
        Objects.requireNonNull(payload, GiftCardBalanceSuccess.class + ": payload is missing");
        return new GiftCardBalanceSuccessImpl(severity, message, correlationId, payload);
    }

    /**
     * builds GiftCardBalanceSuccess without checking for non-null required values
     * @return GiftCardBalanceSuccess
     */
    public GiftCardBalanceSuccess buildUnchecked() {
        return new GiftCardBalanceSuccessImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of GiftCardBalanceSuccessBuilder
     * @return builder
     */
    public static GiftCardBalanceSuccessBuilder of() {
        return new GiftCardBalanceSuccessBuilder();
    }

    /**
     * create builder for GiftCardBalanceSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceSuccessBuilder of(final GiftCardBalanceSuccess template) {
        GiftCardBalanceSuccessBuilder builder = new GiftCardBalanceSuccessBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
