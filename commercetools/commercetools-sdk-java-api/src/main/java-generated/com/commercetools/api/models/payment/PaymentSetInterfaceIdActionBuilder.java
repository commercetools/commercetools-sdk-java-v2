
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetInterfaceIdActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetInterfaceIdAction paymentSetInterfaceIdAction = PaymentSetInterfaceIdAction.builder()
 *             .interfaceId("{interfaceId}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetInterfaceIdActionBuilder implements Builder<PaymentSetInterfaceIdAction> {

    private String interfaceId;

    /**
     *  <p>Value to set. The combination of <code>interfaceId</code> and <code>paymentInterface</code> of a PaymentMethodInfo must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @param interfaceId value to be set
     * @return Builder
     */

    public PaymentSetInterfaceIdActionBuilder interfaceId(final String interfaceId) {
        this.interfaceId = interfaceId;
        return this;
    }

    /**
     *  <p>Value to set. The combination of <code>interfaceId</code> and <code>paymentInterface</code> of a PaymentMethodInfo must be unique.</p>
     *  <p>The value cannot be modified after it is set.</p>
     * @return interfaceId
     */

    public String getInterfaceId() {
        return this.interfaceId;
    }

    /**
     * builds PaymentSetInterfaceIdAction with checking for non-null required values
     * @return PaymentSetInterfaceIdAction
     */
    public PaymentSetInterfaceIdAction build() {
        Objects.requireNonNull(interfaceId, PaymentSetInterfaceIdAction.class + ": interfaceId is missing");
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    /**
     * builds PaymentSetInterfaceIdAction without checking for non-null required values
     * @return PaymentSetInterfaceIdAction
     */
    public PaymentSetInterfaceIdAction buildUnchecked() {
        return new PaymentSetInterfaceIdActionImpl(interfaceId);
    }

    /**
     * factory method for an instance of PaymentSetInterfaceIdActionBuilder
     * @return builder
     */
    public static PaymentSetInterfaceIdActionBuilder of() {
        return new PaymentSetInterfaceIdActionBuilder();
    }

    /**
     * create builder for PaymentSetInterfaceIdAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetInterfaceIdActionBuilder of(final PaymentSetInterfaceIdAction template) {
        PaymentSetInterfaceIdActionBuilder builder = new PaymentSetInterfaceIdActionBuilder();
        builder.interfaceId = template.getInterfaceId();
        return builder;
    }

}
