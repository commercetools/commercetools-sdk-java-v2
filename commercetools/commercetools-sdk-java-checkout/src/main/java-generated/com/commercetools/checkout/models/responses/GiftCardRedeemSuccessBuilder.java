
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardRedeemSuccessBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardRedeemSuccess giftCardRedeemSuccess = GiftCardRedeemSuccess.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardRedeemSuccessBuilder implements Builder<GiftCardRedeemSuccess> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardRedeemSuccessBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card redeem success.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardRedeemSuccessBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardRedeemSuccessBuilder correlationId(final String correlationId) {
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
     *  <p>Gift card redeem success.</p>
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
     * builds GiftCardRedeemSuccess with checking for non-null required values
     * @return GiftCardRedeemSuccess
     */
    public GiftCardRedeemSuccess build() {
        Objects.requireNonNull(severity, GiftCardRedeemSuccess.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardRedeemSuccess.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardRedeemSuccess.class + ": correlationId is missing");
        return new GiftCardRedeemSuccessImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardRedeemSuccess without checking for non-null required values
     * @return GiftCardRedeemSuccess
     */
    public GiftCardRedeemSuccess buildUnchecked() {
        return new GiftCardRedeemSuccessImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardRedeemSuccessBuilder
     * @return builder
     */
    public static GiftCardRedeemSuccessBuilder of() {
        return new GiftCardRedeemSuccessBuilder();
    }

    /**
     * create builder for GiftCardRedeemSuccess instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardRedeemSuccessBuilder of(final GiftCardRedeemSuccess template) {
        GiftCardRedeemSuccessBuilder builder = new GiftCardRedeemSuccessBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
