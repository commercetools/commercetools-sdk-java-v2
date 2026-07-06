
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardRedeemErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemError giftCardRedeemError = GiftCardRedeemError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardRedeemErrorBuilder implements Builder<GiftCardRedeemError> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardRedeemErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card redeem failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardRedeemErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardRedeemErrorBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
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
     *  <p>Gift card redeem failed.</p>
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
     * builds GiftCardRedeemError with checking for non-null required values
     * @return GiftCardRedeemError
     */
    public GiftCardRedeemError build() {
        Objects.requireNonNull(severity, GiftCardRedeemError.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardRedeemError.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardRedeemError.class + ": correlationId is missing");
        return new GiftCardRedeemErrorImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardRedeemError without checking for non-null required values
     * @return GiftCardRedeemError
     */
    public GiftCardRedeemError buildUnchecked() {
        return new GiftCardRedeemErrorImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardRedeemErrorBuilder
     * @return builder
     */
    public static GiftCardRedeemErrorBuilder of() {
        return new GiftCardRedeemErrorBuilder();
    }

    /**
     * create builder for GiftCardRedeemError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemErrorBuilder of(final GiftCardRedeemError template) {
        GiftCardRedeemErrorBuilder builder = new GiftCardRedeemErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
