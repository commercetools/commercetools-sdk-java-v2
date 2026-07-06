
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardBalanceStartedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceStarted giftCardBalanceStarted = GiftCardBalanceStarted.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardBalanceStartedBuilder implements Builder<GiftCardBalanceStarted> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardBalanceStartedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card balance started.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardBalanceStartedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardBalanceStartedBuilder correlationId(final String correlationId) {
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
     * builds GiftCardBalanceStarted with checking for non-null required values
     * @return GiftCardBalanceStarted
     */
    public GiftCardBalanceStarted build() {
        Objects.requireNonNull(severity, GiftCardBalanceStarted.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardBalanceStarted.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardBalanceStarted.class + ": correlationId is missing");
        return new GiftCardBalanceStartedImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardBalanceStarted without checking for non-null required values
     * @return GiftCardBalanceStarted
     */
    public GiftCardBalanceStarted buildUnchecked() {
        return new GiftCardBalanceStartedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardBalanceStartedBuilder
     * @return builder
     */
    public static GiftCardBalanceStartedBuilder of() {
        return new GiftCardBalanceStartedBuilder();
    }

    /**
     * create builder for GiftCardBalanceStarted instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceStartedBuilder of(final GiftCardBalanceStarted template) {
        GiftCardBalanceStartedBuilder builder = new GiftCardBalanceStartedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
