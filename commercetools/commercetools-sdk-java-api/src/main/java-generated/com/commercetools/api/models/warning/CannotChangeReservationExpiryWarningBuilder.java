
package com.commercetools.api.models.warning;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * CannotChangeReservationExpiryWarningBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     CannotChangeReservationExpiryWarning cannotChangeReservationExpiryWarning = CannotChangeReservationExpiryWarning.builder()
 *             .message("{message}")
 *             .lineItemId("{lineItemId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class CannotChangeReservationExpiryWarningBuilder implements Builder<CannotChangeReservationExpiryWarning> {

    private String message;

    private String lineItemId;

    /**
     *  <p><code>"The reservation expiration for line item $lineItemId cannot be changed."</code></p>
     * @param message value to be set
     * @return Builder
     */

    public CannotChangeReservationExpiryWarningBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     * @param lineItemId value to be set
     * @return Builder
     */

    public CannotChangeReservationExpiryWarningBuilder lineItemId(final String lineItemId) {
        this.lineItemId = lineItemId;
        return this;
    }

    /**
     *  <p><code>"The reservation expiration for line item $lineItemId cannot be changed."</code></p>
     * @return message
     */

    public String getMessage() {
        return this.message;
    }

    /**
     *  <p>The ID of the Line Item.</p>
     * @return lineItemId
     */

    public String getLineItemId() {
        return this.lineItemId;
    }

    /**
     * builds CannotChangeReservationExpiryWarning with checking for non-null required values
     * @return CannotChangeReservationExpiryWarning
     */
    public CannotChangeReservationExpiryWarning build() {
        Objects.requireNonNull(message, CannotChangeReservationExpiryWarning.class + ": message is missing");
        Objects.requireNonNull(lineItemId, CannotChangeReservationExpiryWarning.class + ": lineItemId is missing");
        return new CannotChangeReservationExpiryWarningImpl(message, lineItemId);
    }

    /**
     * builds CannotChangeReservationExpiryWarning without checking for non-null required values
     * @return CannotChangeReservationExpiryWarning
     */
    public CannotChangeReservationExpiryWarning buildUnchecked() {
        return new CannotChangeReservationExpiryWarningImpl(message, lineItemId);
    }

    /**
     * factory method for an instance of CannotChangeReservationExpiryWarningBuilder
     * @return builder
     */
    public static CannotChangeReservationExpiryWarningBuilder of() {
        return new CannotChangeReservationExpiryWarningBuilder();
    }

    /**
     * create builder for CannotChangeReservationExpiryWarning instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static CannotChangeReservationExpiryWarningBuilder of(final CannotChangeReservationExpiryWarning template) {
        CannotChangeReservationExpiryWarningBuilder builder = new CannotChangeReservationExpiryWarningBuilder();
        builder.message = template.getMessage();
        builder.lineItemId = template.getLineItemId();
        return builder;
    }

}
