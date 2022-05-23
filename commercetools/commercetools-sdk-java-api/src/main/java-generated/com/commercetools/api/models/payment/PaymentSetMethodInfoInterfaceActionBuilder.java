
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
     <>
     */

    public PaymentSetMethodInfoInterfaceActionBuilder _interface(final String _interface) {
        this._interface = _interface;
        return this;
    }

    public String getInterface() {
        return this._interface;
    }

    public PaymentSetMethodInfoInterfaceAction build() {
        Objects.requireNonNull(_interface, PaymentSetMethodInfoInterfaceAction.class + ": interface is missing");
        return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    /**
     * builds PaymentSetMethodInfoInterfaceAction without checking for non null required values
     */
    public PaymentSetMethodInfoInterfaceAction buildUnchecked() {
        return new PaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder of() {
        return new PaymentSetMethodInfoInterfaceActionBuilder();
    }

    public static PaymentSetMethodInfoInterfaceActionBuilder of(final PaymentSetMethodInfoInterfaceAction template) {
        PaymentSetMethodInfoInterfaceActionBuilder builder = new PaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
