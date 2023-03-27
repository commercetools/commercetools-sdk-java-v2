
package com.commercetools.api.models.payment;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * PaymentSetMethodInfoInterfaceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     PaymentSetMethodInfoInterfaceAction paymentSetMethodInfoInterfaceAction = PaymentSetMethodInfoInterfaceAction.builder()
 *             .interface("{interface}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class PaymentSetMethodInfoInterfaceActionBuilder implements Builder<PaymentSetMethodInfoInterfaceAction> {

    private String _interface;

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @param _interface value to be set
     * @return Builder
     */

    public PaymentSetMethodInfoInterfaceActionBuilder _interface(final String _interface) {
        this._interface = _interface;
        return this;
    }

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @return interface
     */

    public String getInterface() {
        return this._interface;
    }

    /**
     * builds PaymentSetMethodInfoInterfaceAction with checking for non-null required values
     * @return PaymentSetMethodInfoInterfaceAction
     */
    public PaymentSetMethodInfoInterfaceAction build() {
        Objects.requireNonNull(_interface, PaymentSetMethodInfoInterfaceAction.class + ": interface is missing");
        return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    /**
     * builds PaymentSetMethodInfoInterfaceAction without checking for non-null required values
     * @return PaymentSetMethodInfoInterfaceAction
     */
    public PaymentSetMethodInfoInterfaceAction buildUnchecked() {
        return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    /**
     * factory method for an instance of PaymentSetMethodInfoInterfaceActionBuilder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceActionBuilder of() {
        return new PaymentSetMethodInfoInterfaceActionBuilder();
    }

    /**
     * create builder for PaymentSetMethodInfoInterfaceAction instance
     * @param template instance with prefilled values for the builder
     * @return builder
     */
    public static PaymentSetMethodInfoInterfaceActionBuilder of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionBuilder builder = new PaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
