
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * GiftCardBalanceRemovedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     GiftCardBalanceRemoved giftCardBalanceRemoved = GiftCardBalanceRemoved.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class GiftCardBalanceRemovedBuilder implements Builder<GiftCardBalanceRemoved> {

    private String severity;

    private String message;

    private String correlationId;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public GiftCardBalanceRemovedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Gift card balance removed.</p>
     * @param message value to be set
     * @return Builder
     */

    public GiftCardBalanceRemovedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public GiftCardBalanceRemovedBuilder correlationId(final String correlationId) {
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
     *  <p>Gift card balance removed.</p>
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
     * builds GiftCardBalanceRemoved with checking for non-null required values
     * @return GiftCardBalanceRemoved
     */
    public GiftCardBalanceRemoved build() {
        Objects.requireNonNull(severity, GiftCardBalanceRemoved.class + ": severity is missing");
        Objects.requireNonNull(message, GiftCardBalanceRemoved.class + ": message is missing");
        Objects.requireNonNull(correlationId, GiftCardBalanceRemoved.class + ": correlationId is missing");
        return new GiftCardBalanceRemovedImpl(severity, message, correlationId);
    }

    /**
     * builds GiftCardBalanceRemoved without checking for non-null required values
     * @return GiftCardBalanceRemoved
     */
    public GiftCardBalanceRemoved buildUnchecked() {
        return new GiftCardBalanceRemovedImpl(severity, message, correlationId);
    }

    /**
     * factory method for an instance of GiftCardBalanceRemovedBuilder
     * @return builder
     */
    public static GiftCardBalanceRemovedBuilder of() {
        return new GiftCardBalanceRemovedBuilder();
    }

    /**
     * create builder for GiftCardBalanceRemoved instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static GiftCardBalanceRemovedBuilder of(final GiftCardBalanceRemoved template) {
        GiftCardBalanceRemovedBuilder builder = new GiftCardBalanceRemovedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        return builder;
    }

}
