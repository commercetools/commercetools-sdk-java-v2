
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentStatusInterfaceCodeSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentStatusInterfaceCodeSetMessagePayload paymentStatusInterfaceCodeSetMessagePayload = PaymentStatusInterfaceCodeSetMessagePayload.builder()
 *             .paymentId("{paymentId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentStatusInterfaceCodeSetMessagePayloadBuilder
        implements Builder<PaymentStatusInterfaceCodeSetMessagePayload> {

    @Nullable
    private String interfaceCode;

    /**
     *  <p>The <code>interfaceCode</code> that was set during the Set StatusInterfaceCode update action.</p>
     * @param interfaceCode value to be set
     * @return Builder
     */

    public PaymentStatusInterfaceCodeSetMessagePayloadBuilder interfaceCode(@Nullable final String interfaceCode) {
        this.interfaceCode = interfaceCode;
        return this;
    }

    /**
     *  <p>The <code>interfaceCode</code> that was set during the Set StatusInterfaceCode update action.</p>
     * @return interfaceCode
     */

    @Nullable
    public String getInterfaceCode() {
        return this.interfaceCode;
    }

    /**
     * builds PaymentStatusInterfaceCodeSetMessagePayload with checking for non-null required values
     * @return PaymentStatusInterfaceCodeSetMessagePayload
     */
    public PaymentStatusInterfaceCodeSetMessagePayload build() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(interfaceCode);
    }

    /**
     * builds PaymentStatusInterfaceCodeSetMessagePayload without checking for non-null required values
     * @return PaymentStatusInterfaceCodeSetMessagePayload
     */
    public PaymentStatusInterfaceCodeSetMessagePayload buildUnchecked() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadImpl(interfaceCode);
    }

    /**
     * factory method for an instance of PaymentStatusInterfaceCodeSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of() {
        return new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentStatusInterfaceCodeSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentStatusInterfaceCodeSetMessagePayloadBuilder of(
            final PaymentStatusInterfaceCodeSetMessagePayload template) {
        PaymentStatusInterfaceCodeSetMessagePayloadBuilder builder = new PaymentStatusInterfaceCodeSetMessagePayloadBuilder();
        builder.interfaceCode = template.getInterfaceCode();
        return builder;
    }

}
