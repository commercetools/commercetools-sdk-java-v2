
package com.commercetools.checkout.models.responses;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * NotApplicableDiscountCodeRemovedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     NotApplicableDiscountCodeRemoved notApplicableDiscountCodeRemoved = NotApplicableDiscountCodeRemoved.builder()
 *             .severity("{severity}")
 *             .message("{message}")
 *             .correlationId("{correlationId}")
 *             .payload(payloadBuilder -> payloadBuilder)
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class NotApplicableDiscountCodeRemovedBuilder implements Builder<NotApplicableDiscountCodeRemoved> {

    private String severity;

    private String message;

    private String correlationId;

    private java.lang.Object payload;

    /**
     *  <p>`warn`</p>
     * @param severity value to be set
     * @return Builder
     */

    public NotApplicableDiscountCodeRemovedBuilder severity(final String severity) {
        this.severity = severity;
        return this;
    }

    /**
     *  <p>Not applicable discount code removed.</p>
     * @param message value to be set
     * @return Builder
     */

    public NotApplicableDiscountCodeRemovedBuilder message(final String message) {
        this.message = message;
        return this;
    }

    /**
     *  <p>Unique identifier of the event.</p>
     * @param correlationId value to be set
     * @return Builder
     */

    public NotApplicableDiscountCodeRemovedBuilder correlationId(final String correlationId) {
        this.correlationId = correlationId;
        return this;
    }

    /**
     *  <p>Contains the <code>cartId</code> and <code>discountCode</code> properties.</p>
     * @param payload value to be set
     * @return Builder
     */

    public NotApplicableDiscountCodeRemovedBuilder payload(final java.lang.Object payload) {
        this.payload = payload;
        return this;
    }

    /**
     *  <p>`warn`</p>
     * @return severity
     */

    public String getSeverity() {
        return this.severity;
    }

    /**
     *  <p>Not applicable discount code removed.</p>
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
     * builds NotApplicableDiscountCodeRemoved with checking for non-null required values
     * @return NotApplicableDiscountCodeRemoved
     */
    public NotApplicableDiscountCodeRemoved build() {
        Objects.requireNonNull(severity, NotApplicableDiscountCodeRemoved.class + ": severity is missing");
        Objects.requireNonNull(message, NotApplicableDiscountCodeRemoved.class + ": message is missing");
        Objects.requireNonNull(correlationId, NotApplicableDiscountCodeRemoved.class + ": correlationId is missing");
        Objects.requireNonNull(payload, NotApplicableDiscountCodeRemoved.class + ": payload is missing");
        return new NotApplicableDiscountCodeRemovedImpl(severity, message, correlationId, payload);
    }

    /**
     * builds NotApplicableDiscountCodeRemoved without checking for non-null required values
     * @return NotApplicableDiscountCodeRemoved
     */
    public NotApplicableDiscountCodeRemoved buildUnchecked() {
        return new NotApplicableDiscountCodeRemovedImpl(severity, message, correlationId, payload);
    }

    /**
     * factory method for an instance of NotApplicableDiscountCodeRemovedBuilder
     * @return builder
     */
    public static NotApplicableDiscountCodeRemovedBuilder of() {
        return new NotApplicableDiscountCodeRemovedBuilder();
    }

    /**
     * create builder for NotApplicableDiscountCodeRemoved instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static NotApplicableDiscountCodeRemovedBuilder of(final NotApplicableDiscountCodeRemoved template) {
        NotApplicableDiscountCodeRemovedBuilder builder = new NotApplicableDiscountCodeRemovedBuilder();
        builder.severity = template.getSeverity();
        builder.message = template.getMessage();
        builder.correlationId = template.getCorrelationId();
        builder.payload = template.getPayload();
        return builder;
    }

}
