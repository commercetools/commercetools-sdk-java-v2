
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodPaymentInterfaceSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodPaymentInterfaceSetMessagePayload paymentMethodPaymentInterfaceSetMessagePayload = PaymentMethodPaymentInterfaceSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodPaymentInterfaceSetMessagePayloadBuilder
        implements Builder<PaymentMethodPaymentInterfaceSetMessagePayload> {

    @Nullable
    private String paymentInterface;

    @Nullable
    private String oldPaymentInterface;

    /**
     *  <p>Payment interface of the Payment Method after the Set PaymentInterface update action.</p>
     * @param paymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodPaymentInterfaceSetMessagePayloadBuilder paymentInterface(
            @Nullable final String paymentInterface) {
        this.paymentInterface = paymentInterface;
        return this;
    }

    /**
     *  <p>Payment interface of the Payment Method before the Set PaymentInterface update action.</p>
     * @param oldPaymentInterface value to be set
     * @return Builder
     */

    public PaymentMethodPaymentInterfaceSetMessagePayloadBuilder oldPaymentInterface(
            @Nullable final String oldPaymentInterface) {
        this.oldPaymentInterface = oldPaymentInterface;
        return this;
    }

    /**
     *  <p>Payment interface of the Payment Method after the Set PaymentInterface update action.</p>
     * @return paymentInterface
     */

    @Nullable
    public String getPaymentInterface() {
        return this.paymentInterface;
    }

    /**
     *  <p>Payment interface of the Payment Method before the Set PaymentInterface update action.</p>
     * @return oldPaymentInterface
     */

    @Nullable
    public String getOldPaymentInterface() {
        return this.oldPaymentInterface;
    }

    /**
     * builds PaymentMethodPaymentInterfaceSetMessagePayload with checking for non-null required values
     * @return PaymentMethodPaymentInterfaceSetMessagePayload
     */
    public PaymentMethodPaymentInterfaceSetMessagePayload build() {
        return new PaymentMethodPaymentInterfaceSetMessagePayloadImpl(paymentInterface, oldPaymentInterface);
    }

    /**
     * builds PaymentMethodPaymentInterfaceSetMessagePayload without checking for non-null required values
     * @return PaymentMethodPaymentInterfaceSetMessagePayload
     */
    public PaymentMethodPaymentInterfaceSetMessagePayload buildUnchecked() {
        return new PaymentMethodPaymentInterfaceSetMessagePayloadImpl(paymentInterface, oldPaymentInterface);
    }

    /**
     * factory method for an instance of PaymentMethodPaymentInterfaceSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayloadBuilder of() {
        return new PaymentMethodPaymentInterfaceSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodPaymentInterfaceSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodPaymentInterfaceSetMessagePayloadBuilder of(
            final PaymentMethodPaymentInterfaceSetMessagePayload template) {
        PaymentMethodPaymentInterfaceSetMessagePayloadBuilder builder = new PaymentMethodPaymentInterfaceSetMessagePayloadBuilder();
        builder.paymentInterface = template.getPaymentInterface();
        builder.oldPaymentInterface = template.getOldPaymentInterface();
        return builder;
    }

}
