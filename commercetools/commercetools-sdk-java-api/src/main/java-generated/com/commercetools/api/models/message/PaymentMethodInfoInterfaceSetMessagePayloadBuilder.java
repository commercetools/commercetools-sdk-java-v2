
package com.commercetools.api.models.message;

import java.util.*;

import javax.annotation.Nullable;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentMethodInfoInterfaceSetMessagePayloadBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentMethodInfoInterfaceSetMessagePayload paymentMethodInfoInterfaceSetMessagePayload = PaymentMethodInfoInterfaceSetMessagePayload.builder()
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentMethodInfoInterfaceSetMessagePayloadBuilder
        implements Builder<PaymentMethodInfoInterfaceSetMessagePayload> {

    @Nullable
    private String _interface;

    @Nullable
    private String oldInterface;

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAction" rel="nofollow">Set MethodInfo Interface</a> update action.</p>
     * @param _interface value to be set
     * @return Builder
     */

    public PaymentMethodInfoInterfaceSetMessagePayloadBuilder _interface(@Nullable final String _interface) {
        this._interface = _interface;
        return this;
    }

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAction" rel="nofollow">Set MethodInfo Interface</a> update action.</p>
     * @param oldInterface value to be set
     * @return Builder
     */

    public PaymentMethodInfoInterfaceSetMessagePayloadBuilder oldInterface(@Nullable final String oldInterface) {
        this.oldInterface = oldInterface;
        return this;
    }

    /**
     *  <p>Payment interface of the Payment Method after the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAction" rel="nofollow">Set MethodInfo Interface</a> update action.</p>
     * @return interface
     */

    @Nullable
    public String getInterface() {
        return this._interface;
    }

    /**
     *  <p>Payment interface of the Payment Method before the <a href="https://docs.commercetools.com/apis/ctp:api:type:PaymentSetMethodInfoInterfaceAction" rel="nofollow">Set MethodInfo Interface</a> update action.</p>
     * @return oldInterface
     */

    @Nullable
    public String getOldInterface() {
        return this.oldInterface;
    }

    /**
     * builds PaymentMethodInfoInterfaceSetMessagePayload with checking for non-null required values
     * @return PaymentMethodInfoInterfaceSetMessagePayload
     */
    public PaymentMethodInfoInterfaceSetMessagePayload build() {
        return new PaymentMethodInfoInterfaceSetMessagePayloadImpl(_interface, oldInterface);
    }

    /**
     * builds PaymentMethodInfoInterfaceSetMessagePayload without checking for non-null required values
     * @return PaymentMethodInfoInterfaceSetMessagePayload
     */
    public PaymentMethodInfoInterfaceSetMessagePayload buildUnchecked() {
        return new PaymentMethodInfoInterfaceSetMessagePayloadImpl(_interface, oldInterface);
    }

    /**
     * factory method for an instance of PaymentMethodInfoInterfaceSetMessagePayloadBuilder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessagePayloadBuilder of() {
        return new PaymentMethodInfoInterfaceSetMessagePayloadBuilder();
    }

    /**
     * create builder for PaymentMethodInfoInterfaceSetMessagePayload instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentMethodInfoInterfaceSetMessagePayloadBuilder of(
            final PaymentMethodInfoInterfaceSetMessagePayload template) {
        PaymentMethodInfoInterfaceSetMessagePayloadBuilder builder = new PaymentMethodInfoInterfaceSetMessagePayloadBuilder();
        builder._interface = template.getInterface();
        builder.oldInterface = template.getOldInterface();
        return builder;
    }

}
