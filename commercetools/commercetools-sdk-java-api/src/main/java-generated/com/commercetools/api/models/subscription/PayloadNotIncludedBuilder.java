
package com.commercetools.api.models.subscription;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PayloadNotIncludedBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PayloadNotIncluded payloadNotIncluded = PayloadNotIncluded.builder()
 *             .reason("{reason}")
 *             .payloadType("{payloadType}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PayloadNotIncludedBuilder implements Builder<PayloadNotIncluded> {

    private String reason;

    private String payloadType;

    /**
     *  <p>Reason the payload is not included. For example, the payload is too large, or its content is not supported by the Subscription destination.</p>
     * @param reason value to be set
     * @return Builder
     */

    public PayloadNotIncludedBuilder reason(final String reason) {
        this.reason = reason;
        return this;
    }

    /**
     *  <p>Value of the <code>type</code> field in the original payload.</p>
     * @param payloadType value to be set
     * @return Builder
     */

    public PayloadNotIncludedBuilder payloadType(final String payloadType) {
        this.payloadType = payloadType;
        return this;
    }

    /**
     *  <p>Reason the payload is not included. For example, the payload is too large, or its content is not supported by the Subscription destination.</p>
     * @return reason
     */

    public String getReason() {
        return this.reason;
    }

    /**
     *  <p>Value of the <code>type</code> field in the original payload.</p>
     * @return payloadType
     */

    public String getPayloadType() {
        return this.payloadType;
    }

    /**
     * builds PayloadNotIncluded with checking for non-null required values
     * @return PayloadNotIncluded
     */
    public PayloadNotIncluded build() {
        Objects.requireNonNull(reason, PayloadNotIncluded.class + ": reason is missing");
        Objects.requireNonNull(payloadType, PayloadNotIncluded.class + ": payloadType is missing");
        return new PayloadNotIncludedImpl(reason, payloadType);
    }

    /**
     * builds PayloadNotIncluded without checking for non-null required values
     * @return PayloadNotIncluded
     */
    public PayloadNotIncluded buildUnchecked() {
        return new PayloadNotIncludedImpl(reason, payloadType);
    }

    /**
     * factory method for an instance of PayloadNotIncludedBuilder
     * @return builder
     */
    public static PayloadNotIncludedBuilder of() {
        return new PayloadNotIncludedBuilder();
    }

    /**
     * create builder for PayloadNotIncluded instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PayloadNotIncludedBuilder of(final PayloadNotIncluded template) {
        PayloadNotIncludedBuilder builder = new PayloadNotIncludedBuilder();
        builder.reason = template.getReason();
        builder.payloadType = template.getPayloadType();
        return builder;
    }

}
