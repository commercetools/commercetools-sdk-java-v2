
package com.commercetools.api.models.me;

import java.util.*;

import io.vrap.rmf.base.client.Builder;
import io.vrap.rmf.base.client.utils.Generated;

/**
 * MyPaymentSetMethodInfoInterfaceActionBuilder
 * <hr>
 * Example to create an instance using the builder pattern
 * <div class=code-example>
 * <pre><code class='java'>
 *     MyPaymentSetMethodInfoInterfaceAction myPaymentSetMethodInfoInterfaceAction = MyPaymentSetMethodInfoInterfaceAction.builder()
 *             .interface("{interface}")
 *             .build()
 * </code></pre>
 * </div>
 */
@Generated(value = "io.vrap.rmf.codegen.rendering.CoreCodeGenerator", comments = "https://github.com/commercetools/rmf-codegen")
public class MyPaymentSetMethodInfoInterfaceActionBuilder implements Builder<MyPaymentSetMethodInfoInterfaceAction> {

    private String _interface;

    /**
     *  <p>Value to set. Once set, the <code>paymentInterface</code> of the <code>paymentMethodInfo</code> cannot be changed.</p>
     * @param _interface
     * @return Builder
     */

    public MyPaymentSetMethodInfoInterfaceActionBuilder _interface(final String _interface) {
        this._interface = _interface;
        return this;
    }

    public String getInterface() {
        return this._interface;
    }

    public MyPaymentSetMethodInfoInterfaceAction build() {
        Objects.requireNonNull(_interface, MyPaymentSetMethodInfoInterfaceAction.class + ": interface is missing");
        return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    /**
     * builds MyPaymentSetMethodInfoInterfaceAction without checking for non null required values
     */
    public MyPaymentSetMethodInfoInterfaceAction buildUnchecked() {
        return new MyPaymentSetMethodInfoInterfaceActionImpl(_interface);
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of() {
        return new MyPaymentSetMethodInfoInterfaceActionBuilder();
    }

    public static MyPaymentSetMethodInfoInterfaceActionBuilder of(
            final MyPaymentSetMethodInfoInterfaceAction template) {
        MyPaymentSetMethodInfoInterfaceActionBuilder builder = new MyPaymentSetMethodInfoInterfaceActionBuilder();
        builder._interface = template.getInterface();
        return builder;
    }

}
