
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * DiscountCodeNotApplicableBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     DiscountCodeNotApplicable discountCodeNotApplicable = DiscountCodeNotApplicable.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class DiscountCodeNotApplicableBuilder implements Builder<DiscountCodeNotApplicable> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`info`</p>
     * @param severity value to be set
     * @return Builder
     */

    public DiscountCodeNotApplicableBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Discount code not applicable.</p>
     * @param message value to be set
     * @return Builder
     */

    public DiscountCodeNotApplicableBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public DiscountCodeNotApplicableBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cartId</code> and <code>discountCode</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public DiscountCodeNotApplicableBuilder payload(final java.lang.Object payload) {
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
     *  <p>Discount code not applicable.</p>
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
     *  <p>Contains the <code>cartId</code> and <code>discountCode</code> properties.</p>
     * @return payload
     */

    public java.lang.Object getPayload() {
        return this.payload;
    }

    /**
     * builds DiscountCodeNotApplicable with checking for non-null required values
     * @return DiscountCodeNotApplicable
     */
    public DiscountCodeNotApplicable build() {
        Objects.requireNonNull(severity, DiscountCodeNotApplicable.class + ": severity is missing");
        Objects.requireNonNull(message, DiscountCodeNotApplicable.class + ": message is missing");
        Objects.requireNonNull(correlationId, DiscountCodeNotApplicable.class + ": correlationId is missing");
        Objects.requireNonNull(payload, DiscountCodeNotApplicable.class + ": payload is missing");
        return new DiscountCodeNotApplicableImpl(severity, message, correlationId, payload);
    }

    /**
     * builds DiscountCodeNotApplicable without checking for non-null required values
     * @return DiscountCodeNotApplicable
     */
    public DiscountCodeNotApplicable buildUnchecked() {
        return new DiscountCodeNotApplicableImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of DiscountCodeNotApplicableBuilder
     * @return builder
     */
    public static DiscountCodeNotApplicableBuilder of() {
        return new DiscountCodeNotApplicableBuilder();
    }

    /**
     * create builder for DiscountCodeNotApplicable instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static DiscountCodeNotApplicableBuilder of(final DiscountCodeNotApplicable template) {
        DiscountCodeNotApplicableBuilder builder = new DiscountCodeNotApplicableBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
