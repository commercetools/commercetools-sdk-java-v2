
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentInterfaceIdSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentInterfaceIdSetMessagePayload paymentInterfaceIdSetMessagePayload = PaymentInterfaceIdSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentInterfaceIdSetMessagePayloadBuilder implements Builder<PaymentInterfaceIdSetMessagePayload> {

    @Nullable
    private String interfaceId;

    @Nullable
    private String oldInterfaceId;

    /**
     *  <p>Interface ID of the Payment after the Set InterfaceId update action.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public PaymentInterfaceIdSetMessagePayloadBuilder interfaceId(@Nullable final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>Interface ID of the Payment before the Set InterfaceId update action.</p>
     * @param oldInterfaceId value to be set
     * @return Builder
     */

    public PaymentInterfaceIdSetMessagePayloadBuilder oldInterfaceId(@Nullable final String oldInterfaceId) {
        this.oldInterfaceId = oldInterfaceId;
        return this;
    }

    /**
     *  <p>Interface ID of the Payment after the Set InterfaceId update action.</p>
     * @return interfaceId
     */

    @Nullable
    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     *  <p>Interface ID of the Payment before the Set InterfaceId update action.</p>
     * @return oldInterfaceId
     */

    @Nullable
    public String getOldInterfaceId() {
        return this.oldInterfaceId;
    }

    /**
     * builds PaymentInterfaceIdSetMessagePayload with checking for non-null required values
     * @return PaymentInterfaceIdSetMessagePayload
     */
    public PaymentInterfaceIdSetMessagePayload build() {
        return new PaymentInterfaceIdSetMessagePayloadImpl(interfaceId, oldInterfaceId);
    }

    /**
     * builds PaymentInterfaceIdSetMessagePayload without checking for non-null required values
     * @return PaymentInterfaceIdSetMessagePayload
     */
    public PaymentInterfaceIdSetMessagePayload buildUnchecked() {
        return new PaymentInterfaceIdSetMessagePayloadImpl(interfaceId, oldInterfaceId);
    }

    /**
     * factory method for an instance of PaymentInterfaceIdSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentInterfaceIdSetMessagePayloadBuilder of() {
        return new PaymentInterfaceIdSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentInterfaceIdSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentInterfaceIdSetMessagePayloadBuilder of(final PaymentInterfaceIdSetMessagePayload template) {
        PaymentInterfaceIdSetMessagePayloadBuilder builder = new PaymentInterfaceIdSetMessagePayloadBuilder();
        builder.interfaceId = template.getInterfaceId();
        builder.oldInterfaceId = template.getOldInterfaceId();
        return builder;
    }

}
