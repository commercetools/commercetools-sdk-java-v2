
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardRedeemStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemStarted giftCardRedeemStarted = GiftCardRedeemStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardRedeemStartedBuilder implements Builder<GiftCardRedeemStarted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardRedeemStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card redeem started.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardRedeemStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardRedeemStartedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
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
     *  <p>Gift card redeem started.</p>
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
     * builds GiftCardRedeemStarted with checking for non-null required values
     * @return GiftCardRedeemStarted
     */
    public GiftCardRedeemStarted build() {
        Objects.requireNonNull(severity, GiftCardRedeemStarted.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardRedeemStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardRedeemStarted.class + ": correlationId is missing");
        return new GiftCardRedeemStartedImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardRedeemStarted without checking for non-null required values
     * @return GiftCardRedeemStarted
     */
    public GiftCardRedeemStarted buildUnchecked() {
        return new GiftCardRedeemStartedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardRedeemStartedBuilder
     * @return builder
     */
    public static GiftCardRedeemStartedBuilder of() {
        return new GiftCardRedeemStartedBuilder();
    }

    /**
     * create builder for GiftCardRedeemStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemStartedBuilder of(final GiftCardRedeemStarted template) {
        GiftCardRedeemStartedBuilder builder = new GiftCardRedeemStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
