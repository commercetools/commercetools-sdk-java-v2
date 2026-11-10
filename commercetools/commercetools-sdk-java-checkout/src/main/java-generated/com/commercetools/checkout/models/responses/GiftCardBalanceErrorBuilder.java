
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardBalanceErrorBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceError giftCardBalanceError = GiftCardBalanceError.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardBalanceErrorBuilder implements Builder<GiftCardBalanceError> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`error`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardBalanceErrorBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card balance failed.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardBalanceErrorBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardBalanceErrorBuilder correlationId(final String correlationId) {
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
     *  <p>Gift card balance failed.</p>
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
     * builds GiftCardBalanceError with checking for non-null required values
     * @return GiftCardBalanceError
     */
    public GiftCardBalanceError build() {
        Objects.requireNonNull(severity, GiftCardBalanceError.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardBalanceError.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardBalanceError.class + ": correlationId is missing");
        return new GiftCardBalanceErrorImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardBalanceError without checking for non-null required values
     * @return GiftCardBalanceError
     */
    public GiftCardBalanceError buildUnchecked() {
        return new GiftCardBalanceErrorImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardBalanceErrorBuilder
     * @return builder
     */
    public static GiftCardBalanceErrorBuilder of() {
        return new GiftCardBalanceErrorBuilder();
    }

    /**
     * create builder for GiftCardBalanceError instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceErrorBuilder of(final GiftCardBalanceError template) {
        GiftCardBalanceErrorBuilder builder = new GiftCardBalanceErrorBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
